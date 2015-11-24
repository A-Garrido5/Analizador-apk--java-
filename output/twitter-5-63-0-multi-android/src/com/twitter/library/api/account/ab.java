// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.account;

import com.twitter.library.service.d;
import com.twitter.internal.network.l;
import java.io.Serializable;
import android.os.Parcelable;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import java.util.TimeZone;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.service.e;
import com.twitter.library.provider.b;
import com.twitter.library.provider.bg;
import java.util.Locale;
import com.twitter.util.i;
import com.twitter.library.service.f;
import android.accounts.Account;
import com.twitter.library.provider.ae;
import com.twitter.library.api.bh;
import com.twitter.library.util.be;
import java.util.ArrayList;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.util.a;
import com.twitter.library.client.az;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.api.UserSettings;
import com.twitter.library.service.c;

public class ab extends c
{
    private boolean a;
    private String e;
    private String f;
    private UserSettings g;
    private String h;
    private String i;
    private String j;
    private boolean k;
    
    private ab(final Context context, final Session session) {
        super(context, x.class.getName(), session);
    }
    
    private ab(final Context context, final Session session, final UserSettings g, final boolean a, final String e) {
        super(context, x.class.getName(), session);
        this.g = g;
        this.a = a;
        this.e = e;
        String e2;
        if (e != null) {
            e2 = session.e();
        }
        else {
            e2 = null;
        }
        this.f = e2;
    }
    
    private ab(final Context context, final Session session, final String e, final String h, final String i, final String j, final boolean k) {
        super(context, x.class.getName(), session);
        this.e = e;
        this.f = session.e();
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
    }
    
    public static ab a(final Context context, final Session session) {
        final ab ab = new ab(context, session);
        ab.j("Settings fetch is never triggered by a user action.");
        ab.g(1);
        return ab;
    }
    
    public static ab a(final Context context, final Session session, final UserSettings userSettings, final boolean b, final String s) {
        final ab ab = new ab(context, session, userSettings, b, s);
        ab.g(2);
        return ab;
    }
    
    public static ab a(final Context context, final Session session, final String s, final String s2, final String s3, final String s4, final boolean b) {
        final ab ab = new ab(context, session, s, s2, s3, s4, b);
        ab.g(3);
        return ab;
    }
    
    private void a(final UserSettings userSettings) {
        final com.twitter.library.service.ab p = this.P();
        if (p != null) {
            final Session c = az.a(this.p).c(p.a);
            if (c != null) {
                final UserSettings j = c.j();
                if (j != null) {
                    userSettings.s = j.s;
                }
                c.a(userSettings);
                com.twitter.library.util.a.a(this.p, c.e(), null, userSettings);
            }
        }
    }
    
    private void a(UserSettings userSettings, final ArrayList list, final int n) {
        if (n == 200 || n == 403) {
            final com.twitter.library.service.ab p3 = this.P();
            if (p3 != null) {
                final Session c = az.a(this.p).c(p3.a);
                if (c != null) {
                    final UserSettings j = c.j();
                    if (n != 200) {
                        if (j != null) {
                            j.j = this.k;
                        }
                        userSettings = j;
                    }
                    if (userSettings != null) {
                        this.a(c, userSettings);
                        if (be.b(list) == null && this.f != null && this.e != null && !this.f.equals(this.e)) {
                            userSettings.m = this.e;
                            this.a(c, userSettings, this.f);
                        }
                    }
                }
            }
        }
    }
    
    private void a(final Session session, final UserSettings userSettings) {
        final UserSettings j = session.j();
        if (j != null) {
            userSettings.s = j.s;
        }
        session.a(userSettings);
        com.twitter.library.util.a.a(this.p, session.e(), null, userSettings);
    }
    
    private void a(final Session session, final UserSettings userSettings, final String s) {
        final String m = userSettings.m;
        final TwitterUser f = session.f();
        if (f != null) {
            f.username = m;
            session.a(f);
            final Account a = com.twitter.library.util.a.a(this.p, m, session.h(), bh.a(f));
            com.twitter.library.util.a.a(this.p, m, null, userSettings);
            if (com.twitter.library.util.a.a(this.p, s, ae.c)) {
                com.twitter.library.util.a.a(a, ae.c, true);
            }
            session.a(m);
            com.twitter.library.util.a.b(this.p, s);
        }
    }
    
    @Deprecated
    private void a(final f f) {
        final Locale locale = this.p.getResources().getConfiguration().locale;
        if (locale != null) {
            f.a("locale", locale.getCountry()).a("lang", com.twitter.util.i.b(locale));
        }
    }
    
