// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnClickListener;

class c2 implements View$OnClickListener
{
    final GroupChatInfo a;
    
    c2(final GroupChatInfo a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        this.a.showDialog(3);
    }
}
