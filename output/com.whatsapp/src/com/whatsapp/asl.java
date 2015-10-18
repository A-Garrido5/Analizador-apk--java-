// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class asl implements DialogInterface$OnClickListener
{
    final a_9 a;
    final SettingsChat b;
    
    asl(final SettingsChat b, final a_9 a) {
        this.b = b;
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.b.removeDialog(19);
        Conversation.a((Activity)this.b, this.b, this.a, true);
    }
}
