// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnClickListener;

class zo implements View$OnClickListener
{
    final Conversation a;
    
    zo(final Conversation a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        if (Conversation.ab(this.a)) {
            Conversation.C(this.a).a(true);
            Conversation.o(this.a);
            if (!App.I) {
                return;
            }
        }
        Conversation.r(this.a);
    }
}
