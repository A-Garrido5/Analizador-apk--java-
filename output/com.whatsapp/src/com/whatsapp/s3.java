// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class s3 implements DialogInterface$OnClickListener
{
    final VerifySms a;
    
    s3(final VerifySms a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.a.removeDialog(34);
        VerifySms.z(this.a);
    }
}
