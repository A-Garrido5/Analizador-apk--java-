// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public enum e
{
    public static final e H;
    public static final e L;
    public static final e M;
    public static final e Q;
    private static final e[] a;
    private final int c;
    
    static {
        L = new e("L", 0, 1);
        M = new e("M", 1, 0);
        Q = new e("Q", 2, 3);
        H = new e("H", 3, 2);
        a = new e[] { e.M, e.L, e.H, e.Q };
    }
    
    private e(final String s, final int n, final int c) {
        this.c = c;
    }
    
    public static e forBits(final int n) {
        while (true) {
            if (n >= 0) {
                try {
                    if (n >= e.a.length) {
                        throw new IllegalArgumentException();
                    }
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
                return e.a[n];
            }
            continue;
        }
    }
    
    public int getBits() {
        return this.c;
    }
}
