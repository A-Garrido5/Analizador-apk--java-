// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface;
import android.app.Activity;
import android.content.DialogInterface$OnClickListener;

final class v8 implements DialogInterface$OnClickListener
{
    final Activity a;
    
    v8(final Activity a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.a.removeDialog(119);
        this.a.finish();
    }
}
