// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.crypto.modes;

import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.StreamCipher;
import org.spongycastle.crypto.StreamBlockCipher;

public class SICBlockCipher extends StreamBlockCipher implements StreamCipher
{
    public static boolean a;
    private static final String[] z;
    private byte[] IV;
    private final int blockSize;
    private int byteCount;
    private final BlockCipher cipher;
    private byte[] counter;
    private byte[] counterOut;
    
    static {
        final String[] z2 = new String[2];
        final char[] charArray = "\u0007!\u0004W".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '-';
                    break;
                }
                case 0: {
                    c2 = '(';
                    break;
                }
                case 1: {
                    c2 = 'r';
                    break;
                }
                case 2: {
                    c2 = 'M';
                    break;
                }
                case 3: {
                    c2 = '\u0014';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "{;\u000e4@G\u0016(4_M\u00038}_M\u0001mDLZ\u0013 qYM\u0000>CD\\\u001a\u0004B".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = '-';
                    break;
                }
                case 0: {
                    c4 = '(';
                    break;
                }
                case 1: {
                    c4 = 'r';
                    break;
                }
                case 2: {
                    c4 = 'M';
                    break;
                }
                case 3: {
                    c4 = '\u0014';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        z = z2;
    }
    
    public SICBlockCipher(final BlockCipher cipher) {
        super(cipher);
        this.cipher = cipher;
        this.blockSize = this.cipher.getBlockSize();
        this.IV = new byte[this.blockSize];
        this.counter = new byte[this.blockSize];
        this.counterOut = new byte[this.blockSize];
        this.byteCount = 0;
    }
    
    private void incrementCounter() {
        final boolean a = SICBlockCipher.a;
        int n = -1 + this.counter.length;
        while (true) {
            if (n < 0) {
                return;
            }
            try {
                final byte[] counter = this.counter;
                final byte b = (byte)(1 + counter[n]);
                counter[n] = b;
                if (b == 0) {
                    --n;
                    if (!a) {
                        continue;
                    }
                }
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
    }
    
    @Override
    protected byte calculateByte(final byte b) {
        while (true) {
            try {
                if (this.byteCount == 0) {
                    this.cipher.processBlock(this.counter, 0, this.counterOut, 0);
                    return (byte)(this.counterOut[this.byteCount++] ^ b);
                }
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
            final byte b2 = (byte)(b ^ this.counterOut[this.byteCount++]);
            try {
                if (this.byteCount == this.counter.length) {
                    this.byteCount = 0;
                    this.incrementCounter();
                    return b2;
                }
                return b2;
            }
            catch (IllegalArgumentException ex2) {
                throw ex2;
            }
        }
    }
    
    @Override
    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + SICBlockCipher.z[0];
    }
    
    @Override
    public int getBlockSize() {
        return this.cipher.getBlockSize();
    }
    
    @Override
    public void init(final boolean b, final CipherParameters cipherParameters) {
        while (true) {
            if (cipherParameters instanceof ParametersWithIV) {
                final ParametersWithIV parametersWithIV = (ParametersWithIV)cipherParameters;
                final byte[] iv = parametersWithIV.getIV();
                try {
                    System.arraycopy(iv, 0, this.IV, 0, this.IV.length);
                    if (parametersWithIV.getParameters() != null) {
                        this.cipher.init(true, parametersWithIV.getParameters());
                    }
                    try {
                        this.reset();
                        if (SICBlockCipher.a) {
                            throw new IllegalArgumentException(SICBlockCipher.z[1]);
                        }
                    }
                    catch (IllegalArgumentException ex) {
                        throw ex;
                    }
                }
                catch (IllegalArgumentException ex2) {
                    throw ex2;
                }
                return;
            }
            continue;
        }
    }
    
    @Override
    public int processBlock(final byte[] array, final int n, final byte[] array2, final int n2) {
        this.processBytes(array, n, this.blockSize, array2, n2);
        return this.blockSize;
    }
    
    @Override
    public void reset() {
        System.arraycopy(this.IV, 0, this.counter, 0, this.counter.length);
        this.cipher.reset();
        this.byteCount = 0;
    }
}
