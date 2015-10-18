// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class adf implements mc
{
    final ConversationRowAudio a;
    
    adf(final ConversationRowAudio a) {
        this.a = a;
    }
    
    @Override
    public void a(final byte[] array) {
        if (ConversationRowAudio.b(this.a) != null) {
            ConversationRowAudio.b(this.a).a(array);
        }
    }
}
