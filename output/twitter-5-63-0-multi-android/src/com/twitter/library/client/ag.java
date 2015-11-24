// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.client;

import com.twitter.library.scribe.ScribeDatabaseHelper;
import com.twitter.library.provider.bg;
import com.twitter.library.provider.b;
import com.twitter.util.d;
import android.content.Context;

public class ag
{
    private static ag a;
    private final Context b;
    private final az c;
    
    private ag(final Context b) {
        this.b = b;
        this.c = az.a(b);
    }
    
    public static ag a(final Context context) {
        synchronized (ag.class) {
            if (ag.a == null) {
                ag.a = new ag(context.getApplicationContext());
            }
            return ag.a;
        }
    }
    
    public k a(final Context context, final String s, final String s2) {
        return new k(context, s, s2);
    }
    
    public void a() {
        d.c();
        final Session b = az.a(this.b).b();
        final k k = new k(this.b, b.e(), "decider");
        if (k.getBoolean("cache_dirty", false)) {
            final b b2 = new b(this.b.getContentResolver());
            bg.a(this.b, b.g()).b(b2);
            b2.a();
            ScribeDatabaseHelper.a(this.b, b.g()).b();
            k.a().a("cache_dirty").apply();
        }
    }
    
    public void a(final long n) {
        final Session b = this.c.b();
        if (n != b.g()) {
            return;
        }
        final k a = this.a(this.b, b.e(), "decider");
        final int int1 = a.getInt("cache_version", -1);
        final int a2 = com.twitter.library.featureswitch.d.a("cache_version", -1);
        if (int1 != -1) {
            if (int1 < a2) {
                a.a().a("cache_version", a2).a("cache_dirty", true).apply();
            }
        }
        else {
            a.a().a("cache_version", a2).apply();
        }
        v.a(this.b).a();
    }
}
