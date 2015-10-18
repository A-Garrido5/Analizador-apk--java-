// 
// Decompiled by Procyon v0.5.30
// 

package org.aspectj.lang;

import org.aspectj.runtime.internal.AroundClosure;

public interface ProceedingJoinPoint extends JoinPoint
{
    Object proceed() throws Throwable;
    
    Object proceed(final Object[] p0) throws Throwable;
    
    void set$AroundClosure(final AroundClosure p0);
}
