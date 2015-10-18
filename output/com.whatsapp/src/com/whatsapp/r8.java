// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class r8 implements DialogInterface$OnClickListener
{
    final RegisterPhone a;
    
    r8(final RegisterPhone a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        EnterPhoneNumber.s = 0;
        this.a.removeDialog(21);
    }
}
