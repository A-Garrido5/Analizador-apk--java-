// 
// Decompiled by Procyon v0.5.30
// 

package org.aspectj.internal.lang.reflect;

import java.lang.reflect.Modifier;
import java.lang.reflect.TypeVariable;
import org.aspectj.lang.reflect.AjTypeSystem;
import java.lang.reflect.Type;
import org.aspectj.lang.reflect.AjType;
import java.lang.reflect.Method;
import org.aspectj.lang.reflect.InterTypeMethodDeclaration;

public class InterTypeMethodDeclarationImpl extends InterTypeDeclarationImpl implements InterTypeMethodDeclaration
{
    private Method baseMethod;
    private AjType<?>[] exceptionTypes;
    private Type[] genericParameterTypes;
    private Type genericReturnType;
    private String name;
    private int parameterAdjustmentFactor;
    private AjType<?>[] parameterTypes;
    private AjType<?> returnType;
    
    public InterTypeMethodDeclarationImpl(final AjType<?> ajType, final String s, final int n, final String name, final Method baseMethod) {
        super(ajType, s, n);
        this.parameterAdjustmentFactor = 1;
        this.name = name;
        this.baseMethod = baseMethod;
    }
    
    public InterTypeMethodDeclarationImpl(final AjType<?> ajType, final AjType<?> ajType2, final Method baseMethod, final int n) {
        super(ajType, ajType2, n);
        this.parameterAdjustmentFactor = 1;
        this.parameterAdjustmentFactor = 0;
        this.name = baseMethod.getName();
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
        final AjType[] array = new AjType[genericParameterTypes.length - this.parameterAdjustmentFactor];
        for (int i = this.parameterAdjustmentFactor; i < genericParameterTypes.length; ++i) {
            if (genericParameterTypes[i] instanceof Class) {
                array[i - this.parameterAdjustmentFactor] = AjTypeSystem.getAjType((Class<Object>)genericParameterTypes[i]);
            }
            else {
                array[i - this.parameterAdjustmentFactor] = (AjType)genericParameterTypes[i];
            }
        }
        return array;
    }
    
    @Override
    public Type getGenericReturnType() {
        Type type = this.baseMethod.getGenericReturnType();
        if (type instanceof Class) {
            type = AjTypeSystem.getAjType((Class<Object>)type);
        }
        return type;
    }
    
    @Override
    public String getName() {
        return this.name;
    }
    
    @Override
    public AjType<?>[] getParameterTypes() {
        final Class<?>[] parameterTypes = this.baseMethod.getParameterTypes();
        final AjType[] array = new AjType[parameterTypes.length - this.parameterAdjustmentFactor];
        for (int i = this.parameterAdjustmentFactor; i < parameterTypes.length; ++i) {
            array[i - this.parameterAdjustmentFactor] = AjTypeSystem.getAjType(parameterTypes[i]);
        }
        return (AjType<?>[])array;
    }
    
    @Override
    public AjType<?> getReturnType() {
        return AjTypeSystem.getAjType(this.baseMethod.getReturnType());
    }
    
    @Override
    public TypeVariable<Method>[] getTypeParameters() {
        return this.baseMethod.getTypeParameters();
    }
    
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append(Modifier.toString(this.getModifiers()));
        sb.append(" ");
        sb.append(this.getReturnType().toString());
        sb.append(" ");
        sb.append(this.targetTypeName);
        sb.append(".");
        sb.append(this.getName());
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
