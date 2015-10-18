// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface$OnCancelListener;

class r9 implements DialogInterface$OnCancelListener
{
    final ContactPicker a;
    
    r9(final ContactPicker a) {
        this.a = a;
    }
    
    public void onCancel(final DialogInterface dialogInterface) {
        this.a.removeDialog(2);
    }
}
