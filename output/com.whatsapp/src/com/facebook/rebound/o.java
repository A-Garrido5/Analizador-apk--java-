// 
// Decompiled by Procyon v0.5.30
// 

package com.facebook.rebound;

public class o
{
    public static o b;
    public double a;
    public double c;
    
    static {
        o.b = a(40.0, 7.0);
    }
    
    public o(final double c, final double a) {
        this.c = c;
        this.a = a;
    }
    
    public static o a(final double n, final double n2) {
        return new o(com.facebook.rebound.b.b(n), com.facebook.rebound.b.c(n2));
    }
}
