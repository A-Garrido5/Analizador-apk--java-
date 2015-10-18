// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

final class d
{
    private final L a;
    private boolean b;
    private bE c;
    private bH d;
    
    d(final L a) {
        final int a2 = a.a();
        if (a2 < 21 || (a2 & 0x3) != 0x1) {
            throw fD.a();
        }
        this.a = a;
    }
    
    private int a(final int n, final int n2, final int n3) {
        boolean b;
        if (this.b) {
            b = this.a.a(n2, n);
        }
        else {
            b = this.a.a(n, n2);
        }
        if (b) {
            return 0x1 | n3 << 1;
        }
        return n3 << 1;
    }
    
    void a(final boolean b) {
        this.c = null;
        this.d = null;
        this.b = b;
    }
    
    byte[] a() {
        final int e = bE.e;
        final bH d = this.d();
        final bE e2 = this.e();
        final bf a = bf.a(d.b());
        final int a2 = this.a.a();
        a.a(this.a, a2);
        final L e3 = e2.e();
        final byte[] array = new byte[e2.a()];
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        int i = a2 - 1;
        int n4 = 1;
    Label_0255:
        while (i > 0) {
            if (i == 6) {
                --i;
            }
            int j = 0;
            int n5 = n;
            while (true) {
                while (j < a2) {
                    int n6;
                    if (n4 != 0) {
                        n6 = a2 - 1 - j;
                    }
                    else {
                        n6 = j;
                    }
                    int n8;
                    for (int k = 0; k < 2; k = n8) {
                        if (!e3.a(i - k, n6)) {
                            ++n3;
                            n2 <<= 1;
                            if (this.a.a(i - k, n6)) {
                                n2 |= 0x1;
                            }
                            if (n3 == 8) {
                                final int n7 = n5 + 1;
                                array[n5] = (byte)n2;
                                n3 = 0;
                                n2 = 0;
                                n5 = n7;
                            }
                        }
                        n8 = k + 1;
                        if (e != 0) {
                            break;
                        }
                    }
                    final int n9 = n3;
                    final int n10 = n2;
                    final int n11 = n5;
                    ++j;
                    if (e != 0) {
                        final int n12 = n9;
                        n = n11;
                        final int n13 = n4 ^ 0x1;
                        i -= 2;
                        if (e != 0) {
                            break Label_0255;
                        }
                        n4 = n13;
                        n2 = n10;
                        n3 = n12;
                        continue Label_0255;
                    }
                    else {
                        n5 = n11;
                        n2 = n10;
                        n3 = n9;
                    }
                }
                final int n12 = n3;
                n = n5;
                final int n10 = n2;
                continue;
            }
        }
        if (n != e2.a()) {
            throw fD.a();
        }
        return array;
    }
    
    void b() {
        final int e = bE.e;
        int i = 0;
        while (i < this.a.g()) {
            int j = i + 1;
            while (j < this.a.a()) {
                if (this.a.a(i, j) != this.a.a(j, i)) {
                    this.a.c(j, i);
                    this.a.c(i, j);
                }
                ++j;
                if (e != 0) {
                    break;
                }
            }
            ++i;
            if (e != 0) {
                break;
            }
        }
    }
    
    void c() {
        if (this.d == null) {
            return;
        }
        bf.a(this.d.b()).a(this.a, this.a.a());
    }
    
    bH d() {
        final int e = bE.e;
        if (this.d != null) {
            return this.d;
        }
        int i = 0;
        int a = 0;
        while (i < 6) {
            a = this.a(i, 8, a);
            ++i;
            if (e != 0) {
                break;
            }
        }
        int n = this.a(8, 7, this.a(8, 8, this.a(7, 8, a)));
        int j = 5;
        while (j >= 0) {
            n = this.a(8, j, n);
            --j;
            if (e != 0) {
                break;
            }
        }
        final int a2 = this.a.a();
        final int n2 = a2 - 7;
        final int n3 = a2 - 1;
        int n4 = 0;
        int k = n3;
        while (k >= n2) {
            n4 = this.a(8, k, n4);
            --k;
            if (e != 0) {
                break;
            }
        }
        int l = a2 - 8;
        while (l < a2) {
            n4 = this.a(l, 8, n4);
            ++l;
            if (e != 0) {
                break;
            }
        }
        this.d = bH.b(n, n4);
        if (this.d != null) {
            return this.d;
        }
        throw fD.a();
    }
    
    bE e() {
        final int e = bE.e;
        if (this.c != null) {
            return this.c;
        }
        final int a = this.a.a();
        final int n = (a - 17) / 4;
        if (n <= 6) {
            return bE.b(n);
        }
        final int n2 = a - 11;
        int i = 5;
        int a2 = 0;
        while (i >= 0) {
            int j = a - 9;
            while (j >= n2) {
                a2 = this.a(j, i, a2);
                --j;
                if (e != 0) {
                    break;
                }
            }
            final int n3 = i - 1;
            if (e != 0) {
                break;
            }
            i = n3;
        }
        final bE c = bE.c(a2);
        if (c != null && c.c() == a) {
            return this.c = c;
        }
        int a3 = 0;
        int n4;
        for (int k = 5; k >= 0; k = n4) {
            int l = a - 9;
            while (l >= n2) {
                a3 = this.a(k, l, a3);
                --l;
                if (e != 0) {
                    break;
                }
            }
            n4 = k - 1;
            if (e != 0) {
                break;
            }
        }
        final bE c2 = bE.c(a3);
        if (c2 != null && c2.c() == a) {
            return this.c = c2;
        }
        throw fD.a();
    }
}
