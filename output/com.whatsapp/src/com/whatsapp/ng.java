// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class ng implements DialogInterface$OnClickListener
{
    final RegisterPhone a;
    
    ng(final RegisterPhone a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.a.removeDialog(22);
    }
}
