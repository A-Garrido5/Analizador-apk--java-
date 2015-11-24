// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.notification.w;

class ze implements Runnable
{
    final v3 a;
    
    ze(final v3 a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        w.b().c();
        App.ar();
        this.a.a.a();
    }
}
