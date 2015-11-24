// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.bm;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class aqf implements DialogInterface$OnClickListener
{
    final SettingsChat a;
    
    aqf(final SettingsChat a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.a.showDialog(6);
        bm.a(new aw1(this));
    }
}
