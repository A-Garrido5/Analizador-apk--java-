// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.network;

public class g
{
    private static int a;
    private static int b;
    private static int c;
    private static int d;
    private final k e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    
    static {
        g.a = 90000;
        g.b = 20000;
        g.c = 60000;
        g.d = 2;
    }
    
    public g() {
        this(null);
    }
    
    public g(final k k) {
        this(k, d(), e());
    }
    
    public g(final k k, final int n, final int n2) {
        this(k, n, n2, g(), f());
    }
    
    public g(final k e, final int g, final int f, final int h, final int i) {
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public static void a(final int b, final int a) {
        g.b = b;
        g.a = a;
    }
    
    public static int d() {
        return g.a;
    }
    
    public static int e() {
        return g.b;
    }
    
    public static int f() {
        return g.d;
    }
    
    public static int g() {
        return g.c;
    }
    
    public k a() {
        return this.e;
    }
    
    public int b() {
        return this.f;
    }
    
    public int c() {
        return this.g;
    }
}
