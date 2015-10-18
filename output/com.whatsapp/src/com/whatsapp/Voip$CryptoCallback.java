// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.math.BigInteger;

public interface Voip$CryptoCallback
{
    BigInteger generateDiffieHellmanSharedPublicKey(final byte[] p0);
    
    boolean generateDiffieHellmanSymmetricKey(final BigInteger p0, final byte[] p1, final byte[] p2);
    
    byte[] generateRandomBytes(final int p0);
}
