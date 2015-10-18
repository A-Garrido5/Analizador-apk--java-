// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class a2l implements DialogInterface$OnClickListener
{
    final Conversation a;
    
    a2l(final Conversation a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.a.removeDialog(9);
        Conversation.e(this.a, z8.a(this.a.I).f());
    }
}
