// 
// Decompiled by Procyon v0.5.30
// 

package org.aspectj.lang;

public interface Signature
{
    Class getDeclaringType();
    
    String getDeclaringTypeName();
    
    int getModifiers();
    
    String getName();
    
    String toLongString();
    
    String toShortString();
    
    String toString();
}
