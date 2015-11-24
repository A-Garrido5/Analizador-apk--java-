// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.util.concurrent;

import java.util.concurrent.Executor;

public class e implements d
{
    private Executor a;
    private d b;
    
    public e a(final d b) {
        this.b = b;
        return this;
    }
    
    public e a(final Executor a) {
        this.a = a;
        return this;
    }
    
    @Override
    public void a(final Object o) {
        if (this.a == null) {
            throw new IllegalStateException("The executor must not be null");
        }
        final d b = this.b;
        if (b == null) {
            throw new IllegalStateException("The callback must not be null");
        }
        this.a.execute(new f(this, b, o));
    }
}
