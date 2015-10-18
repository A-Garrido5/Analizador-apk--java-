// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface$OnDismissListener;

class q2 implements DialogInterface$OnDismissListener
{
    final RegisterPhone a;
    
    q2(final RegisterPhone a) {
        this.a = a;
    }
    
    public void onDismiss(final DialogInterface dialogInterface) {
        RegisterPhone.a(this.a, (Dialog)null);
    }
}
