// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class mn implements Runnable
{
    final s1 a;
    final a_9 b;
    
    mn(final s1 a, final a_9 b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        App.S.f(this.b);
    }
}
