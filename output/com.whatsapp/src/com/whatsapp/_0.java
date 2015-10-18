// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class _0 implements Runnable
{
    final ConversationRow a;
    
    _0(final ConversationRow a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        this.a.d();
    }
}
