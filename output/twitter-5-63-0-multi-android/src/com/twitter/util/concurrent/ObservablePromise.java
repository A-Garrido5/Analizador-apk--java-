// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.util.concurrent;

public class ObservablePromise extends k implements i
{
    private final ObservablePromise$CallbackList a;
    private final ObservablePromise$CallbackList b;
    private final ObservablePromise$CallbackList c;
    
    public ObservablePromise() {
        this.a = new ObservablePromise$CallbackList(null);
        this.b = new ObservablePromise$CallbackList(null);
        this.c = new ObservablePromise$CallbackList(null);
    }
    
    public static ObservablePromise a(final Object o) {
        final ObservablePromise observablePromise = new ObservablePromise();
        observablePromise.set(o);
        return observablePromise;
    }
    
    public static ObservablePromise b() {
        final ObservablePromise observablePromise = new ObservablePromise();
        observablePromise.d();
        return observablePromise;
    }
    
    @Override
    public i a(final d d) {
        this.a.a(d);
        return this;
    }
    
    @Override
    protected void a() {
        this.a.a();
        this.b.a();
        this.c.a((Object)null);
    }
    
    @Override
    protected void a(final Exception ex) {
        this.a.a();
        this.b.a(ex);
        this.c.a();
    }
    
    @Override
    protected void b(final Object o) {
        this.a.a(o);
        this.b.a();
        this.c.a();
    }
}
