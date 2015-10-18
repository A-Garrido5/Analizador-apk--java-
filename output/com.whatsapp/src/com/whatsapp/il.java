// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnClickListener;

class il implements View$OnClickListener
{
    final ConversationRowAudio a;
    
    il(final ConversationRowAudio a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        App.n(this.a.t);
    }
}
