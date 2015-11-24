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
import android.accounts.AccountManager;
import android.accounts.Account;
import android.os.Looper;
import android.util.Log;
import android.os.Handler;
import java.util.HashMap;
import java.util.ArrayList;
import android.content.Context;
import com.twitter.internal.android.service.a;
import com.twitter.library.service.aa;
import com.twitter.library.api.account.c;
import com.twitter.library.service.y;
import com.twitter.library.service.z;

class bc extends z
{
    final /* synthetic */ az a;
    
    bc(final az a) {
        this.a = a;
    }
    
    @Override
    public void a(final y y) {
        final com.twitter.library.api.account.c c = (com.twitter.library.api.account.c)y;
        final int[] g = c.g();
        final boolean u = c.u();
        final aa aa = (aa)y.l().b();
        final Session session = this.a.g.get(y.P().a);
        if (session != null) {
            final boolean a = aa.a();
            final bd bd = this.a.k.remove(c.b);
            if (a) {
                while (true) {
                    while (true) {
                        try {
                            final String a2 = this.a.a(session, c.t(), c.f());
                            if (bd == null) {
                                break;
                            }
                            if (!u) {
                                final boolean b = true;
                                bd.a(session, a2, b);
                                return;
                            }
                        }
                        catch (Exception ex) {
                            session.a(Session$LoginStatus.a);
                            if (bd != null) {
                                final int c2 = aa.c();
                                boolean b2 = false;
                                if (!u) {
                                    b2 = true;
                                }
                                bd.a(session, 2, c2, g, b2);
                                return;
                            }
                            break;
                        }
                        final boolean b = false;
                        continue;
                    }
                }
            }
            else {
                session.a(Session$LoginStatus.a);
                if (bd != null) {
                    final int c3 = aa.c();
                    boolean b3 = false;
                    if (!u) {
                        b3 = true;
                    }
                    bd.a(session, 1, c3, g, b3);
                }
            }
        }
    }
}
