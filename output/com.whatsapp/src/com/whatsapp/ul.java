// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class ul implements DialogInterface$OnClickListener
{
    final GroupChatInfo a;
    
    ul(final GroupChatInfo a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.a.removeDialog(6);
        GroupChatInfo.b(this.a, GroupChatInfo.o(this.a).u);
    }
}
