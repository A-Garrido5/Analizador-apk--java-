// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class ev implements DialogInterface$OnClickListener
{
    final VerifySms a;
    final int b;
    
    ev(final VerifySms a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.a.removeDialog(this.b);
        VerifySms.z(this.a);
    }
}
