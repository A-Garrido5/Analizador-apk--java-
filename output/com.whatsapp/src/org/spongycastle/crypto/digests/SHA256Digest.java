// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.crypto.digests;

import org.spongycastle.util.Memoable;
import org.spongycastle.util.Pack;

public class SHA256Digest extends GeneralDigest implements EncodableDigest
{
    private static final int DIGEST_LENGTH = 32;
    static final int[] K;
    private static final String z;
    private int H1;
    private int H2;
    private int H3;
    private int H4;
    private int H5;
    private int H6;
    private int H7;
    private int H8;
    private int[] X;
    private int xOff;
    
    static {
        final char[] charArray = "M\u0012\u0003*\u0018+l".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '*';
                    break;
                }
                case 0: {
                    c2 = '\u001e';
                    break;
                }
                case 1: {
                    c2 = 'Z';
                    break;
                }
                case 2: {
                    c2 = 'B';
                    break;
                }
                case 3: {
                    c2 = '\u0007';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
        K = new int[] { 1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998 };
    }
    
    public SHA256Digest() {
        this.X = new int[64];
        this.reset();
    }
    
    public SHA256Digest(final SHA256Digest sha256Digest) {
        super(sha256Digest);
        this.X = new int[64];
        this.copyIn(sha256Digest);
    }
    
    public SHA256Digest(final byte[] array) {
        final boolean a = GeneralDigest.a;
        super(array);
        this.X = new int[64];
        this.H1 = Pack.bigEndianToInt(array, 16);
        this.H2 = Pack.bigEndianToInt(array, 20);
        this.H3 = Pack.bigEndianToInt(array, 24);
        this.H4 = Pack.bigEndianToInt(array, 28);
        this.H5 = Pack.bigEndianToInt(array, 32);
        this.H6 = Pack.bigEndianToInt(array, 36);
        this.H7 = Pack.bigEndianToInt(array, 40);
        this.H8 = Pack.bigEndianToInt(array, 44);
        this.xOff = Pack.bigEndianToInt(array, 48);
        int i = 0;
        while (i != this.xOff) {
            this.X[i] = Pack.bigEndianToInt(array, 52 + i * 4);
            ++i;
            if (a) {
                break;
            }
        }
    }
    
    private int Ch(final int n, final int n2, final int n3) {
        return (n & n2) ^ (n3 & ~n);
    }
    
    private int Maj(final int n, final int n2, final int n3) {
        return (n & n2) ^ (n & n3) ^ (n2 & n3);
    }
    
    private int Sum0(final int n) {
        return (n >>> 2 | n << 30) ^ (n >>> 13 | n << 19) ^ (n >>> 22 | n << 10);
    }
    
    private int Sum1(final int n) {
        return (n >>> 6 | n << 26) ^ (n >>> 11 | n << 21) ^ (n >>> 25 | n << 7);
    }
    
    private int Theta0(final int n) {
        return (n >>> 7 | n << 25) ^ (n >>> 18 | n << 14) ^ n >>> 3;
    }
    
    private int Theta1(final int n) {
        return (n >>> 17 | n << 15) ^ (n >>> 19 | n << 13) ^ n >>> 10;
    }
    
    private void copyIn(final SHA256Digest sha256Digest) {
        super.copyIn(sha256Digest);
        this.H1 = sha256Digest.H1;
        this.H2 = sha256Digest.H2;
        this.H3 = sha256Digest.H3;
        this.H4 = sha256Digest.H4;
        this.H5 = sha256Digest.H5;
        this.H6 = sha256Digest.H6;
        this.H7 = sha256Digest.H7;
        this.H8 = sha256Digest.H8;
        System.arraycopy(sha256Digest.X, 0, this.X, 0, sha256Digest.X.length);
        this.xOff = sha256Digest.xOff;
    }
    
    @Override
    public Memoable copy() {
        return new SHA256Digest(this);
    }
    
    @Override
    public int doFinal(final byte[] array, final int n) {
        this.finish();
        Pack.intToBigEndian(this.H1, array, n);
        Pack.intToBigEndian(this.H2, array, n + 4);
        Pack.intToBigEndian(this.H3, array, n + 8);
        Pack.intToBigEndian(this.H4, array, n + 12);
        Pack.intToBigEndian(this.H5, array, n + 16);
        Pack.intToBigEndian(this.H6, array, n + 20);
        Pack.intToBigEndian(this.H7, array, n + 24);
        Pack.intToBigEndian(this.H8, array, n + 28);
        this.reset();
        return 32;
    }
    
    @Override
    public String getAlgorithmName() {
        return SHA256Digest.z;
    }
    
    @Override
    public int getDigestSize() {
        return 32;
    }
    
