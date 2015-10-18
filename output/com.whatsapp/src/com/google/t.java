// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public final class t implements cH
{
    private static final String[] z;
    private bl a;
    private final String b;
    private bl c;
    private final by d;
    private final bW e;
    private dc f;
    private final int g;
    
    static {
        final String[] z2 = new String[2];
        final char[] charArray = "=L!Lzq\u0003<\u001f;?\u0001-L)~\u000b-\u001f.f\u001c-\u0011".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'Z';
                    break;
                }
                case 0: {
                    c2 = '\u001f';
                    break;
                }
                case 1: {
                    c2 = 'l';
                    break;
                }
                case 2: {
                    c2 = 'H';
                    break;
                }
                case 3: {
                    c2 = '?';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "=L!Lzq\u0003<\u001f;?\u0001-L)~\u000b-\u001f.f\u001c-\u0011".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = 'Z';
                    break;
                }
                case 0: {
                    c4 = '\u001f';
                    break;
                }
                case 1: {
                    c4 = 'l';
                    break;
                }
                case 2: {
                    c4 = 'H';
                    break;
                }
                case 3: {
                    c4 = '?';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        z = z2;
    }
    
    private t(final dc f, final by d, final bW e, final int g) {
        this.g = g;
        this.f = f;
        this.d = d;
        this.e = e;
        this.b = e.a() + '.' + f.l();
        by.a(d).d(this);
    }
    
    t(final dc dc, final by by, final bW bw, final int n, final bO bo) {
        this(dc, by, bw, n);
    }
    
    private void a(final dc f) {
        this.f = f;
    }
    
    static void a(final t t) {
        t.b();
    }
    
    static void a(final t t, final dc dc) {
        t.a(dc);
    }
    
    private void b() {
        final cH a = by.a(this.d).a(this.f.q(), this, ag.TYPES_ONLY);
        if (!(a instanceof bl)) {
            throw new gG(this, '\"' + this.f.q() + t.z[0], (bO)null);
        }
        this.a = (bl)a;
        final cH a2 = by.a(this.d).a(this.f.r(), this, ag.TYPES_ONLY);
        if (!(a2 instanceof bl)) {
            throw new gG(this, '\"' + this.f.r() + t.z[1], (bO)null);
        }
        this.c = (bl)a2;
    }
    
    public dc a() {
        return this.f;
    }
    
    @Override
    public String a() {
        return this.b;
    }
    
    @Override
    public fm b() {
        return this.a();
    }
    
    @Override
    public String c() {
        return this.f.l();
    }
    
    @Override
    public by d() {
        return this.d;
    }
}
