// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface$OnCancelListener;

class a7 implements DialogInterface$OnCancelListener
{
    final EULA a;
    
    a7(final EULA a) {
        this.a = a;
    }
    
    public void onCancel(final DialogInterface dialogInterface) {
        this.a.removeDialog(7);
        this.a.showDialog(8);
    }
}