    @Override
    public byte[] getEncodedState() {
        final boolean a = GeneralDigest.a;
        final byte[] array = new byte[52 + 4 * this.xOff];
        super.populateState(array);
        Pack.intToBigEndian(this.H1, array, 16);
        Pack.intToBigEndian(this.H2, array, 20);
        Pack.intToBigEndian(this.H3, array, 24);
        Pack.intToBigEndian(this.H4, array, 28);
        Pack.intToBigEndian(this.H5, array, 32);
        Pack.intToBigEndian(this.H6, array, 36);
        Pack.intToBigEndian(this.H7, array, 40);
        Pack.intToBigEndian(this.H8, array, 44);
        Pack.intToBigEndian(this.xOff, array, 48);
        int i = 0;
        while (i != this.xOff) {
            Pack.intToBigEndian(this.X[i], array, 52 + i * 4);
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
        while (i <= 63) {
            this.X[i] = this.Theta1(this.X[i - 2]) + this.X[i - 7] + this.Theta0(this.X[i - 15]) + this.X[i - 16];
            ++i;
            if (a) {
                break;
            }
        }
        int h1 = this.H1;
        int h2 = this.H2;
        int h3 = this.H3;
        int h4 = this.H4;
        int h5 = this.H5;
        int h6 = this.H6;
        int h7 = this.H7;
        int h8 = this.H8;
        int j = 0;
        int n = 0;
        while (j < 8) {
            final int n2 = h8 + (this.Sum1(h5) + this.Ch(h5, h6, h7) + SHA256Digest.K[n] + this.X[n]);
            final int n3 = h4 + n2;
            final int n4 = n2 + (this.Sum0(h1) + this.Maj(h1, h2, h3));
            final int n5 = n + 1;
            final int n6 = h7 + (this.Sum1(n3) + this.Ch(n3, h5, h6) + SHA256Digest.K[n5] + this.X[n5]);
            final int n7 = h3 + n6;
            final int n8 = n6 + (this.Sum0(n4) + this.Maj(n4, h1, h2));
            final int n9 = n5 + 1;
            final int n10 = h6 + (this.Sum1(n7) + this.Ch(n7, n3, h5) + SHA256Digest.K[n9] + this.X[n9]);
            final int n11 = h2 + n10;
            final int n12 = n10 + (this.Sum0(n8) + this.Maj(n8, n4, h1));
            final int n13 = n9 + 1;
            final int n14 = h5 + (this.Sum1(n11) + this.Ch(n11, n7, n3) + SHA256Digest.K[n13] + this.X[n13]);
            final int n15 = h1 + n14;
            final int n16 = n14 + (this.Sum0(n12) + this.Maj(n12, n8, n4));
            final int n17 = n13 + 1;
            final int n18 = n3 + (this.Sum1(n15) + this.Ch(n15, n11, n7) + SHA256Digest.K[n17] + this.X[n17]);
            h8 = n4 + n18;
            h4 = n18 + (this.Sum0(n16) + this.Maj(n16, n12, n8));
            final int n19 = n17 + 1;
            final int n20 = n7 + (this.Sum1(h8) + this.Ch(h8, n15, n11) + SHA256Digest.K[n19] + this.X[n19]);
            h7 = n8 + n20;
            h3 = n20 + (this.Sum0(h4) + this.Maj(h4, n16, n12));
            final int n21 = n19 + 1;
            final int n22 = n11 + (this.Sum1(h7) + this.Ch(h7, h8, n15) + SHA256Digest.K[n21] + this.X[n21]);
            h6 = n12 + n22;
            h2 = n22 + (this.Sum0(h3) + this.Maj(h3, h4, n16));
            final int n23 = n21 + 1;
            final int n24 = n15 + (this.Sum1(h6) + this.Ch(h6, h7, h8) + SHA256Digest.K[n23] + this.X[n23]);
            h5 = n16 + n24;
            h1 = n24 + (this.Sum0(h2) + this.Maj(h2, h3, h4));
            n = n23 + 1;
            ++j;
            if (a) {
                break;
            }
        }
        this.H1 += h1;
        this.H2 += h2;
        this.H3 += h3;
        this.H4 += h4;
        this.H5 += h5;
        this.H6 += h6;
        this.H7 += h7;
        this.H8 += h8;
        this.xOff = 0;
        int k = 0;
        while (k < 16) {
            this.X[k] = 0;
            ++k;
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
        this.H1 = 1779033703;
        this.H2 = -1150833019;
        this.H3 = 1013904242;
        this.H4 = -1521486534;
        this.H5 = 1359893119;
        this.H6 = -1694144372;
        this.H7 = 528734635;
        this.H8 = 1541459225;
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
        this.copyIn((SHA256Digest)memoable);
    }
}
