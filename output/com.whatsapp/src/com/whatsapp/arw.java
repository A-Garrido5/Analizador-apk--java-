// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class arw implements DialogInterface$OnClickListener
{
    final ContactPicker a;
    
    arw(final ContactPicker a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        Conversation.aB = true;
        this.a.startActivity(ContactPicker.q(this.a));
        this.a.removeDialog(1);
        this.a.finish();
    }
}
