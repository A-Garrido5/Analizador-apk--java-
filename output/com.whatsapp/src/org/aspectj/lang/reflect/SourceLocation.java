// 
// Decompiled by Procyon v0.5.30
// 

package org.aspectj.lang.reflect;

public interface SourceLocation
{
    int getColumn();
    
    String getFileName();
    
    int getLine();
    
    Class getWithinType();
}
