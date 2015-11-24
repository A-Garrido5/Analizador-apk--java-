// 
// Decompiled by Procyon v0.5.30
// 

package org.aspectj.lang.reflect;

public interface DeclareErrorOrWarning
{
    AjType getDeclaringType();
    
    String getMessage();
    
    PointcutExpression getPointcutExpression();
    
    boolean isError();
}
