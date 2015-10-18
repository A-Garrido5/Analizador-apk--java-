// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.util;

import android.annotation.SuppressLint;
import java.util.Random;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.UUID;
import android.net.Uri;
import com.twitter.android.ka;
import com.twitter.android.jz;
import java.util.List;
import android.support.v4.content.CursorLoader;
import android.provider.ContactsContract$Profile;
import android.support.v4.content.Loader;
import android.text.TextUtils;
import com.twitter.library.client.az;
import com.twitter.android.client.c;
import com.twitter.library.api.as;
import android.os.Bundle;
import android.util.Log;
import com.twitter.library.client.App;
import android.content.SharedPreferences;
import android.content.Context;

public class y implements x
{
    private static final boolean a;
    private final Context b;
    private SharedPreferences c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    
    static {
        a = (App.l() && Log.isLoggable("InstantSignupHelper", 3));
    }
    
    y(final Context b) {
        this.b = b;
    }
    
    private x g(final String g) {
        this.g = g;
        if (y.a) {
            Log.d("InstantSignupHelper", String.format("setDefaultPassword, password=%s", this.g));
        }
        return this;
    }
    
    private String h(final String s) {
        return "register_" + String.valueOf(s);
    }
    
    @Override
    public x a(final Bundle bundle) {
        if (y.a) {
            Log.d("InstantSignupHelper", "loadFromBundle");
        }
        this.c(bundle.getString("name"));
        this.b(bundle.getString("username"));
        this.f(bundle.getString("email"));
        this.a(bundle.getString("password"));
        this.g(bundle.getString("default_password"));
        this.e(bundle.getString("avatar_uri"));
        return this;
    }
    
    @Override
    public x a(final String f) {
        this.f = f;
        if (y.a) {
            Log.d("InstantSignupHelper", String.format("setPassword, password=%s", this.f));
        }
        return this;
    }
    
    @Override
    public void a(final int n, final as as) {
        final c a = com.twitter.android.client.c.a(this.b);
        final long g = az.a(this.b).b().g();
        switch (n) {
            default: {
                a.a(g, "signup:instant_card:::failure");
                break;
            }
            case 400: {
                a.a(g, "signup:instant_card:login::failure");
            }
            case 403: {
                if (as == null) {
                    break;
                }
                if (as.d != null) {
                    a.a(g, "signup:instant_card:screen_name::failure");
                }
                if (as.b != null) {
                    a.a(g, "signup:instant_card:email::failure");
                }
                if (as.e != null) {
                    a.a(g, "signup:instant_card:password::failure");
                }
                if (as.a != null) {
                    a.a(g, "signup:instant_card:full_name::failure");
                    return;
                }
                break;
            }
        }
    }
    
    @Override
    public void a(final String s, final String s2) {
        com.twitter.android.client.c.a(this.b).a(az.a(this.b).b().g(), "signup:instant_card:" + s + "::fetch_" + s2);
    }
    
    @Override
    public boolean a() {
        return !TextUtils.isEmpty((CharSequence)this.e);
    }
    
    @Override
    public x b(final Bundle bundle) {
        if (y.a) {
            Log.d("InstantSignupHelper", "saveToBundle");
        }
        bundle.putString("name", this.i);
        bundle.putString("username", this.d);
        bundle.putString("email", this.e);
        bundle.putString("password", this.f);
        bundle.putString("default_password", this.g);
        bundle.putString("avatar_uri", this.h);
        return this;
    }
    
    @Override
    public x b(final String d) {
        this.d = d;
        if (y.a) {
            Log.d("InstantSignupHelper", String.format("setUsername, username=%s", this.d));
        }
        return this;
    }
    
    @Override
    public boolean b() {
        final boolean b = !TextUtils.isEmpty((CharSequence)this.e);
        if (y.a) {
            Log.d("InstantSignupHelper", String.format("isEmailAvailableOrRegistrationInProgress, email=%b, registration=%b, !registered=%b", b, this.t(), !this.u()));
        }
        return (b || this.t()) && !this.u();
    }
    
    @Override
    public Loader c() {
        return new CursorLoader(this.b, ContactsContract$Profile.CONTENT_URI, new String[] { "display_name" }, null, null, null);
    }
    
    @Override
    public x c(final String i) {
        this.i = i;
        if (y.a) {
            Log.d("InstantSignupHelper", String.format("setName, name=%s", this.i));
        }
        return this;
    }
    
    @Override
    public String d() {
        return this.i;
    }
    
