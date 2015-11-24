// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class x_ implements DialogInterface$OnClickListener
{
    final ConversationsFragment$DeleteContactDialogFragment a;
    
    x_(final ConversationsFragment$DeleteContactDialogFragment a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.a.dismiss();
    }
}
