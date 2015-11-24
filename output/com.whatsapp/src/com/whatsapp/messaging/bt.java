// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.messaging;

class bt implements Runnable
{
    final MessageService$1 a;
    
    bt(final MessageService$1 a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        MessageService.c(this.a.a, true);
    }
}
