// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.List;

public final class aS
{
    private Integer a;
    private final String b;
    private final byte[] c;
    private final String d;
    private final int e;
    private final int f;
    private Object g;
    private Integer h;
    private final List i;
    
    public aS(final byte[] array, final String s, final List list, final String s2) {
        this(array, s, list, s2, -1, -1);
    }
    
    public aS(final byte[] c, final String d, final List i, final String b, final int f, final int e) {
        this.c = c;
        this.d = d;
        this.i = i;
        this.b = b;
        this.e = e;
        this.f = f;
    }
    
    public String a() {
        return this.d;
    }
    
    public void a(final Integer a) {
        this.a = a;
    }
    
    public void a(final Object g) {
        this.g = g;
    }
    
    public int b() {
        return this.f;
    }
    
    public void b(final Integer h) {
        this.h = h;
    }
    
    public String c() {
        return this.b;
    }
    
    public Object d() {
        return this.g;
    }
    
    public byte[] e() {
        return this.c;
    }
    
    public List f() {
        return this.i;
    }
    
    public int g() {
        return this.e;
    }
    
    public boolean h() {
        return this.e >= 0 && this.f >= 0;
    }
}
