// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class mr implements DialogInterface$OnClickListener
{
    final ConversationsFragment$DeleteBroadcastListDialogFragment a;
    
    mr(final ConversationsFragment$DeleteBroadcastListDialogFragment a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.a.dismiss();
    }
}
