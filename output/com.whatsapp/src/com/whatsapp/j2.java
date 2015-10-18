// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class j2 implements Runnable
{
    final gw a;
    
    j2(final gw a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        gw.b(this.a);
    }
}
