// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnClickListener;

class a9r implements View$OnClickListener
{
    final QuickContactActivity a;
    
    a9r(final QuickContactActivity a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        this.a.startActivity(Conversation.a(QuickContactActivity.c(this.a)));
        QuickContactActivity.a(this.a, false);
    }
}