    private void b(final UserSettings userSettings) {
        if (userSettings.a == this.g.a) {
            userSettings.b = this.g.b;
        }
        final com.twitter.library.service.ab p = this.P();
        if (userSettings.n != null && p != null) {
            final bg v = this.V();
            final b w = this.W();
            if (userSettings.n.equals("none")) {
                v.b(p.c, 1024, w);
            }
            else {
                v.a(p.c, 1024, w);
            }
        }
        this.a(userSettings);
        final String m = userSettings.m;
        if (this.f != null && m != null && !this.f.equals(m) && p != null) {
            this.a(az.a(this.p).c(p.a), userSettings, this.f);
        }
    }
    
    @Override
    protected e a() {
        final f m = this.M();
        switch (this.O()) {
            default: {
                throw new IllegalArgumentException("Invalid/unknown action: " + this.O());
            }
            case 1: {
                m.a(new Object[] { "account", "settings" });
                this.a(m);
                break;
            }
            case 2: {
                m.a(HttpOperation$RequestMethod.b);
                m.a(new Object[] { "account", "settings" });
                this.a(m);
                if (this.e != null) {
                    this.g.m = this.e;
                    m.a("old_screen_name", this.f);
                }
                m.a("geo_enabled", String.valueOf(this.g.c)).a("protected", String.valueOf(this.g.j)).a("discoverable_by_email", String.valueOf(this.g.i)).a("discoverable_by_mobile_phone", String.valueOf(this.g.l)).a("display_sensitive_media", String.valueOf(this.g.k)).a("screen_name", this.g.m).a("email_follow_enabled", String.valueOf(this.g.o)).a("allow_ads_personalization", String.valueOf(this.g.q)).a("sleep_time_enabled", String.valueOf(this.g.e));
                if (this.g.e) {
                    m.a("start_sleep_time", this.g.a()).a("end_sleep_time", this.g.b()).a("time_zone", TimeZone.getDefault().getID());
                }
                if (this.a) {
                    if (this.g.s) {
                        m.a("personalized_trends", "true");
                    }
                    else {
                        m.a("trend_location_woeid", String.valueOf(this.g.a));
                    }
                }
                if (this.g.n != null) {
                    m.a("allow_media_tagging", String.valueOf(this.g.n));
                }
                if (this.g.r != null) {
                    m.a("allow_dms_from", String.valueOf(this.g.r));
                    break;
                }
                break;
            }
            case 3: {
                m.a(HttpOperation$RequestMethod.b);
                m.a(new Object[] { "account", "settings" });
                this.a(m);
                m.a("protected", String.valueOf(this.k));
                if (this.e != null) {
                    m.a("screen_name", this.e);
                }
                if (this.j != null) {
                    m.a("email", this.j);
                }
                if (this.h != null) {
                    m.a("current_password", this.h);
                }
                if (this.i != null) {
                    m.a("new_password", this.i);
                    m.a("password_confirmation", this.i);
                    break;
                }
                break;
            }
        }
        return m.a();
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final com.twitter.library.api.bg bg) {
        switch (this.O()) {
            case 1: {
                if (!httpOperation.k()) {
                    break;
                }
                final UserSettings userSettings = (UserSettings)bg.a();
                if (userSettings != null) {
                    aa.c.putParcelable("SETTINGS", (Parcelable)userSettings);
                    this.a(userSettings);
                    return;
                }
                break;
            }
            case 2: {
                if (!httpOperation.k()) {
                    break;
                }
                final UserSettings userSettings2 = (UserSettings)bg.a();
                if (userSettings2 != null) {
                    aa.c.putParcelable("SETTINGS", (Parcelable)userSettings2);
                    if (this.f != null) {
                        aa.c.putString("OLD_SCREEN_NAME", this.f);
                    }
                    this.b(userSettings2);
                    return;
                }
                break;
            }
            case 3: {
                UserSettings userSettings3;
                ArrayList list;
                if (httpOperation.k()) {
                    userSettings3 = (UserSettings)bg.a();
                    list = null;
                }
                else {
                    list = (ArrayList)bg.a();
                    aa.c.putSerializable("CUSTOM_ERRORS", (Serializable)list);
                    userSettings3 = null;
                }
                final l f = aa.f();
                int n;
                if (f != null) {
                    n = f.a;
                }
                else {
                    n = aa.c();
                }
                this.a(userSettings3, list, n);
            }
        }
    }
    
    protected com.twitter.library.api.bg b() {
        return com.twitter.library.api.bg.a(10);
    }
}
