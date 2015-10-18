// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class or implements Runnable
{
    final Conversation a;
    
    or(final Conversation a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        Conversation.d(this.a, (String)null);
    }
}
