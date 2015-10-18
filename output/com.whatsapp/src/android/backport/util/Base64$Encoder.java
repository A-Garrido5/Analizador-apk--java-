// 
// Decompiled by Procyon v0.5.30
// 

package android.backport.util;

import com.whatsapp.DialogToastActivity;

class Base64$Encoder extends Base64$Coder
{
    static final boolean $assertionsDisabled;
    private static final byte[] ENCODE;
    private static final byte[] ENCODE_WEBSAFE;
    private final byte[] alphabet;
    private int count;
    public final boolean do_cr;
    public final boolean do_newline;
    public final boolean do_padding;
    private final byte[] tail;
    int tailLen;
    
    static {
        $assertionsDisabled = !Base64.class.desiredAssertionStatus();
        ENCODE = new byte[] { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47 };
        ENCODE_WEBSAFE = new byte[] { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95 };
    }
    
    public Base64$Encoder(final int n, final byte[] output) {
        final boolean a = Base64.a;
        this.output = output;
        this.do_padding = ((n & 0x1) == 0x0);
        this.do_newline = ((n & 0x2) == 0x0);
        this.do_cr = ((n & 0x4) != 0x0);
        byte[] alphabet;
        if ((n & 0x8) == 0x0) {
            alphabet = Base64$Encoder.ENCODE;
        }
        else {
            alphabet = Base64$Encoder.ENCODE_WEBSAFE;
        }
        this.alphabet = alphabet;
        this.tail = new byte[2];
        this.tailLen = 0;
        int count;
        if (this.do_newline) {
            count = 19;
        }
        else {
            count = -1;
        }
        this.count = count;
        if (a) {
            final boolean h = DialogToastActivity.h;
            boolean h2 = false;
            if (!h) {
                h2 = true;
            }
            DialogToastActivity.h = h2;
        }
    }
    
