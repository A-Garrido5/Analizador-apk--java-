// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.notification;

import com.whatsapp.App;

class e implements Runnable
{
    final w a;
    
    e(final w a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        final App aq = App.aq;
        App.A();
    }
}
