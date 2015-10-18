// 
// Decompiled by Procyon v0.5.30
// 

package org.aspectj.lang.reflect;

import java.lang.reflect.Type;

public interface InterTypeFieldDeclaration extends InterTypeDeclaration
{
    Type getGenericType();
    
    String getName();
    
    AjType<?> getType();
}
