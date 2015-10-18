// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.jcajce.provider.asymmetric.rsa;

import org.spongycastle.jcajce.provider.asymmetric.util.b;
import org.spongycastle.asn1.d;
import org.spongycastle.asn1.ay;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.security.spec.RSAPrivateKeySpec;
import org.spongycastle.jcajce.provider.asymmetric.util.c;
import java.math.BigInteger;
import java.security.interfaces.RSAPrivateKey;

public class BCRSAPrivateKey implements RSAPrivateKey
{
    private static BigInteger a;
    static final long serialVersionUID = 5110188922551353628L;
    private transient c b;
    protected BigInteger modulus;
    protected BigInteger privateExponent;
    
    static {
        BCRSAPrivateKey.a = BigInteger.valueOf(0L);
    }
    
    protected BCRSAPrivateKey() {
        this.b = new c();
    }
    
    BCRSAPrivateKey(final aaa aaa) {
        this.b = new c();
        this.modulus = aaa.b();
        this.privateExponent = aaa.c();
    }
    
    BCRSAPrivateKey(final RSAPrivateKey rsaPrivateKey) {
        this.b = new c();
        this.modulus = rsaPrivateKey.getModulus();
        this.privateExponent = rsaPrivateKey.getPrivateExponent();
    }
    
    BCRSAPrivateKey(final RSAPrivateKeySpec rsaPrivateKeySpec) {
        this.b = new c();
        this.modulus = rsaPrivateKeySpec.getModulus();
        this.privateExponent = rsaPrivateKeySpec.getPrivateExponent();
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.b = new c();
    }
    
    private void writeObject(final ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (!(o instanceof RSAPrivateKey)) {
            b = false;
        }
        else if (o != this) {
            final RSAPrivateKey rsaPrivateKey = (RSAPrivateKey)o;
            if (!this.modulus.equals(rsaPrivateKey.getModulus()) || !this.privateExponent.equals(rsaPrivateKey.getPrivateExponent())) {
                return false;
            }
        }
        return b;
    }
    
    @Override
    public String getAlgorithm() {
        return "RSA";
    }
    
    @Override
    public byte[] getEncoded() {
        return org.spongycastle.jcajce.provider.asymmetric.util.b.b(new zm(zh.b, new ay()), new zj(this.modulus, BCRSAPrivateKey.a, this.privateExponent, BCRSAPrivateKey.a, BCRSAPrivateKey.a, BCRSAPrivateKey.a, BCRSAPrivateKey.a, BCRSAPrivateKey.a));
    }
    
    @Override
    public String getFormat() {
        return "PKCS#8";
    }
    
    @Override
    public BigInteger getModulus() {
        return this.modulus;
    }
    
    @Override
    public BigInteger getPrivateExponent() {
        return this.privateExponent;
    }
    
    @Override
    public int hashCode() {
        return this.modulus.hashCode() ^ this.privateExponent.hashCode();
    }
}
