// 
// Decompiled by Procyon v0.5.30
// 

package org.aspectj.runtime.reflect;

import java.lang.reflect.Constructor;
import org.aspectj.lang.reflect.ConstructorSignature;

class ConstructorSignatureImpl extends CodeSignatureImpl implements ConstructorSignature
{
    private Constructor constructor;
    
    ConstructorSignatureImpl(final int n, final Class clazz, final Class[] array, final String[] array2, final Class[] array3) {
        super(n, "<init>", clazz, array, array2, array3);
    }
    
    ConstructorSignatureImpl(final String s) {
        super(s);
    }
    
    @Override
    protected String createToString(final StringMaker stringMaker) {
        final StringBuffer sb = new StringBuffer();
        sb.append(stringMaker.makeModifiersString(this.getModifiers()));
        sb.append(stringMaker.makePrimaryTypeName(this.getDeclaringType(), this.getDeclaringTypeName()));
        stringMaker.addSignature(sb, this.getParameterTypes());
        stringMaker.addThrows(sb, this.getExceptionTypes());
        return sb.toString();
    }
    
    @Override
    public Constructor getConstructor() {
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
        return "<init>";
    }
}
