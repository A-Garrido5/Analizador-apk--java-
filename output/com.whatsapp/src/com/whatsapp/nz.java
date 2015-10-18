// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class nz implements DialogInterface$OnClickListener
{
    final Conversation a;
    
    nz(final Conversation a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.a.removeDialog(11);
        Conversation.a(this.a, this.a.s.f(), true);
        Conversation.e(this.a, false);
    }
}
