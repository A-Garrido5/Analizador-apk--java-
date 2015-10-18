// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnClickListener;

class a6t implements View$OnClickListener
{
    final ListChatInfo a;
    
    a6t(final ListChatInfo a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        this.a.showDialog(50);
    }
}
