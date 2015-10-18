// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.jcajce.provider.asymmetric.rsa;

import java.security.interfaces.RSAPublicKey;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPrivateKey;
import org.spongycastle.asn1.l;

public class a
{
    public static final l[] a;
    
    static {
        a = new l[] { zh.b, zp.l, zh.h, zh.k };
    }
    
    static aaa a(final RSAPrivateKey rsaPrivateKey) {
        if (rsaPrivateKey instanceof RSAPrivateCrtKey) {
            final RSAPrivateCrtKey rsaPrivateCrtKey = (RSAPrivateCrtKey)rsaPrivateKey;
            return new aab(rsaPrivateCrtKey.getModulus(), rsaPrivateCrtKey.getPublicExponent(), rsaPrivateCrtKey.getPrivateExponent(), rsaPrivateCrtKey.getPrimeP(), rsaPrivateCrtKey.getPrimeQ(), rsaPrivateCrtKey.getPrimeExponentP(), rsaPrivateCrtKey.getPrimeExponentQ(), rsaPrivateCrtKey.getCrtCoefficient());
        }
        return new aaa(true, rsaPrivateKey.getModulus(), rsaPrivateKey.getPrivateExponent());
    }
    
    static aaa a(final RSAPublicKey rsaPublicKey) {
        return new aaa(false, rsaPublicKey.getModulus(), rsaPublicKey.getPublicExponent());
    }
    
    public static boolean a(final l l) {
        int n = 0;
        boolean b;
        while (true) {
            final int length = org.spongycastle.jcajce.provider.asymmetric.rsa.a.a.length;
            b = false;
            if (n == length) {
                break;
            }
            if (l.equals(org.spongycastle.jcajce.provider.asymmetric.rsa.a.a[n])) {
                b = true;
                break;
            }
            ++n;
        }
        return b;
    }
}
