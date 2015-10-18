// 
// Decompiled by Procyon v0.5.30
// 

package org.aspectj.runtime.internal.cflowstack;

import java.util.Stack;

public class ThreadStackFactoryImpl implements ThreadStackFactory
{
    @Override
    public ThreadCounter getNewThreadCounter() {
        return new ThreadCounterImpl(null);
    }
    
    @Override
    public ThreadStack getNewThreadStack() {
        return new ThreadStackImpl(null);
    }
    
    private static class ThreadCounterImpl extends ThreadLocal implements ThreadCounter
    {
        private ThreadCounterImpl() {
        }
        
        ThreadCounterImpl(final ThreadStackFactoryImpl$1 object) {
            this();
        }
        
        @Override
        public void dec() {
            final Counter threadCounter = this.getThreadCounter();
            --threadCounter.value;
        }
        
        public Counter getThreadCounter() {
            return this.get();
        }
        
        @Override
        public void inc() {
            final Counter threadCounter = this.getThreadCounter();
            ++threadCounter.value;
        }
        
        public Object initialValue() {
            return new Counter();
        }
        
        @Override
        public boolean isNotZero() {
            return this.getThreadCounter().value != 0;
        }
        
        @Override
        public void removeThreadCounter() {
            this.remove();
        }
        
        static class Counter
        {
            protected int value;
            
            Counter() {
                this.value = 0;
            }
        }
    }
    
    private static class ThreadStackImpl extends ThreadLocal implements ThreadStack
    {
        private ThreadStackImpl() {
        }
        
        ThreadStackImpl(final ThreadStackFactoryImpl$1 object) {
            this();
        }
        
        @Override
        public Stack getThreadStack() {
            return this.get();
        }
        
        public Object initialValue() {
            return new Stack();
        }
        
        @Override
        public void removeThreadStack() {
            this.remove();
        }
    }
}
