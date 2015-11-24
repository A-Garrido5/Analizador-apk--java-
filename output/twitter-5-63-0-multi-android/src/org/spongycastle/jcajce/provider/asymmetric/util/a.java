// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.jcajce.provider.asymmetric.util;

import java.security.Key;
import java.security.spec.X509EncodedKeySpec;
import java.security.PublicKey;
import java.io.IOException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.PrivateKey;
import java.security.spec.KeySpec;
import java.security.KeyFactorySpi;

public abstract class a extends KeyFactorySpi implements aaf
{
    @Override
    protected PrivateKey engineGeneratePrivate(final KeySpec keySpec) {
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                return this.a(zi.a(((PKCS8EncodedKeySpec)keySpec).getEncoded()));
            }
            catch (IOException ex) {
                throw new InvalidKeySpecException("encoded key spec not recognised");
            }
        }
        throw new InvalidKeySpecException("key spec not recognised");
    }
    
    @Override
    protected PublicKey engineGeneratePublic(final KeySpec keySpec) {
        if (keySpec instanceof X509EncodedKeySpec) {
            try {
                return this.a(zo.a(((X509EncodedKeySpec)keySpec).getEncoded()));
            }
            catch (IOException ex) {
                throw new InvalidKeySpecException("encoded key spec not recognised");
            }
        }
        throw new InvalidKeySpecException("key spec not recognised");
    }
    
    @Override
    protected KeySpec engineGetKeySpec(final Key key, final Class clazz) {
        if (clazz.isAssignableFrom(PKCS8EncodedKeySpec.class) && key.getFormat().equals("PKCS#8")) {
            return new PKCS8EncodedKeySpec(key.getEncoded());
        }
        if (clazz.isAssignableFrom(X509EncodedKeySpec.class) && key.getFormat().equals("X.509")) {
            return new X509EncodedKeySpec(key.getEncoded());
        }
        throw new InvalidKeySpecException("not implemented yet " + key + " " + clazz);
    }
}
