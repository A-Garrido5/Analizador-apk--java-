// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class pj implements Runnable
{
    final vy a;
    final boolean b;
    
    pj(final vy a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        vy.g(this.a).a(null, this.b);
    }
}