    public boolean process(final byte[] array, int n, final int n2, final boolean b) {
        final boolean a = Base64.a;
        final byte[] alphabet = this.alphabet;
        final byte[] output = this.output;
        int count = this.count;
        final int n3 = n2 + n;
        int n4 = -1;
        int n8 = 0;
        int n10 = 0;
        Label_0067: {
            Label_0943: {
                switch (this.tailLen) {
                    case 0: {
                        if (a) {
                            break Label_0943;
                        }
                        break;
                    }
                    case 1: {
                        if (n + 2 > n3) {
                            break;
                        }
                        final int n5 = (0xFF & this.tail[0]) << 16;
                        final int n6 = n + 1;
                        final int n7 = n5 | (0xFF & array[n]) << 8;
                        n = n6 + 1;
                        n4 = (n7 | (0xFF & array[n6]));
                        this.tailLen = 0;
                        if (a) {
                            break Label_0943;
                        }
                        break;
                    }
                    case 2: {
                        n8 = n;
                        if (n8 + 1 <= n3) {
                            final int n9 = (0xFF & this.tail[0]) << 16 | (0xFF & this.tail[1]) << 8;
                            n = n8 + 1;
                            n4 = (n9 | (0xFF & array[n8]));
                            this.tailLen = 0;
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
        int op = 0;
        while (true) {
            int n11 = 0;
            Label_1287: {
                if (n10 != -1) {
                    output[0] = alphabet[0x3F & n10 >> 18];
                    output[1] = alphabet[0x3F & n10 >> 12];
                    output[2] = alphabet[0x3F & n10 >> 6];
                    n11 = 4;
                    output[3] = alphabet[n10 & 0x3F];
                    if (--count != 0) {
                        break Label_1287;
                    }
                    int n12;
                    if (this.do_cr) {
                        n12 = 5;
                        output[n11] = 13;
                    }
                    else {
                        n12 = n11;
                    }
                    op = n12 + 1;
                    output[n12] = 10;
                    count = 19;
                }
                while (n8 + 3 <= n3) {
                    final int n13 = (0xFF & array[n8]) << 16 | (0xFF & array[n8 + 1]) << 8 | (0xFF & array[n8 + 2]);
                    output[op] = alphabet[0x3F & n13 >> 18];
                    output[op + 1] = alphabet[0x3F & n13 >> 12];
                    output[op + 2] = alphabet[0x3F & n13 >> 6];
                    output[op + 3] = alphabet[n13 & 0x3F];
                    n8 += 3;
                    n11 = op + 4;
                    if (--count != 0) {
                        break Label_1287;
                    }
                    int n14;
                    if (this.do_cr) {
                        n14 = n11 + 1;
                        output[n11] = 13;
                    }
                    else {
                        n14 = n11;
                    }
                    op = n14 + 1;
                    output[n14] = 10;
                    count = 19;
                    if (a) {
                        break;
                    }
                }
                final int count2 = count;
                Label_1202: {
                    if (b) {
                        int n20 = 0;
                        int n24 = 0;
                        Label_0846: {
                            int n16;
                            if (n8 - this.tailLen == n3 - 1) {
                                int n15;
                                byte b2;
                                if (this.tailLen > 0) {
                                    final byte[] tail = this.tail;
                                    n15 = 1;
                                    b2 = tail[0];
                                    n16 = n8;
                                }
                                else {
                                    final int n17 = n8 + 1;
                                    b2 = array[n8];
                                    n16 = n17;
                                    n15 = 0;
                                }
                                final int n18 = (b2 & 0xFF) << 4;
                                this.tailLen -= n15;
                                final int n19 = op + 1;
                                output[op] = alphabet[0x3F & n18 >> 6];
                                n20 = n19 + 1;
                                output[n19] = alphabet[n18 & 0x3F];
                                if (this.do_padding) {
                                    final int n21 = n20 + 1;
                                    output[n20] = 61;
                                    n20 = n21 + 1;
                                    output[n21] = 61;
                                }
                                if (this.do_newline) {
                                    if (this.do_cr) {
                                        final int n22 = n20 + 1;
                                        output[n20] = 13;
                                        n20 = n22;
                                    }
                                    final int n23 = n20 + 1;
                                    output[n20] = 10;
                                    n20 = n23;
                                }
                                if (!a) {
                                    n24 = n16;
                                    break Label_0846;
                                }
                            }
                            else {
                                n16 = n8;
                                n20 = op;
                            }
                            if (n16 - this.tailLen == n3 - 2) {
                                byte b3;
                                int n25;
                                if (this.tailLen > 1) {
                                    b3 = this.tail[0];
                                    n24 = n16;
                                    n25 = 1;
                                }
                                else {
                                    n24 = n16 + 1;
                                    b3 = array[n16];
                                    n25 = 0;
                                }
                                final int n26 = (b3 & 0xFF) << 10;
                                byte b4;
                                if (this.tailLen > 0) {
                                    final byte[] tail2 = this.tail;
                                    final int n27 = n25 + 1;
                                    b4 = tail2[n25];
                                    n25 = n27;
                                }
                                else {
                                    final int n28 = n24 + 1;
                                    b4 = array[n24];
                                    n24 = n28;
                                }
                                final int n29 = n26 | (b4 & 0xFF) << 2;
                                this.tailLen -= n25;
                                final int n30 = n20 + 1;
                                output[n20] = alphabet[0x3F & n29 >> 12];
                                final int n31 = n30 + 1;
                                output[n30] = alphabet[0x3F & n29 >> 6];
                                final int n32 = n31 + 1;
                                output[n31] = alphabet[n29 & 0x3F];
                                if (this.do_padding) {
                                    n20 = n32 + 1;
                                    output[n32] = 61;
                                }
                                else {
                                    n20 = n32;
                                }
                                if (this.do_newline) {
                                    if (this.do_cr) {
                                        final int n33 = n20 + 1;
                                        output[n20] = 13;
                                        n20 = n33;
                                    }
                                    final int n34 = n20 + 1;
                                    output[n20] = 10;
                                    n20 = n34;
                                }
                                if (!a) {
                                    break Label_0846;
                                }
                            }
                            else {
                                n24 = n16;
                            }
                            if (this.do_newline && n20 > 0 && count2 != 19) {
                                if (this.do_cr) {
                                    final int n35 = n20 + 1;
                                    output[n20] = 13;
                                    n20 = n35;
                                }
                                final int n36 = n20 + 1;
                                output[n20] = 10;
                                n20 = n36;
                            }
                        }
                        assert this.tailLen == 0;
                        assert n24 == n3;
                        op = n20;
                    }
                    else {
                        if (n8 == n3 - 1) {
                            this.tail[this.tailLen++] = array[n8];
                            if (!a) {
                                break Label_1202;
                            }
                        }
                        if (n8 == n3 - 2) {
                            this.tail[this.tailLen++] = array[n8];
                            this.tail[this.tailLen++] = array[n8 + 1];
                        }
                    }
                }
                this.op = op;
                this.count = count2;
                if (DialogToastActivity.h) {
                    Base64.a = !a;
                }
                return true;
            }
            op = n11;
            continue;
        }
    }
}
