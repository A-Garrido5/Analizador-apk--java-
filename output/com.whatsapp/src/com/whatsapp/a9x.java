// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class a9x implements Runnable
{
    final of a;
    
    a9x(final of a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        if (ConversationRowVideo.a(this.a.a) == this.a) {
            ConversationRowVideo.a(this.a.a, null);
        }
    }
}
