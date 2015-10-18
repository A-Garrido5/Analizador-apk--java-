// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class aa5 implements DialogInterface$OnClickListener
{
    final EULA a;
    
    aa5(final EULA a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.a.showDialog(7);
    }
}
