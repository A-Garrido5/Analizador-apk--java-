// 
// Decompiled by Procyon v0.5.30
// 

package com.fasterxml.jackson.core.io;

import java.lang.ref.SoftReference;
import com.fasterxml.jackson.core.util.b;

public final class c
{
    protected static final ThreadLocal a;
    private static final char[] d;
    private static final byte[] e;
    protected b b;
    protected final char[] c;
    
    static {
        d = com.fasterxml.jackson.core.io.a.g();
        e = com.fasterxml.jackson.core.io.a.h();
        a = new ThreadLocal();
    }
    
    public c() {
        (this.c = new char[6])[0] = '\\';
        this.c[2] = '0';
        this.c[3] = '0';
    }
    
    private static int a(final int n, final int n2) {
        if (n2 < 56320 || n2 > 57343) {
            throw new IllegalArgumentException("Broken surrogate pair: first char 0x" + Integer.toHexString(n) + ", second 0x" + Integer.toHexString(n2) + "; illegal combination");
        }
        return 65536 + (n - 55296 << 10) + (n2 - 56320);
    }
    
    private int a(int n, final int n2, final b b, final int n3) {
        b.c(n3);
        b.a(92);
        if (n2 < 0) {
            b.a(117);
            if (n > 255) {
                final int n4 = n >> 8;
                b.a(com.fasterxml.jackson.core.io.c.e[n4 >> 4]);
                b.a(com.fasterxml.jackson.core.io.c.e[n4 & 0xF]);
                n &= 0xFF;
            }
            else {
                b.a(48);
                b.a(48);
            }
            b.a(com.fasterxml.jackson.core.io.c.e[n >> 4]);
            b.a(com.fasterxml.jackson.core.io.c.e[n & 0xF]);
        }
        else {
            b.a((byte)n2);
        }
        return b.f();
    }
    
    public static c a() {
        final SoftReference<c> softReference = c.a.get();
        c c;
        if (softReference == null) {
            c = null;
        }
        else {
            c = softReference.get();
        }
        if (c == null) {
            c = new c();
            com.fasterxml.jackson.core.io.c.a.set(new SoftReference<c>(c));
        }
        return c;
    }
    
    private static void a(final int n) {
        throw new IllegalArgumentException(h.c(n));
    }
    
    public byte[] a(final String s) {
        b b = this.b;
        if (b == null) {
            b = new b(null);
            this.b = b;
        }
        final int length = s.length();
        byte[] array = b.c();
        int a = 0;
        int i = 0;
    Label_0181:
        while (i < length) {
            final int[] f = com.fasterxml.jackson.core.io.a.f();
            int n;
            char char2;
            while (true) {
                final char char1 = s.charAt(i);
                if (char1 > '\u007f' || f[char1] != 0) {
                    if (a >= array.length) {
                        array = b.d();
                        a = 0;
                    }
                    n = i + 1;
                    char2 = s.charAt(i);
                    if (char2 <= '\u007f') {
                        a = this.a(char2, f[char2], b, a);
                        array = b.e();
                        i = n;
                        continue Label_0181;
                    }
                    break;
                }
                else {
                    int n2;
                    if (a >= array.length) {
                        array = b.d();
                        n2 = 0;
                    }
                    else {
                        n2 = a;
                    }
                    a = n2 + 1;
                    array[n2] = (byte)char1;
                    if (++i >= length) {
                        break Label_0181;
                    }
                    continue;
                }
            }
            int n3;
            byte[] d;
            int n4;
            if (char2 <= '\u07ff') {
                n3 = a + 1;
                array[a] = (byte)('\u00c0' | char2 >> 6);
                final char c = (char)('\u0080' | (char2 & '?'));
                d = array;
                n4 = c;
            }
            else if (char2 < '\ud800' || char2 > '\udfff') {
                final int n5 = a + 1;
                array[a] = (byte)('\u00e0' | char2 >> 12);
                int n6;
                if (n5 >= array.length) {
                    array = b.d();
                    n6 = 0;
                }
                else {
                    n6 = n5;
                }
                n3 = n6 + 1;
                array[n6] = (byte)('\u0080' | ('?' & char2 >> 6));
                final char c2 = (char)('\u0080' | (char2 & '?'));
                d = array;
                n4 = c2;
            }
            else {
                if (char2 > '\udbff') {
                    a(char2);
                }
                if (n >= length) {
                    a(char2);
                }
                final int n7 = n + 1;
                final int a2 = a(char2, s.charAt(n));
                if (a2 > 1114111) {
                    a(a2);
                }
                final int n8 = a + 1;
                array[a] = (byte)(0xF0 | a2 >> 18);
                int n9;
                if (n8 >= array.length) {
                    array = b.d();
                    n9 = 0;
                }
                else {
                    n9 = n8;
                }
                final int n10 = n9 + 1;
                array[n9] = (byte)(0x80 | (0x3F & a2 >> 12));
                int n11;
                if (n10 >= array.length) {
                    array = b.d();
                    n11 = 0;
                }
                else {
                    n11 = n10;
                }
                n3 = n11 + 1;
                array[n11] = (byte)(0x80 | (0x3F & a2 >> 6));
                final int n12 = 0x80 | (a2 & 0x3F);
                n = n7;
                final byte[] array2 = array;
                n4 = n12;
                d = array2;
            }
            if (n3 >= d.length) {
                d = b.d();
                n3 = 0;
            }
            final int n13 = n3 + 1;
            d[n3] = (byte)n4;
            array = d;
            i = n;
            a = n13;
        }
        return this.b.b(a);
    }
    
