// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.upload;

import android.os.Handler;
import android.os.Looper;
import com.twitter.library.provider.b;
import android.os.Parcelable;
import java.util.Collection;
import java.util.ArrayList;
import com.twitter.library.api.UserSettings;
import com.twitter.library.service.aa;
import com.twitter.errorreporter.a;
import com.twitter.library.service.ab;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.api.bg;
import com.twitter.library.client.ap;
import com.twitter.library.api.TwitterUser;

public abstract class w extends ag
{
    protected final TwitterUser a;
    protected ap e;
    private bg f;
    
    protected w(final Context context, final String s, final Session session) {
        super(context, s, session);
        this.a = session.f();
    }
    
    protected w(final Context context, final String s, final ab ab, final TwitterUser a) {
        super(context, s, ab);
        this.a = a;
    }
    
    protected bg a(final com.twitter.errorreporter.a a) {
        return this.f = bg.a(17);
    }
    
    public w a(final ap e) {
        this.e = e;
        return this;
    }
    
    public boolean b() {
        return this.e.c;
    }
    
    protected boolean b(final aa aa) {
        if (this.f == null) {
            throw new IllegalStateException();
        }
        if (aa.a()) {
            final TwitterUser twitterUser = (TwitterUser)this.f.a();
            com.twitter.library.util.a.a(this.p, this.P().e, twitterUser, null);
            final ArrayList<TwitterUser> list = new ArrayList<TwitterUser>();
            list.add(twitterUser);
            final b w = this.W();
            this.V().a(list, -1L, -1, -1L, null, null, true, w);
            w.a();
            this.o.putParcelable("user", (Parcelable)twitterUser);
        }
        return aa.a();
    }
    
    public boolean e() {
        return this.e.a != null;
    }
    
    public boolean g() {
        return this.e.i;
    }
    
    protected void h() {
        new Handler(Looper.getMainLooper()).postDelayed((Runnable)new x(this), 5000L);
    }
}
