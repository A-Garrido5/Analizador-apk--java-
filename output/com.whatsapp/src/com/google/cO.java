// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public final class cO
{
    private static final String[] z;
    private final gN a;
    
    static {
        final String[] z2 = new String[5];
        String s = "tWpbcDD{0&ZYw#r_Yz";
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
                        c2 = '\u0006';
                        break;
                    }
                    case 0: {
                        c2 = '6';
                        break;
                    }
                    case 1: {
                        c2 = '6';
                        break;
                    }
                    case 2: {
                        c2 = '\u0014';
                        break;
                    }
                    case 3: {
                        c2 = 'B';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "r_b+u_YzbgZQ{0oB^yb`W_x'b\u0016B{btSRa!c\u0016F{.\u007fXYy+gZ\t";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "E_s/gb_x&c\u001e\u0006=bqWE48cDY";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "Dio++\u0007K45gE\u0016n'tY";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "sDf-t\u0016Z{!gBYfbbSQf'c\u0016R{'u\u0016X{6&[W`!n\u0016Xa/dSD4-`\u0016D{-rE";
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
    
    public cO(final gN a) {
        this.a = a;
    }
    
    private int[] a(final r r) {
        int n = 0;
        int n2 = 1;
        final boolean n3 = gN.n;
        final int b = r.b();
        if (b == n2) {
            try {
                return new int[] { r.b(1) };
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
        }
        final int[] array = new int[b];
    Label_0097_Outer:
        while (true) {
            while (true) {
                if (n2 < this.a.a() && n < b) {
                    try {
                        if (r.c(n2) == 0) {
                            array[n] = this.a.a(n2);
                            ++n;
                        }
                        ++n2;
                        if (!n3) {
                            continue Label_0097_Outer;
                        }
                        if (n != b) {
                            try {
                                throw new dA(cO.z[4]);
                            }
                            catch (IllegalStateException ex2) {
                                throw ex2;
                            }
                        }
                    }
                    catch (IllegalStateException ex3) {
                        throw ex3;
                    }
                    break;
                }
                continue;
            }
        }
        return array;
    }
    
    private int[] a(final r r, final int[] array) {
        final boolean n = gN.n;
        final int length = array.length;
        final int[] array2 = new int[length];
        int n2 = 0;
    Label_0085_Outer:
        while (true) {
            if (n2 >= length) {
                return array2;
            }
            final int a = this.a.a(array[n2]);
            int n3 = 1;
            int n4 = 0;
            int n7 = 0;
            Label_0177: {
                while (true) {
                    int b = 0;
                    while (true) {
                        if (n4 >= length) {
                            b = n3;
                            break Label_0177;
                        }
                        Label_0098: {
                            if (n2 == n4) {
                                b = n3;
                                break Label_0098;
                            }
                            final int b2 = this.a.b(array[n4], a);
                            if ((b2 & 0x1) != 0x0) {
                                break Label_0177;
                            }
                            final int n5 = b2 | 0x1;
                            b = this.a.b(n3, n5);
                        }
                        final int n6 = n4 + 1;
                        if (!n) {
                            n4 = n6;
                            n3 = b;
                            continue Label_0085_Outer;
                        }
                        break;
                    }
                    try {
                        array2[n2] = this.a.b(r.c(a), this.a.a(b));
                        if (this.a.b() != 0) {
                            array2[n2] = this.a.b(array2[n2], a);
                        }
                        n7 = n2 + 1;
                        if (n) {
                            return array2;
                        }
                        break Label_0177;
                        final int b2;
                        final int n5 = b2 & 0xFFFFFFFE;
                        continue;
                    }
                    catch (IllegalStateException ex) {
                        throw ex;
                    }
                    break;
                }
            }
            n2 = n7;
        }
    }
    
    private r[] a(r r, r a, final int n) {
        final boolean n2 = gN.n;
        if (r.b() >= a.b()) {
            final r r2 = a;
            a = r;
            r = r2;
        }
        r c = this.a.c();
        while (true) {
            r d;
            r r5;
            r a3;
            r r6;
            for (d = this.a.d(); r.b() >= n / 2; r = r5, r6 = d, d = a3, c = r6) {
                try {
                    if (r.a()) {
                        throw new dA(cO.z[3]);
                    }
                }
                catch (IllegalStateException ex) {
                    throw ex;
                }
                r r3 = this.a.c();
                final int a2 = this.a.a(r.b(r.b()));
                while (a.b() >= r.b() && !a.a()) {
                    final int n3 = a.b() - r.b();
                    final int b = this.a.b(a.b(a.b()), a2);
                    r3 = r3.a(this.a.a(n3, b));
                    a = a.a(r.a(n3, b));
                    if (n2) {
                        break;
                    }
                }
                final r r4 = r3;
                r5 = a;
                a3 = r4.b(d).a(c);
                try {
                    if (r5.b() >= r.b()) {
                        throw new IllegalStateException(cO.z[1]);
                    }
                }
                catch (IllegalStateException ex2) {
                    throw ex2;
                }
                if (n2) {
                    final int b2 = a3.b(0);
                    if (b2 == 0) {
                        try {
                            throw new dA(cO.z[2]);
                        }
                        catch (IllegalStateException ex3) {
                            throw ex3;
                        }
                    }
                    final int a4 = this.a.a(b2);
                    return new r[] { a3.a(a4), r5.a(a4) };
                }
                a = r;
            }
            a3 = d;
            r5 = r;
            continue;
        }
    }
    
    public void a(final int[] array, final int n) {
        int i = 0;
        final boolean n2 = gN.n;
        final r r = new r(this.a, array);
        final int[] array2 = new int[n];
        int j = 0;
        boolean b = true;
        while (j < n) {
            if ((array2[-1 + array2.length - j] = r.c(this.a.c(j + this.a.b()))) != 0) {
                b = false;
            }
            ++j;
            if (n2) {
                ++fN.a;
                break;
            }
        }
        if (!b) {
            final r[] a = this.a(this.a.a(n, 1), new r(this.a, array2), n);
            final r r2 = a[0];
            final r r3 = a[1];
            final int[] a2 = this.a(r2);
            final int[] a3 = this.a(r3, a2);
            while (i < a2.length) {
                final int n3 = -1 + array.length - this.a.b(a2[i]);
                if (n3 < 0) {
                    try {
                        throw new dA(cO.z[0]);
                    }
                    catch (IllegalStateException ex) {
                        throw ex;
                    }
                }
                array[n3] = gN.c(array[n3], a3[i]);
                ++i;
                if (n2) {
                    return;
                }
            }
        }
    }
}
