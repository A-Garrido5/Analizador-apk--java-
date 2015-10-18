// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.lang.reflect.Array;

public final class cE extends cJ
{
    private L e;
    
    public cE(final b5 b5) {
        super(b5);
    }
    
    private static int a(final int n, final int n2, final int n3) {
        if (n < n2) {
            return n2;
        }
        if (n > n3) {
            return n3;
        }
        return n;
    }
    
    private static void a(final byte[] array, final int n, final int n2, final int n3, final int n4, final L l) {
        final int b = hN.b;
        int n5 = n + n2 * n4;
        int i = 0;
        while (i < 8) {
            int j = 0;
            while (j < 8) {
                if ((0xFF & array[n5 + j]) <= n3) {
                    l.b(n + j, n2 + i);
                }
                ++j;
                if (b != 0) {
                    break;
                }
            }
            ++i;
            final int n6 = n5 + n4;
            if (b != 0) {
                break;
            }
            n5 = n6;
        }
    }
    
    private static void a(final byte[] array, final int n, final int n2, final int n3, final int n4, final int[][] array2, final L l) {
        final int b = hN.b;
        int n11;
        for (int i = 0; i < n2; i = n11) {
            final int n5 = i << 3;
            int n6 = n4 - 8;
            if (n5 <= n6) {
                n6 = n5;
            }
            int n10;
            for (int j = 0; j < n; j = n10) {
                final int n7 = j << 3;
                int n8 = n3 - 8;
                if (n7 <= n8) {
                    n8 = n7;
                }
                final int a = a(j, 2, n - 3);
                final int a2 = a(i, 2, n2 - 3);
                int n9 = 0;
                int k = -2;
                while (k <= 2) {
                    final int[] array3 = array2[a2 + k];
                    n9 += array3[a - 2] + array3[a - 1] + array3[a] + array3[a + 1] + array3[a + 2];
                    ++k;
                    if (b != 0) {
                        break;
                    }
                }
                a(array, n8, n6, n9 / 25, n3, l);
                n10 = j + 1;
                if (b != 0) {
                    break;
                }
            }
            n11 = i + 1;
            if (b != 0) {
                break;
            }
        }
    }
    
    private static int[][] a(final byte[] array, final int n, final int n2, final int n3, final int n4) {
        final int b = hN.b;
        final int[][] array2 = (int[][])Array.newInstance(Integer.TYPE, n2, n);
        int n28;
        for (int i = 0; i < n2; i = n28) {
            final int n5 = i << 3;
            int n6 = n4 - 8;
            if (n5 <= n6) {
                n6 = n5;
            }
            int n27;
            for (int j = 0; j < n; j = n27) {
                final int n7 = j << 3;
                int n8 = n3 - 8;
                if (n7 <= n8) {
                    n8 = n7;
                }
                int k = 0;
                int n9 = n8 + n6 * n3;
                int n10 = 0;
                int n11 = 255;
                int n12 = 0;
                while (k < 8) {
                    int n14;
                    for (int l = 0; l < 8; l = n14) {
                        final int n13 = 0xFF & array[n9 + l];
                        n12 += n13;
                        if (n13 < n11) {
                            n11 = n13;
                        }
                        if (n13 > n10) {
                            n10 = n13;
                        }
                        n14 = l + 1;
                        if (b != 0) {
                            break;
                        }
                    }
                    if (n10 - n11 > 24) {
                        final int n15 = k + 1;
                        final int n16 = n9 + n3;
                        int n17 = n15;
                        int n18 = n12;
                        int n19 = n16;
                        while (n17 < 8) {
                            int n20 = 0;
                            while (n20 < 8) {
                                n18 += (0xFF & array[n19 + n20]);
                                ++n20;
                                if (b != 0) {
                                    break;
                                }
                            }
                            ++n17;
                            n19 += n3;
                            if (b != 0) {
                                break;
                            }
                        }
                        final int n21 = n19;
                        n12 = n18;
                        k = n17;
                        n9 = n21;
                    }
                    ++k;
                    n9 += n3;
                    if (b != 0) {
                        break;
                    }
                }
                final int n22 = n10;
                final int n23 = n12;
                final int n24 = n11;
                int n25 = n23 >> 6;
                Label_0392: {
                    if (n22 - n24 <= 24) {
                        final int n26 = n24 / 2;
                        if (i > 0 && j > 0) {
                            n25 = (array2[i - 1][j] + 2 * array2[i][j - 1] + array2[i - 1][j - 1]) / 4;
                            if (n24 < n25) {
                                break Label_0392;
                            }
                        }
                        n25 = n26;
                    }
                }
                array2[i][j] = n25;
                n27 = j + 1;
                if (b != 0) {
                    break;
                }
            }
            n28 = i + 1;
            if (b != 0) {
                break;
            }
        }
        return array2;
    }
    
    @Override
    public cG a(final b5 b5) {
        return new cE(b5);
    }
    
    @Override
    public L d() {
        if (this.e != null) {
            return this.e;
        }
        final b5 b = this.b();
        final int c = b.c();
        final int e = b.e();
        if (c >= 40 && e >= 40) {
            final byte[] b2 = b.b();
            int n = c >> 3;
            if ((c & 0x7) != 0x0) {
                ++n;
            }
            int n2 = e >> 3;
            if ((e & 0x7) != 0x0) {
                ++n2;
            }
            final int[][] a = a(b2, n, n2, c, e);
            final L e2 = new L(c, e);
            a(b2, n, n2, c, e, a, e2);
            this.e = e2;
            if (hN.b == 0) {
                return this.e;
            }
        }
        this.e = super.d();
        return this.e;
    }
}
