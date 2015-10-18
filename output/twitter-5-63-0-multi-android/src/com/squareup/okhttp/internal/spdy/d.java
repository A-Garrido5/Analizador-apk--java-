// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp.internal.spdy;

public final class d
{
    public static final bk a;
    public static final bk b;
    public static final bk c;
    public static final bk d;
    public static final bk e;
    public static final bk f;
    public static final bk g;
    public final bk h;
    public final bk i;
    final int j;
    
    static {
        a = bk.a(":status");
        b = bk.a(":method");
        c = bk.a(":path");
        d = bk.a(":scheme");
        e = bk.a(":authority");
        f = bk.a(":host");
        g = bk.a(":version");
    }
    
    public d(final bk h, final bk i) {
        this.h = h;
        this.i = i;
        this.j = 32 + h.e() + i.e();
    }
    
    public d(final bk bk, final String s) {
        this(bk, bk.a(s));
    }
    
    public d(final String s, final String s2) {
        this(bk.a(s), bk.a(s2));
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = o instanceof d;
        boolean b2 = false;
        if (b) {
            final d d = (d)o;
            final boolean equals = this.h.equals(d.h);
            b2 = false;
            if (equals) {
                final boolean equals2 = this.i.equals(d.i);
                b2 = false;
                if (equals2) {
                    b2 = true;
                }
            }
        }
        return b2;
    }
    
    @Override
    public int hashCode() {
        return 31 * (527 + this.h.hashCode()) + this.i.hashCode();
    }
    
    @Override
    public String toString() {
        return String.format("%s: %s", this.h.a(), this.i.a());
    }
}
