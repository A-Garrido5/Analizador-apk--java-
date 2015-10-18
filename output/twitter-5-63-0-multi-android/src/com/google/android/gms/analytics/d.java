// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.analytics;

public class d
{
    private static a a;
    private static volatile boolean b;
    private static b c;
    
    static {
        d.b = false;
    }
    
    static b a() {
        synchronized (d.class) {
            if (d.b) {
                if (d.c == null) {
                    d.c = new e();
                }
                return d.c;
            }
            if (d.a == null) {
                d.a = com.google.android.gms.analytics.a.a();
            }
            if (d.a != null) {
                return d.a.b();
            }
        }
        // monitorexit(d.class)
        return null;
    }
    
    public static void a(final String s) {
        final b a = a();
        if (a != null) {
            a.b(s);
        }
    }
    
    public static void b(final String s) {
        final b a = a();
        if (a != null) {
            a.a(s);
        }
    }
}
