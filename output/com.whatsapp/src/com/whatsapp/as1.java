// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class as1 implements DialogInterface$OnClickListener
{
    final Main a;
    
    as1(final Main a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        OverlayAlert.a(this.a);
        this.a.removeDialog(1);
        this.a.finish();
    }
}
