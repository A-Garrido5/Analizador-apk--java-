// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

public class bv
{
    public long a;
    public c6 b;
    public int c;
    public String d;
    public long e;
    public int f;
    public long g;
    
    public bv(final String s, final int n, final int n2) {
        this(s, n, n2, 0L, 0L, null);
    }
    
    public bv(final String d, final int c, final int f, final long a, final long g, final c6 b) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.f = f;
        this.b = b;
        this.g = g;
    }
    
    public bv(final String s, final int n, final long n2) {
        this(s, n, n2, 0L);
    }
    
    public bv(final String s, final int n, final long n2, final long n3) {
        this(s, n, 0, n2, n3, null);
    }
    
    public bv(final String s, final int n, final c6 c6) {
        this(s, n, 0, 0L, 0L, c6);
    }
}
