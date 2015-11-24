// 
// Decompiled by Procyon v0.5.30
// 

package org.aspectj.lang.reflect;

public interface Pointcut
{
    AjType getDeclaringType();
    
    int getModifiers();
    
    String getName();
    
    String[] getParameterNames();
    
    AjType<?>[] getParameterTypes();
    
    PointcutExpression getPointcutExpression();
}
