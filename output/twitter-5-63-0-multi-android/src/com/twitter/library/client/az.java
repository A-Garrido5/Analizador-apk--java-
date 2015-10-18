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
import com.twitter.library.api.account.y;
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
import com.twitter.library.util.a;
import android.text.TextUtils;
import android.accounts.AccountManager;
import android.accounts.Account;
import android.os.Looper;
import android.util.Log;
import android.os.Handler;
import java.util.HashMap;
import java.util.ArrayList;
import android.content.Context;

public class az
{
    public static final yv a;
    private static final boolean b;
    private static az c;
    private final Context d;
    private final ArrayList e;
    private final Object f;
    private final HashMap g;
    private String h;
    private final Handler i;
    private as j;
    private final HashMap k;
    
    static {
        a = new yv("TestSessionManager");
        b = (App.l() && Log.isLoggable("SessionManager", 3));
        az.c = null;
    }
    
    public az(final Context d) {
        this.e = new ArrayList();
        this.f = new Object();
        this.g = new HashMap();
        this.k = new HashMap();
        this.d = d;
        this.j = as.a(d);
        this.i = new Handler(Looper.getMainLooper());
    }
    
    private Session a(final Account account) {
        final AccountManager value = AccountManager.get(this.d);
        final String userData = value.getUserData(account, "account_user_info");
        final Session d = this.d();
        if (userData != null) {
            final String name = account.name;
            final String password = value.getPassword(account);
            int n;
            if (password != null) {
                n = 1;
            }
            else {
                n = 0;
            }
            if (n == 0) {
                this.a(d, account);
                return d;
            }
            d.a(name);
            d.a(true);
            this.a(d, name, password, null);
        }
        return d;
    }
    
    private Session a(final String s, Account account, final long n) {
        boolean b;
        if (!TextUtils.isEmpty((CharSequence)s)) {
            b = true;
        }
        else {
            b = false;
        }
        final long n2 = lcmp(n, 0L);
        boolean b2 = false;
        if (n2 > 0) {
            b2 = true;
        }
        final Object f = this.f;
        // monitorenter(f)
    Label_0137:
        while (true) {
            if (!b) {
                if (!b2) {
                    break Label_0137;
                }
            }
            while (true) {
                Label_0161: {
                    try {
                        for (final Session session : this.g.values()) {
                            if ((b2 && n == session.g()) || (b && s.equalsIgnoreCase(session.e()))) {
                                return session;
                            }
                        }
                        if (account == null) {
                            if (!b) {
                                break Label_0161;
                            }
                            account = com.twitter.library.util.a.a(this.d, s);
                        }
                        if (account == null) {
                            return this.d();
                        }
                        break;
                    }
                    finally {
                    }
                    // monitorexit(f)
                }
                account = com.twitter.library.util.a.a(this.d, n);
                continue Label_0137;
            }
            break;
        }
        // monitorexit(f)
        return this.a(account);
    }
    
    public static az a(final Context context) {
        synchronized (az.class) {
            if (az.c == null) {
                throw new IllegalArgumentException("Instance has not been set");
            }
        }
        // monitorexit(az.class)
        return az.c;
    }
    
    private String a(final Session session, final LoginResponse loginResponse, final TwitterUser twitterUser) {
        this.a(session, twitterUser.username, loginResponse.a, twitterUser, null);
        final String a = bh.a(twitterUser);
        final String e = session.e();
        final OAuthToken h = session.h();
        if (!TextUtils.isEmpty((CharSequence)loginResponse.c)) {
            m.b(this.d, loginResponse.c);
        }
        final Account a2 = com.twitter.library.util.a.a(this.d, e, h, a);
        if (session.i()) {
            session.a(false);
        }
        else {
            com.twitter.library.util.a.a(a2, ae.c, true);
        }
        final boolean b = com.twitter.library.util.a.a(this.d).length == 1;
        for (int i = -1 + this.e.size(); i >= 0; --i) {
            ((ay)this.e.get(i)).b(session, b);
        }
        return a;
    }
    
    private String a(final Session session, final Locale locale, final String s, final String s2, final String s3, final String s4, final bj bj, final String s5) {
        final f f = new f(this.d, session, s, s2, s3, s5, s4);
        if (locale != null && !TextUtils.isEmpty((CharSequence)locale.getLanguage())) {
            f.a(com.twitter.util.i.b(locale));
        }
        this.a(f.b, bj);
        return this.j.a(f.a(new bi(this, true)));
    }
    
