// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Collection;

class ah2 implements Runnable
{
    final adq a;
    final Collection b;
    
    ah2(final adq a, final Collection b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        if (!this.a.isCancelled()) {
            App.c(this.b.toArray(new String[this.b.size()]));
        }
    }
}
