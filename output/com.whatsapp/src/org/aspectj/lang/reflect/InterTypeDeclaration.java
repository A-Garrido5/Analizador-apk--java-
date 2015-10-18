// 
// Decompiled by Procyon v0.5.30
// 

package org.aspectj.lang.reflect;

public interface InterTypeDeclaration
{
    AjType<?> getDeclaringType();
    
    int getModifiers();
    
    AjType<?> getTargetType() throws ClassNotFoundException;
}
