// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class em implements Runnable
{
    final Conversation a;
    
    em(final Conversation a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        Conversation.f(this.a).setUnfreezeHeight();
        Conversation.f(this.a).requestLayout();
    }
}
