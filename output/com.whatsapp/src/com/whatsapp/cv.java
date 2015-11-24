// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class cv implements DialogInterface$OnClickListener
{
    final SmsDefaultAppWarning a;
    
    cv(final SmsDefaultAppWarning a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.a.removeDialog(0);
        SmsDefaultAppWarning.b(this.a);
        this.a.finish();
    }
}
