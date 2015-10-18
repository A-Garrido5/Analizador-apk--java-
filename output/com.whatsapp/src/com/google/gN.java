// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public final class gN
{
    public static final gN a;
    public static final gN c;
    public static final gN d;
    public static final gN g;
    public static final gN h;
    public static final gN m;
    public static boolean n;
    public static final gN o;
    public static final gN p;
    private static final String z;
    private final r b;
    private final int e;
    private final r f;
    private final int i;
    private final int[] j;
    private final int[] k;
    private final int l;
    
    static {
        final char[] charArray = "\u0000zJKB".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c2 = charArray[n];
            char c3 = '\0';
            switch (n % 5) {
                default: {
                    c3 = ':';
                    break;
                }
                case 0: {
                    c3 = 'G';
                    break;
                }
                case 1: {
                    c3 = '<';
                    break;
                }
                case 2: {
                    c3 = 'b';
                    break;
                }
                case 3: {
                    c3 = '{';
                    break;
                }
            }
            charArray[n] = (char)(c3 ^ c2);
        }
        z = new String(charArray).intern();
        c = new gN(4201, 4096, 1);
        a = new gN(1033, 1024, 1);
        g = new gN(67, 64, 1);
        h = new gN(19, 16, 1);
        p = new gN(285, 256, 0);
        o = new gN(301, 256, 1);
        m = gN.o;
        d = gN.g;
    }
    
    public gN(final int l, final int e, final int i) {
        this.l = l;
        this.e = e;
        this.i = i;
        this.k = new int[e];
        this.j = new int[e];
        int j = 0;
        int n = 1;
        while (j < e) {
            this.k[j] = n;
            n *= 2;
            if (n >= e) {
                n = ((n ^ l) & e - 1);
            }
            ++j;
        }
        int k = 0;
        while (k < e - 1) {
            try {
                this.j[this.k[k]] = k;
                ++k;
                continue;
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
            break;
        }
        this.b = new r(this, new int[] { 0 });
        this.f = new r(this, new int[] { 1 });
    }
    
    static int c(final int n, final int n2) {
        return n ^ n2;
    }
    
    public int a() {
        return this.e;
    }
    
    int a(final int n) {
        if (n == 0) {
            try {
                throw new ArithmeticException();
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
        return this.k[-1 + (this.e - this.j[n])];
    }
    
    r a(final int n, final int n2) {
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
                return this.b;
            }
            catch (IllegalArgumentException ex2) {
                throw ex2;
            }
        }
        final int[] array = new int[n + 1];
        array[0] = n2;
        return new r(this, array);
    }
    
    public int b() {
        return this.i;
    }
    
    int b(final int n) {
        if (n == 0) {
            try {
                throw new IllegalArgumentException();
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
        return this.j[n];
    }
    
    int b(final int n, final int n2) {
        if (n == 0 || n2 == 0) {
            return 0;
        }
        return this.k[(this.j[n] + this.j[n2]) % (-1 + this.e)];
    }
    
    int c(final int n) {
        return this.k[n];
    }
    
    r c() {
        return this.b;
    }
    
    r d() {
        return this.f;
    }
    
    @Override
    public String toString() {
        return gN.z + Integer.toHexString(this.l) + ',' + this.e + ')';
    }
}
