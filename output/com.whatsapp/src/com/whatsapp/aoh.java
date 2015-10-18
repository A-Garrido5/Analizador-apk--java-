// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.notification.a2;
import de.greenrobot.event.m;
import android.os.Message;
import android.os.Handler;

class aoh extends Handler
{
    final Conversation a;
    
    private aoh(final Conversation a) {
        this.a = a;
    }
    
    aoh(final Conversation conversation, final st st) {
        this(conversation);
    }
    
    public void handleMessage(final Message message) {
        if (!((a8p)m.b().a(a8p.class)).a()) {
            App.a(false, false);
            if (Conversation.ac(this.a)) {
                a2.b().c();
            }
            Conversation.i(this.a, false);
            Conversation.j(this.a, true);
        }
    }
}
