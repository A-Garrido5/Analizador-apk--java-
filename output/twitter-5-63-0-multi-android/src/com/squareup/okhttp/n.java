// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp;

import java.util.LinkedHashSet;
import java.util.Set;

public final class n
{
    private final Set a;
    
    public n() {
        this.a = new LinkedHashSet();
    }
    
    public void a(final m m) {
        synchronized (this) {
            this.a.add(m);
        }
    }
    
    public void b(final m m) {
        synchronized (this) {
            this.a.remove(m);
        }
    }
    
    public boolean c(final m m) {
        synchronized (this) {
            return this.a.contains(m);
        }
    }
}
