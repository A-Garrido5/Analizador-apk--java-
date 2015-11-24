// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Message;
import android.os.Handler;

class ew extends Handler
{
    final Conversation a;
    
    ew(final Conversation a) {
        this.a = a;
    }
    
    public void handleMessage(final Message message) {
        if (message.what == 0) {
            Conversation.z(this.a);
            if (!App.I) {
                return;
            }
        }
        Conversation.ae(this.a);
    }
}
