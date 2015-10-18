// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.messaging;

class b_ implements Runnable
{
    final MessageService$1 a;
    
    b_(final MessageService$1 a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        MessageService.c(this.a.a, false);
    }
}
