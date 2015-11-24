// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.crypto.params;

import java.security.SecureRandom;
import org.spongycastle.crypto.CipherParameters;

public class ParametersWithRandom implements CipherParameters
{
    private CipherParameters parameters;
    private SecureRandom random;
    
    public ParametersWithRandom(final CipherParameters cipherParameters) {
        this(cipherParameters, new SecureRandom());
    }
    
    public ParametersWithRandom(final CipherParameters parameters, final SecureRandom random) {
        this.random = random;
        this.parameters = parameters;
    }
    
    public CipherParameters getParameters() {
        return this.parameters;
    }
    
    public SecureRandom getRandom() {
        return this.random;
    }
}
