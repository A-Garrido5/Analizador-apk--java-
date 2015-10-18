// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

final class N
{
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private int e;
    
    N(final int b, final int a, final int d, final int c) {
        this.e = -1;
        this.b = b;
        this.a = a;
        this.d = d;
        this.c = c;
    }
    
    void a(final int e) {
        this.e = e;
    }
    
    boolean a() {
        return this.b(this.e);
    }
    
    int b() {
        return this.a;
    }
    
    boolean b(final int n) {
        return n != -1 && this.d == 3 * (n % 3);
    }
    
    int c() {
        return this.c;
    }
    
    void d() {
        this.e = 3 * (this.c / 30) + this.d / 3;
    }
    
    int e() {
        return this.d;
    }
    
    int f() {
        return this.b;
    }
    
    int g() {
        return this.a - this.b;
    }
    
    int h() {
        return this.e;
    }
    
    @Override
    public String toString() {
        return this.e + "|" + this.c;
    }
}
