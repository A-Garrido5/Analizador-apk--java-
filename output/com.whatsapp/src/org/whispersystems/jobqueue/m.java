// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems.jobqueue;

class m extends k
{
    private static final byte[] d;
    static final boolean f;
    private static final byte[] k;
    int c;
    private int e;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    private final byte[] j;
    private final byte[] l;
    
    static {
        f = !f.class.desiredAssertionStatus();
        d = new byte[] { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47 };
        k = new byte[] { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95 };
    }
    
    public m(final int n, final byte[] b) {
        final boolean b2 = org.whispersystems.jobqueue.f.b;
        this.b = b;
        this.i = ((n & 0x1) == 0x0);
        this.g = ((n & 0x2) == 0x0);
        this.h = ((n & 0x4) != 0x0);
        byte[] j;
        if ((n & 0x8) == 0x0) {
            j = m.d;
        }
        else {
            j = m.k;
        }
        this.j = j;
        this.l = new byte[2];
        this.c = 0;
        int e;
        if (this.g) {
            e = 19;
        }
        else {
            e = -1;
        }
        this.e = e;
        if (b2) {
            final boolean a = org.whispersystems.jobqueue.a.a;
            boolean a2 = false;
            if (!a) {
                a2 = true;
            }
            org.whispersystems.jobqueue.a.a = a2;
        }
    }
    
