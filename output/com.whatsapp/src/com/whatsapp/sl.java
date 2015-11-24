// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class sl implements Runnable
{
    final Conversation a;
    
    sl(final Conversation a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        Conversation.d(this.a, Conversation.am(this.a));
    }
}
