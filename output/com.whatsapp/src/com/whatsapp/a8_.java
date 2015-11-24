// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.protocol.bi;

class a8_ implements Runnable
{
    final bi a;
    final ek b;
    
    a8_(final ek b, final bi a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        App.n(this.a);
    }
}
