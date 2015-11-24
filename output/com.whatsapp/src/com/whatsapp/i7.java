// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class i7 implements DialogInterface$OnClickListener
{
    final DeleteAccount a;
    
    i7(final DeleteAccount a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.a.removeDialog(109);
    }
}
