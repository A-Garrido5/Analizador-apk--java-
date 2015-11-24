// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.crypto.digests;

import org.spongycastle.util.Memoable;
import org.spongycastle.util.Pack;

public class SHA1Digest extends GeneralDigest implements EncodableDigest
{
    private static final int DIGEST_LENGTH = 20;
    private static final int Y1 = 1518500249;
    private static final int Y2 = 1859775393;
    private static final int Y3 = -1894007588;
    private static final int Y4 = -899497514;
    private static final String z;
    private int H1;
    private int H2;
    private int H3;
    private int H4;
    private int H5;
    private int[] X;
    private int xOff;
    
    static {
        final char[] charArray = "X_hv^".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'o';
                    break;
                }
                case 0: {
                    c2 = '\u000b';
                    break;
                }
                case 1: {
                    c2 = '\u0017';
                    break;
                }
                case 2: {
                    c2 = ')';
                    break;
                }
                case 3: {
                    c2 = '[';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public SHA1Digest() {
        this.X = new int[80];
        this.reset();
    }
    
    public SHA1Digest(final SHA1Digest sha1Digest) {
        super(sha1Digest);
        this.X = new int[80];
        this.copyIn(sha1Digest);
    }
    
    public SHA1Digest(final byte[] array) {
        final boolean a = GeneralDigest.a;
        super(array);
        this.X = new int[80];
        this.H1 = Pack.bigEndianToInt(array, 16);
        this.H2 = Pack.bigEndianToInt(array, 20);
        this.H3 = Pack.bigEndianToInt(array, 24);
        this.H4 = Pack.bigEndianToInt(array, 28);
        this.H5 = Pack.bigEndianToInt(array, 32);
        this.xOff = Pack.bigEndianToInt(array, 36);
        int i = 0;
        while (i != this.xOff) {
            this.X[i] = Pack.bigEndianToInt(array, 40 + i * 4);
            ++i;
            if (a) {
                break;
            }
        }
    }
    
    private void copyIn(final SHA1Digest sha1Digest) {
        this.H1 = sha1Digest.H1;
        this.H2 = sha1Digest.H2;
        this.H3 = sha1Digest.H3;
        this.H4 = sha1Digest.H4;
        this.H5 = sha1Digest.H5;
        System.arraycopy(sha1Digest.X, 0, this.X, 0, sha1Digest.X.length);
        this.xOff = sha1Digest.xOff;
    }
    
    private int f(final int n, final int n2, final int n3) {
        return (n & n2) | (n3 & ~n);
    }
    
    private int g(final int n, final int n2, final int n3) {
        return (n & n2) | (n & n3) | (n2 & n3);
    }
    
    private int h(final int n, final int n2, final int n3) {
        return n3 ^ (n ^ n2);
    }
    
    @Override
    public Memoable copy() {
        return new SHA1Digest(this);
    }
    
    @Override
    public int doFinal(final byte[] array, final int n) {
        this.finish();
        Pack.intToBigEndian(this.H1, array, n);
        Pack.intToBigEndian(this.H2, array, n + 4);
        Pack.intToBigEndian(this.H3, array, n + 8);
        Pack.intToBigEndian(this.H4, array, n + 12);
        Pack.intToBigEndian(this.H5, array, n + 16);
        this.reset();
        return 20;
    }
    
    @Override
    public String getAlgorithmName() {
        return SHA1Digest.z;
    }
    
    @Override
    public int getDigestSize() {
        return 20;
    }
    
    @Override
    public byte[] getEncodedState() {
        final boolean a = GeneralDigest.a;
        final byte[] array = new byte[40 + 4 * this.xOff];
        super.populateState(array);
        Pack.intToBigEndian(this.H1, array, 16);
        Pack.intToBigEndian(this.H2, array, 20);
        Pack.intToBigEndian(this.H3, array, 24);
        Pack.intToBigEndian(this.H4, array, 28);
        Pack.intToBigEndian(this.H5, array, 32);
        Pack.intToBigEndian(this.xOff, array, 36);
        int i = 0;
        while (i != this.xOff) {
            Pack.intToBigEndian(this.X[i], array, 40 + i * 4);
            ++i;
            if (a) {
                break;
            }
        }
        return array;
    }
    
    @Override
    protected void processBlock() {
        final boolean a = GeneralDigest.a;
        int i = 16;
        while (i < 80) {
            final int n = this.X[i - 3] ^ this.X[i - 8] ^ this.X[i - 14] ^ this.X[i - 16];
            this.X[i] = (n << 1 | n >>> 31);
            ++i;
            if (a) {
                break;
            }
        }
        final int h1 = this.H1;
        final int h2 = this.H2;
        final int h3 = this.H3;
        final int h4 = this.H4;
        final int h5 = this.H5;
        int n2 = 0;
        int n3 = h5;
        int n4 = h4;
        int n5 = h3;
        int n6 = h2;
        int n7 = h1;
        int j = 0;
        while (j < 4) {
            final int n8 = (n7 << 5 | n7 >>> 27) + this.f(n6, n5, n4);
            final int[] x = this.X;
            final int n9 = n2 + 1;
            final int n10 = n3 + (1518500249 + (n8 + x[n2]));
            final int n11 = n6 << 30 | n6 >>> 2;
            final int n12 = (n10 << 5 | n10 >>> 27) + this.f(n7, n11, n5);
            final int[] x2 = this.X;
            final int n13 = n9 + 1;
            final int n14 = n4 + (1518500249 + (n12 + x2[n9]));
            final int n15 = n7 << 30 | n7 >>> 2;
            final int n16 = (n14 << 5 | n14 >>> 27) + this.f(n10, n15, n11);
            final int[] x3 = this.X;
            final int n17 = n13 + 1;
            final int n18 = n5 + (1518500249 + (n16 + x3[n13]));
            n3 = (n10 << 30 | n10 >>> 2);
            final int n19 = (n18 << 5 | n18 >>> 27) + this.f(n14, n3, n15);
            final int[] x4 = this.X;
            final int n20 = n17 + 1;
            n6 = n11 + (1518500249 + (n19 + x4[n17]));
            n4 = (n14 << 30 | n14 >>> 2);
            final int n21 = (n6 << 5 | n6 >>> 27) + this.f(n18, n4, n3);
            final int[] x5 = this.X;
            n2 = n20 + 1;
            n7 = n15 + (1518500249 + (n21 + x5[n20]));
            n5 = (n18 << 30 | n18 >>> 2);
            ++j;
            if (a) {
                break;
            }
        }
        int k = 0;
        while (k < 4) {
            final int n22 = (n7 << 5 | n7 >>> 27) + this.h(n6, n5, n4);
            final int[] x6 = this.X;
            final int n23 = n2 + 1;
            final int n24 = n3 + (1859775393 + (n22 + x6[n2]));
            final int n25 = n6 << 30 | n6 >>> 2;
            final int n26 = (n24 << 5 | n24 >>> 27) + this.h(n7, n25, n5);
            final int[] x7 = this.X;
            final int n27 = n23 + 1;
            final int n28 = n4 + (1859775393 + (n26 + x7[n23]));
            final int n29 = n7 << 30 | n7 >>> 2;
            final int n30 = (n28 << 5 | n28 >>> 27) + this.h(n24, n29, n25);
            final int[] x8 = this.X;
            final int n31 = n27 + 1;
            final int n32 = n5 + (1859775393 + (n30 + x8[n27]));
            n3 = (n24 << 30 | n24 >>> 2);
            final int n33 = (n32 << 5 | n32 >>> 27) + this.h(n28, n3, n29);
            final int[] x9 = this.X;
            final int n34 = n31 + 1;
            n6 = n25 + (1859775393 + (n33 + x9[n31]));
            n4 = (n28 << 30 | n28 >>> 2);
            final int n35 = (n6 << 5 | n6 >>> 27) + this.h(n32, n4, n3);
            final int[] x10 = this.X;
            n2 = n34 + 1;
            n7 = n29 + (1859775393 + (n35 + x10[n34]));
            n5 = (n32 << 30 | n32 >>> 2);
            ++k;
            if (a) {
                break;
            }
        }
        int l = 0;
        while (l < 4) {
            final int n36 = (n7 << 5 | n7 >>> 27) + this.g(n6, n5, n4);
            final int[] x11 = this.X;
            final int n37 = n2 + 1;
            final int n38 = n3 + (-1894007588 + (n36 + x11[n2]));
            final int n39 = n6 << 30 | n6 >>> 2;
            final int n40 = (n38 << 5 | n38 >>> 27) + this.g(n7, n39, n5);
            final int[] x12 = this.X;
            final int n41 = n37 + 1;
            final int n42 = n4 + (-1894007588 + (n40 + x12[n37]));
            final int n43 = n7 << 30 | n7 >>> 2;
            final int n44 = (n42 << 5 | n42 >>> 27) + this.g(n38, n43, n39);
            final int[] x13 = this.X;
            final int n45 = n41 + 1;
            final int n46 = n5 + (-1894007588 + (n44 + x13[n41]));
            n3 = (n38 << 30 | n38 >>> 2);
            final int n47 = (n46 << 5 | n46 >>> 27) + this.g(n42, n3, n43);
            final int[] x14 = this.X;
            final int n48 = n45 + 1;
            n6 = n39 + (-1894007588 + (n47 + x14[n45]));
            n4 = (n42 << 30 | n42 >>> 2);
            final int n49 = (n6 << 5 | n6 >>> 27) + this.g(n46, n4, n3);
            final int[] x15 = this.X;
            n2 = n48 + 1;
            n7 = n43 + (-1894007588 + (n49 + x15[n48]));
            n5 = (n46 << 30 | n46 >>> 2);
            ++l;
            if (a) {
                break;
            }
        }
        int n50 = n2;
        int n51 = n3;
        int n52 = n4;
        int n53 = n5;
        int n54 = n6;
        int n55 = n7;
        int n56 = 0;
        while (n56 <= 3) {
            final int n57 = (n55 << 5 | n55 >>> 27) + this.h(n54, n53, n52);
            final int[] x16 = this.X;
            final int n58 = n50 + 1;
            final int n59 = n51 + (-899497514 + (n57 + x16[n50]));
            final int n60 = n54 << 30 | n54 >>> 2;
            final int n61 = (n59 << 5 | n59 >>> 27) + this.h(n55, n60, n53);
            final int[] x17 = this.X;
            final int n62 = n58 + 1;
            final int n63 = n52 + (-899497514 + (n61 + x17[n58]));
            final int n64 = n55 << 30 | n55 >>> 2;
            final int n65 = (n63 << 5 | n63 >>> 27) + this.h(n59, n64, n60);
            final int[] x18 = this.X;
            final int n66 = n62 + 1;
            final int n67 = n53 + (-899497514 + (n65 + x18[n62]));
            n51 = (n59 << 30 | n59 >>> 2);
            final int n68 = (n67 << 5 | n67 >>> 27) + this.h(n63, n51, n64);
            final int[] x19 = this.X;
            final int n69 = n66 + 1;
            n54 = n60 + (-899497514 + (n68 + x19[n66]));
            n52 = (n63 << 30 | n63 >>> 2);
            final int n70 = (n54 << 5 | n54 >>> 27) + this.h(n67, n52, n51);
            final int[] x20 = this.X;
            n50 = n69 + 1;
            n55 = n64 + (-899497514 + (n70 + x20[n69]));
            n53 = (n67 << 30 | n67 >>> 2);
            ++n56;
            if (a) {
                break;
            }
        }
        this.H1 += n55;
        this.H2 += n54;
        this.H3 += n53;
        this.H4 += n52;
        this.H5 += n51;
        this.xOff = 0;
        int n71 = 0;
        while (n71 < 16) {
            this.X[n71] = 0;
            ++n71;
            if (a) {
                break;
            }
        }
    }
    
    @Override
    protected void processLength(final long n) {
        if (this.xOff > 14) {
            this.processBlock();
        }
        this.X[14] = (int)(n >>> 32);
        this.X[15] = (int)(-1L & n);
    }
    
    @Override
    protected void processWord(final byte[] array, final int n) {
        final int n2 = array[n] << 24;
        final int n3 = n + 1;
        final int n4 = n2 | (0xFF & array[n3]) << 16;
        final int n5 = n3 + 1;
        this.X[this.xOff] = (n4 | (0xFF & array[n5]) << 8 | (0xFF & array[n5 + 1]));
        final int xOff = 1 + this.xOff;
        this.xOff = xOff;
        if (xOff == 16) {
            this.processBlock();
        }
    }
    
    @Override
    public void reset() {
        final boolean a = GeneralDigest.a;
        super.reset();
        this.H1 = 1732584193;
        this.H2 = -271733879;
        this.H3 = -1732584194;
        this.H4 = 271733878;
        this.H5 = -1009589776;
        this.xOff = 0;
        int i = 0;
        while (i != this.X.length) {
            this.X[i] = 0;
            ++i;
            if (a) {
                break;
            }
        }
    }
    
    @Override
    public void reset(final Memoable memoable) {
        final SHA1Digest sha1Digest = (SHA1Digest)memoable;
        super.copyIn(sha1Digest);
        this.copyIn(sha1Digest);
    }
}
