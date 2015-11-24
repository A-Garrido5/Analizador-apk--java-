// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.jcajce.provider.asymmetric.rsa;

import java.security.InvalidAlgorithmParameterException;
import java.security.spec.RSAKeyGenParameterSpec;
import java.security.spec.AlgorithmParameterSpec;
import org.spongycastle.crypto.b;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.KeyPair;
import org.spongycastle.crypto.f;
import java.security.SecureRandom;
import java.math.BigInteger;
import java.security.KeyPairGenerator;

public class KeyPairGeneratorSpi extends KeyPairGenerator
{
    static final BigInteger a;
    zz b;
    zw c;
    
    static {
        a = BigInteger.valueOf(65537L);
    }
    
    public KeyPairGeneratorSpi() {
        super("RSA");
        this.c = new zw();
        this.b = new zz(KeyPairGeneratorSpi.a, new SecureRandom(), 2048, 12);
        this.c.a(this.b);
    }
    
    @Override
    public KeyPair generateKeyPair() {
        final b a = this.c.a();
        return new KeyPair(new BCRSAPublicKey((aaa)a.a()), new BCRSAPrivateCrtKey((aab)a.b()));
    }
    
    @Override
    public void initialize(final int n, final SecureRandom secureRandom) {
        this.b = new zz(KeyPairGeneratorSpi.a, secureRandom, n, 12);
        this.c.a(this.b);
    }
    
    @Override
    public void initialize(final AlgorithmParameterSpec algorithmParameterSpec, final SecureRandom secureRandom) {
        if (!(algorithmParameterSpec instanceof RSAKeyGenParameterSpec)) {
            throw new InvalidAlgorithmParameterException("parameter object not a RSAKeyGenParameterSpec");
        }
        final RSAKeyGenParameterSpec rsaKeyGenParameterSpec = (RSAKeyGenParameterSpec)algorithmParameterSpec;
        this.b = new zz(rsaKeyGenParameterSpec.getPublicExponent(), secureRandom, rsaKeyGenParameterSpec.getKeysize(), 12);
        this.c.a(this.b);
    }
}
