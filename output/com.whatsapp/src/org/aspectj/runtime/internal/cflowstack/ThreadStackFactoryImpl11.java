// 
// Decompiled by Procyon v0.5.30
// 

package org.aspectj.runtime.internal.cflowstack;

public class ThreadStackFactoryImpl11 implements ThreadStackFactory
{
    @Override
    public ThreadCounter getNewThreadCounter() {
        return new ThreadCounterImpl11();
    }
    
    @Override
    public ThreadStack getNewThreadStack() {
        return new ThreadStackImpl11();
    }
}
