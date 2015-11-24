// 
// Decompiled by Procyon v0.5.30
// 

package org.aspectj.lang.reflect;

import java.lang.reflect.Type;

public interface DeclareParents
{
    AjType getDeclaringType();
    
    Type[] getParentTypes() throws ClassNotFoundException;
    
    TypePattern getTargetTypesPattern();
    
    boolean isExtends();
    
    boolean isImplements();
}
