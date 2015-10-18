// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public final class et
{
    private final int a;
    private final L b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    
    public et(final L l) {
        this(l, 10, l.g() / 2, l.a() / 2);
    }
    
    public et(final L b, final int n, final int n2, final int n3) {
        final boolean a = gf.a;
        this.b = b;
        this.a = b.a();
        this.f = b.g();
        final int n4 = n / 2;
        this.d = n2 - n4;
        this.c = n2 + n4;
        this.e = n3 - n4;
        this.g = n4 + n3;
        if (this.e < 0 || this.d < 0 || this.g >= this.a || this.c >= this.f) {
            throw fv.a();
        }
        if (fN.a != 0) {
            gf.a = !a;
        }
    }
    
    private cs a(final float n, final float n2, final float n3, final float n4) {
        final boolean a = gf.a;
        final int a2 = gf.a(gf.a(n, n2, n3, n4));
        final float n5 = (n3 - n) / a2;
        final float n6 = (n4 - n2) / a2;
        int i = 0;
        while (i < a2) {
            final int a3 = gf.a(n + n5 * i);
            final int a4 = gf.a(n2 + n6 * i);
            if (this.b.a(a3, a4)) {
                return new cs(a3, a4);
            }
            ++i;
            if (a) {
                break;
            }
        }
        return null;
    }
    
    private boolean a(int i, final int n, final int n2, final boolean b) {
        final boolean a = gf.a;
        if (b) {
            int j = i;
            while (j <= n) {
                if (this.b.a(j, n2)) {
                    return true;
                }
                ++j;
                if (a) {
                    break;
                }
            }
            if (!a) {
                return false;
            }
        }
        while (i <= n) {
            if (this.b.a(n2, i)) {
                return true;
            }
            ++i;
            if (a) {
                break;
            }
        }
        return false;
    }
    
    private cs[] a(final cs cs, final cs cs2, final cs cs3, final cs cs4) {
        final float a = cs.a();
        final float b = cs.b();
        final float a2 = cs2.a();
        final float b2 = cs2.b();
        final float a3 = cs3.a();
        final float b3 = cs3.b();
        final float a4 = cs4.a();
        final float b4 = cs4.b();
        if (a < this.f / 2.0f) {
            return new cs[] { new cs(a4 - 1.0f, b4 + 1.0f), new cs(a2 + 1.0f, b2 + 1.0f), new cs(a3 - 1.0f, b3 - 1.0f), new cs(a + 1.0f, b - 1.0f) };
        }
        return new cs[] { new cs(a4 + 1.0f, b4 + 1.0f), new cs(a2 + 1.0f, b2 - 1.0f), new cs(a3 - 1.0f, b3 + 1.0f), new cs(a - 1.0f, b - 1.0f) };
    }
    
    public cs[] a() {
        final boolean a = gf.a;
        int d = this.d;
        int c = this.c;
        int e = this.e;
        int g = this.g;
        int n = 0;
        int i = 1;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        while (true) {
            while (i != 0) {
                int n7 = n3;
                boolean b = false;
                boolean a2 = true;
                while ((a2 || n7 == 0) && c < this.f) {
                    a2 = this.a(e, g, c, false);
                    if (a2) {
                        ++c;
                        b = true;
                        n7 = 1;
                        if (!a) {
                            continue;
                        }
                        ++fN.a;
                    }
                    if (n7 == 0) {
                        ++c;
                        if (a) {
                            break;
                        }
                        continue;
                    }
                }
                if (c >= this.f) {
                    n = 1;
                    if (!a) {
                        break;
                    }
                }
                boolean b2 = b;
                int n8 = n4;
                boolean a3 = true;
                while ((a3 || n8 == 0) && g < this.a) {
                    a3 = this.a(d, c, g, true);
                    if (a3) {
                        ++g;
                        b2 = true;
                        n8 = 1;
                        if (!a) {
                            continue;
                        }
                    }
                    if (n8 == 0) {
                        ++g;
                        if (a) {
                            break;
                        }
                        continue;
                    }
                }
                if (g >= this.a) {
                    n = 1;
                    if (!a) {
                        break;
                    }
                }
                boolean b3 = b2;
                int n9 = n5;
                boolean a4 = true;
                while ((a4 || n9 == 0) && d >= 0) {
                    a4 = this.a(e, g, d, false);
                    if (a4) {
                        --d;
                        b3 = true;
                        n9 = 1;
                        if (!a) {
                            continue;
                        }
                    }
                    if (n9 == 0) {
                        --d;
                        if (a) {
                            break;
                        }
                        continue;
                    }
                }
                n5 = n9;
                if (d < 0) {
                    n = 1;
                    if (!a) {
                        break;
                    }
                }
                int n10 = n6;
                int n11 = e;
                boolean b4 = b3;
                boolean a5 = true;
                while ((a5 || n10 == 0) && n11 >= 0) {
                    a5 = this.a(d, c, n11, true);
                    if (a5) {
                        --n11;
                        b4 = true;
                        n10 = 1;
                        if (!a) {
                            continue;
                        }
                    }
                    if (n10 == 0) {
                        --n11;
                        if (a) {
                            break;
                        }
                        continue;
                    }
                }
                final boolean b5 = b4;
                e = n11;
                n6 = n10;
                if (e < 0) {
                    n = 1;
                    if (!a) {
                        break;
                    }
                }
                final int n12 = n;
                int n13;
                if (b5) {
                    n13 = 1;
                }
                else {
                    n13 = n2;
                }
                if (a) {
                    final int n14 = n13;
                    final int n15 = c;
                    final int n16 = e;
                    n = n12;
                    final int n17 = d;
                    if (n != 0 || n14 == 0) {
                        throw fv.a();
                    }
                    final int n18 = n15 - n17;
                    cs a6 = null;
                    int j = 1;
                    while (j < n18) {
                        a6 = this.a(n17, g - j, n17 + j, g);
                        if (a6 != null && !a) {
                            break;
                        }
                        ++j;
                        if (a) {
                            break;
                        }
                    }
                    final cs cs = a6;
                    if (cs == null) {
                        throw fv.a();
                    }
                    cs a7 = null;
                    int k = 1;
                    while (k < n18) {
                        a7 = this.a(n17, n16 + k, n17 + k, n16);
                        if (a7 != null && !a) {
                            break;
                        }
                        ++k;
                        if (a) {
                            break;
                        }
                    }
                    final cs cs2 = a7;
                    if (cs2 == null) {
                        throw fv.a();
                    }
                    cs a8 = null;
                    int l = 1;
                    while (l < n18) {
                        a8 = this.a(n15, n16 + l, n15 - l, n16);
                        if (a8 != null && !a) {
                            break;
                        }
                        ++l;
                        if (a) {
                            break;
                        }
                    }
                    final cs cs3 = a8;
                    if (cs3 == null) {
                        throw fv.a();
                    }
                    cs a9 = null;
                    int n19 = 1;
                    while (n19 < n18) {
                        a9 = this.a(n15, g - n19, n15 - n19, g);
                        if (a9 != null && !a) {
                            break;
                        }
                        ++n19;
                        if (a) {
                            break;
                        }
                    }
                    if (a9 == null) {
                        throw fv.a();
                    }
                    return this.a(a9, cs, cs3, cs2);
                }
                else {
                    n2 = n13;
                    n = n12;
                    final int n20 = n8;
                    n3 = n7;
                    i = (b5 ? 1 : 0);
                    n4 = n20;
                }
            }
            final int n14 = n2;
            final int n15 = c;
            final int n16 = e;
            final int n17 = d;
            continue;
        }
    }
}
