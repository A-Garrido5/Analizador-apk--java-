// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnClickListener;

class qj implements View$OnClickListener
{
    final Conversation a;
    
    qj(final Conversation a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        this.a.showDialog(11);
    }
}
