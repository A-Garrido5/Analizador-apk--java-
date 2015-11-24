// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import java.io.UnsupportedEncodingException;

public final class qp
{
    private final byte[] a;
    private final int b;
    private int c;
    
    private qp(final byte[] a, final int c, final int n) {
        this.a = a;
        this.c = c;
        this.b = c + n;
    }
    
    public static qp a(final byte[] array) {
        return a(array, 0, array.length);
    }
    
    public static qp a(final byte[] array, final int n, final int n2) {
        return new qp(array, n, n2);
    }
    
    public static int b(final int n) {
        if (n >= 0) {
            return f(n);
        }
        return 10;
    }
    
    public static int b(final int n, final int n2) {
        return d(n) + b(n2);
    }
    
    public static int b(final int n, final long n2) {
        return d(n) + b(n2);
    }
    
    public static int b(final int n, final da da) {
        return 2 * d(n) + c(da);
    }
    
    public static int b(final int n, final String s) {
        return d(n) + b(s);
    }
    
    public static int b(final int n, final boolean b) {
        return d(n) + b(b);
    }
    
    public static int b(final long n) {
        return d(n);
    }
    
    public static int b(final String s) {
        try {
            final byte[] bytes = s.getBytes("UTF-8");
            return bytes.length + f(bytes.length);
        }
        catch (UnsupportedEncodingException ex) {
            throw new RuntimeException("UTF-8 not supported.");
        }
    }
    
    public static int b(final boolean b) {
        return 1;
    }
    
    public static int c(final int n, final da da) {
        return d(n) + d(da);
    }
    
    public static int c(final da da) {
        return da.f();
    }
    
    public static int d(final int n) {
        return f(dd.a(n, 0));
    }
    
    public static int d(final long n) {
        if ((0xFFFFFFFFFFFFFF80L & n) == 0x0L) {
            return 1;
        }
        if ((0xFFFFFFFFFFFFC000L & n) == 0x0L) {
            return 2;
        }
        if ((0xFFFFFFFFFFE00000L & n) == 0x0L) {
            return 3;
        }
        if ((0xFFFFFFFFF0000000L & n) == 0x0L) {
            return 4;
        }
        if ((0xFFFFFFF800000000L & n) == 0x0L) {
            return 5;
        }
        if ((0xFFFFFC0000000000L & n) == 0x0L) {
            return 6;
        }
        if ((0xFFFE000000000000L & n) == 0x0L) {
            return 7;
        }
        if ((0xFF00000000000000L & n) == 0x0L) {
            return 8;
        }
        if ((Long.MIN_VALUE & n) == 0x0L) {
            return 9;
        }
        return 10;
    }
    
    public static int d(final da da) {
        final int f = da.f();
        return f + f(f);
    }
    
    public static int f(final int n) {
        if ((n & 0xFFFFFF80) == 0x0) {
            return 1;
        }
        if ((n & 0xFFFFC000) == 0x0) {
            return 2;
        }
        if ((0xFFE00000 & n) == 0x0) {
            return 3;
        }
        if ((0xF0000000 & n) == 0x0) {
            return 4;
        }
        return 5;
    }
    
    public void a(final byte b) {
        if (this.c == this.b) {
            throw new qp$a(this.c, this.b);
        }
        this.a[this.c++] = b;
    }
    
    public void a(final int n) {
        if (n >= 0) {
            this.e(n);
            return;
        }
        this.c((long)n);
    }
    
    public void a(final int n, final int n2) {
        this.c(n, 0);
        this.a(n2);
    }
    
    public void a(final int n, final long n2) {
        this.c(n, 0);
        this.a(n2);
    }
    
    public void a(final int n, final da da) {
        this.c(n, 2);
        this.b(da);
    }
    
    public void a(final int n, final String s) {
        this.c(n, 2);
        this.a(s);
    }
    
    public void a(final int n, final boolean b) {
        this.c(n, 0);
        this.a(b);
    }
    
    public void a(final long n) {
        this.c(n);
    }
    
    public void a(final da da) {
        da.a(this);
    }
    
    public void a(final String s) {
        final byte[] bytes = s.getBytes("UTF-8");
        this.e(bytes.length);
        this.b(bytes);
    }
    
    public void a(final boolean b) {
        int n;
        if (b) {
            n = 1;
        }
        else {
            n = 0;
        }
        this.c(n);
    }
    
    public void b(final da da) {
        this.e(da.e());
        da.a(this);
    }
    
    public void b(final byte[] array) {
        this.b(array, 0, array.length);
    }
    
    public void b(final byte[] array, final int n, final int n2) {
        if (this.b - this.c >= n2) {
            System.arraycopy(array, n, this.a, this.c, n2);
            this.c += n2;
            return;
        }
        throw new qp$a(this.c, this.b);
    }
    
    public void c(final int n) {
        this.a((byte)n);
    }
    
    public void c(final int n, final int n2) {
        this.e(dd.a(n, n2));
    }
    
    public void c(long n) {
        while ((0xFFFFFFFFFFFFFF80L & n) != 0x0L) {
            this.c(0x80 | (0x7F & (int)n));
            n >>>= 7;
        }
        this.c((int)n);
    }
    
    public void e(int n) {
        while ((n & 0xFFFFFF80) != 0x0) {
            this.c(0x80 | (n & 0x7F));
            n >>>= 7;
        }
        this.c(n);
    }
}
