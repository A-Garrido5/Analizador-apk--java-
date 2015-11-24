// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.bm;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class vw implements DialogInterface$OnClickListener
{
    final boolean a;
    final SettingsChat b;
    
    vw(final SettingsChat b, final boolean a) {
        this.b = b;
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.b.removeDialog(5);
        this.b.showDialog(6);
        bm.a(new a_6(this));
    }
}
