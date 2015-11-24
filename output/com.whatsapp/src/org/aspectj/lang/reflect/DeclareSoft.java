// 
// Decompiled by Procyon v0.5.30
// 

package org.aspectj.lang.reflect;

public interface DeclareSoft
{
    AjType getDeclaringType();
    
    PointcutExpression getPointcutExpression();
    
    AjType getSoftenedExceptionType() throws ClassNotFoundException;
}
