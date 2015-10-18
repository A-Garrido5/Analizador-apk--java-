// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class aru implements DialogInterface$OnClickListener
{
    final RegisterPhone a;
    
    aru(final RegisterPhone a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.a.removeDialog(23);
    }
}
