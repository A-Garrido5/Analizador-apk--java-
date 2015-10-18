// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

final class ars implements Runnable
{
    final a_9 a;
    
    ars(final a_9 a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        App.d(this.a.u);
    }
}
