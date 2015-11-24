// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public final class bm
{
    private static int a(int i, int n) {
        int j = 1;
        final int c = e0.c;
        int n2 = 0;
        Label_0033: {
            if (i - n > n) {
                n2 = i - n;
                if (c == 0) {
                    break Label_0033;
                }
            }
            final int n3 = i - n;
            n2 = n;
            n = n3;
        }
        int n4 = j;
        while (i > n2) {
            n4 *= i;
            if (j <= n) {
                n4 /= j;
                ++j;
            }
            --i;
            if (c != 0) {
                break;
            }
        }
        int n5 = n4;
        while (j <= n) {
            n5 /= j;
            ++j;
            if (c != 0) {
                break;
            }
        }
        return n5;
    }
    
    public static int a(final int[] array, final int n, final boolean b) {
        final int c = e0.c;
        final int length = array.length;
        final int length2 = array.length;
        int n2 = 0;
        int i = 0;
        while (i < length2) {
            n2 += array[i];
            ++i;
            if (c != 0) {
                break;
            }
        }
        int j = 0;
        int n3 = n2;
        int n4 = 0;
        int n5 = 0;
        while (j < length - 1) {
            int k = 1;
            n4 |= 1 << j;
            while (k < array[j]) {
                int a = a(-1 + (n3 - k), -2 + (length - j));
                if (b && n4 == 0 && n3 - k - (-1 + (length - j)) >= -1 + (length - j)) {
                    a -= a(n3 - k - (length - j), -2 + (length - j));
                }
                Label_0267: {
                    if (-1 + (length - j) > 1) {
                        final int n6 = n3 - k - (-2 + (length - j));
                        int n7 = 0;
                        int l = n6;
                        while (l > n) {
                            n7 += a(-1 + (n3 - k - l), -3 + (length - j));
                            --l;
                            if (c != 0) {
                                break;
                            }
                        }
                        a -= n7 * (length - 1 - j);
                        if (c == 0) {
                            break Label_0267;
                        }
                    }
                    if (n3 - k > n) {
                        --a;
                    }
                }
                n5 += a;
                ++k;
                n4 &= (-1 ^ 1 << j);
                if (c != 0) {
                    break;
                }
            }
            final int n8 = n3 - k;
            final int n9 = j + 1;
            if (c != 0) {
                break;
            }
            j = n9;
            n3 = n8;
        }
        return n5;
    }
}
