// 
// Decompiled by Procyon v0.5.30
// 

package org.aspectj.runtime.reflect;

import java.lang.reflect.Modifier;
import java.lang.reflect.Constructor;
import org.aspectj.lang.reflect.InitializerSignature;

class InitializerSignatureImpl extends CodeSignatureImpl implements InitializerSignature
{
    private Constructor constructor;
    
    InitializerSignatureImpl(final int n, final Class clazz) {
        String s;
        if (Modifier.isStatic(n)) {
            s = "<clinit>";
        }
        else {
            s = "<init>";
        }
        super(n, s, clazz, SignatureImpl.EMPTY_CLASS_ARRAY, SignatureImpl.EMPTY_STRING_ARRAY, SignatureImpl.EMPTY_CLASS_ARRAY);
    }
    
    InitializerSignatureImpl(final String s) {
        super(s);
    }
    
    @Override
    protected String createToString(final StringMaker stringMaker) {
        final StringBuffer sb = new StringBuffer();
        sb.append(stringMaker.makeModifiersString(this.getModifiers()));
        sb.append(stringMaker.makePrimaryTypeName(this.getDeclaringType(), this.getDeclaringTypeName()));
        sb.append(".");
        sb.append(this.getName());
        return sb.toString();
    }
    
    @Override
    public Constructor getInitializer() {
        Label_0022: {
            if (this.constructor != null) {
                break Label_0022;
            }
            try {
                this.constructor = this.getDeclaringType().getDeclaredConstructor((Class[])this.getParameterTypes());
                return this.constructor;
            }
            catch (Exception ex) {
                return this.constructor;
            }
        }
    }
    
    @Override
    public String getName() {
        if (Modifier.isStatic(this.getModifiers())) {
            return "<clinit>";
        }
        return "<init>";
    }
}
