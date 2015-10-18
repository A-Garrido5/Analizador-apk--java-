// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.jce.provider;

import org.spongycastle.asn1.l;
import java.security.PrivilegedAction;
import java.security.AccessController;
import java.util.HashMap;
import java.util.Map;
import org.spongycastle.jcajce.provider.config.b;
import org.spongycastle.jcajce.provider.config.a;
import java.security.Provider;

public final class BouncyCastleProvider extends Provider implements a
{
    public static String a;
    public static final b b;
    private static String c;
    private static final Map d;
    private static final String[] e;
    private static final String[] f;
    private static final String[] g;
    private static final String[] h;
    
    static {
        BouncyCastleProvider.c = "BouncyCastle Security Provider v1.47";
        BouncyCastleProvider.a = "SC";
        b = new org.spongycastle.jce.provider.b();
        d = new HashMap();
        e = new String[] { "AES", "ARC4", "Blowfish", "Camellia", "CAST5", "CAST6", "DES", "DESede", "GOST28147", "Grainv1", "Grain128", "HC128", "HC256", "IDEA", "Noekeon", "RC2", "RC5", "RC6", "Rijndael", "Salsa20", "SEED", "Serpent", "Skipjack", "TEA", "Twofish", "VMPC", "VMPCKSA3", "XTEA" };
        f = new String[] { "X509" };
        g = new String[] { "DSA", "DH", "EC", "RSA", "GOST", "ECGOST", "ElGamal" };
        h = new String[] { "GOST3411", "MD2", "MD4", "MD5", "SHA1", "RIPEMD128", "RIPEMD160", "RIPEMD256", "RIPEMD320", "SHA224", "SHA256", "SHA384", "SHA512", "Tiger", "Whirlpool" };
    }
    
    public BouncyCastleProvider() {
        super(BouncyCastleProvider.a, 1.47, BouncyCastleProvider.c);
        AccessController.doPrivileged((PrivilegedAction<Object>)new org.spongycastle.jce.provider.a(this));
    }
    
