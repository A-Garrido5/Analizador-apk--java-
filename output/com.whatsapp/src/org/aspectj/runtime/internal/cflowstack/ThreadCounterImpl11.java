// 
// Decompiled by Procyon v0.5.30
// 

package org.aspectj.runtime.internal.cflowstack;

import java.util.Iterator;
import java.util.Enumeration;
import java.util.ArrayList;
import java.util.Hashtable;

public class ThreadCounterImpl11 implements ThreadCounter
{
    private static final int COLLECT_AT = 20000;
    private static final int MIN_COLLECT_AT = 100;
    private Counter cached_counter;
    private Thread cached_thread;
    private int change_count;
    private Hashtable counters;
    
    public ThreadCounterImpl11() {
        this.counters = new Hashtable();
        this.change_count = 0;
    }
    
    private Counter getThreadCounter() {
        Label_0225: {
            final ArrayList<Thread> list;
            synchronized (this) {
                if (Thread.currentThread() == this.cached_thread) {
                    break Label_0225;
                }
                this.cached_thread = Thread.currentThread();
                this.cached_counter = this.counters.get(this.cached_thread);
                if (this.cached_counter == null) {
                    this.cached_counter = new Counter();
                    this.counters.put(this.cached_thread, this.cached_counter);
                }
                ++this.change_count;
                if (this.change_count <= Math.max(100, 20000 / Math.max(1, this.counters.size()))) {
                    break Label_0225;
                }
                list = new ArrayList<Thread>();
                final Enumeration<Thread> keys = (Enumeration<Thread>)this.counters.keys();
                while (keys.hasMoreElements()) {
                    final Thread thread = keys.nextElement();
                    if (!thread.isAlive()) {
                        list.add(thread);
                    }
                }
            }
            final Iterator<Object> iterator = list.iterator();
            while (iterator.hasNext()) {
                this.counters.remove(iterator.next());
            }
            this.change_count = 0;
        }
        // monitorexit(this)
        return this.cached_counter;
    }
    
    @Override
    public void dec() {
        final Counter threadCounter = this.getThreadCounter();
        --threadCounter.value;
    }
    
    @Override
    public void inc() {
        final Counter threadCounter = this.getThreadCounter();
        ++threadCounter.value;
    }
    
    @Override
    public boolean isNotZero() {
        return this.getThreadCounter().value != 0;
    }
    
    @Override
    public void removeThreadCounter() {
    }
    
    static class Counter
    {
        protected int value;
        
        Counter() {
            this.value = 0;
        }
    }
}
