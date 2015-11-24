// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class k1
{
    private int a;
    private int b;
    private int[] c;
    private int d;
    
    private k1(final int a, final int[] c, final int d, final int b) {
        this.a = a;
        this.c = c;
        this.d = d;
        this.b = b;
    }
    
    k1(final int n, final int[] array, final int n2, final int n3, final r0 r0) {
        this(n, array, n2, n3);
    }
    
    static int a(final k1 k1) {
        return k1.b;
    }
    
    static int b(final k1 k1) {
        return k1.d;
    }
    
    static int c(final k1 k1) {
        return k1.a;
    }
    
    public int a() {
        return this.c.length;
    }
    
    public int a(final int n) {
        return this.c[n];
    }
}
