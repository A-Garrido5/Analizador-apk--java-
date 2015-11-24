// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems.curve25519;

public class OpportunisticCurve25519Provider implements at
{
    private at a;
    
    OpportunisticCurve25519Provider() {
        try {
            this.a = new NativeCurve25519Provider();
        }
        catch (ai ai) {
            this.a = new JavaCurve25519Provider();
        }
    }
    
    @Override
    public void a(final e e) {
        this.a.a(e);
    }
    
    @Override
    public byte[] a() {
        return this.a.a();
    }
    
    @Override
    public byte[] a(final int n) {
        return this.a.a(n);
    }
    
    @Override
    public boolean b() {
        return this.a.b();
    }
    
    @Override
    public byte[] calculateAgreement(final byte[] array, final byte[] array2) {
        return this.a.calculateAgreement(array, array2);
    }
    
    @Override
    public byte[] calculateSignature(final byte[] array, final byte[] array2, final byte[] array3) {
        return this.a.calculateSignature(array, array2, array3);
    }
    
    @Override
    public byte[] generatePrivateKey(final byte[] array) {
        return this.a.generatePrivateKey(array);
    }
    
    @Override
    public byte[] generatePublicKey(final byte[] array) {
        return this.a.generatePublicKey(array);
    }
    
    @Override
    public boolean verifySignature(final byte[] array, final byte[] array2, final byte[] array3) {
        return this.a.verifySignature(array, array2, array3);
    }
}