    @Override
    public void d(final String s) {
        com.twitter.android.client.c.a(this.b).a(az.a(this.b).b().g(), "signup:instant_card::dest_" + s + ":redirect");
    }
    
    public x e(final String h) {
        this.h = h;
        if (y.a) {
            Log.d("InstantSignupHelper", String.format("setAvatarUri, uri=%s", String.valueOf(this.h)));
        }
        return this;
    }
    
    @Override
    public String e() {
        return this.e;
    }
    
    public x f(final String e) {
        this.e = e;
        if (y.a) {
            Log.d("InstantSignupHelper", String.format("setEmail, email=%s", this.e));
        }
        return this;
    }
    
    @Override
    public String f() {
        return this.d;
    }
    
    @Override
    public String g() {
        return this.f;
    }
    
    @Override
    public String h() {
        return this.g;
    }
    
    @Override
    public String i() {
        if (this.h == null) {
            this.n();
        }
        return this.h;
    }
    
    @Override
    public x j() {
        final List b = com.twitter.library.network.c.a(this.b).b();
        if (!b.isEmpty()) {
            this.e = b.get(0);
            if (b.size() == 1) {
                this.a("email", "single");
            }
            else if (b.size() == 2) {
                this.a("email", "double");
            }
            else if (b.size() > 2) {
                this.a("email", "multiple");
            }
        }
        else {
            this.e = "";
        }
        if (TextUtils.isEmpty((CharSequence)this.e)) {
            this.a("email", "failure");
            return this;
        }
        this.a("email", "success");
        return this;
    }
    
    @Override
    public x k() {
        final SharedPreferences y = this.y();
        this.c(y.getString("name", ""));
        this.b(y.getString("username", ""));
        this.f(y.getString("email", ""));
        this.a(y.getString("password", ""));
        this.g(y.getString("default_password", ""));
        this.e(y.getString("avatar_uri", ""));
        if (com.twitter.android.util.y.a) {
            Log.d("InstantSignupHelper", String.format("loadFromPrefs, name=%s, username=%s, email=%s, pwd=%s, dpwd=%s, avatar=%s", this.i, this.d, this.e, this.f, this.g, this.h));
        }
        return this;
    }
    
    @Override
    public x l() {
        return this.b(this.v());
    }
    
    @Override
    public x m() {
        return this.g(this.w());
    }
    
    @Override
    public x n() {
        return this.e(this.x());
    }
    
    @Override
    public x o() {
        new jz(this.b, new z(this)).execute((Object[])new Uri[0]);
        return this;
    }
    
    @Override
    public x p() {
        if (y.a) {
            Log.d("InstantSignupHelper", "saveToPrefs");
        }
        this.y().edit().putString("name", this.i).putString("username", this.d).putString("email", this.e).putString("password", this.f).putString("default_password", this.g).putString("avatar_uri", this.i()).apply();
        return this;
    }
    
    @Override
    public x q() {
        this.y().edit().remove("name").remove("username").remove("email").remove("password").remove("default_password").remove("avatar_uri").apply();
        return this;
    }
    
    @Override
    public x r() {
        final String h = this.h(this.e);
        if (y.a) {
            Log.d("InstantSignupHelper", String.format("registerEmail, key=%s", h));
        }
        this.y().edit().putBoolean(h, true).apply();
        return this;
    }
    
    @Override
    public void s() {
        final long g = az.a(this.b).b().g();
        com.twitter.android.client.c.a(this.b).a(g, "signup:instant_card:::success");
        com.twitter.android.client.c.a(this.b).a(g, "signup::::success");
    }
    
    public boolean t() {
        return !TextUtils.isEmpty((CharSequence)this.d) && !TextUtils.isEmpty((CharSequence)this.f);
    }
    
    public boolean u() {
        final String h = this.h(this.e);
        final boolean boolean1 = this.y().getBoolean(h, false);
        if (y.a) {
            Log.d("InstantSignupHelper", String.format("isEmailRegistered, key=%s, registered=%b", h, boolean1));
        }
        return boolean1;
    }
    
    public String v() {
        return UUID.randomUUID().toString().replace("-", "").substring(0, 15);
    }
    
    @SuppressLint({ "TrulyRandom" })
    public String w() {
        return new BigInteger(100, new SecureRandom()).toString(32);
    }
    
    public String x() {
        return "android.resource://" + this.b.getPackageName() + "/" + 2130837696;
    }
    
    public SharedPreferences y() {
        if (this.c == null) {
            this.c = this.b.getSharedPreferences("instant_signup", 0);
        }
        return this.c;
    }
}
