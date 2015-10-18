// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.network;

import java.util.ArrayList;
import java.util.List;

public class e
{
    private static final e a;
    private final List b;
    
    static {
        a = new e();
    }
    
    public e() {
        this.b = new ArrayList();
    }
    
    public static e a() {
        return e.a;
    }
    
    public void a(final HttpOperation httpOperation) {
        synchronized (this) {
            if (!this.b.isEmpty()) {
                for (int i = -1 + this.b.size(); i >= 0; --i) {
                    ((d)this.b.get(i)).b(httpOperation);
                }
            }
        }
    }
    
    public void a(final HttpOperation httpOperation, final Exception ex) {
        synchronized (this) {
            if (!this.b.isEmpty()) {
                for (int i = -1 + this.b.size(); i >= 0; --i) {
                    ((d)this.b.get(i)).a(httpOperation, ex);
                }
            }
        }
    }
    
    public void a(final d d) {
        synchronized (this) {
            if (!this.b.contains(d)) {
                this.b.add(d);
            }
        }
    }
    
    public void b(final HttpOperation httpOperation) {
        synchronized (this) {
            if (!this.b.isEmpty()) {
                for (int i = -1 + this.b.size(); i >= 0; --i) {
                    ((d)this.b.get(i)).a(httpOperation);
                }
            }
        }
    }
}
