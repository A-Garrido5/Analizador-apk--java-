// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.android.service;

import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

public class x
{
    private final List a;
    
    public x() {
        this.a = new ArrayList();
    }
    
    public List a() {
        synchronized (this) {
            return new ArrayList(this.a);
        }
    }
    
    public void a(final Object o) {
        synchronized (this) {
            this.a.add(o);
        }
    }
    
    public Object b() {
        synchronized (this) {
            Object value;
            if (this.a.isEmpty()) {
                value = null;
            }
            else {
                value = this.a.get(-1 + this.a.size());
            }
            return value;
        }
    }
}
