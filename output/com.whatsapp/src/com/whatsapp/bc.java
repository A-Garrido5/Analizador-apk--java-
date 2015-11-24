// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class bc implements DialogInterface$OnClickListener
{
    final pr a;
    final int b;
    
    bc(final pr a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        pr.a(this.a).removeDialog(this.b);
        this.a.a(true);
    }
}
