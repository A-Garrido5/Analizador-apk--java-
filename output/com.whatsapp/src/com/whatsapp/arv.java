// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnClickListener;

class arv implements View$OnClickListener
{
    final Conversation a;
    
    arv(final Conversation a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        if (this.a.aI.getLastVisiblePosition() >= -1 + this.a.aI.getCount()) {
            this.a.aI.setTranscriptMode(2);
            Conversation.a(this.a);
        }
        this.a.aI.setFastScrollEnabled(false);
    }
}
