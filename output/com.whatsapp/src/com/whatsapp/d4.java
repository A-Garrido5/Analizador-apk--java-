// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class d4 implements DialogInterface$OnClickListener
{
    final RegisterName a;
    
    d4(final RegisterName a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        RegisterName.n(this.a);
        this.a.removeDialog(1);
    }
}
