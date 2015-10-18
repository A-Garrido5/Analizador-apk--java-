// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.jcajce.provider.asymmetric.rsa;

import java.security.InvalidKeyException;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.Key;
import java.security.spec.RSAPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPrivateKeySpec;
import java.security.spec.RSAPrivateCrtKeySpec;
import org.spongycastle.jcajce.provider.asymmetric.util.ExtendedInvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.KeySpec;
import java.security.PublicKey;
import org.spongycastle.asn1.l;
import java.io.IOException;
import java.security.PrivateKey;
import org.spongycastle.jcajce.provider.asymmetric.util.a;

public class KeyFactorySpi extends a
{
    @Override
    public PrivateKey a(final zi zi) {
        final l c = zi.c().c();
        if (org.spongycastle.jcajce.provider.asymmetric.rsa.a.a(c)) {
            return new BCRSAPrivateCrtKey(zi);
        }
        throw new IOException("algorithm identifier " + c + " in key not recognised");
    }
    
    @Override
    public PublicKey a(final zo zo) {
        final l c = zo.c().c();
        if (org.spongycastle.jcajce.provider.asymmetric.rsa.a.a(c)) {
            return new BCRSAPublicKey(zo);
        }
        throw new IOException("algorithm identifier " + c + " in key not recognised");
    }
    
    @Override
    protected PrivateKey engineGeneratePrivate(final KeySpec keySpec) {
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                return this.a(zi.a(((PKCS8EncodedKeySpec)keySpec).getEncoded()));
            }
            catch (Exception ex) {
                try {
                    return new BCRSAPrivateCrtKey(zj.a(((PKCS8EncodedKeySpec)keySpec).getEncoded()));
                }
                catch (Exception ex2) {
                    throw new ExtendedInvalidKeySpecException("unable to process key spec: " + ex.toString(), ex);
                }
            }
        }
        if (keySpec instanceof RSAPrivateCrtKeySpec) {
            return new BCRSAPrivateCrtKey((RSAPrivateCrtKeySpec)keySpec);
        }
        if (keySpec instanceof RSAPrivateKeySpec) {
            return new BCRSAPrivateKey((RSAPrivateKeySpec)keySpec);
        }
        throw new InvalidKeySpecException("Unknown KeySpec type: " + keySpec.getClass().getName());
    }
    
    @Override
    protected PublicKey engineGeneratePublic(final KeySpec keySpec) {
        if (keySpec instanceof RSAPublicKeySpec) {
            return new BCRSAPublicKey((RSAPublicKeySpec)keySpec);
        }
        return super.engineGeneratePublic(keySpec);
    }
    
    @Override
    protected KeySpec engineGetKeySpec(final Key key, final Class clazz) {
        if (clazz.isAssignableFrom(RSAPublicKeySpec.class) && key instanceof RSAPublicKey) {
            final RSAPublicKey rsaPublicKey = (RSAPublicKey)key;
            return new RSAPublicKeySpec(rsaPublicKey.getModulus(), rsaPublicKey.getPublicExponent());
        }
        if (clazz.isAssignableFrom(RSAPrivateKeySpec.class) && key instanceof RSAPrivateKey) {
            final RSAPrivateKey rsaPrivateKey = (RSAPrivateKey)key;
            return new RSAPrivateKeySpec(rsaPrivateKey.getModulus(), rsaPrivateKey.getPrivateExponent());
        }
        if (clazz.isAssignableFrom(RSAPrivateCrtKeySpec.class) && key instanceof RSAPrivateCrtKey) {
            final RSAPrivateCrtKey rsaPrivateCrtKey = (RSAPrivateCrtKey)key;
            return new RSAPrivateCrtKeySpec(rsaPrivateCrtKey.getModulus(), rsaPrivateCrtKey.getPublicExponent(), rsaPrivateCrtKey.getPrivateExponent(), rsaPrivateCrtKey.getPrimeP(), rsaPrivateCrtKey.getPrimeQ(), rsaPrivateCrtKey.getPrimeExponentP(), rsaPrivateCrtKey.getPrimeExponentQ(), rsaPrivateCrtKey.getCrtCoefficient());
        }
        return super.engineGetKeySpec(key, clazz);
    }
    
    @Override
    protected Key engineTranslateKey(final Key key) {
        if (key instanceof RSAPublicKey) {
            return new BCRSAPublicKey((RSAPublicKey)key);
        }
        if (key instanceof RSAPrivateCrtKey) {
            return new BCRSAPrivateCrtKey((RSAPrivateCrtKey)key);
        }
        if (key instanceof RSAPrivateKey) {
            return new BCRSAPrivateKey((RSAPrivateKey)key);
        }
        throw new InvalidKeyException("key type unknown");
    }
}
