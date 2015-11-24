// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.crypto.digests;

import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.spongycastle.util.Memoable;

public class MD5Digest extends GeneralDigest
{
    private static final int DIGEST_LENGTH = 16;
    private static final int S11 = 7;
    private static final int S12 = 12;
    private static final int S13 = 17;
    private static final int S14 = 22;
    private static final int S21 = 5;
    private static final int S22 = 9;
    private static final int S23 = 14;
    private static final int S24 = 20;
    private static final int S31 = 4;
    private static final int S32 = 11;
    private static final int S33 = 16;
    private static final int S34 = 23;
    private static final int S41 = 6;
    private static final int S42 = 10;
    private static final int S43 = 15;
    private static final int S44 = 21;
    private static final String z;
    private int H1;
    private int H2;
    private int H3;
    private int H4;
    private int[] X;
    private int xOff;
    
    static {
        final char[] charArray = "0eL".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\t';
                    break;
                }
                case 0: {
                    c2 = '}';
                    break;
                }
                case 1: {
                    c2 = '!';
                    break;
                }
                case 2: {
                    c2 = 'y';
                    break;
                }
                case 3: {
                    c2 = '^';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public MD5Digest() {
        this.X = new int[16];
        this.reset();
    }
    
    public MD5Digest(final MD5Digest md5Digest) {
        super(md5Digest);
        this.X = new int[16];
        this.copyIn(md5Digest);
    }
    
    private int F(final int n, final int n2, final int n3) {
        return (n & n2) | (n3 & ~n);
    }
    
    private int G(final int n, final int n2, final int n3) {
        return (n & n3) | (n2 & ~n3);
    }
    
    private int H(final int n, final int n2, final int n3) {
        return n3 ^ (n ^ n2);
    }
    
    private int K(final int n, final int n2, final int n3) {
        return n2 ^ (n | ~n3);
    }
    
    private void copyIn(final MD5Digest md5Digest) {
        super.copyIn(md5Digest);
        this.H1 = md5Digest.H1;
        this.H2 = md5Digest.H2;
        this.H3 = md5Digest.H3;
        this.H4 = md5Digest.H4;
        System.arraycopy(md5Digest.X, 0, this.X, 0, md5Digest.X.length);
        this.xOff = md5Digest.xOff;
    }
    
    private int rotateLeft(final int n, final int n2) {
        return n << n2 | n >>> 32 - n2;
    }
    
    private void unpackWord(final int n, final byte[] array, final int n2) {
        array[n2] = (byte)n;
        array[n2 + 1] = (byte)(n >>> 8);
        array[n2 + 2] = (byte)(n >>> 16);
        array[n2 + 3] = (byte)(n >>> 24);
    }
    
    @Override
    public Memoable copy() {
        return new MD5Digest(this);
    }
    
    @Override
    public int doFinal(final byte[] array, final int n) {
        this.finish();
        this.unpackWord(this.H1, array, n);
        this.unpackWord(this.H2, array, n + 4);
        this.unpackWord(this.H3, array, n + 8);
        this.unpackWord(this.H4, array, n + 12);
        this.reset();
        return 16;
    }
    
    @Override
    public String getAlgorithmName() {
        return MD5Digest.z;
    }
    
    @Override
    public int getDigestSize() {
        return 16;
    }
    
    @Override
    protected void processBlock() {
        final boolean a = GeneralDigest.a;
        final int h1 = this.H1;
        final int h2 = this.H2;
        final int h3 = this.H3;
        final int h4 = this.H4;
        final int n = h2 + this.rotateLeft(-680876936 + (h1 + this.F(h2, h3, h4) + this.X[0]), 7);
        final int n2 = n + this.rotateLeft(-389564586 + (h4 + this.F(n, h2, h3) + this.X[1]), 12);
        final int n3 = n2 + this.rotateLeft(606105819 + (h3 + this.F(n2, n, h2) + this.X[2]), 17);
        final int n4 = n3 + this.rotateLeft(-1044525330 + (h2 + this.F(n3, n2, n) + this.X[3]), 22);
        final int n5 = n4 + this.rotateLeft(-176418897 + (n + this.F(n4, n3, n2) + this.X[4]), 7);
        final int n6 = n5 + this.rotateLeft(1200080426 + (n2 + this.F(n5, n4, n3) + this.X[5]), 12);
        final int n7 = n6 + this.rotateLeft(-1473231341 + (n3 + this.F(n6, n5, n4) + this.X[6]), 17);
        final int n8 = n7 + this.rotateLeft(-45705983 + (n4 + this.F(n7, n6, n5) + this.X[7]), 22);
        final int n9 = n8 + this.rotateLeft(1770035416 + (n5 + this.F(n8, n7, n6) + this.X[8]), 7);
        final int n10 = n9 + this.rotateLeft(-1958414417 + (n6 + this.F(n9, n8, n7) + this.X[9]), 12);
        final int n11 = n10 + this.rotateLeft(-42063 + (n7 + this.F(n10, n9, n8) + this.X[10]), 17);
        final int n12 = n11 + this.rotateLeft(-1990404162 + (n8 + this.F(n11, n10, n9) + this.X[11]), 22);
        final int n13 = n12 + this.rotateLeft(1804603682 + (n9 + this.F(n12, n11, n10) + this.X[12]), 7);
        final int n14 = n13 + this.rotateLeft(-40341101 + (n10 + this.F(n13, n12, n11) + this.X[13]), 12);
        final int n15 = n14 + this.rotateLeft(-1502002290 + (n11 + this.F(n14, n13, n12) + this.X[14]), 17);
        final int n16 = n15 + this.rotateLeft(1236535329 + (n12 + this.F(n15, n14, n13) + this.X[15]), 22);
        final int n17 = n16 + this.rotateLeft(-165796510 + (n13 + this.G(n16, n15, n14) + this.X[1]), 5);
        final int n18 = n17 + this.rotateLeft(-1069501632 + (n14 + this.G(n17, n16, n15) + this.X[6]), 9);
        final int n19 = n18 + this.rotateLeft(643717713 + (n15 + this.G(n18, n17, n16) + this.X[11]), 14);
        final int n20 = n19 + this.rotateLeft(-373897302 + (n16 + this.G(n19, n18, n17) + this.X[0]), 20);
        final int n21 = n20 + this.rotateLeft(-701558691 + (n17 + this.G(n20, n19, n18) + this.X[5]), 5);
        final int n22 = n21 + this.rotateLeft(38016083 + (n18 + this.G(n21, n20, n19) + this.X[10]), 9);
        final int n23 = n22 + this.rotateLeft(-660478335 + (n19 + this.G(n22, n21, n20) + this.X[15]), 14);
        final int n24 = n23 + this.rotateLeft(-405537848 + (n20 + this.G(n23, n22, n21) + this.X[4]), 20);
        final int n25 = n24 + this.rotateLeft(568446438 + (n21 + this.G(n24, n23, n22) + this.X[9]), 5);
        final int n26 = n25 + this.rotateLeft(-1019803690 + (n22 + this.G(n25, n24, n23) + this.X[14]), 9);
        final int n27 = n26 + this.rotateLeft(-187363961 + (n23 + this.G(n26, n25, n24) + this.X[3]), 14);
        final int n28 = n27 + this.rotateLeft(1163531501 + (n24 + this.G(n27, n26, n25) + this.X[8]), 20);
        final int n29 = n28 + this.rotateLeft(-1444681467 + (n25 + this.G(n28, n27, n26) + this.X[13]), 5);
        final int n30 = n29 + this.rotateLeft(-51403784 + (n26 + this.G(n29, n28, n27) + this.X[2]), 9);
        final int n31 = n30 + this.rotateLeft(1735328473 + (n27 + this.G(n30, n29, n28) + this.X[7]), 14);
        final int n32 = n31 + this.rotateLeft(-1926607734 + (n28 + this.G(n31, n30, n29) + this.X[12]), 20);
        final int n33 = n32 + this.rotateLeft(-378558 + (n29 + this.H(n32, n31, n30) + this.X[5]), 4);
        final int n34 = n33 + this.rotateLeft(-2022574463 + (n30 + this.H(n33, n32, n31) + this.X[8]), 11);
        final int n35 = n34 + this.rotateLeft(1839030562 + (n31 + this.H(n34, n33, n32) + this.X[11]), 16);
        final int n36 = n35 + this.rotateLeft(-35309556 + (n32 + this.H(n35, n34, n33) + this.X[14]), 23);
        final int n37 = n36 + this.rotateLeft(-1530992060 + (n33 + this.H(n36, n35, n34) + this.X[1]), 4);
        final int n38 = n37 + this.rotateLeft(1272893353 + (n34 + this.H(n37, n36, n35) + this.X[4]), 11);
        final int n39 = n38 + this.rotateLeft(-155497632 + (n35 + this.H(n38, n37, n36) + this.X[7]), 16);
        final int n40 = n39 + this.rotateLeft(-1094730640 + (n36 + this.H(n39, n38, n37) + this.X[10]), 23);
        final int n41 = n40 + this.rotateLeft(681279174 + (n37 + this.H(n40, n39, n38) + this.X[13]), 4);
        final int n42 = n41 + this.rotateLeft(-358537222 + (n38 + this.H(n41, n40, n39) + this.X[0]), 11);
        final int n43 = n42 + this.rotateLeft(-722521979 + (n39 + this.H(n42, n41, n40) + this.X[3]), 16);
        final int n44 = n43 + this.rotateLeft(76029189 + (n40 + this.H(n43, n42, n41) + this.X[6]), 23);
        final int n45 = n44 + this.rotateLeft(-640364487 + (n41 + this.H(n44, n43, n42) + this.X[9]), 4);
        final int n46 = n45 + this.rotateLeft(-421815835 + (n42 + this.H(n45, n44, n43) + this.X[12]), 11);
        final int n47 = n46 + this.rotateLeft(530742520 + (n43 + this.H(n46, n45, n44) + this.X[15]), 16);
        final int n48 = n47 + this.rotateLeft(-995338651 + (n44 + this.H(n47, n46, n45) + this.X[2]), 23);
        final int n49 = n48 + this.rotateLeft(-198630844 + (n45 + this.K(n48, n47, n46) + this.X[0]), 6);
        final int n50 = n49 + this.rotateLeft(1126891415 + (n46 + this.K(n49, n48, n47) + this.X[7]), 10);
        final int n51 = n50 + this.rotateLeft(-1416354905 + (n47 + this.K(n50, n49, n48) + this.X[14]), 15);
        final int n52 = n51 + this.rotateLeft(-57434055 + (n48 + this.K(n51, n50, n49) + this.X[5]), 21);
        final int n53 = n52 + this.rotateLeft(1700485571 + (n49 + this.K(n52, n51, n50) + this.X[12]), 6);
        final int n54 = n53 + this.rotateLeft(-1894986606 + (n50 + this.K(n53, n52, n51) + this.X[3]), 10);
        final int n55 = n54 + this.rotateLeft(-1051523 + (n51 + this.K(n54, n53, n52) + this.X[10]), 15);
        final int n56 = n55 + this.rotateLeft(-2054922799 + (n52 + this.K(n55, n54, n53) + this.X[1]), 21);
        final int n57 = n56 + this.rotateLeft(1873313359 + (n53 + this.K(n56, n55, n54) + this.X[8]), 6);
        final int n58 = n57 + this.rotateLeft(-30611744 + (n54 + this.K(n57, n56, n55) + this.X[15]), 10);
        final int n59 = n58 + this.rotateLeft(-1560198380 + (n55 + this.K(n58, n57, n56) + this.X[6]), 15);
        final int n60 = n59 + this.rotateLeft(1309151649 + (n56 + this.K(n59, n58, n57) + this.X[13]), 21);
        final int n61 = n60 + this.rotateLeft(-145523070 + (n57 + this.K(n60, n59, n58) + this.X[4]), 6);
        final int n62 = n61 + this.rotateLeft(-1120210379 + (n58 + this.K(n61, n60, n59) + this.X[11]), 10);
        final int n63 = n62 + this.rotateLeft(718787259 + (n59 + this.K(n62, n61, n60) + this.X[2]), 15);
        final int n64 = n63 + this.rotateLeft(-343485551 + (n60 + this.K(n63, n62, n61) + this.X[9]), 21);
        this.H1 += n61;
        this.H2 += n64;
        this.H3 += n63;
        this.H4 += n62;
        this.xOff = 0;
        int i = 0;
        while (i != this.X.length) {
            this.X[i] = 0;
            ++i;
            if (a) {
                final boolean a2 = BaseKeyGenerator.a;
                boolean a3 = false;
                if (!a2) {
                    a3 = true;
                }
                BaseKeyGenerator.a = a3;
                break;
            }
        }
    }
    
    @Override
    protected void processLength(final long n) {
        if (this.xOff > 14) {
            this.processBlock();
        }
        this.X[14] = (int)(-1L & n);
        this.X[15] = (int)(n >>> 32);
    }
    
    @Override
    protected void processWord(final byte[] array, final int n) {
        this.X[this.xOff++] = ((0xFF & array[n]) | (0xFF & array[n + 1]) << 8 | (0xFF & array[n + 2]) << 16 | (0xFF & array[n + 3]) << 24);
        if (this.xOff == 16) {
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
        this.copyIn((MD5Digest)memoable);
    }
}
