// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

final class Z implements aK
{
    private final boolean a;
    private final el b;
    private final int c;
    private final dw d;
    private final boolean e;
    
    private Z(final dw d, final int c, final el b, final boolean e, final boolean a) {
        this.d = d;
        this.c = c;
        this.b = b;
        this.e = e;
        this.a = a;
    }
    
    Z(final dw dw, final int n, final el el, final boolean b, final boolean b2, final cM cm) {
        this(dw, n, el, b, b2);
    }
    
    static el b(final Z z) {
        return z.b;
    }
    
    static boolean c(final Z z) {
        return z.e;
    }
    
    public int a(final Z z) {
        return this.c - z.c;
    }
    
    @Override
    public aJ a(final aJ aj, final ci ci) {
        return ((gm)aj).a((dD)ci);
    }
    
    public dw a() {
        return this.d;
    }
    
    @Override
    public boolean a() {
        return this.a;
    }
    
    @Override
    public boolean b() {
        return this.e;
    }
    
    @Override
    public int c() {
        return this.c;
    }
    
    @Override
    public int compareTo(final Object o) {
        return this.a((Z)o);
    }
    
    @Override
    public es d() {
        return this.b.getJavaType();
    }
    
    @Override
    public el e() {
        return this.b;
    }
}
