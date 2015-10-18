// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class a2y implements DialogInterface$OnClickListener
{
    final SettingsHelp a;
    
    a2y(final SettingsHelp a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.a.removeDialog(102);
    }
}
