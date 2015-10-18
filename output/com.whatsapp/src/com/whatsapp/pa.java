// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnClickListener;

class pa implements View$OnClickListener
{
    final Conversation a;
    
    pa(final Conversation a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        Conversation.ak(this.a);
    }
}
