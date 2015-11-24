// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnClickListener;

class cl implements View$OnClickListener
{
    final VoipActivity a;
    
    cl(final VoipActivity a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        final String peerJid = Voip.getPeerJid();
        if (peerJid != null) {
            this.a.startActivity(Conversation.a(App.S.e(peerJid)));
        }
    }
}
