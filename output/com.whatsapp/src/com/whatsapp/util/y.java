// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import java.util.concurrent.Callable;

class y implements Callable
{
    final n a;
    
    y(final n a) {
        this.a = a;
    }
    
    public Void a() {
        synchronized (this.a) {
            if (n.a(this.a) == null) {
                return null;
            }
            n.c(this.a);
            if (n.b(this.a)) {
                n.d(this.a);
                n.a(this.a, 0);
            }
            return null;
        }
    }
    
    @Override
    public Object call() {
        return this.a();
    }
}
