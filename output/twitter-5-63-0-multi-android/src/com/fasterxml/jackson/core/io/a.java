// 
// Decompiled by Procyon v0.5.30
// 

package com.fasterxml.jackson.core.io;

import java.util.Arrays;

public final class a
{
    static final int[] a;
    static final int[] b;
    static final int[] c;
    static final int[] d;
    static final int[] e;
    static final int[] f;
    static final int[] g;
    static final int[] h;
    private static final char[] i;
    private static final byte[] j;
    
    static {
        i = "0123456789ABCDEF".toCharArray();
        final int length = com.fasterxml.jackson.core.io.a.i.length;
        j = new byte[length];
        for (int k = 0; k < length; ++k) {
            com.fasterxml.jackson.core.io.a.j[k] = (byte)com.fasterxml.jackson.core.io.a.i[k];
        }
        final int[] a2 = new int[256];
        for (int l = 0; l < 32; ++l) {
            a2[l] = -1;
        }
        a2[92] = (a2[34] = 1);
        a = a2;
        final int[] b2 = new int[com.fasterxml.jackson.core.io.a.a.length];
        System.arraycopy(com.fasterxml.jackson.core.io.a.a, 0, b2, 0, b2.length);
        for (int n = 128; n < 256; ++n) {
            int n2;
            if ((n & 0xE0) == 0xC0) {
                n2 = 2;
            }
            else if ((n & 0xF0) == 0xE0) {
                n2 = 3;
            }
            else if ((n & 0xF8) == 0xF0) {
                n2 = 4;
            }
            else {
                n2 = -1;
            }
            b2[n] = n2;
        }
        b = b2;
        final int[] c2 = new int[256];
        Arrays.fill(c2, -1);
        for (int n3 = 33; n3 < 256; ++n3) {
            if (Character.isJavaIdentifierPart((char)n3)) {
                c2[n3] = 0;
            }
        }
        c2[64] = 0;
        c2[42] = (c2[35] = 0);
        c2[43] = (c2[45] = 0);
        c = c2;
        final int[] d2 = new int[256];
        System.arraycopy(com.fasterxml.jackson.core.io.a.c, 0, d2, 0, d2.length);
        Arrays.fill(d2, 128, 128, 0);
        d = d2;
        final int[] e2 = new int[256];
        System.arraycopy(com.fasterxml.jackson.core.io.a.b, 128, e2, 128, 128);
        Arrays.fill(e2, 0, 32, -1);
        e2[9] = 0;
        e2[10] = 10;
        e2[13] = 13;
        e2[42] = 42;
        e = e2;
        final int[] f2 = new int[256];
        System.arraycopy(com.fasterxml.jackson.core.io.a.b, 128, f2, 128, 128);
        Arrays.fill(f2, 0, 32, -1);
        f2[9] = (f2[32] = 1);
        f2[10] = 10;
        f2[13] = 13;
        f2[47] = 47;
        f2[35] = 35;
        f = f2;
        final int[] g2 = new int[128];
        for (int n4 = 0; n4 < 32; ++n4) {
            g2[n4] = -1;
        }
        g2[34] = 34;
        g2[92] = 92;
        g2[8] = 98;
        g2[9] = 116;
        g2[12] = 102;
        g2[10] = 110;
        g2[13] = 114;
        g = g2;
        Arrays.fill(h = new int[128], -1);
        for (int n5 = 0; n5 < 10; ++n5) {
            com.fasterxml.jackson.core.io.a.h[n5 + 48] = n5;
        }
        for (int n6 = 0; n6 < 6; ++n6) {
            com.fasterxml.jackson.core.io.a.h[n6 + 97] = n6 + 10;
            com.fasterxml.jackson.core.io.a.h[n6 + 65] = n6 + 10;
        }
    }
    
    public static int a(final int n) {
        if (n > 127) {
            return -1;
        }
        return com.fasterxml.jackson.core.io.a.h[n];
    }
    
    public static void a(final StringBuilder sb, final String s) {
        final int[] g = com.fasterxml.jackson.core.io.a.g;
        final int length = g.length;
        for (int i = 0; i < s.length(); ++i) {
            final char char1 = s.charAt(i);
            if (char1 >= length || g[char1] == 0) {
                sb.append(char1);
            }
            else {
                sb.append('\\');
                final int n = g[char1];
                if (n < 0) {
                    sb.append('u');
                    sb.append('0');
                    sb.append('0');
                    sb.append(com.fasterxml.jackson.core.io.a.i[char1 >> 4]);
                    sb.append(com.fasterxml.jackson.core.io.a.i[char1 & '\u000f']);
                }
                else {
                    sb.append((char)n);
                }
            }
        }
    }
    
    public static int[] a() {
        return com.fasterxml.jackson.core.io.a.a;
    }
    
    public static int[] b() {
        return com.fasterxml.jackson.core.io.a.b;
    }
    
    public static int[] c() {
        return com.fasterxml.jackson.core.io.a.c;
    }
    
    public static int[] d() {
        return com.fasterxml.jackson.core.io.a.d;
    }
    
    public static int[] e() {
        return com.fasterxml.jackson.core.io.a.e;
    }
    
    public static int[] f() {
        return com.fasterxml.jackson.core.io.a.g;
    }
    
    public static char[] g() {
        return com.fasterxml.jackson.core.io.a.i.clone();
    }
    
    public static byte[] h() {
        return com.fasterxml.jackson.core.io.a.j.clone();
    }
}
