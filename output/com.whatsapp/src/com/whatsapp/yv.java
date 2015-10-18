// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.protocol.c_;

class yv implements Runnable
{
    final Conversations a;
    final String b;
    
    yv(final Conversations a, final String b) {
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
