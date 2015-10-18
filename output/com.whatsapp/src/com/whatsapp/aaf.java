// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class aaf implements DialogInterface$OnClickListener
{
    final DialogToastActivity$MessageDialogFragment a;
    
    aaf(final DialogToastActivity$MessageDialogFragment a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.a.dismiss();
    }
}
