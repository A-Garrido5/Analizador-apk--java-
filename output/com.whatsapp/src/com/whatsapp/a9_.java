// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class a9_ implements DialogInterface$OnClickListener
{
    final ConversationsFragment$ExitGroupDialogFragment a;
    
    a9_(final ConversationsFragment$ExitGroupDialogFragment a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.a.dismiss();
    }
}
