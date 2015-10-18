// 
// Decompiled by Procyon v0.5.30
// 

package org.aspectj.lang.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.Type;

public interface InterTypeMethodDeclaration extends InterTypeDeclaration
{
    AjType<?>[] getExceptionTypes();
    
    Type[] getGenericParameterTypes();
    
    Type getGenericReturnType();
    
    String getName();
    
    AjType<?>[] getParameterTypes();
    
    AjType<?> getReturnType();
    
    TypeVariable<Method>[] getTypeParameters();
}
