// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.util.concurrent;

import java.util.concurrent.Executor;

public class m implements Executor
{
    public static final Executor a;
    
    static {
        a = new m();
    }
    
    @Override
    public void execute(final Runnable runnable) {
        runnable.run();
    }
}
