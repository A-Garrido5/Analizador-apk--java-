// 
// Decompiled by Procyon v0.5.30
// 

package org.aspectj.lang.reflect;

public interface CodeSignature extends MemberSignature
{
    Class[] getExceptionTypes();
    
    String[] getParameterNames();
    
    Class[] getParameterTypes();
}
