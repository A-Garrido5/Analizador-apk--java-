// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

final class ei
{
    private final int a;
    private final byte[] b;
    
    private ei(final int a, final byte[] b) {
        this.a = a;
        this.b = b;
    }
    
    static ei[] a(final byte[] array, final ef ef) {
        final int f = ef.f;
        final hG b = ef.b();
        final bM[] b2 = b.b();
        final int length = b2.length;
        int i = 0;
        int n = 0;
        while (i < length) {
            n += b2[i].a();
            ++i;
            if (f != 0) {
                break;
            }
        }
        final ei[] array2 = new ei[n];
        final int length2 = b2.length;
        int j = 0;
        int n2 = 0;
    Label_0163:
        while (j < length2) {
            final bM bm = b2[j];
            int n3 = n2;
            int k = 0;
            while (true) {
                while (k < bm.a()) {
                    final int b3 = bm.b();
                    final int n4 = b3 + b.a();
                    final int n5 = n3 + 1;
                    array2[n3] = new ei(b3, new byte[n4]);
                    ++k;
                    if (f != 0) {
                        n2 = n5;
                        final int n6 = j + 1;
                        if (f != 0) {
                            break Label_0163;
                        }
                        j = n6;
                        continue Label_0163;
                    }
                    else {
                        n3 = n5;
                    }
                }
                n2 = n3;
                continue;
            }
        }
        final int n7 = array2[0].b.length - b.a();
        final int n8 = n7 - 1;
        int l = 0;
        int n9 = 0;
    Block_7:
        while (l < n8) {
            int n10 = 0;
            int n11 = n9;
            while (true) {
                while (n10 < n2) {
                    final byte[] b4 = array2[n10].b;
                    n9 = n11 + 1;
                    b4[l] = array[n11];
                    final int n12 = n10 + 1;
                    if (f != 0) {
                        final int n13 = l + 1;
                        if (f != 0) {
                            break Block_7;
                        }
                        l = n13;
                        continue Block_7;
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
        int n14;
        int n15;
        int n16;
        byte[] b5;
        int n17;
        int n18 = 0;
        int n19 = 0;
        int n20;
        int length3;
        int n21 = 0;
        int n22;
        int n23 = 0;
        int n24;
        byte[] b6;
        int n25 = 0;
        int n26 = 0;
        int n27;
        Label_0281_Outer:Label_0284_Outer:Label_0336_Outer:
        while (true) {
            while (true) {
                Label_0516:Label_0428_Outer:
                while (true) {
                    Label_0505: {
                        while (true) {
                            Label_0498:Label_0389_Outer:
                            while (true) {
                            Label_0487:
                                while (true) {
                                Label_0477:
                                    while (true) {
                                    Label_0470:
                                        while (true) {
                                            try {
                                                if (ef.d() == 24) {
                                                    n14 = 1;
                                                    if (n14 == 0) {
                                                        break Label_0470;
                                                    }
                                                    n15 = 8;
                                                    n16 = 0;
                                                    if (n16 >= n15) {
                                                        break Label_0516;
                                                    }
                                                    b5 = array2[n16].b;
                                                    n17 = n7 - 1;
                                                    n18 = n9 + 1;
                                                    b5[n17] = array[n9];
                                                    n19 = n16 + 1;
                                                    if (f == 0) {
                                                        break Label_0505;
                                                    }
                                                    n20 = n18;
                                                    length3 = array2[0].b.length;
                                                    n21 = n7;
                                                    while (n21 < length3) {
                                                        n22 = 0;
                                                        n23 = n20;
                                                        if (n22 >= n2) {
                                                            break Label_0498;
                                                        }
                                                        if (n14 == 0 || n22 <= 7) {
                                                            break Label_0477;
                                                        }
                                                        n24 = n21 - 1;
                                                        b6 = array2[n22].b;
                                                        n25 = n23 + 1;
                                                        b6[n24] = array[n23];
                                                        n26 = n22 + 1;
                                                        if (f == 0) {
                                                            break Label_0487;
                                                        }
                                                        n20 = n25;
                                                        ++n21;
                                                        if (f != 0) {
                                                            break;
                                                        }
                                                    }
                                                    n27 = n20;
                                                    try {
                                                        if (n27 != array.length) {
                                                            throw new IllegalArgumentException();
                                                        }
                                                        break;
                                                    }
                                                    catch (IllegalArgumentException ex) {
                                                        throw ex;
                                                    }
                                                }
                                            }
                                            catch (IllegalArgumentException ex2) {
                                                throw ex2;
                                            }
                                            n14 = 0;
                                            continue Label_0281_Outer;
                                        }
                                        n15 = n2;
                                        continue Label_0284_Outer;
                                    }
                                    n24 = n21;
                                    continue Label_0428_Outer;
                                }
                                n22 = n26;
                                n23 = n25;
                                continue Label_0389_Outer;
                            }
                            n20 = n23;
                            continue;
                        }
                    }
                    n16 = n19;
                    n9 = n18;
                    continue Label_0336_Outer;
                }
                n20 = n9;
                continue;
            }
        }
        return array2;
    }
    
    int a() {
        return this.a;
    }
    
    byte[] b() {
        return this.b;
    }
}
