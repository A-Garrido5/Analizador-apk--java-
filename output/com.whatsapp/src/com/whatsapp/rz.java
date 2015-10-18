// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class rz implements DialogInterface$OnClickListener
{
    final Advanced a;
    
    rz(final Advanced a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        App.F(String.valueOf(n));
    }
}
