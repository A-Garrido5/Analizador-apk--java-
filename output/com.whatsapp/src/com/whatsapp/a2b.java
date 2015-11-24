// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class a2b implements DialogInterface$OnClickListener
{
    final Conversation a;
    
    a2b(final Conversation a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        Conversation.b(this.a, 0);
        App.ak.u(this.a.s.u);
        this.a.removeDialog(0);
    }
}
