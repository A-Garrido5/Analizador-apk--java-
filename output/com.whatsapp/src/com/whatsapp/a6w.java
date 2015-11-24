// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface$OnCancelListener;

class a6w implements DialogInterface$OnCancelListener
{
    final SmsDefaultAppWarning a;
    
    a6w(final SmsDefaultAppWarning a) {
        this.a = a;
    }
    
    public void onCancel(final DialogInterface dialogInterface) {
        this.a.finish();
    }
}
