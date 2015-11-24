// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

final class fB
{
    private int a;
    private fl b;
    
    fB() {
        this.a = 0;
        this.b = fl.NUMERIC;
    }
    
    void a() {
        this.b = fl.ALPHA;
    }
    
    void a(final int n) {
        this.a += n;
    }
    
    void b() {
        this.b = fl.NUMERIC;
    }
    
    void b(final int a) {
        this.a = a;
    }
    
    boolean c() {
        return this.b == fl.ISO_IEC_646;
    }
    
    boolean d() {
        return this.b == fl.ALPHA;
    }
    
    void e() {
        this.b = fl.ISO_IEC_646;
    }
    
    int f() {
        return this.a;
    }
}
