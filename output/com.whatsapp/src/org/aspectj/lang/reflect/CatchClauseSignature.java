// 
// Decompiled by Procyon v0.5.30
// 

package org.aspectj.lang.reflect;

import org.aspectj.lang.Signature;

public interface CatchClauseSignature extends Signature
{
    String getParameterName();
    
    Class getParameterType();
}
