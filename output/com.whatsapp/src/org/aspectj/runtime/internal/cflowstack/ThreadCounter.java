// 
// Decompiled by Procyon v0.5.30
// 

package org.aspectj.runtime.internal.cflowstack;

public interface ThreadCounter
{
    void dec();
    
    void inc();
    
    boolean isNotZero();
    
    void removeThreadCounter();
}
