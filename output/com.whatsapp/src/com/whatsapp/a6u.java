// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class a6u implements DialogInterface$OnClickListener
{
    final String a;
    final RegisterPhone b;
    
    a6u(final RegisterPhone b, final String a) {
        this.b = b;
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.b.removeDialog(22);
        this.b.g(this.a);
    }
}
