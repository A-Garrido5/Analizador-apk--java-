// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Flushable;

final class aq implements Flushable
{
    private final byte[] a;
    private final int b;
    private int c;
    private final OutputStream d;
    
    private aq(final OutputStream d, final byte[] a) {
        this.d = d;
        this.a = a;
        this.c = 0;
        this.b = a.length;
    }
    
    public static int a(final int n) {
        return c(aj.a(n, 0));
    }
    
    public static aq a(final OutputStream outputStream) {
        return new aq(outputStream, new byte[4096]);
    }
    
    private void a() {
        if (this.d == null) {
            throw new i();
        }
        this.d.write(this.a, 0, this.c);
        this.c = 0;
    }
    
    private void a(long n) {
        while ((0xFFFFFFFFFFFFFF80L & n) != 0x0L) {
            this.d(0x80 | (0x7F & (int)n));
            n >>>= 7;
        }
        this.d((int)n);
    }
    
    public static int b(final int n, final float n2) {
        return 4 + a(1);
    }
    
    public static int b(final int n, final long n2) {
        final int a = a(n);
        int n3;
        if ((0xFFFFFFFFFFFFFF80L & n2) == 0x0L) {
            n3 = 1;
        }
        else if ((0xFFFFFFFFFFFFC000L & n2) == 0x0L) {
            n3 = 2;
        }
        else if ((0xFFFFFFFFFFE00000L & n2) == 0x0L) {
            n3 = 3;
        }
        else if ((0xFFFFFFFFF0000000L & n2) == 0x0L) {
            n3 = 4;
        }
        else if ((0xFFFFFFF800000000L & n2) == 0x0L) {
            n3 = 5;
        }
        else if ((0xFFFFFC0000000000L & n2) == 0x0L) {
            n3 = 6;
        }
        else if ((0xFFFE000000000000L & n2) == 0x0L) {
            n3 = 7;
        }
        else if ((0xFF00000000000000L & n2) == 0x0L) {
            n3 = 8;
        }
        else if ((Long.MIN_VALUE & n2) == 0x0L) {
            n3 = 9;
        }
        else {
            n3 = 10;
        }
        return n3 + a;
    }
    
    public static int b(final int n, final am am) {
        return a(n) + (c(am.a()) + am.a());
    }
    
    public static int b(final int n, final boolean b) {
        return 1 + a(n);
    }
    
    public static int c(final int n) {
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
    
    public static int d(final int n, final int n2) {
        return a(n) + c(n2);
    }
    
    private void d(final int n) {
        final byte b = (byte)n;
        if (this.c == this.b) {
            this.a();
        }
        this.a[this.c++] = b;
    }
    
    private static int e(final int n) {
        return n << 1 ^ n >> 31;
    }
    
    public static int e(final int n, final int n2) {
        final int a = a(n);
        int c;
        if (n2 >= 0) {
            c = c(n2);
        }
        else {
            c = 10;
        }
        return c + a;
    }
    
    public static int f(final int n, final int n2) {
        return a(2) + c(e(n2));
    }
    
    public final void a(final int n, final float n2) {
        this.g(1, 5);
        final int floatToRawIntBits = Float.floatToRawIntBits(n2);
        this.d(floatToRawIntBits & 0xFF);
        this.d(0xFF & floatToRawIntBits >> 8);
        this.d(0xFF & floatToRawIntBits >> 16);
        this.d(floatToRawIntBits >>> 24);
    }
    
    public final void a(final int n, final int n2) {
        this.g(n, 0);
        this.b(n2);
    }
    
    public final void a(final int n, final long n2) {
        this.g(n, 0);
        this.a(n2);
    }
    
    public final void a(final int n, final am am) {
        this.g(n, 2);
        this.b(am.a());
        final int a = am.a();
        if (this.b - this.c >= a) {
            am.a(this.a, 0, this.c, a);
            this.c += a;
        }
        else {
            final int n2 = this.b - this.c;
            am.a(this.a, 0, this.c, n2);
            final int n3 = n2 + 0;
            int i = a - n2;
            this.c = this.b;
            this.a();
            if (i <= this.b) {
                am.a(this.a, n3, 0, i);
                this.c = i;
                return;
            }
            final InputStream b = am.b();
            if (n3 != b.skip(n3)) {
                throw new IllegalStateException("Skip failed.");
            }
            while (i > 0) {
                final int min = Math.min(i, this.b);
                final int read = b.read(this.a, 0, min);
                if (read != min) {
                    throw new IllegalStateException("Read failed.");
                }
                this.d.write(this.a, 0, read);
                i -= read;
            }
        }
    }
    
    public final void a(final int n, final String s) {
        this.g(1, 2);
        final byte[] bytes = s.getBytes("UTF-8");
        this.b(bytes.length);
        this.a(bytes);
    }
    
    public final void a(final int n, final boolean b) {
        this.g(n, 0);
        int n2 = 0;
        if (b) {
            n2 = 1;
        }
        this.d(n2);
    }
    
    public final void a(final byte[] array) {
        final int length = array.length;
        if (this.b - this.c >= length) {
            System.arraycopy(array, 0, this.a, this.c, length);
            this.c += length;
            return;
        }
        final int n = this.b - this.c;
        System.arraycopy(array, 0, this.a, this.c, n);
        final int n2 = n + 0;
        final int c = length - n;
        this.c = this.b;
        this.a();
        if (c <= this.b) {
            System.arraycopy(array, n2, this.a, 0, c);
            this.c = c;
            return;
        }
        this.d.write(array, n2, c);
    }
    
    public final void b(int n) {
        while ((n & 0xFFFFFF80) != 0x0) {
            this.d(0x80 | (n & 0x7F));
            n >>>= 7;
        }
        this.d(n);
    }
    
    public final void b(final int n, final int n2) {
        this.g(n, 0);
        if (n2 >= 0) {
            this.b(n2);
            return;
        }
        this.a((long)n2);
    }
    
    public final void c(final int n, final int n2) {
        this.g(2, 0);
        this.b(e(n2));
    }
    
    @Override
    public final void flush() {
        if (this.d != null) {
            this.a();
        }
    }
    
    public final void g(final int n, final int n2) {
        this.b(aj.a(n, n2));
    }
}
