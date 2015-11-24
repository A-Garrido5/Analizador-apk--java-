// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class aom implements DialogInterface$OnClickListener
{
    final Runnable a;
    final AccountInfoActivity b;
    final int c;
    
    aom(final AccountInfoActivity b, final int c, final Runnable a) {
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.b.removeDialog(this.c);
        if (this.a != null) {
            this.a.run();
        }
    }
}
