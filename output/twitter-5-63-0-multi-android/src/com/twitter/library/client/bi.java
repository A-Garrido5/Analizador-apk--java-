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
import com.twitter.library.api.account.f;
import com.twitter.library.service.aa;
import com.twitter.library.service.y;
import com.twitter.library.service.z;

class bi extends z
{
    final /* synthetic */ az a;
    private final boolean b;
    
    bi(final az a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    private void a(final y y, final aa aa, final Session session) {
        final com.twitter.library.api.account.y y2 = (com.twitter.library.api.account.y)y;
        final bj bj = this.a.k.remove(y2.b);
        Label_0107: {
            if (!aa.a()) {
                break Label_0107;
            }
            try {
                final String a = this.a.a(session, y2.e(), y2.t());
                if (bj != null) {
                    bj.a(session, a);
                }
                return;
            }
            catch (Exception ex) {
                this.a.a(session, y2.u());
                if (bj != null) {
                    bj.a(session, 2, 400, y2.g());
                }
                return;
            }
        }
        this.a.a(session, y2.u());
        if (bj == null) {
            return;
        }
        final int c = aa.c();
        if (c == 412) {
            bj.a(session, y2.g());
            return;
        }
        bj.a(session, 1, c, y2.g());
    }
    
    private void b(final y y, final aa aa, final Session session) {
        final f f = (f)y;
        final bj bj = this.a.k.remove(f.b);
        Label_0107: {
            if (!aa.a()) {
                break Label_0107;
            }
            try {
                final String a = this.a.a(session, f.u(), f.g());
                if (bj != null) {
                    bj.a(session, a);
                }
                return;
            }
            catch (Exception ex) {
                this.a.a(session, f.t());
                if (bj != null) {
                    bj.a(session, 2, 400, f.f());
                }
                return;
            }
        }
        this.a.a(session, f.t());
        if (bj == null) {
            return;
        }
        final int c = aa.c();
        if (c == 412) {
            bj.a(session, f.f());
            return;
        }
        bj.a(session, 1, c, f.f());
    }
    
    @Override
    public void a(final y y) {
        final aa aa = (aa)y.l().b();
        final Session session = this.a.g.get(y.P().a);
        if (session == null) {
            return;
        }
        if (this.b) {
            this.b(y, aa, session);
            return;
        }
        this.a(y, aa, session);
    }
}
