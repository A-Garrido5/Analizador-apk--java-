// 
// Decompiled by Procyon v0.5.30
// 

package org.aspectj.runtime.reflect;

import org.aspectj.lang.reflect.UnlockSignature;

class UnlockSignatureImpl extends SignatureImpl implements UnlockSignature
{
    private Class parameterType;
    
    UnlockSignatureImpl(final Class parameterType) {
        super(8, "unlock", parameterType);
        this.parameterType = parameterType;
    }
    
    UnlockSignatureImpl(final String s) {
        super(s);
    }
    
    @Override
    protected String createToString(final StringMaker stringMaker) {
        if (this.parameterType == null) {
            this.parameterType = this.extractType(3);
        }
        return new StringBuffer().append("unlock(").append(stringMaker.makeTypeName(this.parameterType)).append(")").toString();
    }
    
    public Class getParameterType() {
        if (this.parameterType == null) {
            this.parameterType = this.extractType(3);
        }
        return this.parameterType;
    }
}
