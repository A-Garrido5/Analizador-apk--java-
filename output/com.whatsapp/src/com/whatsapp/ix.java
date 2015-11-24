// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnClickListener;

class ix implements View$OnClickListener
{
    final ConversationRowAudio a;
    
    ix(final ConversationRowAudio a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        this.a.j();
    }
}
