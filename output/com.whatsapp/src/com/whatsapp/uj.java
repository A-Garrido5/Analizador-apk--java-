// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class uj implements Runnable
{
    final ly a;
    
    uj(final ly a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        Conversation.W(this.a.b);
    }
}
