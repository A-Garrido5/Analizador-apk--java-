// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class cz implements DialogInterface$OnClickListener
{
    final EULA a;
    
    cz(final EULA a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.a.removeDialog(6);
        if (al5.N() != null) {
            this.a.showDialog(8);
            if (!App.I) {
                return;
            }
        }
        EULA.a(this.a, gd.AGREE_NONE);
    }
}
