// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.jcajce.provider.symmetric.util;

import java.security.SecureRandom;
import java.security.AlgorithmParameterGeneratorSpi;

public abstract class BaseAlgorithmParameterGenerator extends AlgorithmParameterGeneratorSpi
{
    protected SecureRandom random;
    protected int strength;
    
    public BaseAlgorithmParameterGenerator() {
        this.strength = 1024;
    }
    
    @Override
    protected void engineInit(final int strength, final SecureRandom random) {
        this.strength = strength;
        this.random = random;
    }
}
