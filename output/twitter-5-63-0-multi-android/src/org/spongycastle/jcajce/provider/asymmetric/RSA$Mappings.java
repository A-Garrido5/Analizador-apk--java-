// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.jcajce.provider.asymmetric;

import org.spongycastle.jcajce.provider.asymmetric.rsa.KeyFactorySpi;
import org.spongycastle.asn1.l;
import org.spongycastle.jcajce.provider.config.a;

public class RSA$Mappings extends aae
{
    private void a(final a a, final String s, final String s2, final l l) {
        final String string = s + "WITHRSA";
        final String string2 = s + "withRSA";
        final String string3 = s + "WithRSA";
        final String string4 = s + "/" + "RSA";
        final String string5 = s + "WITHRSAENCRYPTION";
        final String string6 = s + "withRSAEncryption";
        final String string7 = s + "WithRSAEncryption";
        a.a("Signature." + string, s2);
        a.a("Alg.Alias.Signature." + string2, string);
        a.a("Alg.Alias.Signature." + string3, string);
        a.a("Alg.Alias.Signature." + string5, string);
        a.a("Alg.Alias.Signature." + string6, string);
        a.a("Alg.Alias.Signature." + string7, string);
        a.a("Alg.Alias.Signature." + string4, string);
        if (l != null) {
            a.a("Alg.Alias.Signature." + l, string);
            a.a("Alg.Alias.Signature.OID." + l, string);
        }
    }
    
