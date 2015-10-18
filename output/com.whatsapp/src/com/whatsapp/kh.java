// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnClickListener;

class kh implements View$OnClickListener
{
    final fa a;
    
    kh(final fa a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        Conversation.b(this.a.a, true);
    }
}
