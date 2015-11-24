// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class pq implements Runnable
{
    final cu a;
    
    pq(final cu a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        App.S.g(this.a.a);
    }
}
