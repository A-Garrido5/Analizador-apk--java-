// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class tm implements DialogInterface$OnClickListener
{
    final ConversationsFragment$ViewContactsNotSupportedDialogFragment a;
    
    tm(final ConversationsFragment$ViewContactsNotSupportedDialogFragment a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.a.dismiss();
    }
}
