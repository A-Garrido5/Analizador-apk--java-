// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.protocol.c6;

class h9 implements Runnable
{
    final c6 a;
    final App b;
    
    h9(final App b, final c6 a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        this.b.a2.b(this.a);
    }
}
