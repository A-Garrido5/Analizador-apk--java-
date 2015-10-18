// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.crypto.modes;

import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.StreamBlockCipher;

public class OFBBlockCipher extends StreamBlockCipher
{
    private static final String z;
    private byte[] IV;
    private final int blockSize;
    private int byteCount;
    private final BlockCipher cipher;
    private byte[] ofbOutV;
    private byte[] ofbV;
    
    static {
        final char[] charArray = "K`\u0003z".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u000e';
                    break;
                }
                case 0: {
                    c2 = 'd';
                    break;
                }
                case 1: {
                    c2 = '/';
                    break;
                }
                case 2: {
                    c2 = 'E';
                    break;
                }
                case 3: {
                    c2 = '8';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public OFBBlockCipher(final BlockCipher cipher, final int n) {
        super(cipher);
        this.cipher = cipher;
        this.blockSize = n / 8;
        this.IV = new byte[cipher.getBlockSize()];
        this.ofbV = new byte[cipher.getBlockSize()];
        this.ofbOutV = new byte[cipher.getBlockSize()];
    }
    
    @Override
    protected byte calculateByte(final byte b) {
        if (this.byteCount == 0) {
            this.cipher.processBlock(this.ofbV, 0, this.ofbOutV, 0);
        }
        final byte b2 = (byte)(b ^ this.ofbOutV[this.byteCount++]);
        if (this.byteCount == this.blockSize) {
            this.byteCount = 0;
            System.arraycopy(this.ofbV, this.blockSize, this.ofbV, 0, this.ofbV.length - this.blockSize);
            System.arraycopy(this.ofbOutV, 0, this.ofbV, this.ofbV.length - this.blockSize, this.blockSize);
        }
        return b2;
    }
    
    @Override
    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + OFBBlockCipher.z + 8 * this.blockSize;
    }
    
    @Override
    public int getBlockSize() {
        return this.blockSize;
    }
    
    @Override
    public void init(final boolean b, final CipherParameters cipherParameters) {
        final boolean a = SICBlockCipher.a;
        if (cipherParameters instanceof ParametersWithIV) {
            final ParametersWithIV parametersWithIV = (ParametersWithIV)cipherParameters;
            final byte[] iv = parametersWithIV.getIV();
            Label_0109: {
                if (iv.length < this.IV.length) {
                    System.arraycopy(iv, 0, this.IV, this.IV.length - iv.length, iv.length);
                    int i = 0;
                    while (i < this.IV.length - iv.length) {
                        this.IV[i] = 0;
                        ++i;
                        if (a) {
                            break;
                        }
                    }
                    if (!a) {
                        break Label_0109;
                    }
                }
                System.arraycopy(iv, 0, this.IV, 0, this.IV.length);
            }
            this.reset();
            if (parametersWithIV.getParameters() != null) {
                this.cipher.init(true, parametersWithIV.getParameters());
            }
            if (!a) {
                return;
            }
        }
        this.reset();
        if (cipherParameters != null) {
            this.cipher.init(true, cipherParameters);
        }
    }
    
    @Override
    public int processBlock(final byte[] array, final int n, final byte[] array2, final int n2) {
        this.processBytes(array, n, this.blockSize, array2, n2);
        return this.blockSize;
    }
    
    @Override
    public void reset() {
        System.arraycopy(this.IV, 0, this.ofbV, 0, this.IV.length);
        this.byteCount = 0;
        this.cipher.reset();
    }
}
