// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.messaging;

import android.os.Message;
import android.os.Handler$Callback;

class i implements Handler$Callback
{
    final MessageService a;
    
    i(final MessageService a) {
        this.a = a;
    }
    
    public boolean handleMessage(final Message message) {
        MessageService.a(this.a, message.arg1);
        MessageService.b(this.a, message.arg2 != 0);
        return true;
    }
}
