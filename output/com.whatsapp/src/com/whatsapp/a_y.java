// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnClickListener;

class a_y implements View$OnClickListener
{
    final Conversation a;
    
    a_y(final Conversation a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        this.a.aI.onWindowFocusChanged(false);
        Conversation.a(this.a);
        Conversation.I(this.a).setVisibility(8);
        Conversation.F(this.a).setVisibility(8);
    }
}
