// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class zz implements Runnable
{
    final ConversationsFragment a;
    
    zz(final ConversationsFragment a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        ConversationsFragment.f(this.a);
    }
}
