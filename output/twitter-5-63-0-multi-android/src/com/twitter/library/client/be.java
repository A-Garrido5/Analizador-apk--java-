// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.client;

import com.twitter.library.api.account.ac;
import com.twitter.library.api.account.t;
import com.twitter.library.service.ab;
import com.twitter.library.provider.cy;
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
import java.util.Iterator;
import android.text.TextUtils;
import android.accounts.AccountManager;
import android.accounts.Account;
import android.os.Looper;
import android.util.Log;
import android.os.Handler;
import java.util.HashMap;
import java.util.ArrayList;
import android.content.Context;
import com.twitter.internal.android.service.a;
import com.twitter.library.featureswitch.d;
import com.twitter.library.service.aa;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.network.LoginResponse;
import com.twitter.library.api.account.n;
import com.twitter.library.service.y;
import com.twitter.library.service.z;

class be extends z
{
    final /* synthetic */ az a;
    
    private be(final az a) {
        this.a = a;
    }
    
    @Override
    public void a(final y y) {
        final Session session = this.a.g.get(y.P().a);
        if (session == null) {
            return;
        }
        final n n = (n)y;
        this.a(y, session, n.t(), n.u(), n.f(), n.g());
    }
    
    protected void a(final y y, final Session session, final int[] array, final LoginResponse loginResponse, final String s, final TwitterUser twitterUser) {
        final aa aa = (aa)y.l().b();
        final bf bf = this.a.k.remove(y.b);
        if (d.f("login_challenge_enabled") && loginResponse != null && loginResponse.d == 2 && loginResponse.b.e == 2) {
            session.a(Session$LoginStatus.a);
            if (bf != null) {
                bf.b(session, loginResponse.b);
            }
        }
        else {
            if (loginResponse == null || loginResponse.d != 2 || (loginResponse.b.e != 1 && loginResponse.b.e != 0)) {
                if (aa.a()) {
                    try {
                        final String a = this.a.a(session, loginResponse, twitterUser);
                        if (bf != null) {
                            bf.a(session, a);
                        }
                        return;
                    }
                    catch (Exception ex) {
                        this.a.a(session, s);
                        if (bf != null) {
                            bf.a(session, 2, array);
                        }
                        return;
                    }
                }
                if (bf != null) {
                    bf.a(session, 1, array);
                }
                this.a.a(session, s);
                return;
            }
            session.a(Session$LoginStatus.a);
            if (bf != null) {
                bf.a(session, loginResponse.b);
            }
        }
    }
}
