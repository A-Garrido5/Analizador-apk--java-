// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.util;

import android.preference.PreferenceManager;
import android.content.Context;
import android.content.SharedPreferences;

public class ar
{
    private static ar a;
    private final SharedPreferences b;
    private boolean c;
    
    private ar(final Context context) {
        this.b = PreferenceManager.getDefaultSharedPreferences(context);
        this.c = this.b.getBoolean("phone_verified", false);
    }
    
    public static ar a(final Context context) {
        if (ar.a == null) {
            ar.a = new ar(context);
        }
        return ar.a;
    }
    
    public void a() {
        this.b.edit().remove("phone_verified").remove("last_phone_verified_request").apply();
        this.c = false;
    }
    
    public void a(final boolean b, final boolean b2) {
        this.a(b, b2, System.currentTimeMillis());
    }
    
    public void a(final boolean c, final boolean b, final long n) {
        this.b.edit().putBoolean("phone_verified", c).putLong("last_phone_verified_request", n).apply();
        if (b) {
            this.c = c;
        }
    }
    
    public boolean b() {
        return this.c;
    }
    
    public boolean c() {
        return 86400000L + this.b.getLong("last_phone_verified_request", 0L) < System.currentTimeMillis();
    }
}
