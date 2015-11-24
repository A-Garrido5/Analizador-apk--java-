// 
// Decompiled by Procyon v0.5.30
// 

package org.aspectj.runtime.internal.cflowstack;

import java.util.Stack;

public interface ThreadStack
{
    Stack getThreadStack();
    
    void removeThreadStack();
}
