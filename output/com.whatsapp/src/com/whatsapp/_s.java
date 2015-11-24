// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class _s implements DialogInterface$OnClickListener
{
    final ListChatInfo a;
    
    _s(final ListChatInfo a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.a.removeDialog(6);
        ListChatInfo.a(this.a, ListChatInfo.d(this.a));
    }
}
