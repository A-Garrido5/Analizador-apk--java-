// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

final class hx
{
    private static int a(int n) {
        if (n > -12) {
            n = -1;
        }
        return n;
    }
    
    private static int a(final int n, final int n2) {
        if (n > -12 || n2 > -65) {
            return -1;
        }
        return n ^ n2 << 8;
    }
    
    private static int a(final int n, final int n2, final int n3) {
        if (n > -12 || n2 > -65 || n3 > -65) {
            return -1;
        }
        return n ^ n2 << 8 ^ n3 << 16;
    }
    
    public static int a(final int n, final byte[] array, int n2, final int n3) {
        if (n != 0) {
            if (n2 >= n3) {
                return n;
            }
            final byte b = (byte)n;
            if (b < -32) {
                if (b >= -62) {
                    final int n4 = n2 + 1;
                    if (array[n2] <= -65) {
                        n2 = n4;
                        return a(array, n2, n3);
                    }
                }
                return -1;
            }
            Label_0149: {
                if (b < -16) {
                    byte b2 = (byte)(-1 ^ n >> 8);
                    int n5;
                    if (b2 == 0) {
                        n5 = n2 + 1;
                        b2 = array[n2];
                        if (n5 >= n3) {
                            return a(b, b2);
                        }
                    }
                    else {
                        n5 = n2;
                    }
                    if (b2 <= -65 && (b != -32 || b2 >= -96) && (b != -19 || b2 < -96)) {
                        n2 = n5 + 1;
                        if (array[n5] <= -65) {
                            if (dt.b) {
                                break Label_0149;
                            }
                            return a(array, n2, n3);
                        }
                    }
                    return -1;
                }
            }
            final int n6 = n2;
            final byte b3 = (byte)(-1 ^ n >> 8);
            int n7;
            byte b5;
            int n8;
            if (b3 == 0) {
                n7 = n6 + 1;
                final byte b4 = array[n6];
                if (n7 >= n3) {
                    return a(b, b4);
                }
                b5 = b4;
                n8 = 0;
            }
            else {
                n8 = (byte)(n >> 16);
                n7 = n6;
                b5 = b3;
            }
            int n9;
            if (n8 == 0) {
                n9 = n7 + 1;
                n8 = array[n7];
                if (n9 >= n3) {
                    return a(b, b5, n8);
                }
            }
            else {
                n9 = n7;
            }
            if (b5 <= -65 && (b << 28) + (b5 + 112) >> 30 == 0 && n8 <= -65) {
                n2 = n9 + 1;
                if (array[n9] <= -65) {
                    return a(array, n2, n3);
                }
            }
            return -1;
        }
        return a(array, n2, n3);
    }
    
    public static int a(final byte[] array, final int n, final int n2) {
        final boolean b = dt.b;
        int n3 = n;
        while (n3 < n2 && array[n3] >= 0) {
            ++n3;
            if (b) {
                break;
            }
        }
        if (n3 >= n2) {
            return 0;
        }
        return d(array, n3, n2);
    }
    
    public static boolean b(final byte[] array, final int n, final int n2) {
        return a(array, n, n2) == 0;
    }
    
    private static int c(final byte[] array, final int n, final int n2) {
        final byte b = array[n - 1];
        switch (n2 - n) {
            default: {
                throw new AssertionError();
            }
            case 0: {
                return a(b);
            }
            case 1: {
                return a(b, array[n]);
            }
            case 2: {
                return a(b, array[n], array[n + 1]);
            }
        }
    }
    
    private static int d(final byte[] array, int i, final int n) {
        while (i < n) {
            final int n2 = i + 1;
            final int n3 = array[i];
            if (n3 < 0) {
                int n4 = 0;
                Label_0222: {
                    if (n3 < -32) {
                        if (n2 < n) {
                            if (n3 >= -62) {
                                n4 = n2 + 1;
                                if (array[n2] <= -65) {
                                    break Label_0222;
                                }
                            }
                            return -1;
                        }
                        return n3;
                    }
                    else if (n3 < -16) {
                        if (n2 >= n - 1) {
                            return c(array, n2, n);
                        }
                        final int n5 = n2 + 1;
                        final byte b = array[n2];
                        if (b <= -65 && (n3 != -32 || b >= -96) && (n3 != -19 || b < -96)) {
                            n4 = n5 + 1;
                            if (array[n5] <= -65) {
                                break Label_0222;
                            }
                        }
                        return -1;
                    }
                    else {
                        if (n2 >= n - 2) {
                            return c(array, n2, n);
                        }
                        final int n6 = n2 + 1;
                        final byte b2 = array[n2];
                        if (b2 <= -65 && (n3 << 28) + (b2 + 112) >> 30 == 0) {
                            final int n7 = n6 + 1;
                            if (array[n6] <= -65) {
                                n4 = n7 + 1;
                                if (array[n7] <= -65) {
                                    break Label_0222;
                                }
                            }
                        }
                        return -1;
                    }
                }
                i = n4;
            }
            else {
                i = n2;
            }
        }
        return 0;
    }
}
