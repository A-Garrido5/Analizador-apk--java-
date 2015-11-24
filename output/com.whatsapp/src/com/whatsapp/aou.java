// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class aou implements DialogInterface$OnClickListener
{
    final Main a;
    
    aou(final Main a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        aah.a();
        this.a.removeDialog(0);
        Main.b(this.a);
    }
}
