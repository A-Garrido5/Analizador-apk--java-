// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class l9 implements DialogInterface$OnClickListener
{
    final ChangeNumber a;
    
    l9(final ChangeNumber a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        ChangeNumber.b(this.a);
    }
}
