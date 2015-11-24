// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.preference;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class b implements DialogInterface$OnClickListener
{
    final WaFontListPreference a;
    
    b(final WaFontListPreference a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        WaFontListPreference.a(this.a, n);
        this.a.onClick(dialogInterface, -1);
        dialogInterface.dismiss();
    }
}
