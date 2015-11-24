// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnClickListener;

class gg implements View$OnClickListener
{
    final Conversation a;
    
    gg(final Conversation a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        Conversation.k(this.a);
    }
}
