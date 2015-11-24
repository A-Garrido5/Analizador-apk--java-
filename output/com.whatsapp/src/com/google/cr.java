// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Formatter;

final class cr
{
    private static final String[] z;
    private final hU a;
    private final P[] b;
    private g3 c;
    private final int d;
    
    static {
        final String[] z2 = new String[5];
        String s = "\u0001}\u0016=l\u0004kA";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0156:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0010';
                        break;
                    }
                    case 0: {
                        c2 = '!';
                        break;
                    }
                    case 1: {
                        c2 = 'X';
                        break;
                    }
                    case 2: {
                        c2 = '%';
                        break;
                    }
                    case 3: {
                        c2 = 'Y';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0001x\u0005yl\u0001x\u0005";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u0001x\u0005yl\u0001x\u0005";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "b\u000f\u0005|#Eb";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "\u00046";
                    n = 3;
                    continue;
                }
                case 3: {
                    break Label_0156;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    cr(final hU a, final g3 c) {
        this.a = a;
        this.d = a.a();
        this.c = c;
        this.b = new P[2 + this.d];
    }
    
    private static int a(final int n, int n2, final N n3) {
        if (n3 != null && !n3.a()) {
            if (n3.b(n)) {
                n3.a(n);
                final boolean b = fG.b;
                n2 = 0;
                if (!b) {
                    return n2;
                }
            }
            return n2 + 1;
        }
        return n2;
    }
    
    private void a(final int n, final int n2, final N[] array) {
        final boolean b = fG.b;
        final N n3 = array[n2];
        final N[] a = this.b[n - 1].a();
        N[] a2;
        if (this.b[n + 1] != null) {
            a2 = this.b[n + 1].a();
        }
        else {
            a2 = a;
        }
        final N[] array2 = new N[14];
        array2[2] = a[n2];
        array2[3] = a2[n2];
        if (n2 > 0) {
            array2[0] = array[n2 - 1];
            array2[4] = a[n2 - 1];
            array2[5] = a2[n2 - 1];
        }
        if (n2 > 1) {
            array2[8] = array[n2 - 2];
            array2[10] = a[n2 - 2];
            array2[11] = a2[n2 - 2];
        }
        if (n2 < -1 + array.length) {
            array2[1] = array[n2 + 1];
            array2[6] = a[n2 + 1];
            array2[7] = a2[n2 + 1];
        }
        if (n2 < -2 + array.length) {
            array2[9] = array[n2 + 2];
            array2[12] = a[n2 + 2];
            array2[13] = a2[n2 + 2];
        }
        final int length = array2.length;
        int n4 = 0;
        while (n4 < length && !a(n3, array2[n4])) {
            ++n4;
            if (b) {
                return;
            }
        }
    }
    
    private void a(final P p) {
        if (p != null) {
            ((Q)p).a(this.a);
        }
    }
    
    private static boolean a(final N n, final N n2) {
        if (n2 != null && n2.a() && n2.e() == n.e()) {
            n.a(n2.h());
            return true;
        }
        return false;
    }
    
    private int b() {
        this.h();
        return this.c() + this.j();
    }
    
    private int c() {
        final boolean b = fG.b;
        if (this.b[0] == null) {
            return 0;
        }
        final N[] a = this.b[0].a();
        int i = 0;
        int n = 0;
        while (i < a.length) {
            if (a[i] != null || b) {
                final int h = a[i].h();
                int n2 = n;
                int n3 = 1;
                int a2 = 0;
                while (n3 < 1 + this.d && a2 < 2) {
                    final N n4 = this.b[n3].a()[i];
                    if (n4 != null) {
                        a2 = a(h, a2, n4);
                        if (!n4.a()) {
                            ++n2;
                        }
                    }
                    ++n3;
                    if (b) {
                        break;
                    }
                }
                n = n2;
            }
            ++i;
            if (b) {
                break;
            }
        }
        return n;
    }
    
    private int e() {
        final boolean b = fG.b;
        final int b2 = this.b();
        if (b2 == 0) {
            return 0;
        }
        int i = 1;
        while (i < 1 + this.d) {
            final N[] a = this.b[i].a();
            int j = 0;
            while (j < a.length) {
                if ((a[j] != null || b) && !a[j].a()) {
                    this.a(i, j, a);
                }
                ++j;
                if (b) {
                    break;
                }
            }
            ++i;
            if (b) {
                break;
            }
        }
        return b2;
    }
    
    private void h() {
        int i = 0;
        final boolean b = fG.b;
        if (this.b[0] != null && this.b[1 + this.d] != null) {
            final N[] a = this.b[0].a();
            final N[] a2 = this.b[1 + this.d].a();
            while (i < a.length) {
                if (a[i] != null && a2[i] != null && a[i].h() == a2[i].h()) {
                    int j = 1;
                    while (j <= this.d) {
                        final N n = this.b[j].a()[i];
                        if (n != null || b) {
                            n.a(a[i].h());
                            if (!n.a()) {
                                this.b[j].a()[i] = null;
                            }
                        }
                        ++j;
                        if (b) {
                            break;
                        }
                    }
                }
                ++i;
                if (b) {
                    return;
                }
            }
        }
    }
    
    private int j() {
        final boolean b = fG.b;
        if (this.b[1 + this.d] == null) {
            return 0;
        }
        final N[] a = this.b[1 + this.d].a();
        int i = 0;
        int n = 0;
        while (i < a.length) {
            if (a[i] != null || b) {
                final int h = a[i].h();
                int n2 = 1 + this.d;
                int a2 = 0;
                while (n2 > 0 && a2 < 2) {
                    final N n3 = this.b[n2].a()[i];
                    if (n3 != null) {
                        a2 = a(h, a2, n3);
                        if (!n3.a()) {
                            ++n;
                        }
                    }
                    --n2;
                    if (b) {
                        break;
                    }
                }
            }
            ++i;
            if (b) {
                break;
            }
        }
        return n;
    }
    
    int a() {
        return this.d;
    }
    
    P a(final int n) {
        return this.b[n];
    }
    
    void a(final int n, final P p2) {
        this.b[n] = p2;
    }
    
    public void a(final g3 c) {
        this.c = c;
    }
    
    int d() {
        return this.a.c();
    }
    
    int f() {
        return this.a.d();
    }
    
    g3 g() {
        return this.c;
    }
    
    P[] i() {
        this.a(this.b[0]);
        this.a(this.b[1 + this.d]);
        int n = 928;
        while (true) {
            final int e = this.e();
            if (e <= 0 || e >= n) {
                break;
            }
            n = e;
        }
        return this.b;
    }
    
    @Override
    public String toString() {
        final boolean b = fG.b;
        P p = this.b[0];
        if (p == null) {
            p = this.b[1 + this.d];
        }
        final Formatter formatter = new Formatter();
        int i = 0;
        while (i < p.a().length) {
            formatter.format(cr.z[3], i);
            int j = 0;
            while (j < 2 + this.d) {
                Label_0205: {
                    if (this.b[j] == null) {
                        formatter.format(cr.z[2], new Object[0]);
                        if (!b) {
                            break Label_0205;
                        }
                    }
                    final N n = this.b[j].a()[i];
                    if (n == null) {
                        formatter.format(cr.z[1], new Object[0]);
                        if (!b) {
                            break Label_0205;
                        }
                    }
                    formatter.format(cr.z[0], n.h(), n.c());
                }
                ++j;
                if (b) {
                    break;
                }
            }
            formatter.format(cr.z[4], new Object[0]);
            ++i;
            if (b) {
                break;
            }
        }
        final String string = formatter.toString();
        formatter.close();
        return string;
    }
}
