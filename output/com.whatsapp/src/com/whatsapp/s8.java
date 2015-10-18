// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.protocol.c_;

class s8 implements Runnable
{
    final HomeActivity a;
    final String b;
    
    s8(final HomeActivity a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        try {
            Thread.sleep(300L);
            App.a(this.b, (c_)null);
        }
        catch (InterruptedException ex) {}
    }
}
