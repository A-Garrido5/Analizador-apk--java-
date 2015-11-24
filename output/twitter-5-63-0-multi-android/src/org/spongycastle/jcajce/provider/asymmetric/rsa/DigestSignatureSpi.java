// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.jcajce.provider.asymmetric.rsa;

import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.interfaces.RSAPublicKey;
import java.security.PublicKey;
import org.spongycastle.crypto.c;
import java.security.InvalidKeyException;
import java.security.interfaces.RSAPrivateKey;
import java.security.PrivateKey;
import java.security.AlgorithmParameters;
import org.spongycastle.asn1.ay;
import org.spongycastle.asn1.l;
import org.spongycastle.crypto.a;
import org.spongycastle.crypto.d;
import java.security.SignatureSpi;

public class DigestSignatureSpi extends SignatureSpi
{
    private d a;
    private a b;
    private zm c;
    
    protected DigestSignatureSpi(final l l, final d a, final a b) {
        this.a = a;
        this.b = b;
        this.c = new zm(l, ay.a);
    }
    
    private String a(final Object o) {
        if (o == null) {
            return null;
        }
        return o.getClass().getName();
    }
    
    private byte[] a(final byte[] array) {
        if (this.c == null) {
            return array;
        }
        return new zn(this.c, array).a("DER");
    }
    
    @Override
    protected Object engineGetParameter(final String s) {
        return null;
    }
    
    @Override
    protected AlgorithmParameters engineGetParameters() {
        return null;
    }
    
    @Override
    protected void engineInitSign(final PrivateKey privateKey) {
        if (!(privateKey instanceof RSAPrivateKey)) {
            throw new InvalidKeyException("Supplied key (" + this.a(privateKey) + ") is not a RSAPrivateKey instance");
        }
        final aaa a = org.spongycastle.jcajce.provider.asymmetric.rsa.a.a((RSAPrivateKey)privateKey);
        this.a.b();
        this.b.a(true, a);
    }
    
    @Override
    protected void engineInitVerify(final PublicKey publicKey) {
        if (!(publicKey instanceof RSAPublicKey)) {
            throw new InvalidKeyException("Supplied key (" + this.a(publicKey) + ") is not a RSAPublicKey instance");
        }
        final aaa a = org.spongycastle.jcajce.provider.asymmetric.rsa.a.a((RSAPublicKey)publicKey);
        this.a.b();
        this.b.a(false, a);
    }
    
    @Override
    protected void engineSetParameter(final String s, final Object o) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }
    
    @Override
    protected void engineSetParameter(final AlgorithmParameterSpec algorithmParameterSpec) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }
    
    @Override
    protected byte[] engineSign() {
        final byte[] array = new byte[this.a.a()];
        this.a.a(array, 0);
        try {
            final byte[] a = this.a(array);
            return this.b.a(a, 0, a.length);
        }
        catch (ArrayIndexOutOfBoundsException ex2) {
            throw new SignatureException("key too small for signature type");
        }
        catch (Exception ex) {
            throw new SignatureException(ex.toString());
        }
    }
    
    @Override
    protected void engineUpdate(final byte b) {
        this.a.a(b);
    }
    
    @Override
    protected void engineUpdate(final byte[] array, final int n, final int n2) {
        this.a.a(array, n, n2);
    }
    
    @Override
    protected boolean engineVerify(final byte[] array) {
        final byte[] array2 = new byte[this.a.a()];
        this.a.a(array2, 0);
        try {
            final byte[] a = this.b.a(array, 0, array.length);
            final byte[] a2 = this.a(array2);
            if (a.length == a2.length) {
                for (int i = 0; i < a.length; ++i) {
                    if (a[i] != a2[i]) {
                        return false;
                    }
                }
                return true;
            }
            if (a.length == -2 + a2.length) {
                final int n = -2 + (a.length - array2.length);
                final int n2 = -2 + (a2.length - array2.length);
                a2[1] -= 2;
                a2[3] -= 2;
                for (int j = 0; j < array2.length; ++j) {
                    if (a[n + j] != a2[n2 + j]) {
                        return false;
                    }
                }
                for (int k = 0; k < n; ++k) {
                    if (a[k] != a2[k]) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        catch (Exception ex) {
            return false;
        }
    }
}
