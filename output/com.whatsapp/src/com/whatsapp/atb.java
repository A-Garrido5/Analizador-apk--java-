// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class atb implements DialogInterface$OnClickListener
{
    final EULA a;
    
    atb(final EULA a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.a.removeDialog(8);
        EULA.a(this.a, gd.AGREE_NONE);
    }
}
