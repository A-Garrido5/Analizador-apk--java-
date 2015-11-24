// 
// Decompiled by Procyon v0.5.30
// 

package com.fasterxml.jackson.core.util;

public class a
{
    private static final int[] c;
    private static final int[] d;
    protected final byte[][] a;
    protected final char[][] b;
    
    static {
        c = new int[] { 8000, 8000, 2000, 2000 };
        d = new int[] { 4000, 4000, 200, 200 };
    }
    
    public a() {
        this(4, 4);
    }
    
    protected a(final int n, final int n2) {
        this.a = new byte[n][];
        this.b = new char[n2][];
    }
    
    public final void a(final int n, final byte[] array) {
        this.a[n] = array;
    }
    
    public void a(final int n, final char[] array) {
        this.b[n] = array;
    }
    
    public final byte[] a(final int n) {
        return this.a(n, 0);
    }
    
    public byte[] a(final int n, int n2) {
        final int c = this.c(n);
        if (n2 < c) {
            n2 = c;
        }
        final byte[] array = this.a[n];
        if (array == null || array.length < n2) {
            return this.e(n2);
        }
        this.a[n] = null;
        return array;
    }
    
    public final char[] b(final int n) {
        return this.b(n, 0);
    }
    
    public char[] b(final int n, int n2) {
        final int d = this.d(n);
        if (n2 < d) {
            n2 = d;
        }
        final char[] array = this.b[n];
        if (array == null || array.length < n2) {
            return this.f(n2);
        }
        this.b[n] = null;
        return array;
    }
    
    protected int c(final int n) {
        return com.fasterxml.jackson.core.util.a.c[n];
    }
    
    protected int d(final int n) {
        return com.fasterxml.jackson.core.util.a.d[n];
    }
    
    protected byte[] e(final int n) {
        return new byte[n];
    }
    
    protected char[] f(final int n) {
        return new char[n];
    }
}