    @Override
    public void a(final a a) {
        a.a("AlgorithmParameters.OAEP", "org.spongycastle.jcajce.provider.asymmetric.rsa.AlgorithmParametersSpi$OAEP");
        a.a("AlgorithmParameters.PSS", "org.spongycastle.jcajce.provider.asymmetric.rsa.AlgorithmParametersSpi$PSS");
        a.a("Alg.Alias.AlgorithmParameters.RSAPSS", "PSS");
        a.a("Alg.Alias.AlgorithmParameters.RSASSA-PSS", "PSS");
        a.a("Alg.Alias.AlgorithmParameters.SHA224withRSA/PSS", "PSS");
        a.a("Alg.Alias.AlgorithmParameters.SHA256withRSA/PSS", "PSS");
        a.a("Alg.Alias.AlgorithmParameters.SHA384withRSA/PSS", "PSS");
        a.a("Alg.Alias.AlgorithmParameters.SHA512withRSA/PSS", "PSS");
        a.a("Alg.Alias.AlgorithmParameters.SHA224WITHRSAANDMGF1", "PSS");
        a.a("Alg.Alias.AlgorithmParameters.SHA256WITHRSAANDMGF1", "PSS");
        a.a("Alg.Alias.AlgorithmParameters.SHA384WITHRSAANDMGF1", "PSS");
        a.a("Alg.Alias.AlgorithmParameters.SHA512WITHRSAANDMGF1", "PSS");
        a.a("Alg.Alias.AlgorithmParameters.RAWRSAPSS", "PSS");
        a.a("Alg.Alias.AlgorithmParameters.NONEWITHRSAPSS", "PSS");
        a.a("Alg.Alias.AlgorithmParameters.NONEWITHRSASSA-PSS", "PSS");
        a.a("Alg.Alias.AlgorithmParameters.NONEWITHRSAANDMGF1", "PSS");
        a.a("Cipher.RSA", "org.spongycastle.jcajce.provider.asymmetric.rsa.CipherSpi$NoPadding");
        a.a("Cipher.RSA/RAW", "org.spongycastle.jcajce.provider.asymmetric.rsa.CipherSpi$NoPadding");
        a.a("Cipher.RSA/PKCS1", "org.spongycastle.jcajce.provider.asymmetric.rsa.CipherSpi$PKCS1v1_5Padding");
        a.a("Cipher.1.2.840.113549.1.1.1", "org.spongycastle.jcajce.provider.asymmetric.rsa.CipherSpi$PKCS1v1_5Padding");
        a.a("Cipher.2.5.8.1.1", "org.spongycastle.jcajce.provider.asymmetric.rsa.CipherSpi$PKCS1v1_5Padding");
        a.a("Cipher.RSA/1", "org.spongycastle.jcajce.provider.asymmetric.rsa.CipherSpi$PKCS1v1_5Padding_PrivateOnly");
        a.a("Cipher.RSA/2", "org.spongycastle.jcajce.provider.asymmetric.rsa.CipherSpi$PKCS1v1_5Padding_PublicOnly");
        a.a("Cipher.RSA/OAEP", "org.spongycastle.jcajce.provider.asymmetric.rsa.CipherSpi$OAEPPadding");
        a.a("Cipher." + zh.h, "org.spongycastle.jcajce.provider.asymmetric.rsa.CipherSpi$OAEPPadding");
        a.a("Cipher.RSA/ISO9796-1", "org.spongycastle.jcajce.provider.asymmetric.rsa.CipherSpi$ISO9796d1Padding");
        a.a("Alg.Alias.Cipher.RSA//RAW", "RSA");
        a.a("Alg.Alias.Cipher.RSA//NOPADDING", "RSA");
        a.a("Alg.Alias.Cipher.RSA//PKCS1PADDING", "RSA/PKCS1");
        a.a("Alg.Alias.Cipher.RSA//OAEPPADDING", "RSA/OAEP");
        a.a("Alg.Alias.Cipher.RSA//ISO9796-1PADDING", "RSA/ISO9796-1");
        a.a("KeyFactory.RSA", "org.spongycastle.jcajce.provider.asymmetric.rsa.KeyFactorySpi");
        a.a("KeyPairGenerator.RSA", "org.spongycastle.jcajce.provider.asymmetric.rsa.KeyPairGeneratorSpi");
        final KeyFactorySpi keyFactorySpi = new KeyFactorySpi();
        this.a(a, zh.b, "RSA", keyFactorySpi);
        this.a(a, zp.l, "RSA", keyFactorySpi);
        this.a(a, zh.h, "RSA", keyFactorySpi);
        this.a(a, zh.k, "RSA", keyFactorySpi);
        this.a(a, zh.b, "RSA");
        this.a(a, zp.l, "RSA");
        this.a(a, zh.h, "OAEP");
        this.a(a, zh.k, "PSS");
        a.a("Signature.RSASSA-PSS", "org.spongycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$PSSwithRSA");
        a.a("Signature." + zh.k, "org.spongycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$PSSwithRSA");
        a.a("Signature.OID." + zh.k, "org.spongycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$PSSwithRSA");
        a.a("Signature.SHA224withRSA/PSS", "org.spongycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA224withRSA");
        a.a("Signature.SHA256withRSA/PSS", "org.spongycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA256withRSA");
        a.a("Signature.SHA384withRSA/PSS", "org.spongycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA384withRSA");
        a.a("Signature.SHA512withRSA/PSS", "org.spongycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA512withRSA");
        a.a("Signature.RSA", "org.spongycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$noneRSA");
        a.a("Signature.RAWRSASSA-PSS", "org.spongycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$nonePSS");
        a.a("Alg.Alias.Signature.RAWRSA", "RSA");
        a.a("Alg.Alias.Signature.NONEWITHRSA", "RSA");
        a.a("Alg.Alias.Signature.RAWRSAPSS", "RAWRSASSA-PSS");
        a.a("Alg.Alias.Signature.NONEWITHRSAPSS", "RAWRSASSA-PSS");
        a.a("Alg.Alias.Signature.NONEWITHRSASSA-PSS", "RAWRSASSA-PSS");
        a.a("Alg.Alias.Signature.NONEWITHRSAANDMGF1", "RAWRSASSA-PSS");
        a.a("Alg.Alias.Signature.RSAPSS", "RSASSA-PSS");
        a.a("Alg.Alias.Signature.SHA224withRSAandMGF1", "SHA224withRSA/PSS");
        a.a("Alg.Alias.Signature.SHA256withRSAandMGF1", "SHA256withRSA/PSS");
        a.a("Alg.Alias.Signature.SHA384withRSAandMGF1", "SHA384withRSA/PSS");
        a.a("Alg.Alias.Signature.SHA512withRSAandMGF1", "SHA512withRSA/PSS");
        a.a("Alg.Alias.Signature.SHA224WITHRSAANDMGF1", "SHA224withRSA/PSS");
        a.a("Alg.Alias.Signature.SHA256WITHRSAANDMGF1", "SHA256withRSA/PSS");
        a.a("Alg.Alias.Signature.SHA384WITHRSAANDMGF1", "SHA384withRSA/PSS");
        a.a("Alg.Alias.Signature.SHA512WITHRSAANDMGF1", "SHA512withRSA/PSS");
        if (a.b("MessageDigest", "MD2")) {
            this.a(a, "MD2", "org.spongycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$MD2", zh.c);
        }
        if (a.b("MessageDigest", "MD2")) {
            this.a(a, "MD4", "org.spongycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$MD4", zh.d);
        }
        if (a.b("MessageDigest", "MD2")) {
            this.a(a, "MD5", "org.spongycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$MD5", zh.e);
            a.a("Signature.MD5withRSA/ISO9796-2", "org.spongycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$MD5WithRSAEncryption");
            a.a("Alg.Alias.Signature.MD5WithRSA/ISO9796-2", "MD5withRSA/ISO9796-2");
        }
        if (a.b("MessageDigest", "SHA1")) {
            a.a("Alg.Alias.AlgorithmParameters.SHA1withRSA/PSS", "PSS");
            a.a("Alg.Alias.AlgorithmParameters.SHA1WITHRSAANDMGF1", "PSS");
            a.a("Signature.SHA1withRSA/PSS", "org.spongycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA1withRSA");
            a.a("Alg.Alias.Signature.SHA1withRSAandMGF1", "SHA1withRSA/PSS");
            a.a("Alg.Alias.Signature.SHA1WITHRSAANDMGF1", "SHA1withRSA/PSS");
            this.a(a, "SHA1", "org.spongycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA1", zh.f);
            a.a("Alg.Alias.Signature.SHA1WithRSA/ISO9796-2", "SHA1withRSA/ISO9796-2");
            a.a("Signature.SHA1withRSA/ISO9796-2", "org.spongycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$SHA1WithRSAEncryption");
            a.a("Alg.Alias.Signature." + zg.k, "SHA1WITHRSA");
            a.a("Alg.Alias.Signature.OID." + zg.k, "SHA1WITHRSA");
        }
        this.a(a, "SHA224", "org.spongycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA224", zh.o);
        this.a(a, "SHA256", "org.spongycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA256", zh.l);
        this.a(a, "SHA384", "org.spongycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA384", zh.m);
        this.a(a, "SHA512", "org.spongycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA512", zh.n);
        if (a.b("MessageDigest", "RIPEMD128")) {
            this.a(a, "RIPEMD128", "org.spongycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD128", zl.g);
            this.a(a, "RMD128", "org.spongycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD128", null);
        }
        if (a.b("MessageDigest", "RIPEMD160")) {
            this.a(a, "RIPEMD160", "org.spongycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD160", zl.f);
            this.a(a, "RMD160", "org.spongycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD160", null);
            a.a("Alg.Alias.Signature.RIPEMD160WithRSA/ISO9796-2", "RIPEMD160withRSA/ISO9796-2");
            a.a("Signature.RIPEMD160withRSA/ISO9796-2", "org.spongycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$RIPEMD160WithRSAEncryption");
        }
        if (a.b("MessageDigest", "RIPEMD256")) {
            this.a(a, "RIPEMD256", "org.spongycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD256", zl.h);
            this.a(a, "RMD256", "org.spongycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD256", null);
        }
    }
}
