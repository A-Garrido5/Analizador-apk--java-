// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public final class bp
{
    public static final bp b;
    public static int c;
    private final int[] a;
    private final aR d;
    private final int e;
    private final int[] f;
    private final aR g;
    
    static {
        b = new bp(929, 3);
    }
    
    private bp(final int e, final int n) {
        this.e = e;
        this.f = new int[e];
        this.a = new int[e];
        int i = 0;
        int n2 = 1;
        while (i < e) {
            this.f[i] = n2;
            n2 = n2 * n % e;
            ++i;
        }
        int j = 0;
        while (j < e - 1) {
            try {
                this.a[this.f[j]] = j;
                ++j;
                continue;
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
            break;
        }
        this.d = new aR(this, new int[] { 0 });
        this.g = new aR(this, new int[] { 1 });
    }
    
    int a() {
        return this.e;
    }
    
    int a(final int n) {
        if (n == 0) {
            try {
                throw new IllegalArgumentException();
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
        return this.a[n];
    }
    
    aR a(final int n, final int n2) {
        if (n < 0) {
            try {
                throw new IllegalArgumentException();
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
        if (n2 == 0) {
            try {
                return this.d;
            }
            catch (IllegalArgumentException ex2) {
                throw ex2;
            }
        }
        final int[] array = new int[n + 1];
        array[0] = n2;
        return new aR(this, array);
    }
    
    int b(final int n) {
        return this.f[n];
    }
    
    int b(final int n, final int n2) {
        return (n + this.e - n2) % this.e;
    }
    
    aR b() {
        return this.g;
    }
    
    int c(final int n) {
        if (n == 0) {
            try {
                throw new ArithmeticException();
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
        return this.f[-1 + (this.e - this.a[n])];
    }
    
    int c(final int n, final int n2) {
        if (n == 0 || n2 == 0) {
            return 0;
        }
        return this.f[(this.a[n] + this.a[n2]) % (-1 + this.e)];
    }
    
    aR c() {
        return this.d;
    }
    
    int d(final int n, final int n2) {
        return (n + n2) % this.e;
    }
}
