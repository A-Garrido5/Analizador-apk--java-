// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.jcajce.provider.asymmetric.rsa;

import org.spongycastle.jcajce.provider.asymmetric.util.b;
import org.spongycastle.asn1.d;
import org.spongycastle.asn1.ay;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.math.BigInteger;
import java.security.interfaces.RSAPrivateCrtKey;

public class BCRSAPrivateCrtKey extends BCRSAPrivateKey implements RSAPrivateCrtKey
{
    static final long serialVersionUID = 7834723820638524718L;
    private BigInteger crtCoefficient;
    private BigInteger primeExponentP;
    private BigInteger primeExponentQ;
    private BigInteger primeP;
    private BigInteger primeQ;
    private BigInteger publicExponent;
    
    BCRSAPrivateCrtKey(final aab aab) {
        super(aab);
        this.publicExponent = aab.d();
        this.primeP = aab.e();
        this.primeQ = aab.f();
        this.primeExponentP = aab.g();
        this.primeExponentQ = aab.h();
        this.crtCoefficient = aab.i();
    }
    
    BCRSAPrivateCrtKey(final RSAPrivateCrtKey rsaPrivateCrtKey) {
        this.modulus = rsaPrivateCrtKey.getModulus();
        this.publicExponent = rsaPrivateCrtKey.getPublicExponent();
        this.privateExponent = rsaPrivateCrtKey.getPrivateExponent();
        this.primeP = rsaPrivateCrtKey.getPrimeP();
        this.primeQ = rsaPrivateCrtKey.getPrimeQ();
        this.primeExponentP = rsaPrivateCrtKey.getPrimeExponentP();
        this.primeExponentQ = rsaPrivateCrtKey.getPrimeExponentQ();
        this.crtCoefficient = rsaPrivateCrtKey.getCrtCoefficient();
    }
    
    BCRSAPrivateCrtKey(final RSAPrivateCrtKeySpec rsaPrivateCrtKeySpec) {
        this.modulus = rsaPrivateCrtKeySpec.getModulus();
        this.publicExponent = rsaPrivateCrtKeySpec.getPublicExponent();
        this.privateExponent = rsaPrivateCrtKeySpec.getPrivateExponent();
        this.primeP = rsaPrivateCrtKeySpec.getPrimeP();
        this.primeQ = rsaPrivateCrtKeySpec.getPrimeQ();
        this.primeExponentP = rsaPrivateCrtKeySpec.getPrimeExponentP();
        this.primeExponentQ = rsaPrivateCrtKeySpec.getPrimeExponentQ();
        this.crtCoefficient = rsaPrivateCrtKeySpec.getCrtCoefficient();
    }
    
    BCRSAPrivateCrtKey(final zi zi) {
        this(zj.a(zi.d()));
    }
    
    BCRSAPrivateCrtKey(final zj zj) {
        this.modulus = zj.c();
        this.publicExponent = zj.d();
        this.privateExponent = zj.e();
        this.primeP = zj.f();
        this.primeQ = zj.g();
        this.primeExponentP = zj.h();
        this.primeExponentQ = zj.i();
        this.crtCoefficient = zj.j();
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o != this) {
            if (!(o instanceof RSAPrivateCrtKey)) {
                return false;
            }
            final RSAPrivateCrtKey rsaPrivateCrtKey = (RSAPrivateCrtKey)o;
            if (!this.getModulus().equals(rsaPrivateCrtKey.getModulus()) || !this.publicExponent.equals(rsaPrivateCrtKey.getPublicExponent()) || !this.getPrivateExponent().equals(rsaPrivateCrtKey.getPrivateExponent()) || !this.primeP.equals(rsaPrivateCrtKey.getPrimeP()) || !this.primeQ.equals(rsaPrivateCrtKey.getPrimeQ()) || !this.primeExponentP.equals(rsaPrivateCrtKey.getPrimeExponentP()) || !this.primeExponentQ.equals(rsaPrivateCrtKey.getPrimeExponentQ()) || !this.crtCoefficient.equals(rsaPrivateCrtKey.getCrtCoefficient())) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public BigInteger getCrtCoefficient() {
        return this.crtCoefficient;
    }
    
    @Override
    public byte[] getEncoded() {
        return org.spongycastle.jcajce.provider.asymmetric.util.b.b(new zm(zh.b, new ay()), new zj(this.getModulus(), this.publicExponent, this.getPrivateExponent(), this.primeP, this.primeQ, this.primeExponentP, this.primeExponentQ, this.crtCoefficient));
    }
    
    @Override
    public String getFormat() {
        return "PKCS#8";
    }
    
    @Override
    public BigInteger getPrimeExponentP() {
        return this.primeExponentP;
    }
    
    @Override
    public BigInteger getPrimeExponentQ() {
        return this.primeExponentQ;
    }
    
    @Override
    public BigInteger getPrimeP() {
        return this.primeP;
    }
    
    @Override
    public BigInteger getPrimeQ() {
        return this.primeQ;
    }
    
    @Override
    public BigInteger getPublicExponent() {
        return this.publicExponent;
    }
    
    @Override
    public int hashCode() {
        return this.getModulus().hashCode() ^ this.publicExponent.hashCode() ^ this.getPrivateExponent().hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        final String property = System.getProperty("line.separator");
        sb.append("RSA Private CRT Key").append(property);
        sb.append("            modulus: ").append(this.getModulus().toString(16)).append(property);
        sb.append("    public exponent: ").append(this.publicExponent.toString(16)).append(property);
        sb.append("   private exponent: ").append(this.getPrivateExponent().toString(16)).append(property);
        sb.append("             primeP: ").append(this.primeP.toString(16)).append(property);
        sb.append("             primeQ: ").append(this.primeQ.toString(16)).append(property);
        sb.append("     primeExponentP: ").append(this.primeExponentP.toString(16)).append(property);
        sb.append("     primeExponentQ: ").append(this.primeExponentQ.toString(16)).append(property);
        sb.append("     crtCoefficient: ").append(this.crtCoefficient.toString(16)).append(property);
        return sb.toString();
    }
}
