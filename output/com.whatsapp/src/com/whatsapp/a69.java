// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class a69 implements DialogInterface$OnClickListener
{
    final Conversations a;
    
    a69(final Conversations a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        Conversations.b(this.a);
    }
}
