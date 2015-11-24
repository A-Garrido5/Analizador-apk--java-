// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Message;
import android.os.Handler;

class ah8 extends Handler
{
    final Conversation a;
    
    ah8(final Conversation a) {
        this.a = a;
    }
    
    public void handleMessage(final Message message) {
        if (message.what == 1) {
            Conversation.a(this.a);
        }
        this.a.aI.setTranscriptMode(0);
    }
}
