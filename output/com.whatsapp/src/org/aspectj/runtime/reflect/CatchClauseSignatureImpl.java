// 
// Decompiled by Procyon v0.5.30
// 

package org.aspectj.runtime.reflect;

import org.aspectj.lang.reflect.CatchClauseSignature;

class CatchClauseSignatureImpl extends SignatureImpl implements CatchClauseSignature
{
    String parameterName;
    Class parameterType;
    
    CatchClauseSignatureImpl(final Class clazz, final Class parameterType, final String parameterName) {
        super(0, "catch", clazz);
        this.parameterType = parameterType;
        this.parameterName = parameterName;
    }
    
    CatchClauseSignatureImpl(final String s) {
        super(s);
    }
    
    @Override
    protected String createToString(final StringMaker stringMaker) {
        return new StringBuffer().append("catch(").append(stringMaker.makeTypeName(this.getParameterType())).append(")").toString();
    }
    
    @Override
    public String getParameterName() {
        if (this.parameterName == null) {
            this.parameterName = this.extractString(4);
        }
        return this.parameterName;
    }
    
    @Override
    public Class getParameterType() {
        if (this.parameterType == null) {
            this.parameterType = this.extractType(3);
        }
        return this.parameterType;
    }
}
