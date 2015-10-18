// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.jcajce.provider.symmetric.util;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.InvalidCipherTextException;
import javax.crypto.BadPaddingException;
import org.spongycastle.crypto.modes.AEADBlockCipher;
import java.lang.reflect.Constructor;

class BaseBlockCipher$AEADGenericBlockCipher implements BaseBlockCipher$GenericBlockCipher
{
    private static final Constructor aeadBadTagConstructor;
    private AEADBlockCipher cipher;
    
    static {
        final char[] charArray = "E;\\\u00016\u00019X\u0019>[5\u0004!\u000bn\u001eh\u0001*{;M%6L?Z\u0014'@4".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'N';
                    break;
                }
                case 0: {
                    c2 = '/';
                    break;
                }
                case 1: {
                    c2 = 'Z';
                    break;
                }
                case 2: {
                    c2 = '*';
                    break;
                }
                case 3: {
                    c2 = '`';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        final Class access$000 = BaseBlockCipher.access$000(new String(charArray).intern());
        if (access$000 != null) {
            aeadBadTagConstructor = findExceptionConstructor(access$000);
            return;
        }
        aeadBadTagConstructor = null;
    }
    
    BaseBlockCipher$AEADGenericBlockCipher(final AEADBlockCipher cipher) {
        this.cipher = cipher;
    }
    
    private static Constructor findExceptionConstructor(final Class clazz) {
        try {
            return clazz.getConstructor(String.class);
        }
        catch (Exception ex) {
            return null;
        }
    }
    
    @Override
    public int doFinal(final byte[] array, final int n) {
        try {
            return this.cipher.doFinal(array, n);
        }
        catch (InvalidCipherTextException ex2) {
            if (BaseBlockCipher$AEADGenericBlockCipher.aeadBadTagConstructor != null) {
                while (true) {
                    try {
                        final BadPaddingException ex = BaseBlockCipher$AEADGenericBlockCipher.aeadBadTagConstructor.newInstance(ex2.getMessage());
                        if (ex != null) {
                            try {
                                throw ex;
                            }
                            catch (InvalidCipherTextException ex3) {
                                throw ex3;
                            }
                        }
                    }
                    catch (Exception ex4) {
                        final BadPaddingException ex = null;
                        continue;
                    }
                    break;
                }
            }
            throw new BadPaddingException(ex2.getMessage());
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
        this.cipher.processAADBytes(array, n, n2);
    }
    
    @Override
    public boolean wrapOnNoPadding() {
        return false;
    }
}
