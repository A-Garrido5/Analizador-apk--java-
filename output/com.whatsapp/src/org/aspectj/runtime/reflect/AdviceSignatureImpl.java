// 
// Decompiled by Procyon v0.5.30
// 

package org.aspectj.runtime.reflect;

import java.util.StringTokenizer;
import java.lang.reflect.Method;
import org.aspectj.lang.reflect.AdviceSignature;

class AdviceSignatureImpl extends CodeSignatureImpl implements AdviceSignature
{
    private Method adviceMethod;
    Class returnType;
    
    AdviceSignatureImpl(final int n, final String s, final Class clazz, final Class[] array, final String[] array2, final Class[] array3, final Class returnType) {
        super(n, s, clazz, array, array2, array3);
        this.adviceMethod = null;
        this.returnType = returnType;
    }
    
    AdviceSignatureImpl(final String s) {
        super(s);
        this.adviceMethod = null;
    }
    
    private String toAdviceName(final String s) {
        if (s.indexOf(36) != -1) {
            final StringTokenizer stringTokenizer = new StringTokenizer(s, "$");
            while (stringTokenizer.hasMoreTokens()) {
                final String nextToken = stringTokenizer.nextToken();
                if (nextToken.startsWith("before") || nextToken.startsWith("after") || nextToken.startsWith("around")) {
                    return nextToken;
                }
            }
        }
        return s;
    }
    
    @Override
    protected String createToString(final StringMaker stringMaker) {
        final StringBuffer sb = new StringBuffer();
        if (stringMaker.includeArgs) {
            sb.append(stringMaker.makeTypeName(this.getReturnType()));
        }
        if (stringMaker.includeArgs) {
            sb.append(" ");
        }
        sb.append(stringMaker.makePrimaryTypeName(this.getDeclaringType(), this.getDeclaringTypeName()));
        sb.append(".");
        sb.append(this.toAdviceName(this.getName()));
        stringMaker.addSignature(sb, this.getParameterTypes());
        stringMaker.addThrows(sb, this.getExceptionTypes());
        return sb.toString();
    }
    
    @Override
    public Method getAdvice() {
        Label_0026: {
            if (this.adviceMethod != null) {
                break Label_0026;
            }
            try {
                this.adviceMethod = this.getDeclaringType().getDeclaredMethod(this.getName(), (Class[])this.getParameterTypes());
                return this.adviceMethod;
            }
            catch (Exception ex) {
                return this.adviceMethod;
            }
        }
    }
    
    @Override
    public Class getReturnType() {
        if (this.returnType == null) {
            this.returnType = this.extractType(6);
        }
        return this.returnType;
    }
}
