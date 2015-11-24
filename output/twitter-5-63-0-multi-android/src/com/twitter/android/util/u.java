// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.util;

import com.twitter.library.util.bk;
import com.twitter.library.client.k;
import android.preference.PreferenceManager;
import android.content.Context;
import android.content.SharedPreferences;

public class u
{
    private final int a;
    private final long b;
    private final String c;
    private final String d;
    private final SharedPreferences e;
    
    public u(final Context context, final String s, final int a, final long b, final String s2) {
        this.c = s + "_amount";
        this.d = s + "_last_active";
        this.a = a;
        this.b = b;
        if (s2 == null) {
            this.e = PreferenceManager.getDefaultSharedPreferences(context);
            return;
        }
        this.e = (SharedPreferences)new k(context, s2, "fatigue");
    }
    
    public boolean a() {
        final int int1 = this.e.getInt(this.c, 0);
        final long long1 = this.e.getLong(this.d, 0L);
        final int a = this.a;
        boolean b = false;
        if (int1 < a) {
            final long n = lcmp(bk.a() - long1, this.b);
            b = false;
            if (n > 0) {
                b = true;
            }
        }
        return b;
    }
    
    public void b() {
        this.e.edit().putInt(this.c, this.e.getInt(this.c, 0) + 1).putLong(this.d, bk.a()).apply();
    }
}
