// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.service;

import android.os.HandlerThread;
import android.content.Intent;
import java.util.List;
import com.twitter.internal.network.HttpOperation;
import com.twitter.internal.network.q;
import java.io.OutputStream;
import com.twitter.internal.network.c;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.network.g;
import java.io.ByteArrayOutputStream;
import com.twitter.library.network.t;
import com.twitter.library.util.a;
import android.content.Context;
import android.accounts.AccountManager;
import com.twitter.library.network.OAuthToken;
import android.os.IBinder;
import com.twitter.library.network.ae;
import android.os.Handler;
import android.os.Looper;
import android.app.Service;

public class AuthTokenService extends Service
{
    private Looper a;
    private Handler b;
    private Handler c;
    private ae d;
    private final IBinder e;
    
    public AuthTokenService() {
        this.e = (IBinder)new h(this);
    }
    
    private void a(final j j, final int n, final OAuthToken oAuthToken, final String s, final long n2) {
        this.c.post((Runnable)new k(j, n, oAuthToken, s, n2));
    }
    
    private void c(final j j, final String s, final String s2, final String s3) {
        final OAuthToken b = com.twitter.library.util.a.b(AccountManager.get((Context)this), com.twitter.library.util.a.a(s3));
        if (b == null) {
            this.a(j, 0, null, null, 0L);
            return;
        }
        final t t = new t(b);
        final StringBuilder append = new StringBuilder(this.d.d).append("/oauth/access_token");
        ae.a(append, "x_reverse_auth_target", s);
        ae.a(append, "x_reverse_auth_parameters", s2);
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        final HttpOperation c = new g((Context)this, append).a(HttpOperation$RequestMethod.b).a(t).a(new c(byteArrayOutputStream, null)).a().c();
        if (c.j()) {
            final List a = com.twitter.library.network.t.a(new String(byteArrayOutputStream.toByteArray()), true);
            this.a(j, c.l().a, new OAuthToken(com.twitter.library.network.t.a(a, "oauth_token"), com.twitter.library.network.t.a(a, "oauth_token_secret")), com.twitter.library.network.t.a(a, "screen_name"), Long.parseLong(com.twitter.library.network.t.a(a, "user_id")));
            return;
        }
        this.a(j, c.l().a, null, null, 0L);
    }
    
    public boolean a(final j j, final String s, final String s2, final String s3) {
        return this.b.post((Runnable)new i(this, j, s, s2, s3));
    }
    
    void b(final j j, final String s, final String s2, final String s3) {
        final t t = new t(null, s, s2);
        final StringBuilder append = new StringBuilder(this.d.d).append("/oauth/request_token");
        ae.a(append, "x_auth_mode", "reverse_auth");
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        if (new g((Context)this, append).a(HttpOperation$RequestMethod.b).a(t).a(new c(byteArrayOutputStream, null)).a().c().j()) {
            this.c(j, s, new String(byteArrayOutputStream.toByteArray()), s3);
            return;
        }
        this.a(j, 0, null, null, 0L);
    }
    
    public IBinder onBind(final Intent intent) {
        return this.e;
    }
    
    public void onCreate() {
        super.onCreate();
        this.d = ae.a((Context)this);
        final HandlerThread handlerThread = new HandlerThread("AuthTokenService", 10);
        handlerThread.start();
        this.a = handlerThread.getLooper();
        this.b = new Handler(this.a);
        this.c = new Handler();
    }
    
    public void onDestroy() {
        super.onDestroy();
        this.a.quit();
    }
}
