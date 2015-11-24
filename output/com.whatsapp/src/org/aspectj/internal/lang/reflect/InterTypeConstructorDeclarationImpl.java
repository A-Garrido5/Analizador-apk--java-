// 
// Decompiled by Procyon v0.5.30
// 

package org.aspectj.internal.lang.reflect;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import org.aspectj.lang.reflect.AjTypeSystem;
import org.aspectj.lang.reflect.AjType;
import java.lang.reflect.Method;
import org.aspectj.lang.reflect.InterTypeConstructorDeclaration;

public class InterTypeConstructorDeclarationImpl extends InterTypeDeclarationImpl implements InterTypeConstructorDeclaration
{
    private Method baseMethod;
    
    public InterTypeConstructorDeclarationImpl(final AjType<?> ajType, final String s, final int n, final Method baseMethod) {
        super(ajType, s, n);
        this.baseMethod = baseMethod;
    }
    
    @Override
    public AjType<?>[] getExceptionTypes() {
        final Class<?>[] exceptionTypes = this.baseMethod.getExceptionTypes();
        final AjType[] array = new AjType[exceptionTypes.length];
        for (int i = 0; i < exceptionTypes.length; ++i) {
            array[i] = AjTypeSystem.getAjType(exceptionTypes[i]);
        }
        return (AjType<?>[])array;
    }
    
    @Override
    public Type[] getGenericParameterTypes() {
        final Type[] genericParameterTypes = this.baseMethod.getGenericParameterTypes();
        final AjType[] array = new AjType[-1 + genericParameterTypes.length];
        for (int i = 1; i < genericParameterTypes.length; ++i) {
            if (genericParameterTypes[i] instanceof Class) {
                array[i - 1] = AjTypeSystem.getAjType((Class<Object>)genericParameterTypes[i]);
            }
            else {
                array[i - 1] = (AjType)genericParameterTypes[i];
            }
        }
        return array;
    }
    
    @Override
    public AjType<?>[] getParameterTypes() {
        final Class<?>[] parameterTypes = this.baseMethod.getParameterTypes();
        final AjType[] array = new AjType[-1 + parameterTypes.length];
        for (int i = 1; i < parameterTypes.length; ++i) {
            array[i - 1] = AjTypeSystem.getAjType(parameterTypes[i]);
        }
        return (AjType<?>[])array;
    }
    
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append(Modifier.toString(this.getModifiers()));
        sb.append(" ");
        sb.append(this.targetTypeName);
        sb.append(".new");
        sb.append("(");
        final AjType<?>[] parameterTypes = this.getParameterTypes();
        for (int i = 0; i < -1 + parameterTypes.length; ++i) {
            sb.append(parameterTypes[i].toString());
            sb.append(", ");
        }
        if (parameterTypes.length > 0) {
            sb.append(parameterTypes[-1 + parameterTypes.length].toString());
        }
        sb.append(")");
        return sb.toString();
    }
}
