// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.messaging;

class ab implements Runnable
{
    final MessageService a;
    
    ab(final MessageService a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        MessageService.c(this.a, false);
    }
}
