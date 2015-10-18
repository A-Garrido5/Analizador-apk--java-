// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.crypto.modes;

import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.util.Arrays;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.StreamBlockCipher;

public class CFBBlockCipher extends StreamBlockCipher
{
    private static final String z;
    private byte[] IV;
    private int blockSize;
    private int byteCount;
    private byte[] cfbOutV;
    private byte[] cfbV;
    private BlockCipher cipher;
    private boolean encrypting;
    private byte[] inBuf;
    
    static {
        final char[] charArray = "6/\\E".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u0015';
                    break;
                }
                case 0: {
                    c2 = '\u0019';
                    break;
                }
                case 1: {
                    c2 = 'l';
                    break;
                }
                case 2: {
                    c2 = '\u001a';
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
    }
    
    public CFBBlockCipher(final BlockCipher cipher, final int n) {
        super(cipher);
        this.cipher = null;
        this.cipher = cipher;
        this.blockSize = n / 8;
        this.IV = new byte[cipher.getBlockSize()];
        this.cfbV = new byte[cipher.getBlockSize()];
        this.cfbOutV = new byte[cipher.getBlockSize()];
        this.inBuf = new byte[this.blockSize];
    }
    
    private byte decryptByte(final byte b) {
        if (this.byteCount == 0) {
            this.cipher.processBlock(this.cfbV, 0, this.cfbOutV, 0);
        }
        this.inBuf[this.byteCount] = b;
        final byte b2 = (byte)(b ^ this.cfbOutV[this.byteCount++]);
        if (this.byteCount == this.blockSize) {
            this.byteCount = 0;
            System.arraycopy(this.cfbV, this.blockSize, this.cfbV, 0, this.cfbV.length - this.blockSize);
            System.arraycopy(this.inBuf, 0, this.cfbV, this.cfbV.length - this.blockSize, this.blockSize);
        }
        return b2;
    }
    
    private byte encryptByte(final byte b) {
        if (this.byteCount == 0) {
            this.cipher.processBlock(this.cfbV, 0, this.cfbOutV, 0);
        }
        final byte b2 = (byte)(b ^ this.cfbOutV[this.byteCount]);
        this.inBuf[this.byteCount++] = b2;
        if (this.byteCount == this.blockSize) {
            this.byteCount = 0;
            System.arraycopy(this.cfbV, this.blockSize, this.cfbV, 0, this.cfbV.length - this.blockSize);
            System.arraycopy(this.inBuf, 0, this.cfbV, this.cfbV.length - this.blockSize, this.blockSize);
        }
        return b2;
    }
    
    @Override
    protected byte calculateByte(final byte b) {
        if (this.encrypting) {
            return this.encryptByte(b);
        }
        return this.decryptByte(b);
    }
    
    public int decryptBlock(final byte[] array, final int n, final byte[] array2, final int n2) {
        this.processBytes(array, n, this.blockSize, array2, n2);
        return this.blockSize;
    }
    
    public int encryptBlock(final byte[] array, final int n, final byte[] array2, final int n2) {
        this.processBytes(array, n, this.blockSize, array2, n2);
        return this.blockSize;
    }
    
    @Override
    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + CFBBlockCipher.z + 8 * this.blockSize;
    }
    
    @Override
    public int getBlockSize() {
        return this.blockSize;
    }
    
    public byte[] getCurrentIV() {
        return Arrays.clone(this.cfbV);
    }
    
    @Override
    public void init(final boolean encrypting, final CipherParameters cipherParameters) {
        final boolean a = SICBlockCipher.a;
        this.encrypting = encrypting;
        if (cipherParameters instanceof ParametersWithIV) {
            final ParametersWithIV parametersWithIV = (ParametersWithIV)cipherParameters;
            final byte[] iv = parametersWithIV.getIV();
            Label_0114: {
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
                        break Label_0114;
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
        System.arraycopy(this.IV, 0, this.cfbV, 0, this.IV.length);
        Arrays.fill(this.inBuf, (byte)0);
        this.byteCount = 0;
        this.cipher.reset();
    }
}
