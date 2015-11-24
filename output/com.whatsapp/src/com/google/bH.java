// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

final class bH
{
    private static final int[][] c;
    private static final int[] d;
    private final e a;
    private final byte b;
    
    static {
        c = new int[][] { { 21522, 0 }, { 20773, 1 }, { 24188, 2 }, { 23371, 3 }, { 17913, 4 }, { 16590, 5 }, { 20375, 6 }, { 19104, 7 }, { 30660, 8 }, { 29427, 9 }, { 32170, 10 }, { 30877, 11 }, { 26159, 12 }, { 25368, 13 }, { 27713, 14 }, { 26998, 15 }, { 5769, 16 }, { 5054, 17 }, { 7399, 18 }, { 6608, 19 }, { 1890, 20 }, { 597, 21 }, { 3340, 22 }, { 2107, 23 }, { 13663, 24 }, { 12392, 25 }, { 16177, 26 }, { 14854, 27 }, { 9396, 28 }, { 8579, 29 }, { 11994, 30 }, { 11245, 31 } };
        d = new int[] { 0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 2, 3, 2, 3, 3, 4 };
    }
    
    private bH(final int n) {
        this.a = e.forBits(0x3 & n >> 3);
        this.b = (byte)(n & 0x7);
    }
    
    static int a(final int n, final int n2) {
        final int n3 = n ^ n2;
        return bH.d[n3 & 0xF] + bH.d[0xF & n3 >>> 4] + bH.d[0xF & n3 >>> 8] + bH.d[0xF & n3 >>> 12] + bH.d[0xF & n3 >>> 16] + bH.d[0xF & n3 >>> 20] + bH.d[0xF & n3 >>> 24] + bH.d[0xF & n3 >>> 28];
    }
    
    static bH b(final int n, final int n2) {
        final bH c = c(n, n2);
        if (c != null) {
            return c;
        }
        return c(n ^ 0x5412, n2 ^ 0x5412);
    }
    
    private static bH c(final int n, final int n2) {
        final int e = bE.e;
        int a = Integer.MAX_VALUE;
        final int[][] c = bH.c;
        final int length = c.length;
        int i = 0;
        int n3 = 0;
    Label_0111_Outer:
        while (i < length) {
            final int[] array = c[i];
            final int n4 = array[0];
            if (n4 == n || n4 == n2) {
                return new bH(array[1]);
            }
            int a2 = a(n, n4);
            if (a2 < a) {
                n3 = array[1];
            }
            else {
                a2 = a;
            }
            while (true) {
                Label_0149: {
                    if (n == n2) {
                        break Label_0149;
                    }
                    a = a(n2, n4);
                    if (a >= a2) {
                        break Label_0149;
                    }
                    n3 = array[1];
                    final int n5 = i + 1;
                    if (e != 0) {
                        break;
                    }
                    i = n5;
                    continue Label_0111_Outer;
                }
                a = a2;
                continue;
            }
        }
        final int n6 = n3;
        if (a <= 3) {
            return new bH(n6);
        }
        return null;
    }
    
    e a() {
        return this.a;
    }
    
    byte b() {
        return this.b;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o instanceof bH) {
            final bH bh = (bH)o;
            if (this.a == bh.a && this.b == bh.b) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return this.a.ordinal() << 3 | this.b;
    }
}
