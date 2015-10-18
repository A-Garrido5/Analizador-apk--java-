// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems.jobqueue;

class l extends k
{
    private static final int[] d;
    private static final int[] g;
    private final int[] c;
    private int e;
    private int f;
    
    static {
        g = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
        d = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
    }
    
    public l(final int n, final byte[] b) {
        this.b = b;
        int[] c;
        if ((n & 0x8) == 0x0) {
            c = l.g;
        }
        else {
            c = l.d;
        }
        this.c = c;
        this.e = 0;
        this.f = 0;
    }
    
    public boolean a(final byte[] array, final int n, final int n2, final boolean b) {
        final boolean b2 = org.whispersystems.jobqueue.f.b;
        if (this.e == 6) {
            return false;
        }
        final int n3 = n2 + n;
        int e = this.e;
        int f = this.f;
        int n4 = 0;
        final byte[] b3 = this.b;
        final int[] c = this.c;
        int i = n;
    Label_0201:
        while (true) {
            int f2;
            int n5;
            int n6;
            int n7;
            int n8 = 0;
            int n9;
            int n10;
            int n11;
            int n12 = 0;
            int n13;
            Label_0738_Outer:Label_0652_Outer:
            while (i < n3) {
                if (e == 0) {
                    while (i + 4 <= n3) {
                        f = (c[0xFF & array[i]] << 18 | c[0xFF & array[i + 1]] << 12 | c[0xFF & array[i + 2]] << 6 | c[0xFF & array[i + 3]]);
                        if (f < 0) {
                            break;
                        }
                        b3[n4 + 2] = (byte)f;
                        b3[n4 + 1] = (byte)(f >> 8);
                        b3[n4] = (byte)(f >> 16);
                        n4 += 3;
                        i += 4;
                        if (b2) {
                            break;
                        }
                    }
                    if (i >= n3) {
                        f2 = f;
                        n5 = n4;
                        break Label_0201;
                    }
                }
                n6 = i + 1;
                n7 = c[0xFF & array[i]];
                Label_0288: {
                    switch (e) {
                        case 0: {
                            if (n7 >= 0) {
                                ++e;
                                if (!b2) {
                                    f = n7;
                                    n8 = e;
                                    break Label_0288;
                                }
                                f = n7;
                            }
                            if (n7 != -1) {
                                this.e = 6;
                                return false;
                            }
                            break;
                        }
                        case 1: {
                            if (n7 >= 0) {
                                f = (n7 | f << 6);
                                ++e;
                                if (!b2) {
                                    break;
                                }
                            }
                            if (n7 != -1) {
                                this.e = 6;
                                return false;
                            }
                            break;
                        }
                        case 2: {
                            if (n7 >= 0) {
                                f = (n7 | f << 6);
                                ++e;
                                if (!b2) {
                                    break;
                                }
                            }
                            n9 = f;
                            n10 = e;
                            if (n7 == -2) {
                                n11 = n4 + 1;
                                b3[n4] = (byte)(n9 >> 4);
                                if (!b2) {
                                    n8 = 4;
                                    n4 = n11;
                                    f = n9;
                                    break Label_0288;
                                }
                                n10 = 4;
                                n4 = n11;
                            }
                            if (n7 != -1) {
                                this.e = 6;
                                return false;
                            }
                            n8 = n10;
                            f = n9;
                            break Label_0288;
                        }
                        case 3: {
                            if (n7 >= 0) {
                                f = (n7 | f << 6);
                                b3[n4 + 2] = (byte)f;
                                b3[n4 + 1] = (byte)(f >> 8);
                                b3[n4] = (byte)(f >> 16);
                                n4 += 3;
                                e = 0;
                                if (!b2) {
                                    break;
                                }
                            }
                            if (n7 == -2) {
                                b3[n4 + 1] = (byte)(f >> 2);
                                b3[n4] = (byte)(f >> 10);
                                n4 += 2;
                                e = 5;
                                if (!b2) {
                                    break;
                                }
                            }
                            if (n7 != -1) {
                                this.e = 6;
                                return false;
                            }
                            break;
                        }
                        case 4: {
                            if (n7 == -2) {
                                ++e;
                                if (!b2) {
                                    break;
                                }
                            }
                            if (n7 != -1) {
                                this.e = 6;
                                return false;
                            }
                            break;
                        }
                        case 5: {
                            if (n7 != -1) {
                                this.e = 6;
                                return false;
                            }
                            break;
                        }
                    }
                    n8 = e;
                }
                if (!b2) {
                    e = n8;
                    i = n6;
                    continue Label_0738_Outer;
                }
                e = n8;
                f2 = f;
                n5 = n4;
                if (!b) {
                    this.e = e;
                    this.f = f2;
                    this.a = n5;
                    return true;
                }
                while (true) {
                    while (true) {
                        Label_0700: {
                            Label_0671: {
                                switch (e) {
                                    case 0: {
                                        if (b2) {
                                            break Label_0671;
                                        }
                                        break;
                                    }
                                    case 1: {
                                        this.e = 6;
                                        return false;
                                    }
                                    case 2: {
                                        n12 = n5 + 1;
                                        b3[n5] = (byte)(f2 >> 4);
                                        if (b2) {
                                            break Label_0700;
                                        }
                                        n5 = n12;
                                        break;
                                    }
                                    case 4: {
                                        this.e = 6;
                                        return false;
                                    }
                                    case 3: {
                                        n12 = n5;
                                        break Label_0700;
                                    }
                                }
                            }
                            this.e = e;
                            this.a = n5;
                            return true;
                        }
                        n13 = n12 + 1;
                        b3[n12] = (byte)(f2 >> 10);
                        n5 = n13 + 1;
                        b3[n13] = (byte)(f2 >> 2);
                        if (b2) {
                            continue Label_0652_Outer;
                        }
                        break;
                    }
                    continue;
                }
            }
            f2 = f;
            n5 = n4;
            continue Label_0201;
        }
    }
}
