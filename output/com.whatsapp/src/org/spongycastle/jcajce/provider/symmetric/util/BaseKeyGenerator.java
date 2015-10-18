// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.jcajce.provider.symmetric.util;

import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.InvalidParameterException;
import javax.crypto.spec.SecretKeySpec;
import org.spongycastle.crypto.KeyGenerationParameters;
import java.security.SecureRandom;
import javax.crypto.SecretKey;
import org.spongycastle.crypto.CipherKeyGenerator;
import javax.crypto.KeyGeneratorSpi;

public class BaseKeyGenerator extends KeyGeneratorSpi
{
    public static boolean a;
    private static final String z;
    protected String algName;
    protected int defaultKeySize;
    protected CipherKeyGenerator engine;
    protected int keySize;
    protected boolean uninitialised;
    
    static {
        final char[] charArray = ",zn?w\u000fevzS\u0007{nzZ".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '>';
                    break;
                }
                case 0: {
                    c2 = 'b';
                    break;
                }
                case 1: {
                    c2 = '\u0015';
                    break;
                }
                case 2: {
                    c2 = '\u001a';
                    break;
                }
                case 3: {
                    c2 = '\u001f';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    protected BaseKeyGenerator(final String algName, final int n, final CipherKeyGenerator engine) {
        this.uninitialised = true;
        this.algName = algName;
        this.defaultKeySize = n;
        this.keySize = n;
        this.engine = engine;
    }
    
    @Override
    protected SecretKey engineGenerateKey() {
        try {
            if (this.uninitialised) {
                this.engine.init(new KeyGenerationParameters(new SecureRandom(), this.defaultKeySize));
                this.uninitialised = false;
            }
            return new SecretKeySpec(this.engine.generateKey(), this.algName);
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    @Override
    protected void engineInit(final int n, SecureRandom secureRandom) {
        Label_0012: {
            if (secureRandom != null) {
                break Label_0012;
            }
            try {
                secureRandom = new SecureRandom();
                this.engine.init(new KeyGenerationParameters(secureRandom, n));
                this.uninitialised = false;
            }
            catch (IllegalArgumentException ex) {
                throw new InvalidParameterException(ex.getMessage());
            }
        }
    }
    
    @Override
    protected void engineInit(final SecureRandom secureRandom) {
        if (secureRandom == null) {
            return;
        }
        try {
            this.engine.init(new KeyGenerationParameters(secureRandom, this.defaultKeySize));
            this.uninitialised = false;
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    @Override
    protected void engineInit(final AlgorithmParameterSpec algorithmParameterSpec, final SecureRandom secureRandom) {
        throw new InvalidAlgorithmParameterException(BaseKeyGenerator.z);
    }
}
