// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface$OnDismissListener;

class a8g implements DialogInterface$OnDismissListener
{
    final VerifySms a;
    
    a8g(final VerifySms a) {
        this.a = a;
    }
    
    public void onDismiss(final DialogInterface dialogInterface) {
        VerifySms.z(this.a);
    }
}
