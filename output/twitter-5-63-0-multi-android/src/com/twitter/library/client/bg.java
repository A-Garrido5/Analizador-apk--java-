// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.client;

import com.twitter.library.api.account.n;
import com.twitter.library.api.account.ac;
import com.twitter.library.api.account.t;
import com.twitter.library.service.ab;
import com.twitter.library.provider.cy;
import com.twitter.library.featureswitch.d;
import com.twitter.library.util.ar;
import java.io.IOException;
import com.twitter.internal.android.service.c;
import com.twitter.util.i;
import com.twitter.library.api.account.f;
import java.util.Locale;
import com.twitter.library.network.OAuthToken;
import com.twitter.library.provider.ae;
import com.twitter.library.api.account.m;
import com.twitter.library.api.bh;
import com.twitter.library.api.UserSettings;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.network.LoginResponse;
import java.util.Iterator;
import android.text.TextUtils;
import android.os.Looper;
import android.os.Handler;
import java.util.HashMap;
import java.util.ArrayList;
import android.accounts.Account;
import android.content.Context;
import com.twitter.internal.network.l;
import android.accounts.AccountManager;
import com.twitter.library.util.a;
import android.util.Log;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.ScribeService;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.service.aa;
import com.twitter.library.service.y;
import com.twitter.library.service.z;

class bg extends z
{
    final /* synthetic */ az a;
    private final int b;
    
    bg(final az a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void a(final y y) {
        final aa aa = (aa)y.l().b();
        final String a = y.P().a;
        final Session session = this.a.g.get(a);
        if (session != null) {
            switch (this.b) {
                default: {}
                case 1: {
                    this.a.e();
                    final boolean a2 = this.a.f(a);
                    session.a(Session$LoginStatus.a);
                    for (int i = -1 + this.a.e.size(); i >= 0; --i) {
                        ((ay)this.a.e.get(i)).a(session, a2);
                    }
                    session.a();
                }
                case 2: {
                    ScribeService.a(this.a.d, new TwitterScribeLog(session.g()).b(new String[] { "api::verify_credentials:unauthorized:check" }));
                    final l f = aa.f();
                    int n;
                    if (f != null) {
                        if (f.a == 401 && f.j == 89) {
                            n = 1;
                        }
                        else {
                            n = 0;
                        }
                    }
                    else {
                        n = 0;
                    }
                    if (n == 0) {
                        break;
                    }
                    final String value = String.valueOf(aa.f().j);
                    final TwitterScribeLog twitterScribeLog = (TwitterScribeLog)new TwitterScribeLog(session.g()).b(new String[] { "api::verify_credentials:unauthorized:logout" });
                    twitterScribeLog.c(new String[] { value });
                    ScribeService.a(this.a.d, twitterScribeLog);
                    if (az.b) {
                        Log.i("SessionManager", "Invalid credentials. The auth token has expired.");
                    }
                    this.a.e();
                    final Context e = this.a.d;
                    final Account a3 = com.twitter.library.util.a.a(e, session.e());
                    if (a3 != null) {
                        final boolean a4 = this.a.f(a);
                        final AccountManager value2 = AccountManager.get(e);
                        value2.setPassword(a3, (String)null);
                        value2.invalidateAuthToken(com.twitter.library.util.a.a, (String)null);
                        session.a(Session$LoginStatus.a);
                        for (int j = -1 + this.a.e.size(); j >= 0; --j) {
                            ((ay)this.a.e.get(j)).c(session, a4);
                        }
                        session.a();
                        return;
                    }
                    break;
                }
            }
        }
    }
}