    private String a(final Session session, final Locale locale, final String s, final String s2, final String s3, final String s4, final String s5, final String s6, final bj bj, final String s7) {
        final y f = new y(this.d, session, s2, s4).d(s).e(s3).g(s5).c(s6).f(s7);
        if (!TextUtils.isEmpty((CharSequence)s7)) {
            String s8;
            if (locale != null && com.twitter.util.i.d(locale)) {
                s8 = locale.getCountry();
            }
            else {
                s8 = Locale.getDefault().getCountry();
            }
            f.b(s8);
        }
        if (locale != null && !TextUtils.isEmpty((CharSequence)locale.getLanguage())) {
            f.a(com.twitter.util.i.b(locale));
        }
        this.a(f.b, bj);
        return this.j.a(f.a(new bi(this, false)));
    }
    
    private void a(final Session session, final Account account) {
        final AccountManager value = AccountManager.get(this.d);
        final OAuthToken b = com.twitter.library.util.a.b(value, account);
        if (b == null) {
            return;
        }
        try {
            this.a(session, account.name, b, bh.b(value.getUserData(account, "account_user_info")), UserSettings.a(value.getUserData(account, "account_settings")));
        }
        catch (IOException ex) {}
    }
    
    private void a(final Session session, final String s) {
        if (!TextUtils.isEmpty((CharSequence)s) && com.twitter.library.util.a.a(this.d, s) != null) {
            final Session b = this.b(s);
            if (!session.equals(b)) {
                session.a(Session$LoginStatus.a);
            }
            this.a(b);
            return;
        }
        session.a(Session$LoginStatus.a);
    }
    
    private void a(final Session session, final String s, final OAuthToken oAuthToken, final TwitterUser twitterUser, final UserSettings userSettings) {
        session.a(Session$LoginStatus.c);
        session.a(twitterUser);
        session.a(s);
        session.a(oAuthToken);
        if (userSettings != null) {
            session.a(userSettings);
        }
        session.a(new ba(this, session));
    }
    
    public static void a(final az c) {
        az.a.a();
        az.c = c;
    }
    
    private Session d() {
        synchronized (this.f) {
            for (final Session session : this.g.values()) {
                if (session.b() == Session$LoginStatus.a && session.g() == 0L) {
                    return session;
                }
            }
            final Session session2 = new Session();
            this.g.put(session2.c(), session2);
            return session2;
        }
    }
    
    private void e() {
        ar.a(this.d).a();
    }
    
