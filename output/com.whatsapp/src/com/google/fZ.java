// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

final class fZ
{
    private final int a;
    private final byte[] b;
    
    private fZ(final int a, final byte[] b) {
        this.a = a;
        this.b = b;
    }
    
    static fZ[] a(final byte[] array, final bE be, final e e) {
        final int e2 = bE.e;
        try {
            if (array.length != be.a()) {
                throw new IllegalArgumentException();
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        final hH a = be.a(e);
        final cf[] a2 = a.a();
        final int length = a2.length;
        int n = 0;
        int i = 0;
        while (i < length) {
            n += a2[i].b();
            ++i;
            if (e2 != 0) {
                ++fN.a;
                break;
            }
        }
        final fZ[] array2 = new fZ[n];
        int n2 = 0;
        int n5;
        for (int length2 = a2.length, j = 0; j < length2; j = n5) {
            final cf cf = a2[j];
            int k = 0;
            while (k < cf.b()) {
                final int a3 = cf.a();
                final int n3 = a3 + a.b();
                final int n4 = n2 + 1;
                array2[n2] = new fZ(a3, new byte[n3]);
                ++k;
                if (e2 != 0) {
                    n2 = n4;
                    break;
                }
                n2 = n4;
            }
            n5 = j + 1;
            if (e2 != 0) {
                break;
            }
        }
        final int length3 = array2[0].b.length;
        int n6 = -1 + array2.length;
        while (n6 >= 0 && (array2[n6].b.length != length3 || e2 != 0)) {
            --n6;
            if (e2 != 0) {
                break;
            }
        }
        final int n7 = n6 + 1;
        final int n8 = length3 - a.b();
        int l = 0;
        int n9 = 0;
    Label_0328:
        while (l < n8) {
            int n10 = 0;
            int n11 = n9;
            while (true) {
                while (n10 < n2) {
                    final byte[] b = array2[n10].b;
                    n9 = n11 + 1;
                    b[l] = array[n11];
                    final int n12 = n10 + 1;
                    if (e2 != 0) {
                        final int n13 = l + 1;
                        if (e2 != 0) {
                            break Label_0328;
                        }
                        l = n13;
                        continue Label_0328;
                    }
                    else {
                        n10 = n12;
                        n11 = n9;
                    }
                }
                n9 = n11;
                continue;
            }
        }
        int n14 = n7;
        int n15 = n9;
        while (true) {
            while (n14 < n2) {
                final byte[] b2 = array2[n14].b;
                final int n16 = n15 + 1;
                b2[n8] = array[n15];
                final int n17 = n14 + 1;
                if (e2 != 0) {
                    final int length4 = array2[0].b.length;
                    int n18 = n8;
                    int n19 = n16;
                Label_0470:
                    while (n18 < length4) {
                        int n20 = 0;
                        while (true) {
                            while (n20 < n2) {
                                int n21;
                                if (n20 < n7) {
                                    n21 = n18;
                                }
                                else {
                                    n21 = n18 + 1;
                                }
                                final byte[] b3 = array2[n20].b;
                                final int n22 = n19 + 1;
                                b3[n21] = array[n19];
                                final int n23 = n20 + 1;
                                if (e2 != 0) {
                                    final int n24 = n22;
                                    ++n18;
                                    if (e2 != 0) {
                                        break Label_0470;
                                    }
                                    n19 = n24;
                                    continue Label_0470;
                                }
                                else {
                                    n20 = n23;
                                    n19 = n22;
                                }
                            }
                            final int n24 = n19;
                            continue;
                        }
                    }
                    return array2;
                }
                n14 = n17;
                n15 = n16;
            }
            final int n16 = n15;
            continue;
        }
    }
    
    int a() {
        return this.a;
    }
    
    byte[] b() {
        return this.b;
    }
}
