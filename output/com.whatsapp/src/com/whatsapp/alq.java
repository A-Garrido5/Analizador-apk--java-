// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class alq implements Runnable
{
    final c8 a;
    
    alq(final c8 a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        App.C(this.a.b);
    }
}
