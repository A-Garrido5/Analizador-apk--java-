// 
// Decompiled by Procyon v0.5.30
// 

package org.aspectj.runtime.reflect;

import java.util.HashSet;
import java.util.Set;
import java.lang.reflect.Method;
import org.aspectj.lang.reflect.MethodSignature;

class MethodSignatureImpl extends CodeSignatureImpl implements MethodSignature
{
    private Method method;
    Class returnType;
    
    MethodSignatureImpl(final int n, final String s, final Class clazz, final Class[] array, final String[] array2, final Class[] array3, final Class returnType) {
        super(n, s, clazz, array, array2, array3);
        this.returnType = returnType;
    }
    
    MethodSignatureImpl(final String s) {
        super(s);
    }
    
    private Method search(final Class clazz, final String s, final Class[] array, final Set set) {
        Method method;
        if (clazz == null) {
            method = null;
        }
        else {
            if (!set.contains(clazz)) {
                set.add(clazz);
                try {
                    return clazz.getDeclaredMethod(s, (Class[])array);
                }
                catch (NoSuchMethodException ex) {}
            }
            method = this.search(clazz.getSuperclass(), s, array, set);
            if (method == null) {
                final Class[] interfaces = clazz.getInterfaces();
                if (interfaces != null) {
                    for (int i = 0; i < interfaces.length; ++i) {
                        method = this.search(interfaces[i], s, array, set);
                        if (method != null) {
                            return method;
                        }
                    }
                }
                return null;
            }
        }
        return method;
    }
    
    @Override
    protected String createToString(final StringMaker stringMaker) {
        final StringBuffer sb = new StringBuffer();
        sb.append(stringMaker.makeModifiersString(this.getModifiers()));
        if (stringMaker.includeArgs) {
            sb.append(stringMaker.makeTypeName(this.getReturnType()));
        }
        if (stringMaker.includeArgs) {
            sb.append(" ");
        }
        sb.append(stringMaker.makePrimaryTypeName(this.getDeclaringType(), this.getDeclaringTypeName()));
        sb.append(".");
        sb.append(this.getName());
        stringMaker.addSignature(sb, this.getParameterTypes());
        stringMaker.addThrows(sb, this.getExceptionTypes());
        return sb.toString();
    }
    
    @Override
    public Method getMethod() {
        Label_0028: {
            if (this.method != null) {
                break Label_0028;
            }
            final Class declaringType = this.getDeclaringType();
            try {
                this.method = declaringType.getDeclaredMethod(this.getName(), (Class[])this.getParameterTypes());
                return this.method;
            }
            catch (NoSuchMethodException ex) {
                final HashSet<Class> set = new HashSet<Class>();
                set.add(declaringType);
                this.method = this.search(declaringType, this.getName(), this.getParameterTypes(), set);
                return this.method;
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
