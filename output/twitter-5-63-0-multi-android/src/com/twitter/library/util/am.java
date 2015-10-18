// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.util;

import android.content.SharedPreferences;
import android.content.Context;

public class am
{
    private static am a;
    private Context b;
    private SharedPreferences c;
    private Boolean d;
    private Boolean e;
    
    private am(final Context context) {
        this.b = context.getApplicationContext();
    }
    
    public static am a(final Context context) {
        synchronized (am.class) {
            if (am.a == null) {
                (am.a = new am(context)).e();
            }
            return am.a;
        }
    }
    
    private SharedPreferences d() {
        if (this.c == null) {
            this.c = this.b.getSharedPreferences("logged_out_settings", 0);
        }
        return this.c;
    }
    
    private void e() {
        this.a(Boolean.valueOf(this.d().getBoolean("email_disco", true)));
        this.b(this.d().getBoolean("phone_disco", true));
    }
    
    public am a(final Boolean d) {
        this.d = d;
        return this;
    }
    
    public boolean a() {
        return this.d;
    }
    
    public am b(final Boolean e) {
        this.e = e;
        return this;
    }
    
    public boolean b() {
        return this.e;
    }
    
    public am c() {
        this.d().edit().putBoolean("email_disco", (boolean)this.d).putBoolean("phone_disco", (boolean)this.e).apply();
        return this;
    }
}
