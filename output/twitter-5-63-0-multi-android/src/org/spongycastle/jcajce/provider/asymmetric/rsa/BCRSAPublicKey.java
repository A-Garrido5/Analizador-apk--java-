// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.jcajce.provider.asymmetric.rsa;

import org.spongycastle.jcajce.provider.asymmetric.util.b;
import org.spongycastle.asn1.d;
import org.spongycastle.asn1.ay;
import java.io.IOException;
import java.security.spec.RSAPublicKeySpec;
import java.math.BigInteger;
import java.security.interfaces.RSAPublicKey;

public class BCRSAPublicKey implements RSAPublicKey
{
    static final long serialVersionUID = 2675817738516720772L;
    private BigInteger modulus;
    private BigInteger publicExponent;
    
    BCRSAPublicKey(final aaa aaa) {
        this.modulus = aaa.b();
        this.publicExponent = aaa.c();
    }
    
    BCRSAPublicKey(final RSAPublicKey rsaPublicKey) {
        this.modulus = rsaPublicKey.getModulus();
        this.publicExponent = rsaPublicKey.getPublicExponent();
    }
    
    BCRSAPublicKey(final RSAPublicKeySpec rsaPublicKeySpec) {
        this.modulus = rsaPublicKeySpec.getModulus();
        this.publicExponent = rsaPublicKeySpec.getPublicExponent();
    }
    
    BCRSAPublicKey(final zo zo) {
        try {
            final zk a = zk.a(zo.d());
            this.modulus = a.c();
            this.publicExponent = a.d();
        }
        catch (IOException ex) {
            throw new IllegalArgumentException("invalid info structure in RSA public key");
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o != this) {
            if (!(o instanceof RSAPublicKey)) {
                return false;
            }
            final RSAPublicKey rsaPublicKey = (RSAPublicKey)o;
            if (!this.modulus.equals(rsaPublicKey.getModulus()) || !this.publicExponent.equals(rsaPublicKey.getPublicExponent())) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public String getAlgorithm() {
        return "RSA";
    }
    
    @Override
    public byte[] getEncoded() {
        return b.a(new zm(zh.b, new ay()), new zk(this.modulus, this.publicExponent));
    }
    
    @Override
    public String getFormat() {
        return "X.509";
    }
    
    @Override
    public BigInteger getModulus() {
        return this.modulus;
    }
    
    @Override
    public BigInteger getPublicExponent() {
        return this.publicExponent;
    }
    
    @Override
    public int hashCode() {
        return this.modulus.hashCode() ^ this.publicExponent.hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        final String property = System.getProperty("line.separator");
        sb.append("RSA Public Key").append(property);
        sb.append("            modulus: ").append(this.modulus.toString(16)).append(property);
        sb.append("    public exponent: ").append(this.publicExponent.toString(16)).append(property);
        return sb.toString();
    }
}
