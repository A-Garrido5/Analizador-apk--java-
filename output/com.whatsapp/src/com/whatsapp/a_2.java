// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class a_2 implements DialogInterface$OnClickListener
{
    final Conversation a;
    
    a_2(final Conversation a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.a.removeDialog(10);
        Conversation.a(this.a, this.a, this.a.s, false);
    }
}
