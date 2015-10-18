// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public final class ef
{
    public static int f;
    private static final ef[] g;
    private final hG a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int h;
    private final int i;
    
    static {
        g = c();
    }
    
    private ef(final int c, final int d, final int i, final int h, final int b, final hG a) {
        int j = 0;
        this.c = c;
        this.d = d;
        this.i = i;
        this.h = h;
        this.b = b;
        this.a = a;
        final int a2 = a.a();
        final bM[] b2 = a.b();
        final int length = b2.length;
        int e = 0;
        while (j < length) {
            final bM bm = b2[j];
            e += bm.a() * (a2 + bm.b());
            ++j;
        }
        this.e = e;
    }
    
    public static ef a(final int n, final int n2) {
        final int f = ef.f;
        if ((n & 0x1) != 0x0 || (n2 & 0x1) != 0x0) {
            throw fD.a();
        }
        final ef[] g = ef.g;
        final int length = g.length;
        int i = 0;
        while (i < length) {
            final ef ef = g[i];
            if (ef.d == n && ef.i == n2) {
                return ef;
            }
            ++i;
            if (f != 0) {
                break;
            }
        }
        throw fD.a();
    }
    
    private static ef[] c() {
        return new ef[] { new ef(1, 10, 10, 8, 8, new hG(5, new bM(1, 3, null), (R)null)), new ef(2, 12, 12, 10, 10, new hG(7, new bM(1, 5, null), (R)null)), new ef(3, 14, 14, 12, 12, new hG(10, new bM(1, 8, null), (R)null)), new ef(4, 16, 16, 14, 14, new hG(12, new bM(1, 12, null), (R)null)), new ef(5, 18, 18, 16, 16, new hG(14, new bM(1, 18, null), (R)null)), new ef(6, 20, 20, 18, 18, new hG(18, new bM(1, 22, null), (R)null)), new ef(7, 22, 22, 20, 20, new hG(20, new bM(1, 30, null), (R)null)), new ef(8, 24, 24, 22, 22, new hG(24, new bM(1, 36, null), (R)null)), new ef(9, 26, 26, 24, 24, new hG(28, new bM(1, 44, null), (R)null)), new ef(10, 32, 32, 14, 14, new hG(36, new bM(1, 62, null), (R)null)), new ef(11, 36, 36, 16, 16, new hG(42, new bM(1, 86, null), (R)null)), new ef(12, 40, 40, 18, 18, new hG(48, new bM(1, 114, null), (R)null)), new ef(13, 44, 44, 20, 20, new hG(56, new bM(1, 144, null), (R)null)), new ef(14, 48, 48, 22, 22, new hG(68, new bM(1, 174, null), (R)null)), new ef(15, 52, 52, 24, 24, new hG(42, new bM(2, 102, null), (R)null)), new ef(16, 64, 64, 14, 14, new hG(56, new bM(2, 140, null), (R)null)), new ef(17, 72, 72, 16, 16, new hG(36, new bM(4, 92, null), (R)null)), new ef(18, 80, 80, 18, 18, new hG(48, new bM(4, 114, null), (R)null)), new ef(19, 88, 88, 20, 20, new hG(56, new bM(4, 144, null), (R)null)), new ef(20, 96, 96, 22, 22, new hG(68, new bM(4, 174, null), (R)null)), new ef(21, 104, 104, 24, 24, new hG(56, new bM(6, 136, null), (R)null)), new ef(22, 120, 120, 18, 18, new hG(68, new bM(6, 175, null), (R)null)), new ef(23, 132, 132, 20, 20, new hG(62, new bM(8, 163, null), (R)null)), new ef(24, 144, 144, 22, 22, new hG(62, new bM(8, 156, null), new bM(2, 155, null), null)), new ef(25, 8, 18, 6, 16, new hG(7, new bM(1, 5, null), (R)null)), new ef(26, 8, 32, 6, 14, new hG(11, new bM(1, 10, null), (R)null)), new ef(27, 12, 26, 10, 24, new hG(14, new bM(1, 16, null), (R)null)), new ef(28, 12, 36, 10, 16, new hG(18, new bM(1, 22, null), (R)null)), new ef(29, 16, 36, 14, 16, new hG(24, new bM(1, 32, null), (R)null)), new ef(30, 16, 48, 14, 22, new hG(28, new bM(1, 49, null), (R)null)) };
    }
    
    public int a() {
        return this.i;
    }
    
    hG b() {
        return this.a;
    }
    
    public int d() {
        return this.c;
    }
    
    public int e() {
        return this.d;
    }
    
    public int f() {
        return this.b;
    }
    
    public int g() {
        return this.e;
    }
    
    public int h() {
        return this.h;
    }
    
    @Override
    public String toString() {
        return String.valueOf(this.c);
    }
}
