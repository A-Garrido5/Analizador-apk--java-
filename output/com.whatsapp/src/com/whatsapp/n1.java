// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class n1 implements DialogInterface$OnClickListener
{
    final VerifySms a;
    
    n1(final VerifySms a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.a.removeDialog(7);
        VerifySms.z(this.a);
    }
}
