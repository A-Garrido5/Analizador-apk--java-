// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class kz implements DialogInterface$OnClickListener
{
    final EnterPhoneNumber a;
    
    kz(final EnterPhoneNumber a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.a.removeDialog(23);
    }
}
