// 
// Decompiled by Procyon v0.5.30
// 

class xj extends xi
{
    static final /* synthetic */ boolean f;
    private static final byte[] g;
    private static final byte[] h;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    private final byte[] i;
    private int j;
    private int k;
    private final byte[] l;
    
    static {
        f = !xh.class.desiredAssertionStatus();
        g = new byte[] { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47 };
        h = new byte[] { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95 };
    }
    
    public xj(final int n, final byte[] a) {
        boolean e = true;
        this.a = a;
        this.c = ((n & 0x1) == 0x0 && e);
        this.d = ((n & 0x2) == 0x0 && e);
        if ((n & 0x4) == 0x0) {
            e = false;
        }
        this.e = e;
        byte[] l;
        if ((n & 0x8) == 0x0) {
            l = xj.g;
        }
        else {
            l = xj.h;
        }
        this.l = l;
        this.i = new byte[2];
        this.j = 0;
        int k;
        if (this.d) {
            k = 19;
        }
        else {
            k = -1;
        }
        this.k = k;
    }
    
    public boolean a(final byte[] array, final int n, final int n2, final boolean b) {
        final byte[] l = this.l;
        final byte[] a = this.a;
        int k = this.k;
        final int n3 = n2 + n;
        int n4 = -1;
        int n5 = 0;
        Label_0059: {
            switch (this.j) {
                case 0: {
                    n5 = n;
                    break Label_0059;
                }
                case 1: {
                    if (n + 2 <= n3) {
                        final int n6 = (0xFF & this.i[0]) << 16;
                        final int n7 = n + 1;
                        final int n8 = n6 | (0xFF & array[n]) << 8;
                        final int n9 = n7 + 1;
                        n4 = (n8 | (0xFF & array[n7]));
                        this.j = 0;
                        n5 = n9;
                        break Label_0059;
                    }
                    break;
                }
                case 2: {
                    if (n + 1 <= n3) {
                        final int n10 = (0xFF & this.i[0]) << 16 | (0xFF & this.i[1]) << 8;
                        n5 = n + 1;
                        n4 = (n10 | (0xFF & array[n]));
                        this.j = 0;
                        break Label_0059;
                    }
                    break;
                }
            }
            n5 = n;
        }
        int n11 = 0;
        while (true) {
            Label_1235: {
                if (n4 == -1) {
                    break Label_1235;
                }
                a[0] = l[0x3F & n4 >> 18];
                a[1] = l[0x3F & n4 >> 12];
                a[2] = l[0x3F & n4 >> 6];
                n11 = 4;
                a[3] = l[n4 & 0x3F];
                if (--k != 0) {
                    break Label_1235;
                }
                int n12;
                if (this.e) {
                    n12 = 5;
                    a[n11] = 13;
                }
                else {
                    n12 = n11;
                }
                final int n13 = n12 + 1;
                a[n12] = 10;
                int i = 19;
                int b2 = n13;
                while (n5 + 3 <= n3) {
                    final int n14 = (0xFF & array[n5]) << 16 | (0xFF & array[n5 + 1]) << 8 | (0xFF & array[n5 + 2]);
                    a[b2] = l[0x3F & n14 >> 18];
                    a[b2 + 1] = l[0x3F & n14 >> 12];
                    a[b2 + 2] = l[0x3F & n14 >> 6];
                    a[b2 + 3] = l[n14 & 0x3F];
                    n5 += 3;
                    n11 = b2 + 4;
                    k = i - 1;
                    if (k != 0) {
                        break Label_1235;
                    }
                    int n15;
                    if (this.e) {
                        n15 = n11 + 1;
                        a[n11] = 13;
                    }
                    else {
                        n15 = n11;
                    }
                    final int n16 = n15 + 1;
                    a[n15] = 10;
                    i = 19;
                    b2 = n16;
                }
                if (b) {
                    if (n5 - this.j == n3 - 1) {
                        int n17;
                        byte b3;
                        int n18;
                        if (this.j > 0) {
                            final byte[] j = this.i;
                            n17 = 1;
                            b3 = j[0];
                            n18 = n5;
                        }
                        else {
                            final int n19 = n5 + 1;
                            b3 = array[n5];
                            n18 = n19;
                            n17 = 0;
                        }
                        final int n20 = (b3 & 0xFF) << 4;
                        this.j -= n17;
                        final int n21 = b2 + 1;
                        a[b2] = l[0x3F & n20 >> 6];
                        int n22 = n21 + 1;
                        a[n21] = l[n20 & 0x3F];
                        if (this.c) {
                            final int n23 = n22 + 1;
                            a[n22] = 61;
                            n22 = n23 + 1;
                            a[n23] = 61;
                        }
                        if (this.d) {
                            if (this.e) {
                                final int n24 = n22 + 1;
                                a[n22] = 13;
                                n22 = n24;
                            }
                            final int n25 = n22 + 1;
                            a[n22] = 10;
                            n22 = n25;
                        }
                        n5 = n18;
                        b2 = n22;
                    }
                    else if (n5 - this.j == n3 - 2) {
                        int n26;
                        byte b4;
                        if (this.j > 1) {
                            final byte[] m = this.i;
                            n26 = 1;
                            b4 = m[0];
                        }
                        else {
                            final int n27 = n5 + 1;
                            b4 = array[n5];
                            n5 = n27;
                            n26 = 0;
                        }
                        final int n28 = (b4 & 0xFF) << 10;
                        byte b5;
                        if (this.j > 0) {
                            final byte[] i2 = this.i;
                            final int n29 = n26 + 1;
                            b5 = i2[n26];
                            n26 = n29;
                        }
                        else {
                            final int n30 = n5 + 1;
                            b5 = array[n5];
                            n5 = n30;
                        }
                        final int n31 = n28 | (b5 & 0xFF) << 2;
                        this.j -= n26;
                        final int n32 = b2 + 1;
                        a[b2] = l[0x3F & n31 >> 12];
                        final int n33 = n32 + 1;
                        a[n32] = l[0x3F & n31 >> 6];
                        final int n34 = n33 + 1;
                        a[n33] = l[n31 & 0x3F];
                        int n35;
                        if (this.c) {
                            n35 = n34 + 1;
                            a[n34] = 61;
                        }
                        else {
                            n35 = n34;
                        }
                        if (this.d) {
                            if (this.e) {
                                final int n36 = n35 + 1;
                                a[n35] = 13;
                                n35 = n36;
                            }
                            final int n37 = n35 + 1;
                            a[n35] = 10;
                            n35 = n37;
                        }
                        b2 = n35;
                    }
                    else if (this.d && b2 > 0 && i != 19) {
                        int n38;
                        if (this.e) {
                            n38 = b2 + 1;
                            a[b2] = 13;
                        }
                        else {
                            n38 = b2;
                        }
                        b2 = n38 + 1;
                        a[n38] = 10;
                    }
                    if (!xj.f && this.j != 0) {
                        throw new AssertionError();
                    }
                    if (!xj.f && n5 != n3) {
                        throw new AssertionError();
                    }
                }
                else if (n5 == n3 - 1) {
                    this.i[this.j++] = array[n5];
                }
                else if (n5 == n3 - 2) {
                    this.i[this.j++] = array[n5];
                    this.i[this.j++] = array[n5 + 1];
                }
                this.b = b2;
                this.k = i;
                return true;
            }
            int i = k;
            int b2 = n11;
            continue;
        }
    }
}