    public boolean a(final byte[] array, int n, final int n2, final boolean b) {
        final boolean b2 = org.whispersystems.jobqueue.f.b;
        final byte[] j = this.j;
        final byte[] b3 = this.b;
        int e = this.e;
        final int n3 = n2 + n;
        int n4 = -1;
        int n8 = 0;
        int n10 = 0;
        Label_0067: {
            Label_0943: {
                switch (this.c) {
                    case 0: {
                        if (b2) {
                            break Label_0943;
                        }
                        break;
                    }
                    case 1: {
                        if (n + 2 > n3) {
                            break;
                        }
                        final int n5 = (0xFF & this.l[0]) << 16;
                        final int n6 = n + 1;
                        final int n7 = n5 | (0xFF & array[n]) << 8;
                        n = n6 + 1;
                        n4 = (n7 | (0xFF & array[n6]));
                        this.c = 0;
                        if (b2) {
                            break Label_0943;
                        }
                        break;
                    }
                    case 2: {
                        n8 = n;
                        if (n8 + 1 <= n3) {
                            final int n9 = (0xFF & this.l[0]) << 16 | (0xFF & this.l[1]) << 8;
                            n = n8 + 1;
                            n4 = (n9 | (0xFF & array[n8]));
                            this.c = 0;
                            break;
                        }
                        n10 = n4;
                        break Label_0067;
                    }
                }
            }
            n10 = n4;
            n8 = n;
        }
        int a = 0;
        while (true) {
            int n11 = 0;
            Label_1287: {
                if (n10 != -1) {
                    b3[0] = j[0x3F & n10 >> 18];
                    b3[1] = j[0x3F & n10 >> 12];
                    b3[2] = j[0x3F & n10 >> 6];
                    n11 = 4;
                    b3[3] = j[n10 & 0x3F];
                    if (--e != 0) {
                        break Label_1287;
                    }
                    int n12;
                    if (this.h) {
                        n12 = 5;
                        b3[n11] = 13;
                    }
                    else {
                        n12 = n11;
                    }
                    a = n12 + 1;
                    b3[n12] = 10;
                    e = 19;
                }
                while (n8 + 3 <= n3) {
                    final int n13 = (0xFF & array[n8]) << 16 | (0xFF & array[n8 + 1]) << 8 | (0xFF & array[n8 + 2]);
                    b3[a] = j[0x3F & n13 >> 18];
                    b3[a + 1] = j[0x3F & n13 >> 12];
                    b3[a + 2] = j[0x3F & n13 >> 6];
                    b3[a + 3] = j[n13 & 0x3F];
                    n8 += 3;
                    n11 = a + 4;
                    if (--e != 0) {
                        break Label_1287;
                    }
                    int n14;
                    if (this.h) {
                        n14 = n11 + 1;
                        b3[n11] = 13;
                    }
                    else {
                        n14 = n11;
                    }
                    a = n14 + 1;
                    b3[n14] = 10;
                    e = 19;
                    if (b2) {
                        break;
                    }
                }
                final int e2 = e;
                Label_1202: {
                    if (b) {
                        int n20 = 0;
                        int n24 = 0;
                        Label_0846: {
                            int n16;
                            if (n8 - this.c == n3 - 1) {
                                int n15;
                                byte b4;
                                if (this.c > 0) {
                                    final byte[] l = this.l;
                                    n15 = 1;
                                    b4 = l[0];
                                    n16 = n8;
                                }
                                else {
                                    final int n17 = n8 + 1;
                                    b4 = array[n8];
                                    n16 = n17;
                                    n15 = 0;
                                }
                                final int n18 = (b4 & 0xFF) << 4;
                                this.c -= n15;
                                final int n19 = a + 1;
                                b3[a] = j[0x3F & n18 >> 6];
                                n20 = n19 + 1;
                                b3[n19] = j[n18 & 0x3F];
                                if (this.i) {
                                    final int n21 = n20 + 1;
                                    b3[n20] = 61;
                                    n20 = n21 + 1;
                                    b3[n21] = 61;
                                }
                                if (this.g) {
                                    if (this.h) {
                                        final int n22 = n20 + 1;
                                        b3[n20] = 13;
                                        n20 = n22;
                                    }
                                    final int n23 = n20 + 1;
                                    b3[n20] = 10;
                                    n20 = n23;
                                }
                                if (!b2) {
                                    n24 = n16;
                                    break Label_0846;
                                }
                            }
                            else {
                                n16 = n8;
                                n20 = a;
                            }
                            if (n16 - this.c == n3 - 2) {
                                byte b5;
                                int n25;
                                if (this.c > 1) {
                                    b5 = this.l[0];
                                    n24 = n16;
                                    n25 = 1;
                                }
                                else {
                                    n24 = n16 + 1;
                                    b5 = array[n16];
                                    n25 = 0;
                                }
                                final int n26 = (b5 & 0xFF) << 10;
                                byte b6;
                                if (this.c > 0) {
                                    final byte[] i = this.l;
                                    final int n27 = n25 + 1;
                                    b6 = i[n25];
                                    n25 = n27;
                                }
                                else {
                                    final int n28 = n24 + 1;
                                    b6 = array[n24];
                                    n24 = n28;
                                }
                                final int n29 = n26 | (b6 & 0xFF) << 2;
                                this.c -= n25;
                                final int n30 = n20 + 1;
                                b3[n20] = j[0x3F & n29 >> 12];
                                final int n31 = n30 + 1;
                                b3[n30] = j[0x3F & n29 >> 6];
                                final int n32 = n31 + 1;
                                b3[n31] = j[n29 & 0x3F];
                                if (this.i) {
                                    n20 = n32 + 1;
                                    b3[n32] = 61;
                                }
                                else {
                                    n20 = n32;
                                }
                                if (this.g) {
                                    if (this.h) {
                                        final int n33 = n20 + 1;
                                        b3[n20] = 13;
                                        n20 = n33;
                                    }
                                    final int n34 = n20 + 1;
                                    b3[n20] = 10;
                                    n20 = n34;
                                }
                                if (!b2) {
                                    break Label_0846;
                                }
                            }
                            else {
                                n24 = n16;
                            }
                            if (this.g && n20 > 0 && e2 != 19) {
                                if (this.h) {
                                    final int n35 = n20 + 1;
                                    b3[n20] = 13;
                                    n20 = n35;
                                }
                                final int n36 = n20 + 1;
                                b3[n20] = 10;
                                n20 = n36;
                            }
                        }
                        if (!m.f && this.c != 0) {
                            throw new AssertionError();
                        }
                        if (!m.f && n24 != n3) {
                            throw new AssertionError();
                        }
                        a = n20;
                    }
                    else {
                        if (n8 == n3 - 1) {
                            this.l[this.c++] = array[n8];
                            if (!b2) {
                                break Label_1202;
                            }
                        }
                        if (n8 == n3 - 2) {
                            this.l[this.c++] = array[n8];
                            this.l[this.c++] = array[n8 + 1];
                        }
                    }
                }
                this.a = a;
                this.e = e2;
                if (org.whispersystems.jobqueue.a.a) {
                    org.whispersystems.jobqueue.f.b = !b2;
                }
                return true;
            }
            a = n11;
            continue;
        }
    }
}
