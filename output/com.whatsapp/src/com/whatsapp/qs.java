// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnClickListener;

class qs implements View$OnClickListener
{
    final Conversation a;
    
    qs(final Conversation a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        this.a.showDialog(16);
    }
}
