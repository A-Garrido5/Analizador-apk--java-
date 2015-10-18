// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface;
import android.app.Activity;
import android.content.DialogInterface$OnClickListener;

final class aat implements DialogInterface$OnClickListener
{
    final Activity a;
    
    aat(final Activity a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.a.removeDialog(115);
    }
}
