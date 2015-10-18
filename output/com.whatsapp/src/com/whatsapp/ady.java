// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface;
import android.app.Activity;
import android.content.DialogInterface$OnClickListener;

final class ady implements DialogInterface$OnClickListener
{
    final Activity a;
    final int b;
    
    ady(final Activity a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.a.removeDialog(this.b);
    }
}
