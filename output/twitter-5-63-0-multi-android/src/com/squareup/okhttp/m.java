// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp;

import java.net.InetSocketAddress;
import java.net.Proxy;

public class m
{
    final a a;
    final Proxy b;
    final InetSocketAddress c;
    final boolean d;
    
    public m(final a a, final Proxy b, final InetSocketAddress c, final boolean d) {
        if (a == null) {
            throw new NullPointerException("address == null");
        }
        if (b == null) {
            throw new NullPointerException("proxy == null");
        }
        if (c == null) {
            throw new NullPointerException("inetSocketAddress == null");
        }
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public a a() {
        return this.a;
    }
    
    public Proxy b() {
        return this.b;
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = o instanceof m;
        boolean b2 = false;
        if (b) {
            final m m = (m)o;
            final boolean equals = this.a.equals(m.a);
            b2 = false;
            if (equals) {
                final boolean equals2 = this.b.equals(m.b);
                b2 = false;
                if (equals2) {
                    final boolean equals3 = this.c.equals(m.c);
                    b2 = false;
                    if (equals3) {
                        final boolean d = this.d;
                        final boolean d2 = m.d;
                        b2 = false;
                        if (d == d2) {
                            b2 = true;
                        }
                    }
                }
            }
        }
        return b2;
    }
    
    @Override
    public int hashCode() {
        final int n = 31 * (31 * (527 + this.a.hashCode()) + this.b.hashCode()) + this.c.hashCode();
        int n2;
        if (this.d) {
            n2 = n * 31;
        }
        else {
            n2 = 0;
        }
        return n2 + n;
    }
}
