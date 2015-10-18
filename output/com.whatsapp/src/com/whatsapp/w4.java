// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface$OnCancelListener;

class w4 implements DialogInterface$OnCancelListener
{
    final ah6 a;
    
    w4(final ah6 a) {
        this.a = a;
    }
    
    public void onCancel(final DialogInterface dialogInterface) {
        ah6.a(this.a, false);
        ah6.a(this.a, null);
        ah6.g(this.a).removeDialog(50);
    }
}
