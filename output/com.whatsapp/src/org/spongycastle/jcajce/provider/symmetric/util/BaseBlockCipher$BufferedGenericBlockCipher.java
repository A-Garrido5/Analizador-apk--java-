// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.jcajce.provider.symmetric.util;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.InvalidCipherTextException;
import javax.crypto.BadPaddingException;
import org.spongycastle.crypto.paddings.BlockCipherPadding;
import org.spongycastle.crypto.paddings.PaddedBufferedBlockCipher;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.BufferedBlockCipher;

class BaseBlockCipher$BufferedGenericBlockCipher implements BaseBlockCipher$GenericBlockCipher
{
    private static final String z;
    private BufferedBlockCipher cipher;
    
    static {
        final char[] charArray = "\u0003E$3\r1$\u000e|\u0010bw\u0015c\u0014-v\u0014v\u0000bm\u000e3\u0010*a@p\u00110v\u0005}\u0010bi\u000fw\u0001l".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'd';
                    break;
                }
                case 0: {
                    c2 = 'B';
                    break;
                }
                case 1: {
                    c2 = '\u0004';
                    break;
                }
                case 2: {
                    c2 = '`';
                    break;
                }
                case 3: {
                    c2 = '\u0013';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    BaseBlockCipher$BufferedGenericBlockCipher(final BlockCipher blockCipher) {
        this.cipher = new PaddedBufferedBlockCipher(blockCipher);
    }
    
    BaseBlockCipher$BufferedGenericBlockCipher(final BlockCipher blockCipher, final BlockCipherPadding blockCipherPadding) {
        this.cipher = new PaddedBufferedBlockCipher(blockCipher, blockCipherPadding);
    }
    
    BaseBlockCipher$BufferedGenericBlockCipher(final BufferedBlockCipher cipher) {
        this.cipher = cipher;
    }
    
    @Override
    public int doFinal(final byte[] array, final int n) {
        try {
            return this.cipher.doFinal(array, n);
        }
        catch (InvalidCipherTextException ex) {
            throw new BadPaddingException(ex.getMessage());
        }
    }
    
    @Override
    public String getAlgorithmName() {
        return this.cipher.getUnderlyingCipher().getAlgorithmName();
    }
    
    @Override
    public int getOutputSize(final int n) {
        return this.cipher.getOutputSize(n);
    }
    
    @Override
    public BlockCipher getUnderlyingCipher() {
        return this.cipher.getUnderlyingCipher();
    }
    
    @Override
    public int getUpdateOutputSize(final int n) {
        return this.cipher.getUpdateOutputSize(n);
    }
    
    @Override
    public void init(final boolean b, final CipherParameters cipherParameters) {
        this.cipher.init(b, cipherParameters);
    }
    
    @Override
    public int processByte(final byte b, final byte[] array, final int n) {
        return this.cipher.processByte(b, array, n);
    }
    
    @Override
    public int processBytes(final byte[] array, final int n, final int n2, final byte[] array2, final int n3) {
        return this.cipher.processBytes(array, n, n2, array2, n3);
    }
    
    @Override
    public void updateAAD(final byte[] array, final int n, final int n2) {
        throw new UnsupportedOperationException(BaseBlockCipher$BufferedGenericBlockCipher.z);
    }
    
    @Override
    public boolean wrapOnNoPadding() {
        return true;
    }
}
