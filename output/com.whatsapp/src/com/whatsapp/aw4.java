// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface$OnCancelListener;

class aw4 implements DialogInterface$OnCancelListener
{
    final ContactPicker a;
    
    aw4(final ContactPicker a) {
        this.a = a;
    }
    
    public void onCancel(final DialogInterface dialogInterface) {
        this.a.removeDialog(0);
    }
}
