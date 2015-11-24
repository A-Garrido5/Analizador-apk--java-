// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.protocol.c_;

class _9 implements Runnable
{
    final pp a;
    
    _9(final pp a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        try {
            Thread.sleep(300L);
            App.a(this.a.b.u, (c_)null);
        }
        catch (InterruptedException ex) {}
    }
}
