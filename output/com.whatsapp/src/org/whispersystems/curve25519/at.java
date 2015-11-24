// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems.curve25519;

interface at
{
    void a(final e p0);
    
    byte[] a();
    
    byte[] a(final int p0);
    
    boolean b();
    
    byte[] calculateAgreement(final byte[] p0, final byte[] p1);
    
    byte[] calculateSignature(final byte[] p0, final byte[] p1, final byte[] p2);
    
    byte[] generatePrivateKey(final byte[] p0);
    
    byte[] generatePublicKey(final byte[] p0);
    
    boolean verifySignature(final byte[] p0, final byte[] p1, final byte[] p2);
}