    public byte[] b(final String s) {
        b b = this.b;
        if (b == null) {
            b = new b(null);
            this.b = b;
        }
        final int length = s.length();
        byte[] c = b.c();
        int length2 = c.length;
        int n = 0;
        int i = 0;
        while (i < length) {
            int n2 = i + 1;
            char c2 = s.charAt(i);
            final int n3 = length2;
            byte[] array = c;
            int n4 = n;
            int n5 = n3;
            while (c2 <= '\u007f') {
                if (n4 >= n5) {
                    array = b.d();
                    n5 = array.length;
                    n4 = 0;
                }
                final int n6 = n4 + 1;
                array[n4] = (byte)c2;
                if (n2 >= length) {
                    final int n7 = n6;
                    return this.b.b(n7);
                }
                final int n8 = n2 + 1;
                c2 = s.charAt(n2);
                n2 = n8;
                n4 = n6;
            }
            int n9;
            if (n4 >= n5) {
                array = b.d();
                n5 = array.length;
                n9 = 0;
            }
            else {
                n9 = n4;
            }
            int n10;
            int n11;
            if (c2 < '\u0800') {
                n10 = n9 + 1;
                array[n9] = (byte)('\u00c0' | c2 >> 6);
                n11 = c2;
                i = n2;
            }
            else if (c2 < '\ud800' || c2 > '\udfff') {
                int n12 = n9 + 1;
                array[n9] = (byte)('\u00e0' | c2 >> 12);
                if (n12 >= n5) {
                    array = b.d();
                    n5 = array.length;
                    n12 = 0;
                }
                final int n13 = n12 + 1;
                array[n12] = (byte)('\u0080' | ('?' & c2 >> 6));
                n10 = n13;
                n11 = c2;
                i = n2;
            }
            else {
                if (c2 > '\udbff') {
                    a(c2);
                }
                if (n2 >= length) {
                    a(c2);
                }
                final int n14 = n2 + 1;
                final int a = a(c2, s.charAt(n2));
                if (a > 1114111) {
                    a(a);
                }
                int n15 = n9 + 1;
                array[n9] = (byte)(0xF0 | a >> 18);
                if (n15 >= n5) {
                    array = b.d();
                    n5 = array.length;
                    n15 = 0;
                }
                final int n16 = n15 + 1;
                array[n15] = (byte)(0x80 | (0x3F & a >> 12));
                int n17;
                if (n16 >= n5) {
                    array = b.d();
                    n5 = array.length;
                    n17 = 0;
                }
                else {
                    n17 = n16;
                }
                final int n18 = n17 + 1;
                array[n17] = (byte)(0x80 | (0x3F & a >> 6));
                n10 = n18;
                n11 = a;
                i = n14;
            }
            if (n10 >= n5) {
                array = b.d();
                n5 = array.length;
                n10 = 0;
            }
            final int n19 = n10 + 1;
            array[n10] = (byte)(0x80 | (n11 & 0x3F));
            c = array;
            length2 = n5;
            n = n19;
        }
        final int n7 = n;
        return this.b.b(n7);
    }
}
