// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.crypto;

import java.security.SecureRandom;

public class CipherKeyGenerator
{
    protected SecureRandom random;
    protected int strength;
    
    public byte[] generateKey() {
        final byte[] array = new byte[this.strength];
        this.random.nextBytes(array);
        return array;
    }
    
    public void init(final KeyGenerationParameters keyGenerationParameters) {
        this.random = keyGenerationParameters.getRandom();
        this.strength = (7 + keyGenerationParameters.getStrength()) / 8;
    }
}
