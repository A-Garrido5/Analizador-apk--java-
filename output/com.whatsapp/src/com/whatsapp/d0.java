// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class d0 implements DialogInterface$OnClickListener
{
    final Conversation a;
    
    d0(final Conversation a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.a.removeDialog(11);
        Conversation.b(this.a, this.a.s.a((Context)this.a), true);
        Conversation.e(this.a, false);
    }
}
