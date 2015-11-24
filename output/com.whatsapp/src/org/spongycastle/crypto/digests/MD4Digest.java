// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.crypto.digests;

import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.spongycastle.util.Memoable;

public class MD4Digest extends GeneralDigest
{
    private static final int DIGEST_LENGTH = 16;
    private static final int S11 = 3;
    private static final int S12 = 7;
    private static final int S13 = 11;
    private static final int S14 = 19;
    private static final int S21 = 3;
    private static final int S22 = 5;
    private static final int S23 = 9;
    private static final int S24 = 13;
    private static final int S31 = 3;
    private static final int S32 = 9;
    private static final int S33 = 11;
    private static final int S34 = 15;
    private static final String z;
    private int H1;
    private int H2;
    private int H3;
    private int H4;
    private int[] X;
    private int xOff;
    
    static {
        final char[] charArray = "=\u001bO".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u001b';
                    break;
                }
                case 0: {
                    c2 = 'p';
                    break;
                }
                case 1: {
                    c2 = '_';
                    break;
                }
                case 2: {
                    c2 = '{';
                    break;
                }
                case 3: {
                    c2 = ' ';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public MD4Digest() {
        this.X = new int[16];
        this.reset();
    }
    
    public MD4Digest(final MD4Digest md4Digest) {
        super(md4Digest);
        this.X = new int[16];
        this.copyIn(md4Digest);
    }
    
    private int F(final int n, final int n2, final int n3) {
        return (n & n2) | (n3 & ~n);
    }
    
    private int G(final int n, final int n2, final int n3) {
        return (n & n2) | (n & n3) | (n2 & n3);
    }
    
    private int H(final int n, final int n2, final int n3) {
        return n3 ^ (n ^ n2);
    }
    
    private void copyIn(final MD4Digest md4Digest) {
        super.copyIn(md4Digest);
        this.H1 = md4Digest.H1;
        this.H2 = md4Digest.H2;
        this.H3 = md4Digest.H3;
        this.H4 = md4Digest.H4;
        System.arraycopy(md4Digest.X, 0, this.X, 0, md4Digest.X.length);
        this.xOff = md4Digest.xOff;
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
        return new MD4Digest(this);
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
        return MD4Digest.z;
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
        final int rotateLeft = this.rotateLeft(h1 + this.F(h2, h3, h4) + this.X[0], 3);
        final int rotateLeft2 = this.rotateLeft(h4 + this.F(rotateLeft, h2, h3) + this.X[1], 7);
        final int rotateLeft3 = this.rotateLeft(h3 + this.F(rotateLeft2, rotateLeft, h2) + this.X[2], 11);
        final int rotateLeft4 = this.rotateLeft(h2 + this.F(rotateLeft3, rotateLeft2, rotateLeft) + this.X[3], 19);
        final int rotateLeft5 = this.rotateLeft(rotateLeft + this.F(rotateLeft4, rotateLeft3, rotateLeft2) + this.X[4], 3);
        final int rotateLeft6 = this.rotateLeft(rotateLeft2 + this.F(rotateLeft5, rotateLeft4, rotateLeft3) + this.X[5], 7);
        final int rotateLeft7 = this.rotateLeft(rotateLeft3 + this.F(rotateLeft6, rotateLeft5, rotateLeft4) + this.X[6], 11);
        final int rotateLeft8 = this.rotateLeft(rotateLeft4 + this.F(rotateLeft7, rotateLeft6, rotateLeft5) + this.X[7], 19);
        final int rotateLeft9 = this.rotateLeft(rotateLeft5 + this.F(rotateLeft8, rotateLeft7, rotateLeft6) + this.X[8], 3);
        final int rotateLeft10 = this.rotateLeft(rotateLeft6 + this.F(rotateLeft9, rotateLeft8, rotateLeft7) + this.X[9], 7);
        final int rotateLeft11 = this.rotateLeft(rotateLeft7 + this.F(rotateLeft10, rotateLeft9, rotateLeft8) + this.X[10], 11);
        final int rotateLeft12 = this.rotateLeft(rotateLeft8 + this.F(rotateLeft11, rotateLeft10, rotateLeft9) + this.X[11], 19);
        final int rotateLeft13 = this.rotateLeft(rotateLeft9 + this.F(rotateLeft12, rotateLeft11, rotateLeft10) + this.X[12], 3);
        final int rotateLeft14 = this.rotateLeft(rotateLeft10 + this.F(rotateLeft13, rotateLeft12, rotateLeft11) + this.X[13], 7);
        final int rotateLeft15 = this.rotateLeft(rotateLeft11 + this.F(rotateLeft14, rotateLeft13, rotateLeft12) + this.X[14], 11);
        final int rotateLeft16 = this.rotateLeft(rotateLeft12 + this.F(rotateLeft15, rotateLeft14, rotateLeft13) + this.X[15], 19);
        final int rotateLeft17 = this.rotateLeft(1518500249 + (rotateLeft13 + this.G(rotateLeft16, rotateLeft15, rotateLeft14) + this.X[0]), 3);
        final int rotateLeft18 = this.rotateLeft(1518500249 + (rotateLeft14 + this.G(rotateLeft17, rotateLeft16, rotateLeft15) + this.X[4]), 5);
        final int rotateLeft19 = this.rotateLeft(1518500249 + (rotateLeft15 + this.G(rotateLeft18, rotateLeft17, rotateLeft16) + this.X[8]), 9);
        final int rotateLeft20 = this.rotateLeft(1518500249 + (rotateLeft16 + this.G(rotateLeft19, rotateLeft18, rotateLeft17) + this.X[12]), 13);
        final int rotateLeft21 = this.rotateLeft(1518500249 + (rotateLeft17 + this.G(rotateLeft20, rotateLeft19, rotateLeft18) + this.X[1]), 3);
        final int rotateLeft22 = this.rotateLeft(1518500249 + (rotateLeft18 + this.G(rotateLeft21, rotateLeft20, rotateLeft19) + this.X[5]), 5);
        final int rotateLeft23 = this.rotateLeft(1518500249 + (rotateLeft19 + this.G(rotateLeft22, rotateLeft21, rotateLeft20) + this.X[9]), 9);
        final int rotateLeft24 = this.rotateLeft(1518500249 + (rotateLeft20 + this.G(rotateLeft23, rotateLeft22, rotateLeft21) + this.X[13]), 13);
        final int rotateLeft25 = this.rotateLeft(1518500249 + (rotateLeft21 + this.G(rotateLeft24, rotateLeft23, rotateLeft22) + this.X[2]), 3);
        final int rotateLeft26 = this.rotateLeft(1518500249 + (rotateLeft22 + this.G(rotateLeft25, rotateLeft24, rotateLeft23) + this.X[6]), 5);
        final int rotateLeft27 = this.rotateLeft(1518500249 + (rotateLeft23 + this.G(rotateLeft26, rotateLeft25, rotateLeft24) + this.X[10]), 9);
        final int rotateLeft28 = this.rotateLeft(1518500249 + (rotateLeft24 + this.G(rotateLeft27, rotateLeft26, rotateLeft25) + this.X[14]), 13);
        final int rotateLeft29 = this.rotateLeft(1518500249 + (rotateLeft25 + this.G(rotateLeft28, rotateLeft27, rotateLeft26) + this.X[3]), 3);
        final int rotateLeft30 = this.rotateLeft(1518500249 + (rotateLeft26 + this.G(rotateLeft29, rotateLeft28, rotateLeft27) + this.X[7]), 5);
        final int rotateLeft31 = this.rotateLeft(1518500249 + (rotateLeft27 + this.G(rotateLeft30, rotateLeft29, rotateLeft28) + this.X[11]), 9);
        final int rotateLeft32 = this.rotateLeft(1518500249 + (rotateLeft28 + this.G(rotateLeft31, rotateLeft30, rotateLeft29) + this.X[15]), 13);
        final int rotateLeft33 = this.rotateLeft(1859775393 + (rotateLeft29 + this.H(rotateLeft32, rotateLeft31, rotateLeft30) + this.X[0]), 3);
        final int rotateLeft34 = this.rotateLeft(1859775393 + (rotateLeft30 + this.H(rotateLeft33, rotateLeft32, rotateLeft31) + this.X[8]), 9);
        final int rotateLeft35 = this.rotateLeft(1859775393 + (rotateLeft31 + this.H(rotateLeft34, rotateLeft33, rotateLeft32) + this.X[4]), 11);
        final int rotateLeft36 = this.rotateLeft(1859775393 + (rotateLeft32 + this.H(rotateLeft35, rotateLeft34, rotateLeft33) + this.X[12]), 15);
        final int rotateLeft37 = this.rotateLeft(1859775393 + (rotateLeft33 + this.H(rotateLeft36, rotateLeft35, rotateLeft34) + this.X[2]), 3);
        final int rotateLeft38 = this.rotateLeft(1859775393 + (rotateLeft34 + this.H(rotateLeft37, rotateLeft36, rotateLeft35) + this.X[10]), 9);
        final int rotateLeft39 = this.rotateLeft(1859775393 + (rotateLeft35 + this.H(rotateLeft38, rotateLeft37, rotateLeft36) + this.X[6]), 11);
        final int rotateLeft40 = this.rotateLeft(1859775393 + (rotateLeft36 + this.H(rotateLeft39, rotateLeft38, rotateLeft37) + this.X[14]), 15);
        final int rotateLeft41 = this.rotateLeft(1859775393 + (rotateLeft37 + this.H(rotateLeft40, rotateLeft39, rotateLeft38) + this.X[1]), 3);
        final int rotateLeft42 = this.rotateLeft(1859775393 + (rotateLeft38 + this.H(rotateLeft41, rotateLeft40, rotateLeft39) + this.X[9]), 9);
        final int rotateLeft43 = this.rotateLeft(1859775393 + (rotateLeft39 + this.H(rotateLeft42, rotateLeft41, rotateLeft40) + this.X[5]), 11);
        final int rotateLeft44 = this.rotateLeft(1859775393 + (rotateLeft40 + this.H(rotateLeft43, rotateLeft42, rotateLeft41) + this.X[13]), 15);
        final int rotateLeft45 = this.rotateLeft(1859775393 + (rotateLeft41 + this.H(rotateLeft44, rotateLeft43, rotateLeft42) + this.X[3]), 3);
        final int rotateLeft46 = this.rotateLeft(1859775393 + (rotateLeft42 + this.H(rotateLeft45, rotateLeft44, rotateLeft43) + this.X[11]), 9);
        final int rotateLeft47 = this.rotateLeft(1859775393 + (rotateLeft43 + this.H(rotateLeft46, rotateLeft45, rotateLeft44) + this.X[7]), 11);
        final int rotateLeft48 = this.rotateLeft(1859775393 + (rotateLeft44 + this.H(rotateLeft47, rotateLeft46, rotateLeft45) + this.X[15]), 15);
        this.H1 += rotateLeft45;
        this.H2 += rotateLeft48;
        this.H3 += rotateLeft47;
        this.H4 += rotateLeft46;
        this.xOff = 0;
        int i = 0;
        while (i != this.X.length) {
            this.X[i] = 0;
            ++i;
            if (a) {
                break;
            }
        }
        if (BaseKeyGenerator.a) {
            GeneralDigest.a = !a;
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
        this.copyIn((MD4Digest)memoable);
    }
}
