// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnClickListener;

class a9y implements View$OnClickListener
{
    final ListChatInfo a;
    
    a9y(final ListChatInfo a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        ListChatInfo.a(this.a);
    }
}
