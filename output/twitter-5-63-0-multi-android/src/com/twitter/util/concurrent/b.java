// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public class b implements a
{
    private Executor a;
    private Callable b;
    private d c;
    private ObservablePromise d;
    
    public b a(final d c) {
        this.c = c;
        return this;
    }
    
    public b a(final Callable b) {
        this.b = b;
        return this;
    }
    
    public b a(final Executor a) {
        this.a = a;
        return this;
    }
    
    public i a() {
        if (this.a == null) {
            throw new IllegalStateException("The executor must not be null");
        }
        if (this.b == null) {
            throw new IllegalStateException("The callable must not be null");
        }
        final Callable b = this.b;
        final d c = this.c;
        ObservablePromise d;
        if (this.d != null) {
            d = this.d;
        }
        else {
            d = new ObservablePromise();
        }
        this.a.execute(new c(this, d, b, c));
        return d;
    }
}
