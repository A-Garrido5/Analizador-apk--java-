// 
// Decompiled by Procyon v0.5.30
// 

package org.aspectj.lang.reflect;

public interface DeclarePrecedence
{
    AjType getDeclaringType();
    
    TypePattern[] getPrecedenceOrder();
}
