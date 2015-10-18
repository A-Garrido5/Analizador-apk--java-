// 
// Decompiled by Procyon v0.5.30
// 

package org.aspectj.runtime.reflect;

import org.aspectj.lang.reflect.LockSignature;

class LockSignatureImpl extends SignatureImpl implements LockSignature
{
    private Class parameterType;
    
    LockSignatureImpl(final Class parameterType) {
        super(8, "lock", parameterType);
        this.parameterType = parameterType;
    }
    
    LockSignatureImpl(final String s) {
        super(s);
    }
    
    @Override
    protected String createToString(final StringMaker stringMaker) {
        if (this.parameterType == null) {
            this.parameterType = this.extractType(3);
        }
        return new StringBuffer().append("lock(").append(stringMaker.makeTypeName(this.parameterType)).append(")").toString();
    }
    
    public Class getParameterType() {
        if (this.parameterType == null) {
            this.parameterType = this.extractType(3);
        }
        return this.parameterType;
    }
}
