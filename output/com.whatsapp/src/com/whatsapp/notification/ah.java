// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.notification;

import com.whatsapp.App;

final class ah implements Runnable
{
    final String a;
    
    ah(final String a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        App.d(this.a);
    }
}
