// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface$OnCancelListener;

class fb implements DialogInterface$OnCancelListener
{
    final EULA a;
    
    fb(final EULA a) {
        this.a = a;
    }
    
    public void onCancel(final DialogInterface dialogInterface) {
        this.a.removeDialog(5);
        this.a.showDialog(6);
    }
}
