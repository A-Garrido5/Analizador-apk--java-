// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class rf implements DialogInterface$OnClickListener
{
    final VoipActivity$MessageDialogFragment a;
    
    rf(final VoipActivity$MessageDialogFragment a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.a.dismissAllowingStateLoss();
    }
}
