// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class fx implements DialogInterface$OnClickListener
{
    final pr a;
    
    fx(final pr a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        pr.a(this.a).removeDialog(103);
        this.a.a(true);
    }
}
