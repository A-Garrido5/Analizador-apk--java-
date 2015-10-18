// 
// Decompiled by Procyon v0.5.30
// 

package org.aspectj.runtime.internal.cflowstack;

public interface ThreadStackFactory
{
    ThreadCounter getNewThreadCounter();
    
    ThreadStack getNewThreadStack();
}
