// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnClickListener;

class a2j implements View$OnClickListener
{
    final Conversation a;
    
    a2j(final Conversation a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        if (!App.p(this.a.s.u)) {
            this.a.showDialog(1);
            if (!App.I) {
                return;
            }
        }
        Conversation.X(this.a);
    }
}
