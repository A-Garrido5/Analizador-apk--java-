// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class a9j implements DialogInterface$OnClickListener
{
    final GroupChatInfo a;
    
    a9j(final GroupChatInfo a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.a.removeDialog(3);
    }
}
