// 
// Decompiled by Procyon v0.5.30
// 

package org.aspectj.internal.lang.reflect;

import org.aspectj.lang.reflect.SignaturePattern;

public class SignaturePatternImpl implements SignaturePattern
{
    private String sigPattern;
    
    public SignaturePatternImpl(final String sigPattern) {
        this.sigPattern = sigPattern;
    }
    
    @Override
    public String asString() {
        return this.sigPattern;
    }
    
    @Override
    public String toString() {
        return this.asString();
    }
}
