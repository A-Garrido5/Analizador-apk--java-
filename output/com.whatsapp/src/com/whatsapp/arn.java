// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class arn implements DialogInterface$OnClickListener
{
    final Conversation a;
    
    arn(final Conversation a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        Conversation.X(this.a);
        this.a.removeDialog(106);
    }
}