    private void a() {
        this.a("org.spongycastle.jcajce.provider.digest.", BouncyCastleProvider.h);
        this.a("org.spongycastle.jcajce.provider.symmetric.", BouncyCastleProvider.e);
        this.a("org.spongycastle.jcajce.provider.asymmetric.", BouncyCastleProvider.f);
        this.a("org.spongycastle.jcajce.provider.asymmetric.", BouncyCastleProvider.g);
        this.put("X509Store.CERTIFICATE/COLLECTION", "org.spongycastle.jce.provider.X509StoreCertCollection");
        this.put("X509Store.ATTRIBUTECERTIFICATE/COLLECTION", "org.spongycastle.jce.provider.X509StoreAttrCertCollection");
        this.put("X509Store.CRL/COLLECTION", "org.spongycastle.jce.provider.X509StoreCRLCollection");
        this.put("X509Store.CERTIFICATEPAIR/COLLECTION", "org.spongycastle.jce.provider.X509StoreCertPairCollection");
        this.put("X509Store.CERTIFICATE/LDAP", "org.spongycastle.jce.provider.X509StoreLDAPCerts");
        this.put("X509Store.CRL/LDAP", "org.spongycastle.jce.provider.X509StoreLDAPCRLs");
        this.put("X509Store.ATTRIBUTECERTIFICATE/LDAP", "org.spongycastle.jce.provider.X509StoreLDAPAttrCerts");
        this.put("X509Store.CERTIFICATEPAIR/LDAP", "org.spongycastle.jce.provider.X509StoreLDAPCertPairs");
        this.put("X509StreamParser.CERTIFICATE", "org.spongycastle.jce.provider.X509CertParser");
        this.put("X509StreamParser.ATTRIBUTECERTIFICATE", "org.spongycastle.jce.provider.X509AttrCertParser");
        this.put("X509StreamParser.CRL", "org.spongycastle.jce.provider.X509CRLParser");
        this.put("X509StreamParser.CERTIFICATEPAIR", "org.spongycastle.jce.provider.X509CertPairParser");
        this.put("KeyStore.BKS", "org.spongycastle.jce.provider.JDKKeyStore");
        this.put("KeyStore.BouncyCastle", "org.spongycastle.jce.provider.JDKKeyStore$BouncyCastleStore");
        this.put("KeyStore.PKCS12", "org.spongycastle.jce.provider.JDKPKCS12KeyStore$BCPKCS12KeyStore");
        this.put("KeyStore.BCPKCS12", "org.spongycastle.jce.provider.JDKPKCS12KeyStore$BCPKCS12KeyStore");
        this.put("KeyStore.PKCS12-DEF", "org.spongycastle.jce.provider.JDKPKCS12KeyStore$DefPKCS12KeyStore");
        this.put("KeyStore.PKCS12-3DES-40RC2", "org.spongycastle.jce.provider.JDKPKCS12KeyStore$BCPKCS12KeyStore");
        this.put("KeyStore.PKCS12-3DES-3DES", "org.spongycastle.jce.provider.JDKPKCS12KeyStore$BCPKCS12KeyStore3DES");
        this.put("KeyStore.PKCS12-DEF-3DES-40RC2", "org.spongycastle.jce.provider.JDKPKCS12KeyStore$DefPKCS12KeyStore");
        this.put("KeyStore.PKCS12-DEF-3DES-3DES", "org.spongycastle.jce.provider.JDKPKCS12KeyStore$DefPKCS12KeyStore3DES");
        this.put("Alg.Alias.KeyStore.UBER", "BouncyCastle");
        this.put("Alg.Alias.KeyStore.BOUNCYCASTLE", "BouncyCastle");
        this.put("Alg.Alias.KeyStore.spongycastle", "BouncyCastle");
        this.put("AlgorithmParameters.IES", "org.spongycastle.jce.provider.JDKAlgorithmParameters$IES");
        this.put("AlgorithmParameters.PKCS12PBE", "org.spongycastle.jce.provider.JDKAlgorithmParameters$PKCS12PBE");
        this.put("AlgorithmParameters." + zh.z, "org.spongycastle.jce.provider.JDKAlgorithmParameters$PBKDF2");
        this.put("Alg.Alias.AlgorithmParameters.PBEWITHSHA1ANDRC2", "PKCS12PBE");
        this.put("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND3-KEYTRIPLEDES", "PKCS12PBE");
        this.put("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND2-KEYTRIPLEDES", "PKCS12PBE");
        this.put("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDRC2", "PKCS12PBE");
        this.put("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDRC4", "PKCS12PBE");
        this.put("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDTWOFISH", "PKCS12PBE");
        this.put("Alg.Alias.AlgorithmParameters.PBEWITHSHA1ANDRC2-CBC", "PKCS12PBE");
        this.put("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND3-KEYTRIPLEDES-CBC", "PKCS12PBE");
        this.put("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND2-KEYTRIPLEDES-CBC", "PKCS12PBE");
        this.put("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDDES3KEY-CBC", "PKCS12PBE");
        this.put("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDDES2KEY-CBC", "PKCS12PBE");
        this.put("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND40BITRC2-CBC", "PKCS12PBE");
        this.put("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND40BITRC4", "PKCS12PBE");
        this.put("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND128BITRC2-CBC", "PKCS12PBE");
        this.put("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND128BITRC4", "PKCS12PBE");
        this.put("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDTWOFISH", "PKCS12PBE");
        this.put("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDTWOFISH-CBC", "PKCS12PBE");
        this.put("Alg.Alias.AlgorithmParameters.1.2.840.113549.1.12.1.1", "PKCS12PBE");
        this.put("Alg.Alias.AlgorithmParameters.1.2.840.113549.1.12.1.2", "PKCS12PBE");
        this.put("Alg.Alias.AlgorithmParameters.1.2.840.113549.1.12.1.3", "PKCS12PBE");
        this.put("Alg.Alias.AlgorithmParameters.1.2.840.113549.1.12.1.4", "PKCS12PBE");
        this.put("Alg.Alias.AlgorithmParameters.1.2.840.113549.1.12.1.5", "PKCS12PBE");
        this.put("Alg.Alias.AlgorithmParameters.1.2.840.113549.1.12.1.6", "PKCS12PBE");
        this.put("Alg.Alias.AlgorithmParameters.PBEWithSHAAnd3KeyTripleDES", "PKCS12PBE");
        this.put("Alg.Alias.AlgorithmParameters." + ze.l.c(), "PKCS12PBE");
        this.put("Alg.Alias.AlgorithmParameters." + ze.m.c(), "PKCS12PBE");
        this.put("Alg.Alias.AlgorithmParameters." + ze.n.c(), "PKCS12PBE");
        this.put("Alg.Alias.AlgorithmParameters." + ze.o.c(), "PKCS12PBE");
        this.put("Alg.Alias.AlgorithmParameters." + ze.p.c(), "PKCS12PBE");
        this.put("Alg.Alias.AlgorithmParameters." + ze.q.c(), "PKCS12PBE");
        this.put("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND128BITAES-CBC-BC", "PKCS12PBE");
        this.put("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND192BITAES-CBC-BC", "PKCS12PBE");
        this.put("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND256BITAES-CBC-BC", "PKCS12PBE");
        this.put("Alg.Alias.AlgorithmParameters.PBEWITHSHA256AND128BITAES-CBC-BC", "PKCS12PBE");
        this.put("Alg.Alias.AlgorithmParameters.PBEWITHSHA256AND192BITAES-CBC-BC", "PKCS12PBE");
        this.put("Alg.Alias.AlgorithmParameters.PBEWITHSHA256AND256BITAES-CBC-BC", "PKCS12PBE");
        this.put("Alg.Alias.AlgorithmParameters.PBEWITHSHA1AND128BITAES-CBC-BC", "PKCS12PBE");
        this.put("Alg.Alias.AlgorithmParameters.PBEWITHSHA1AND192BITAES-CBC-BC", "PKCS12PBE");
        this.put("Alg.Alias.AlgorithmParameters.PBEWITHSHA1AND256BITAES-CBC-BC", "PKCS12PBE");
        this.put("Alg.Alias.AlgorithmParameters.PBEWITHSHA-1AND128BITAES-CBC-BC", "PKCS12PBE");
        this.put("Alg.Alias.AlgorithmParameters.PBEWITHSHA-1AND192BITAES-CBC-BC", "PKCS12PBE");
        this.put("Alg.Alias.AlgorithmParameters.PBEWITHSHA-1AND256BITAES-CBC-BC", "PKCS12PBE");
        this.put("Alg.Alias.AlgorithmParameters.PBEWITHSHA-256AND128BITAES-CBC-BC", "PKCS12PBE");
        this.put("Alg.Alias.AlgorithmParameters.PBEWITHSHA-256AND192BITAES-CBC-BC", "PKCS12PBE");
        this.put("Alg.Alias.AlgorithmParameters.PBEWITHSHA-256AND256BITAES-CBC-BC", "PKCS12PBE");
        this.put("AlgorithmParameters.SHA1WITHECDSA", "org.spongycastle.jce.provider.JDKECDSAAlgParameters$SigAlgParameters");
        this.put("AlgorithmParameters.SHA224WITHECDSA", "org.spongycastle.jce.provider.JDKECDSAAlgParameters$SigAlgParameters");
        this.put("AlgorithmParameters.SHA256WITHECDSA", "org.spongycastle.jce.provider.JDKECDSAAlgParameters$SigAlgParameters");
        this.put("AlgorithmParameters.SHA384WITHECDSA", "org.spongycastle.jce.provider.JDKECDSAAlgParameters$SigAlgParameters");
        this.put("AlgorithmParameters.SHA512WITHECDSA", "org.spongycastle.jce.provider.JDKECDSAAlgParameters$SigAlgParameters");
        this.put("Alg.Alias.Cipher.PBEWithSHAAnd3KeyTripleDES", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
        this.put("Cipher.ECIES", "org.spongycastle.jce.provider.JCEIESCipher$ECIES");
        this.put("Cipher.BrokenECIES", "org.spongycastle.jce.provider.JCEIESCipher$BrokenECIES");
        this.put("Cipher.IES", "org.spongycastle.jce.provider.JCEIESCipher$IES");
        this.put("Cipher.BrokenIES", "org.spongycastle.jce.provider.JCEIESCipher$BrokenIES");
        this.put("Cipher.PBEWITHMD5ANDDES", "org.spongycastle.jce.provider.JCEBlockCipher$PBEWithMD5AndDES");
        this.put("Cipher.BROKENPBEWITHMD5ANDDES", "org.spongycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithMD5AndDES");
        this.put("Cipher.PBEWITHMD5ANDRC2", "org.spongycastle.jce.provider.JCEBlockCipher$PBEWithMD5AndRC2");
        this.put("Cipher.PBEWITHSHA1ANDDES", "org.spongycastle.jce.provider.JCEBlockCipher$PBEWithSHA1AndDES");
        this.put("Cipher.BROKENPBEWITHSHA1ANDDES", "org.spongycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithSHA1AndDES");
        this.put("Cipher.PBEWITHSHA1ANDRC2", "org.spongycastle.jce.provider.JCEBlockCipher$PBEWithSHA1AndRC2");
        this.put("Cipher.PBEWITHSHAAND128BITRC2-CBC", "org.spongycastle.jce.provider.JCEBlockCipher$PBEWithSHAAnd128BitRC2");
        this.put("Cipher.PBEWITHSHAAND40BITRC2-CBC", "org.spongycastle.jce.provider.JCEBlockCipher$PBEWithSHAAnd40BitRC2");
        this.put("Cipher.PBEWITHSHAAND128BITRC4", "org.spongycastle.jce.provider.JCEStreamCipher$PBEWithSHAAnd128BitRC4");
        this.put("Cipher.PBEWITHSHAAND40BITRC4", "org.spongycastle.jce.provider.JCEStreamCipher$PBEWithSHAAnd40BitRC4");
        this.put("Alg.Alias.Cipher.PBEWITHSHA1AND128BITRC2-CBC", "PBEWITHSHAAND128BITRC2-CBC");
        this.put("Alg.Alias.Cipher.PBEWITHSHA1AND40BITRC2-CBC", "PBEWITHSHAAND40BITRC2-CBC");
        this.put("Alg.Alias.Cipher.PBEWITHSHA1AND128BITRC4", "PBEWITHSHAAND128BITRC4");
        this.put("Alg.Alias.Cipher.PBEWITHSHA1AND40BITRC4", "PBEWITHSHAAND40BITRC4");
        this.put("Alg.Alias.Cipher." + ze.l.c(), "PBEWITHSHAAND128BITAES-CBC-BC");
        this.put("Alg.Alias.Cipher." + ze.m.c(), "PBEWITHSHAAND192BITAES-CBC-BC");
        this.put("Alg.Alias.Cipher." + ze.n.c(), "PBEWITHSHAAND256BITAES-CBC-BC");
        this.put("Alg.Alias.Cipher." + ze.o.c(), "PBEWITHSHA256AND128BITAES-CBC-BC");
        this.put("Alg.Alias.Cipher." + ze.p.c(), "PBEWITHSHA256AND192BITAES-CBC-BC");
        this.put("Alg.Alias.Cipher." + ze.q.c(), "PBEWITHSHA256AND256BITAES-CBC-BC");
        this.put("Cipher.PBEWITHSHAAND128BITAES-CBC-BC", "org.spongycastle.jce.provider.JCEBlockCipher$PBEWithAESCBC");
        this.put("Cipher.PBEWITHSHAAND192BITAES-CBC-BC", "org.spongycastle.jce.provider.JCEBlockCipher$PBEWithAESCBC");
        this.put("Cipher.PBEWITHSHAAND256BITAES-CBC-BC", "org.spongycastle.jce.provider.JCEBlockCipher$PBEWithAESCBC");
        this.put("Cipher.PBEWITHSHA256AND128BITAES-CBC-BC", "org.spongycastle.jce.provider.JCEBlockCipher$PBEWithAESCBC");
        this.put("Cipher.PBEWITHSHA256AND192BITAES-CBC-BC", "org.spongycastle.jce.provider.JCEBlockCipher$PBEWithAESCBC");
        this.put("Cipher.PBEWITHSHA256AND256BITAES-CBC-BC", "org.spongycastle.jce.provider.JCEBlockCipher$PBEWithAESCBC");
        this.put("Alg.Alias.Cipher.PBEWITHSHA1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
        this.put("Alg.Alias.Cipher.PBEWITHSHA1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
        this.put("Alg.Alias.Cipher.PBEWITHSHA1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
        this.put("Alg.Alias.Cipher.PBEWITHSHA-1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
        this.put("Alg.Alias.Cipher.PBEWITHSHA-1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
        this.put("Alg.Alias.Cipher.PBEWITHSHA-1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
        this.put("Alg.Alias.Cipher.PBEWITHSHA-256AND128BITAES-CBC-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
        this.put("Alg.Alias.Cipher.PBEWITHSHA-256AND192BITAES-CBC-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
        this.put("Alg.Alias.Cipher.PBEWITHSHA-256AND256BITAES-CBC-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
        this.put("Cipher.PBEWITHMD5AND128BITAES-CBC-OPENSSL", "org.spongycastle.jce.provider.JCEBlockCipher$PBEWithAESCBC");
        this.put("Cipher.PBEWITHMD5AND192BITAES-CBC-OPENSSL", "org.spongycastle.jce.provider.JCEBlockCipher$PBEWithAESCBC");
        this.put("Cipher.PBEWITHMD5AND256BITAES-CBC-OPENSSL", "org.spongycastle.jce.provider.JCEBlockCipher$PBEWithAESCBC");
        this.put("Cipher.PBEWITHSHAANDTWOFISH-CBC", "org.spongycastle.jce.provider.JCEBlockCipher$PBEWithSHAAndTwofish");
        this.put("Cipher.OLDPBEWITHSHAANDTWOFISH-CBC", "org.spongycastle.jce.provider.BrokenJCEBlockCipher$OldPBEWithSHAAndTwofish");
        this.put("Alg.Alias.Cipher." + zh.s, "PBEWITHMD2ANDDES");
        this.put("Alg.Alias.Cipher." + zh.t, "PBEWITHMD2ANDRC2");
        this.put("Alg.Alias.Cipher." + zh.u, "PBEWITHMD5ANDDES");
        this.put("Alg.Alias.Cipher." + zh.v, "PBEWITHMD5ANDDES");
        this.put("Alg.Alias.Cipher." + zh.w, "PBEWITHSHA1ANDDES");
        this.put("Alg.Alias.Cipher." + zh.x, "PBEWITHSHA1ANDRC2");
        this.put("Alg.Alias.Cipher.1.2.840.113549.1.12.1.1", "PBEWITHSHAAND128BITRC4");
        this.put("Alg.Alias.Cipher.1.2.840.113549.1.12.1.2", "PBEWITHSHAAND40BITRC4");
        this.put("Alg.Alias.Cipher.1.2.840.113549.1.12.1.5", "PBEWITHSHAAND128BITRC2-CBC");
        this.put("Alg.Alias.Cipher.1.2.840.113549.1.12.1.6", "PBEWITHSHAAND40BITRC2-CBC");
        this.put("SecretKeyFactory.PBEWITHMD2ANDDES", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithMD2AndDES");
        this.put("Alg.Alias.SecretKeyFactory." + zh.s, "PBEWITHMD2ANDDES");
        this.put("Alg.Alias.SecretKeyFactory." + zh.t, "PBEWITHMD2ANDRC2");
        this.put("Alg.Alias.SecretKeyFactory." + zh.u, "PBEWITHMD5ANDDES");
        this.put("Alg.Alias.SecretKeyFactory." + zh.v, "PBEWITHMD5ANDDES");
        this.put("Alg.Alias.SecretKeyFactory." + zh.w, "PBEWITHSHA1ANDDES");
        this.put("Alg.Alias.SecretKeyFactory." + zh.x, "PBEWITHSHA1ANDRC2");
        this.put("SecretKeyFactory.PBEWITHMD2ANDRC2", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithMD2AndRC2");
        this.put("SecretKeyFactory.PBEWITHMD5ANDDES", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithMD5AndDES");
        this.put("SecretKeyFactory.PBEWITHMD5ANDRC2", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithMD5AndRC2");
        this.put("SecretKeyFactory.PBEWITHSHA1ANDDES", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithSHA1AndDES");
        this.put("SecretKeyFactory.PBEWITHSHA1ANDRC2", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithSHA1AndRC2");
        this.put("SecretKeyFactory.PBEWITHSHAAND3-KEYTRIPLEDES-CBC", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithSHAAndDES3Key");
        this.put("SecretKeyFactory.PBEWITHSHAAND2-KEYTRIPLEDES-CBC", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithSHAAndDES2Key");
        this.put("SecretKeyFactory.PBEWITHSHAAND128BITRC4", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithSHAAnd128BitRC4");
        this.put("SecretKeyFactory.PBEWITHSHAAND40BITRC4", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithSHAAnd40BitRC4");
        this.put("SecretKeyFactory.PBEWITHSHAAND128BITRC2-CBC", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithSHAAnd128BitRC2");
        this.put("SecretKeyFactory.PBEWITHSHAAND40BITRC2-CBC", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithSHAAnd40BitRC2");
        this.put("SecretKeyFactory.PBEWITHSHAANDTWOFISH-CBC", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithSHAAndTwofish");
        this.put("SecretKeyFactory.PBEWITHHMACRIPEMD160", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithRIPEMD160");
        this.put("SecretKeyFactory.PBEWITHHMACSHA1", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithSHA");
        this.put("SecretKeyFactory.PBEWITHHMACTIGER", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithTiger");
        this.put("SecretKeyFactory.PBEWITHMD5AND128BITAES-CBC-OPENSSL", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithMD5And128BitAESCBCOpenSSL");
        this.put("SecretKeyFactory.PBEWITHMD5AND192BITAES-CBC-OPENSSL", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithMD5And192BitAESCBCOpenSSL");
        this.put("SecretKeyFactory.PBEWITHMD5AND256BITAES-CBC-OPENSSL", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithMD5And256BitAESCBCOpenSSL");
        this.put("Alg.Alias.SecretKeyFactory.PBE", "PBE/PKCS5");
        this.put("Alg.Alias.SecretKeyFactory.BROKENPBEWITHMD5ANDDES", "PBE/PKCS5");
        this.put("Alg.Alias.SecretKeyFactory.BROKENPBEWITHSHA1ANDDES", "PBE/PKCS5");
        this.put("Alg.Alias.SecretKeyFactory.OLDPBEWITHSHAAND3-KEYTRIPLEDES-CBC", "PBE/PKCS12");
        this.put("Alg.Alias.SecretKeyFactory.BROKENPBEWITHSHAAND3-KEYTRIPLEDES-CBC", "PBE/PKCS12");
        this.put("Alg.Alias.SecretKeyFactory.BROKENPBEWITHSHAAND2-KEYTRIPLEDES-CBC", "PBE/PKCS12");
        this.put("Alg.Alias.SecretKeyFactory.OLDPBEWITHSHAANDTWOFISH-CBC", "PBE/PKCS12");
        this.put("Alg.Alias.SecretKeyFactory.PBEWITHMD2ANDDES-CBC", "PBEWITHMD2ANDDES");
        this.put("Alg.Alias.SecretKeyFactory.PBEWITHMD2ANDRC2-CBC", "PBEWITHMD2ANDRC2");
        this.put("Alg.Alias.SecretKeyFactory.PBEWITHMD5ANDDES-CBC", "PBEWITHMD5ANDDES");
        this.put("Alg.Alias.SecretKeyFactory.PBEWITHMD5ANDRC2-CBC", "PBEWITHMD5ANDRC2");
        this.put("Alg.Alias.SecretKeyFactory.PBEWITHSHA1ANDDES-CBC", "PBEWITHSHA1ANDDES");
        this.put("Alg.Alias.SecretKeyFactory.PBEWITHSHA1ANDRC2-CBC", "PBEWITHSHA1ANDRC2");
        this.put("Alg.Alias.SecretKeyFactory." + zh.s, "PBEWITHMD2ANDDES");
        this.put("Alg.Alias.SecretKeyFactory." + zh.t, "PBEWITHMD2ANDRC2");
        this.put("Alg.Alias.SecretKeyFactory." + zh.u, "PBEWITHMD5ANDDES");
        this.put("Alg.Alias.SecretKeyFactory." + zh.v, "PBEWITHMD5ANDRC2");
        this.put("Alg.Alias.SecretKeyFactory." + zh.w, "PBEWITHSHA1ANDDES");
        this.put("Alg.Alias.SecretKeyFactory." + zh.x, "PBEWITHSHA1ANDRC2");
        this.put("Alg.Alias.SecretKeyFactory.1.2.840.113549.1.12.1.1", "PBEWITHSHAAND128BITRC4");
        this.put("Alg.Alias.SecretKeyFactory.1.2.840.113549.1.12.1.2", "PBEWITHSHAAND40BITRC4");
        this.put("Alg.Alias.SecretKeyFactory.1.2.840.113549.1.12.1.3", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
        this.put("Alg.Alias.SecretKeyFactory.1.2.840.113549.1.12.1.4", "PBEWITHSHAAND2-KEYTRIPLEDES-CBC");
        this.put("Alg.Alias.SecretKeyFactory.1.2.840.113549.1.12.1.5", "PBEWITHSHAAND128BITRC2-CBC");
        this.put("Alg.Alias.SecretKeyFactory.1.2.840.113549.1.12.1.6", "PBEWITHSHAAND40BITRC2-CBC");
        this.put("Alg.Alias.SecretKeyFactory.PBEWITHHMACSHA", "PBEWITHHMACSHA1");
        this.put("Alg.Alias.SecretKeyFactory.1.3.14.3.2.26", "PBEWITHHMACSHA1");
        this.put("Alg.Alias.SecretKeyFactory.PBEWithSHAAnd3KeyTripleDES", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
        this.put("SecretKeyFactory.PBEWITHSHAAND128BITAES-CBC-BC", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithSHAAnd128BitAESBC");
        this.put("SecretKeyFactory.PBEWITHSHAAND192BITAES-CBC-BC", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithSHAAnd192BitAESBC");
        this.put("SecretKeyFactory.PBEWITHSHAAND256BITAES-CBC-BC", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithSHAAnd256BitAESBC");
        this.put("SecretKeyFactory.PBEWITHSHA256AND128BITAES-CBC-BC", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithSHA256And128BitAESBC");
        this.put("SecretKeyFactory.PBEWITHSHA256AND192BITAES-CBC-BC", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithSHA256And192BitAESBC");
        this.put("SecretKeyFactory.PBEWITHSHA256AND256BITAES-CBC-BC", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithSHA256And256BitAESBC");
        this.put("Alg.Alias.SecretKeyFactory.PBEWITHSHA1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
        this.put("Alg.Alias.SecretKeyFactory.PBEWITHSHA1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
        this.put("Alg.Alias.SecretKeyFactory.PBEWITHSHA1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
        this.put("Alg.Alias.SecretKeyFactory.PBEWITHSHA-1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
        this.put("Alg.Alias.SecretKeyFactory.PBEWITHSHA-1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
        this.put("Alg.Alias.SecretKeyFactory.PBEWITHSHA-1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
        this.put("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND128BITAES-CBC-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
        this.put("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND192BITAES-CBC-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
        this.put("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND256BITAES-CBC-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
        this.put("Alg.Alias.SecretKeyFactory." + ze.l.c(), "PBEWITHSHAAND128BITAES-CBC-BC");
        this.put("Alg.Alias.SecretKeyFactory." + ze.m.c(), "PBEWITHSHAAND192BITAES-CBC-BC");
        this.put("Alg.Alias.SecretKeyFactory." + ze.n.c(), "PBEWITHSHAAND256BITAES-CBC-BC");
        this.put("Alg.Alias.SecretKeyFactory." + ze.o.c(), "PBEWITHSHA256AND128BITAES-CBC-BC");
        this.put("Alg.Alias.SecretKeyFactory." + ze.p.c(), "PBEWITHSHA256AND192BITAES-CBC-BC");
        this.put("Alg.Alias.SecretKeyFactory." + ze.q.c(), "PBEWITHSHA256AND256BITAES-CBC-BC");
        this.b();
        this.put("CertPathValidator.RFC3281", "org.spongycastle.jce.provider.PKIXAttrCertPathValidatorSpi");
        this.put("CertPathBuilder.RFC3281", "org.spongycastle.jce.provider.PKIXAttrCertPathBuilderSpi");
        this.put("CertPathValidator.RFC3280", "org.spongycastle.jce.provider.PKIXCertPathValidatorSpi");
        this.put("CertPathBuilder.RFC3280", "org.spongycastle.jce.provider.PKIXCertPathBuilderSpi");
        this.put("CertPathValidator.PKIX", "org.spongycastle.jce.provider.PKIXCertPathValidatorSpi");
        this.put("CertPathBuilder.PKIX", "org.spongycastle.jce.provider.PKIXCertPathBuilderSpi");
        this.put("CertStore.Collection", "org.spongycastle.jce.provider.CertStoreCollectionSpi");
        this.put("CertStore.LDAP", "org.spongycastle.jce.provider.X509LDAPCertStoreSpi");
        this.put("CertStore.Multi", "org.spongycastle.jce.provider.MultiCertStoreSpi");
        this.put("Alg.Alias.CertStore.X509LDAP", "LDAP");
    }
    
    private void a(final String s, final String[] array) {
        int n = 0;
    Label_0059_Outer:
        while (true) {
            if (n == array.length) {
                return;
            }
            while (true) {
                try {
                    final ClassLoader classLoader = this.getClass().getClassLoader();
                    Label_0082: {
                        if (classLoader == null) {
                            break Label_0082;
                        }
                        Class<?> clazz = classLoader.loadClass(s + array[n] + "$Mappings");
                        Label_0076: {
                            if (clazz == null) {
                                break Label_0076;
                            }
                            try {
                                ((aad)clazz.newInstance()).a(this);
                                ++n;
                                continue Label_0059_Outer;
                                clazz = Class.forName(s + array[n] + "$Mappings");
                                continue;
                            }
                            catch (Exception ex) {
                                ex.printStackTrace();
                                throw new InternalError("cannot create instance of " + s + array[n] + "$Mappings : " + ex);
                            }
                        }
                    }
                }
                catch (ClassNotFoundException ex2) {
                    final Class<?> clazz = null;
                    continue;
                }
                break;
            }
        }
    }
    
    private void b() {
        this.put("Mac.DESWITHISO9797", "org.spongycastle.jce.provider.JCEMac$DES9797Alg3");
        this.put("Alg.Alias.Mac.DESISO9797MAC", "DESWITHISO9797");
        this.put("Mac.ISO9797ALG3MAC", "org.spongycastle.jce.provider.JCEMac$DES9797Alg3");
        this.put("Alg.Alias.Mac.ISO9797ALG3", "ISO9797ALG3MAC");
        this.put("Mac.ISO9797ALG3WITHISO7816-4PADDING", "org.spongycastle.jce.provider.JCEMac$DES9797Alg3with7816d4");
        this.put("Alg.Alias.Mac.ISO9797ALG3MACWITHISO7816-4PADDING", "ISO9797ALG3WITHISO7816-4PADDING");
        this.put("Mac.OLDHMACSHA384", "org.spongycastle.jce.provider.JCEMac$OldSHA384");
        this.put("Mac.OLDHMACSHA512", "org.spongycastle.jce.provider.JCEMac$OldSHA512");
        this.put("Mac.PBEWITHHMACSHA", "org.spongycastle.jce.provider.JCEMac$PBEWithSHA");
        this.put("Mac.PBEWITHHMACSHA1", "org.spongycastle.jce.provider.JCEMac$PBEWithSHA");
        this.put("Mac.PBEWITHHMACRIPEMD160", "org.spongycastle.jce.provider.JCEMac$PBEWithRIPEMD160");
        this.put("Alg.Alias.Mac.1.3.14.3.2.26", "PBEWITHHMACSHA");
    }
    
    @Override
    public void a(final String s, final String s2) {
        if (this.containsKey(s)) {
            throw new IllegalStateException("duplicate provider key (" + s + ") found");
        }
        this.put(s, s2);
    }
    
    @Override
    public void a(final l l, final aaf aaf) {
        BouncyCastleProvider.d.put(l, aaf);
    }
    
    @Override
    public boolean b(final String s, final String s2) {
        return this.containsKey(s + "." + s2) || this.containsKey("Alg.Alias." + s + "." + s2);
    }
}