    private void e(final Session session) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            for (int i = -1 + this.e.size(); i >= 0; --i) {
                ((ay)this.e.get(i)).a(session);
            }
        }
        else {
            this.i.post((Runnable)new bb(this, session));
        }
    }
    
    private boolean f(final String s) {
        synchronized (this.f) {
            if (s.equals(this.h)) {
                com.twitter.library.featureswitch.d.a(0L);
                cy.a(this.d, null, 0L);
                this.h = null;
            }
            if (this.g.get(s) != null) {
                this.g.remove(s);
            }
            // monitorexit(this.f)
            if (com.twitter.library.util.a.a(this.d).length == 0) {
                return true;
            }
        }
        return false;
    }
    
    public Session a(final long n) {
        if (n == -1L) {
            return this.b();
        }
        return this.b(n);
    }
    
    public Session a(final com.twitter.library.service.y y) {
        if (y != null) {
            final ab p = y.P();
            if (p != null) {
                return this.c(p.a);
            }
        }
        return null;
    }
    
    public Session a(final String s) {
        for (final Session b : this.a()) {
            final String e = b.e();
            if (e != null && e.equals(s)) {
                return b;
            }
        }
        Session b = this.b();
        if (b.d()) {
            return this.d();
        }
        return b;
    }
    
    public String a(final Session session) {
        if (session.b() == Session$LoginStatus.c || session.b() == Session$LoginStatus.b) {
            session.a(Session$LoginStatus.d);
            return this.j.a(new t(this.d, session).a(new bg(this, 1)));
        }
        return null;
    }
    
    public String a(final Session session, final long n, final String s, final bd bd) {
        session.a(Session$LoginStatus.b);
        final com.twitter.library.api.account.c c = new com.twitter.library.api.account.c(this.d, session, n, s);
        this.a(c.b, bd);
        return this.j.a(c.a(new bc(this)));
    }
    
    public String a(final Session session, final long n, final String s, final String s2, final bd bd) {
        session.a(Session$LoginStatus.b);
        final com.twitter.library.api.account.c c = new com.twitter.library.api.account.c(this.d, session, n, s);
        this.a(c.b, bd);
        return this.j.a(c.a(s2).a(new bc(this)));
    }
    
    public String a(final Session session, final com.twitter.library.service.y y) {
        return this.j.a((com.twitter.internal.android.service.a)((com.twitter.library.service.y)new ac(this.d, session, new com.twitter.library.network.t(session.h())).a(new bg(this, 2))).a(y));
    }
    
    public String a(final Session session, final String s, final String s2, final bf bf) {
        session.a(Session$LoginStatus.b);
        final n n = new n(this.d, n.class.getName(), session, s, s2);
        this.a(n.b, bf);
        return this.j.a(n.a(new be(this, null)));
    }
    
    public String a(final String s, final String s2, final bf bf) {
        return this.a(this.a(s), s, s2, bf);
    }
    
    public String a(final String s, final String s2, final String s3, final String s4, final String s5, final String s6, final bj bj, final String s7) {
        Session session;
        if (com.twitter.library.util.a.b(this.d) > 0) {
            session = this.d();
        }
        else {
            session = this.b();
        }
        final Locale locale = this.d.getResources().getConfiguration().locale;
        if (com.twitter.library.featureswitch.d.f("account_create_api_for_signup_android_enabled")) {
            return this.a(session, locale, s, s2, s3, s4, bj, s7);
        }
        return this.a(session, locale, s, s2, s3, s4, s5, s6, bj, s7);
    }
    
    public ArrayList a() {
        synchronized (this.f) {
            return new ArrayList(this.g.values());
        }
    }
    
    public void a(final ay ay) {
        if (ay != null && !this.e.contains(ay)) {
            this.e.add(ay);
        }
    }
    
    public void a(final String s, final com.twitter.library.client.bh bh) {
        if (s != null && bh != null) {
            this.k.put(s, bh);
        }
    }
    
    public Session b() {
        while (true) {
            int n = 0;
        Label_0095_Outer:
            while (true) {
            Label_0159:
                while (true) {
                    Label_0153: {
                        synchronized (this.f) {
                            Session d = this.g.get(this.h);
                            if (d == null) {
                                final Account[] accountsByType = AccountManager.get(this.d).getAccountsByType(com.twitter.library.util.a.a);
                                if (accountsByType.length > 0) {
                                    final String a = cy.a(this.d);
                                    if (a == null) {
                                        break Label_0153;
                                    }
                                    final int length = accountsByType.length;
                                    if (n >= length) {
                                        break Label_0153;
                                    }
                                    Account account = accountsByType[n];
                                    if (account.name.equals(a)) {
                                        if (account == null) {
                                            account = accountsByType[0];
                                        }
                                        final Session a2 = this.a(account.name, account, 0L);
                                        this.c(a2);
                                        return a2;
                                    }
                                    break Label_0159;
                                }
                                else {
                                    d = this.d();
                                    this.c(d);
                                }
                            }
                            return d;
                        }
                    }
                    Account account = null;
                    continue;
                }
                ++n;
                continue Label_0095_Outer;
            }
        }
    }
    
    public Session b(final long n) {
        return this.a(null, null, n);
    }
    
    @Deprecated
    public Session b(final String s) {
        return this.a(s, null, 0L);
    }
    
    public void b(final ay ay) {
        if (ay != null) {
            this.e.remove(ay);
        }
    }
    
    public boolean b(final Session session) {
        boolean b = true;
        if (session == null) {
            return b;
        }
        while (true) {
            synchronized (this.f) {
                if (!this.g.containsKey(session.c())) {
                    return b;
                }
            }
            b = false;
            return b;
        }
    }
    
    public Session c(final String s) {
        synchronized (this.f) {
            return this.g.get(s);
        }
    }
    
    public void c(final Session session) {
        synchronized (this.f) {
            this.h = session.c();
            com.twitter.library.featureswitch.d.a(session.g());
            cy.a(this.d, session.e(), session.g());
            // monitorexit(this.f)
            this.e(session);
        }
    }
    
    public void d(final String s) {
        if (!TextUtils.isEmpty((CharSequence)s)) {
            this.c(this.b(s));
        }
    }
    
    public boolean d(final Session session) {
        while (true) {
            synchronized (this.f) {
                if (this.h != null && this.h.equals(session.c())) {
                    return true;
                }
            }
            return false;
        }
    }
    
    public void e(final String s) {
        if (s != null) {
            this.k.remove(s);
        }
    }
}
