// 
// Decompiled by Procyon v0.5.30
// 

package com.fasterxml.jackson.core.io;

public final class f
{
    static final String a;
    static final char[] b;
    static final char[] c;
    static final byte[] d;
    static final String[] e;
    static final String[] f;
    private static int g;
    private static int h;
    private static long i;
    private static long j;
    private static long k;
    private static long l;
    
    static {
        com.fasterxml.jackson.core.io.f.g = 1000000;
        com.fasterxml.jackson.core.io.f.h = 1000000000;
        com.fasterxml.jackson.core.io.f.i = 10000000000L;
        com.fasterxml.jackson.core.io.f.j = 1000L;
        com.fasterxml.jackson.core.io.f.k = -2147483648L;
        com.fasterxml.jackson.core.io.f.l = 2147483647L;
        a = String.valueOf(Long.MIN_VALUE);
        b = new char[4000];
        c = new char[4000];
        int i = 0;
        int n = 0;
        while (i < 10) {
            final char c2 = (char)(i + 48);
            char c3;
            if (i == 0) {
                c3 = '\0';
            }
            else {
                c3 = c2;
            }
            int n2;
            for (int j = 0; j < 10; ++j, n = n2) {
                final char c4 = (char)(j + 48);
                char c5;
                if (i == 0 && j == 0) {
                    c5 = '\0';
                }
                else {
                    c5 = c4;
                }
                n2 = n;
                for (int k = 0; k < 10; ++k) {
                    final char c6 = (char)(k + 48);
                    com.fasterxml.jackson.core.io.f.b[n2] = c3;
                    com.fasterxml.jackson.core.io.f.b[n2 + 1] = c5;
                    com.fasterxml.jackson.core.io.f.b[n2 + 2] = c6;
                    com.fasterxml.jackson.core.io.f.c[n2] = c2;
                    com.fasterxml.jackson.core.io.f.c[n2 + 1] = c4;
                    com.fasterxml.jackson.core.io.f.c[n2 + 2] = c6;
                    n2 += 4;
                }
            }
            ++i;
        }
        d = new byte[4000];
        for (int l = 0; l < 4000; ++l) {
            com.fasterxml.jackson.core.io.f.d[l] = (byte)com.fasterxml.jackson.core.io.f.c[l];
        }
        e = new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };
        f = new String[] { "-1", "-2", "-3", "-4", "-5", "-6", "-7", "-8", "-9", "-10" };
    }
    
    public static int a(int n, final byte[] array, int n2) {
        if (n < 0) {
            if (n == Integer.MIN_VALUE) {
                return a((long)n, array, n2);
            }
            final int n3 = n2 + 1;
            array[n2] = 45;
            n = -n;
            n2 = n3;
        }
        if (n >= com.fasterxml.jackson.core.io.f.g) {
            boolean b;
            if (n >= com.fasterxml.jackson.core.io.f.h) {
                b = true;
            }
            else {
                b = false;
            }
            if (b) {
                n -= com.fasterxml.jackson.core.io.f.h;
                if (n >= com.fasterxml.jackson.core.io.f.h) {
                    n -= com.fasterxml.jackson.core.io.f.h;
                    final int n4 = n2 + 1;
                    array[n2] = 50;
                    n2 = n4;
                }
                else {
                    final int n5 = n2 + 1;
                    array[n2] = 49;
                    n2 = n5;
                }
            }
            final int n6 = n / 1000;
            final int n7 = n - n6 * 1000;
            final int n8 = n6 / 1000;
            final int n9 = n6 - n8 * 1000;
            int n10;
            if (b) {
                n10 = c(n8, array, n2);
            }
            else {
                n10 = b(n8, array, n2);
            }
            return c(n7, array, c(n9, array, n10));
        }
        if (n >= 1000) {
            final int n11 = n / 1000;
            return c(n - n11 * 1000, array, b(n11, array, n2));
        }
        if (n < 10) {
            final int n12 = n2 + 1;
            array[n2] = (byte)(n + 48);
            return n12;
        }
        return b(n, array, n2);
    }
    
    public static int a(int n, final char[] array, int n2) {
        if (n < 0) {
            if (n == Integer.MIN_VALUE) {
                return a((long)n, array, n2);
            }
            final int n3 = n2 + 1;
            array[n2] = '-';
            n = -n;
            n2 = n3;
        }
        if (n >= com.fasterxml.jackson.core.io.f.g) {
            boolean b;
            if (n >= com.fasterxml.jackson.core.io.f.h) {
                b = true;
            }
            else {
                b = false;
            }
            if (b) {
                n -= com.fasterxml.jackson.core.io.f.h;
                if (n >= com.fasterxml.jackson.core.io.f.h) {
                    n -= com.fasterxml.jackson.core.io.f.h;
                    final int n4 = n2 + 1;
                    array[n2] = '2';
                    n2 = n4;
                }
                else {
                    final int n5 = n2 + 1;
                    array[n2] = '1';
                    n2 = n5;
                }
            }
            final int n6 = n / 1000;
            final int n7 = n - n6 * 1000;
            final int n8 = n6 / 1000;
            final int n9 = n6 - n8 * 1000;
            int n10;
            if (b) {
                n10 = c(n8, array, n2);
            }
            else {
                n10 = b(n8, array, n2);
            }
            return c(n7, array, c(n9, array, n10));
        }
        if (n >= 1000) {
            final int n11 = n / 1000;
            return c(n - n11 * 1000, array, b(n11, array, n2));
        }
        if (n < 10) {
            final int n12 = n2 + 1;
            array[n2] = (char)(n + 48);
            return n12;
        }
        return b(n, array, n2);
    }
    
    private static int a(final long n) {
        int n2 = 10;
        for (long i = com.fasterxml.jackson.core.io.f.i; n >= i && n2 != 19; ++n2, i = (i << 3) + (i << 1)) {}
        return n2;
    }
    
    public static int a(long n, final byte[] array, int n2) {
        Label_0100: {
            if (n < 0L) {
                int a;
                if (n > com.fasterxml.jackson.core.io.f.k) {
                    a = a((int)n, array, n2);
                }
                else {
                    if (n != Long.MIN_VALUE) {
                        final int n3 = n2 + 1;
                        array[n2] = 45;
                        n = -n;
                        n2 = n3;
                        break Label_0100;
                    }
                    final int length = com.fasterxml.jackson.core.io.f.a.length();
                    int i = 0;
                    a = n2;
                    while (i < length) {
                        final int n4 = a + 1;
                        array[a] = (byte)com.fasterxml.jackson.core.io.f.a.charAt(i);
                        ++i;
                        a = n4;
                    }
                }
                return a;
            }
            if (n <= com.fasterxml.jackson.core.io.f.l) {
                return a((int)n, array, n2);
            }
        }
        int n6;
        final int n5 = n6 = n2 + a(n);
        while (n > com.fasterxml.jackson.core.io.f.l) {
            n6 -= 3;
            final long n7 = n / com.fasterxml.jackson.core.io.f.j;
            c((int)(n - n7 * com.fasterxml.jackson.core.io.f.j), array, n6);
            n = n7;
        }
        final int n8 = (int)n;
        int n9 = n6;
        int j;
        int n10;
        int n11;
        for (j = n8; j >= 1000; j = n11, n9 = n10) {
            n10 = n9 - 3;
            n11 = j / 1000;
            c(j - n11 * 1000, array, n10);
        }
        b(j, array, n2);
        return n5;
    }
    
    public static int a(long n, final char[] array, int n2) {
        if (n < 0L) {
            if (n > com.fasterxml.jackson.core.io.f.k) {
                return a((int)n, array, n2);
            }
            if (n == Long.MIN_VALUE) {
                final int length = com.fasterxml.jackson.core.io.f.a.length();
                com.fasterxml.jackson.core.io.f.a.getChars(0, length, array, n2);
                return n2 + length;
            }
            final int n3 = n2 + 1;
            array[n2] = '-';
            n = -n;
            n2 = n3;
        }
        else if (n <= com.fasterxml.jackson.core.io.f.l) {
            return a((int)n, array, n2);
        }
        int n5;
        final int n4 = n5 = n2 + a(n);
        while (n > com.fasterxml.jackson.core.io.f.l) {
            n5 -= 3;
            final long n6 = n / com.fasterxml.jackson.core.io.f.j;
            c((int)(n - n6 * com.fasterxml.jackson.core.io.f.j), array, n5);
            n = n6;
        }
        final int n7 = (int)n;
        int n8 = n5;
        int i;
        int n9;
        int n10;
        for (i = n7; i >= 1000; i = n10, n8 = n9) {
            n9 = n8 - 3;
            n10 = i / 1000;
            c(i - n10 * 1000, array, n9);
        }
        b(i, array, n2);
        return n4;
    }
    
    private static int b(final int n, final byte[] array, int n2) {
        final int n3 = n << 2;
        final char[] b = com.fasterxml.jackson.core.io.f.b;
        final int n4 = n3 + 1;
        final char c = b[n3];
        if (c != '\0') {
            final int n5 = n2 + 1;
            array[n2] = (byte)c;
            n2 = n5;
        }
        final char[] b2 = com.fasterxml.jackson.core.io.f.b;
        final int n6 = n4 + 1;
        final char c2 = b2[n4];
        if (c2 != '\0') {
            final int n7 = n2 + 1;
            array[n2] = (byte)c2;
            n2 = n7;
        }
        final int n8 = n2 + 1;
        array[n2] = (byte)com.fasterxml.jackson.core.io.f.b[n6];
        return n8;
    }
    
    private static int b(final int n, final char[] array, int n2) {
        final int n3 = n << 2;
        final char[] b = com.fasterxml.jackson.core.io.f.b;
        final int n4 = n3 + 1;
        final char c = b[n3];
        if (c != '\0') {
            final int n5 = n2 + 1;
            array[n2] = c;
            n2 = n5;
        }
        final char[] b2 = com.fasterxml.jackson.core.io.f.b;
        final int n6 = n4 + 1;
        final char c2 = b2[n4];
        if (c2 != '\0') {
            final int n7 = n2 + 1;
            array[n2] = c2;
            n2 = n7;
        }
        final int n8 = n2 + 1;
        array[n2] = com.fasterxml.jackson.core.io.f.b[n6];
        return n8;
    }
    
    private static int c(final int n, final byte[] array, final int n2) {
        final int n3 = n << 2;
        final int n4 = n2 + 1;
        final byte[] d = com.fasterxml.jackson.core.io.f.d;
        final int n5 = n3 + 1;
        array[n2] = d[n3];
        final int n6 = n4 + 1;
        final byte[] d2 = com.fasterxml.jackson.core.io.f.d;
        final int n7 = n5 + 1;
        array[n4] = d2[n5];
        final int n8 = n6 + 1;
        array[n6] = com.fasterxml.jackson.core.io.f.d[n7];
        return n8;
    }
    
    private static int c(final int n, final char[] array, final int n2) {
        final int n3 = n << 2;
        final int n4 = n2 + 1;
        final char[] c = com.fasterxml.jackson.core.io.f.c;
        final int n5 = n3 + 1;
        array[n2] = c[n3];
        final int n6 = n4 + 1;
        final char[] c2 = com.fasterxml.jackson.core.io.f.c;
        final int n7 = n5 + 1;
        array[n4] = c2[n5];
        final int n8 = n6 + 1;
        array[n6] = com.fasterxml.jackson.core.io.f.c[n7];
        return n8;
    }
}
