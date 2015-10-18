// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.jcajce.provider.symmetric.util;

import org.spongycastle.crypto.PBEParametersGenerator;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;
import javax.crypto.spec.PBEKeySpec;
import org.spongycastle.crypto.CipherParameters;
import javax.crypto.interfaces.PBEKey;

public class BCPBEKey implements PBEKey
{
    private static final String z;
    String algorithm;
    int digest;
    int ivSize;
    int keySize;
    CipherParameters param;
    PBEKeySpec pbeKeySpec;
    boolean tryWrong;
    int type;
    
    static {
        final char[] charArray = "5?q".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u000e';
                    break;
                }
                case 0: {
                    c2 = 'g';
                    break;
                }
                case 1: {
                    c2 = '~';
                    break;
                }
                case 2: {
                    c2 = '&';
                    break;
                }
                case 3: {
                    c2 = '\u0001';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public BCPBEKey(final String algorithm, final int type, final int digest, final int keySize, final int ivSize, final PBEKeySpec pbeKeySpec, final CipherParameters param) {
        this.tryWrong = false;
        this.algorithm = algorithm;
        this.type = type;
        this.digest = digest;
        this.keySize = keySize;
        this.ivSize = ivSize;
        this.pbeKeySpec = pbeKeySpec;
        this.param = param;
    }
    
    @Override
    public String getAlgorithm() {
        return this.algorithm;
    }
    
    int getDigest() {
        return this.digest;
    }
    
    @Override
    public byte[] getEncoded() {
        if (this.param != null) {
            if (this.param instanceof ParametersWithIV) {
                final KeyParameter keyParameter = (KeyParameter)((ParametersWithIV)this.param).getParameters();
                if (BaseMac.a == 0) {
                    return keyParameter.getKey();
                }
            }
            final KeyParameter keyParameter = (KeyParameter)this.param;
            return keyParameter.getKey();
        }
        if (this.type == 5) {
            return PBEParametersGenerator.PKCS5PasswordToUTF8Bytes(this.pbeKeySpec.getPassword());
        }
        return PBEParametersGenerator.PKCS5PasswordToBytes(this.pbeKeySpec.getPassword());
    }
    
    @Override
    public String getFormat() {
        return BCPBEKey.z;
    }
    
    @Override
    public int getIterationCount() {
        return this.pbeKeySpec.getIterationCount();
    }
    
    public int getIvSize() {
        return this.ivSize;
    }
    
    int getKeySize() {
        return this.keySize;
    }
    
    public CipherParameters getParam() {
        return this.param;
    }
    
    @Override
    public char[] getPassword() {
        return this.pbeKeySpec.getPassword();
    }
    
    @Override
    public byte[] getSalt() {
        return this.pbeKeySpec.getSalt();
    }
    
    int getType() {
        return this.type;
    }
    
    public void setTryWrongPKCS12Zero(final boolean tryWrong) {
        this.tryWrong = tryWrong;
    }
    
    boolean shouldTryWrongPKCS12() {
        return this.tryWrong;
    }
}
