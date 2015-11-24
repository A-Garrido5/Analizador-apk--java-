// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class a8b implements DialogInterface$OnClickListener
{
    final int a;
    final VerifySms b;
    
    a8b(final VerifySms b, final int a) {
        this.b = b;
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.b.removeDialog(this.a);
        VerifySms.o(this.b);
    }
}
