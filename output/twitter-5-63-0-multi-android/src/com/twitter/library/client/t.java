// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.client;

import android.content.Context;

public class t
{
    public static long a(final Context context, final String s) {
        synchronized (t.class) {
            final k b = b(context, s);
            long n = b.getLong("read_", 0L);
            if (n == 0L) {
                n = System.currentTimeMillis();
                b.a().a("read_", n).apply();
            }
            return n;
        }
    }
    
    public static void a(final Context context, final String s, final long n) {
        synchronized (t.class) {
            b(context, s).a().a("read_", n).apply();
        }
    }
    
    private static k b(final Context context, final String s) {
        return new k(context, s, "activity");
    }
    
    public static boolean b(final Context context, final String s, final long n) {
        synchronized (t.class) {
            final k b = b(context, s);
            boolean b2;
            if (n > b.getLong("read_", 0L)) {
                b.a().a("read_", n).apply();
                b2 = true;
            }
            else {
                b2 = false;
            }
            return b2;
        }
    }
}
