// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

final class Q extends P
{
    private static final String z;
    private final boolean c;
    
    static {
        final char[] charArray = "}IA\"\u0011@\u0000-".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'w';
                    break;
                }
                case 0: {
                    c2 = '4';
                    break;
                }
                case 1: {
                    c2 = ':';
                    break;
                }
                case 2: {
                    c2 = '\r';
                    break;
                }
                case 3: {
                    c2 = 'G';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    Q(final g3 g3, final boolean c) {
        super(g3);
        this.c = c;
    }
    
    private void a(final N[] array, final hU hu) {
        final boolean b = fG.b;
        int i = 0;
        while (i < array.length) {
            final N n = array[i];
            Label_0108: {
                if (array[i] != null || b) {
                    final int n2 = n.c() % 30;
                    int h = n.h();
                    if (h > hu.d()) {
                        array[i] = null;
                        if (!b) {
                            break Label_0108;
                        }
                    }
                    if (!this.c) {
                        h += 2;
                    }
                    Label_0169: {
                        switch (h % 3) {
                            case 0: {
                                if (1 + n2 * 3 == hu.b()) {
                                    break;
                                }
                                array[i] = null;
                                if (b) {
                                    break Label_0169;
                                }
                                break;
                            }
                            case 1: {
                                if (n2 / 3 == hu.c() && n2 % 3 == hu.e()) {
                                    break;
                                }
                                array[i] = null;
                                if (b) {
                                    break Label_0169;
                                }
                                break;
                            }
                            case 2: {
                                if (n2 + 1 != hu.a()) {
                                    array[i] = null;
                                    break;
                                }
                                break;
                            }
                        }
                    }
                }
            }
            ++i;
            if (b) {
                break;
            }
        }
    }
    
    int a(final hU hu) {
        final boolean b = fG.b;
        final N[] a = this.a();
        this.d();
        this.a(a, hu);
        final g3 b2 = this.b();
        cs cs;
        if (this.c) {
            cs = b2.e();
        }
        else {
            cs = b2.h();
        }
        cs cs2;
        if (this.c) {
            cs2 = b2.c();
        }
        else {
            cs2 = b2.i();
        }
        final int c = this.c((int)cs.b());
        final int c2 = this.c((int)cs2.b());
        final float n = (c2 - c) / hu.d();
        int i = c;
        int n2 = 0;
        int max = 1;
        int h = -1;
        while (i < c2) {
            Label_0332: {
                if (a[i] == null) {
                    if (!b) {
                        break Label_0332;
                    }
                    ++fN.a;
                }
                final N n3 = a[i];
                final int n4 = n3.h() - h;
                if (n4 == 0) {
                    ++n2;
                    if (!b) {
                        break Label_0332;
                    }
                }
                if (n4 == 1) {
                    max = Math.max(max, n2);
                    n2 = 1;
                    h = n3.h();
                    if (!b) {
                        break Label_0332;
                    }
                }
                final int n5 = h;
                final int n6 = max;
                final int n7 = n2;
                Label_0390: {
                    if (n4 < 0 || n3.h() >= hu.d() || n4 > i) {
                        a[i] = null;
                        if (!b) {
                            break Label_0390;
                        }
                    }
                    int n9 = 0;
                    Label_0255: {
                        if (n6 > 2) {
                            final int n8 = n4 * (n6 - 2);
                            if (!b) {
                                n9 = n8;
                                break Label_0255;
                            }
                        }
                        n9 = n4;
                    }
                    int n10;
                    if (n9 >= i) {
                        n10 = 1;
                    }
                    else {
                        n10 = 0;
                    }
                    int n11 = 1;
                    while (n11 <= n9 && n10 == 0) {
                        if (a[i - n11] != null) {
                            n10 = 1;
                        }
                        else {
                            n10 = 0;
                        }
                        ++n11;
                        if (b) {
                            break;
                        }
                    }
                    if (n10 != 0) {
                        a[i] = null;
                        if (!b) {
                            break Label_0390;
                        }
                    }
                    final int h2 = n3.h();
                    n2 = 1;
                    h = h2;
                    max = n6;
                    break Label_0332;
                }
                n2 = n7;
                max = n6;
                h = n5;
            }
            final int n12 = i + 1;
            if (b) {
                break;
            }
            i = n12;
        }
        return (int)(0.5 + n);
    }
    
    boolean a() {
        return this.c;
    }
    
    int b(final hU hu) {
        int b = 1;
        final boolean b2 = fG.b;
        final g3 b3 = this.b();
        cs cs;
        if (this.c) {
            cs = b3.e();
        }
        else {
            cs = b3.h();
        }
        cs cs2;
        if (this.c) {
            cs2 = b3.c();
        }
        else {
            cs2 = b3.i();
        }
        final int c = this.c((int)cs.b());
        final int c2 = this.c((int)cs2.b());
        final float n = (c2 - c) / hu.d();
        final N[] a = this.a();
        int h = -1;
        int i = c;
        int n2 = b;
        int n3 = 0;
        while (i < c2) {
            Label_0219: {
                if (a[i] != null || b2) {
                    final N n4 = a[i];
                    n4.d();
                    final int n5 = n4.h() - h;
                    if (n5 == 0) {
                        ++n3;
                        if (!b2) {
                            break Label_0219;
                        }
                    }
                    if (n5 == b) {
                        final int max = Math.max(n2, n3);
                        final int h2 = n4.h();
                        if (!b2) {
                            h = h2;
                            n2 = max;
                            n3 = b;
                            break Label_0219;
                        }
                        h = h2;
                        n2 = max;
                        n3 = b;
                    }
                    if (n4.h() >= hu.d()) {
                        a[i] = null;
                        if (!b2) {
                            break Label_0219;
                        }
                    }
                    h = n4.h();
                    n3 = b;
                }
            }
            ++i;
            if (b2) {
                break;
            }
        }
        final int n6 = (int)(0.5 + n);
        if (fN.a != 0) {
            if (b2) {
                b = 0;
            }
            fG.b = (b != 0);
        }
        return n6;
    }
    
    hU b() {
        final boolean b = fG.b;
        final N[] a = this.a();
        final bQ bq = new bQ();
        final bQ bq2 = new bQ();
        final bQ bq3 = new bQ();
        final bQ bq4 = new bQ();
        int n3;
        for (int length = a.length, i = 0; i < length; i = n3) {
            final N n = a[i];
            if (n != null || b) {
                n.d();
                final int n2 = n.c() % 30;
                int h = n.h();
                if (!this.c) {
                    h += 2;
                }
                Label_0269: {
                    switch (h % 3) {
                        case 0: {
                            bq2.a(1 + n2 * 3);
                            if (b) {
                                break Label_0269;
                            }
                            break;
                        }
                        case 1: {
                            bq4.a(n2 / 3);
                            bq3.a(n2 % 3);
                            if (b) {
                                break Label_0269;
                            }
                            break;
                        }
                        case 2: {
                            bq.a(n2 + 1);
                            break;
                        }
                    }
                }
            }
            n3 = i + 1;
            if (b) {
                break;
            }
        }
        if (bq.a().length == 0 || bq2.a().length == 0 || bq3.a().length == 0 || bq4.a().length == 0 || bq.a()[0] < 1 || bq2.a()[0] + bq3.a()[0] < 3 || bq2.a()[0] + bq3.a()[0] > 90) {
            return null;
        }
        final hU hu = new hU(bq.a()[0], bq2.a()[0], bq3.a()[0], bq4.a()[0]);
        this.a(a, hu);
        return hu;
    }
    
    int[] c() {
        final boolean b = fG.b;
        final hU b2 = this.b();
        int[] array;
        if (b2 == null) {
            array = null;
        }
        else {
            this.b(b2);
            array = new int[b2.d()];
            final N[] a = this.a();
            final int length = a.length;
            int i = 0;
            while (i < length) {
                final N n = a[i];
                if (n != null) {
                    final int h = n.h();
                    if (h >= array.length) {
                        throw fD.a();
                    }
                    ++array[h];
                }
                ++i;
                if (b) {
                    return array;
                }
            }
        }
        return array;
    }
    
    void d() {
        final boolean b = fG.b;
        final N[] a = this.a();
        final int length = a.length;
        int i = 0;
        while (i < length) {
            final N n = a[i];
            if (n != null) {
                n.d();
            }
            ++i;
            if (b) {
                break;
            }
        }
    }
    
    @Override
    public String toString() {
        return Q.z + this.c + '\n' + super.toString();
    }
}
