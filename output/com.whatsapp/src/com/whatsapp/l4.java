// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class l4 implements DialogInterface$OnClickListener
{
    final ContactPicker a;
    
    l4(final ContactPicker a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.a.setResult(-1, ContactPicker.q(this.a));
        this.a.removeDialog(3);
        this.a.finish();
    }
}
