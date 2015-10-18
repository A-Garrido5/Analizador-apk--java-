// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.protocol.c_;
import com.whatsapp.protocol.bz;

class asm implements Runnable
{
    final bz a;
    final p9 b;
    final String c;
    final c_ d;
    
    asm(final p9 b, final String c, final bz a, final c_ d) {
        this.b = b;
        this.c = c;
        this.a = a;
        this.d = d;
    }
    
    @Override
    public void run() {
        try {
            Thread.sleep(300L);
            App.d(new nc(this, this.c, this.a.b, this.a.d, 13, this.d));
        }
        catch (InterruptedException ex) {}
    }
}
