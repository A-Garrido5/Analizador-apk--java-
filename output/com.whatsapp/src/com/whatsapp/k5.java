// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnClickListener;

class k5 implements View$OnClickListener
{
    final ListChatInfo a;
    
    k5(final ListChatInfo a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        this.a.showDialog(2);
    }
}
