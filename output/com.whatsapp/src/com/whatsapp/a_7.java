// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class a_7 implements DialogInterface$OnClickListener
{
    final DeleteAccountConfirmation a;
    
    a_7(final DeleteAccountConfirmation a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.a.removeDialog(3);
    }
}
