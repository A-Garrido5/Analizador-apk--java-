// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.util.concurrent;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

class ObservablePromise$CallbackList
{
    private List a;
    private ObservablePromise$CallbackList$Status b;
    private Object c;
    
    private ObservablePromise$CallbackList() {
        this.b = ObservablePromise$CallbackList$Status.a;
    }
    
    public void a() {
        synchronized (this) {
            this.a = null;
            this.b = ObservablePromise$CallbackList$Status.c;
        }
    }
    
    public void a(final d d) {
        int n = 0;
        synchronized (this) {
            if (this.b == ObservablePromise$CallbackList$Status.a) {
                if (this.a == null) {
                    this.a = new ArrayList(1);
                }
                this.a.add(d);
            }
            else {
                final ObservablePromise$CallbackList$Status b = this.b;
                final ObservablePromise$CallbackList$Status b2 = ObservablePromise$CallbackList$Status.b;
                n = 0;
                if (b == b2) {
                    n = 1;
                }
            }
            // monitorexit(this)
            if (n != 0) {
                d.a(this.c);
            }
        }
    }
    
    public void a(final Object c) {
        synchronized (this) {
            final List a = this.a;
            this.a = null;
            this.b = ObservablePromise$CallbackList$Status.b;
            this.c = c;
            // monitorexit(this)
            if (a != null) {
                final Iterator<d> iterator = a.iterator();
                while (iterator.hasNext()) {
                    iterator.next().a(c);
                }
            }
        }
    }
}
