// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class rk implements DialogInterface$OnClickListener
{
    final SettingsHelp a;
    
    rk(final SettingsHelp a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.a.removeDialog(123);
    }
}
