// 
// Decompiled by Procyon v0.5.30
// 

package org.aspectj.runtime.internal.cflowstack;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Stack;

public class ThreadStackImpl11 implements ThreadStack
{
    private static final int COLLECT_AT = 20000;
    private static final int MIN_COLLECT_AT = 100;
    private Stack cached_stack;
    private Thread cached_thread;
    private int change_count;
    private Hashtable stacks;
    
    public ThreadStackImpl11() {
        this.stacks = new Hashtable();
        this.change_count = 0;
    }
    
    @Override
    public Stack getThreadStack() {
        Label_0221: {
            final Stack<Thread> stack;
            synchronized (this) {
                if (Thread.currentThread() == this.cached_thread) {
                    break Label_0221;
                }
                this.cached_thread = Thread.currentThread();
                this.cached_stack = this.stacks.get(this.cached_thread);
                if (this.cached_stack == null) {
                    this.cached_stack = new Stack();
                    this.stacks.put(this.cached_thread, this.cached_stack);
                }
                ++this.change_count;
                if (this.change_count <= Math.max(100, 20000 / Math.max(1, this.stacks.size()))) {
                    break Label_0221;
                }
                stack = new Stack<Thread>();
                final Enumeration<Thread> keys = (Enumeration<Thread>)this.stacks.keys();
                while (keys.hasMoreElements()) {
                    final Thread thread = keys.nextElement();
                    if (!thread.isAlive()) {
                        stack.push(thread);
                    }
                }
            }
            final Enumeration<Object> elements = stack.elements();
            while (elements.hasMoreElements()) {
                this.stacks.remove(elements.nextElement());
            }
            this.change_count = 0;
        }
        // monitorexit(this)
        return this.cached_stack;
    }
    
    @Override
    public void removeThreadStack() {
    }
}
