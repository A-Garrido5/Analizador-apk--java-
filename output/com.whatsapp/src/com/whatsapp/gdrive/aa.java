// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import android.content.DialogInterface;
import android.content.DialogInterface$OnCancelListener;
import android.content.DialogInterface$OnClickListener;

final class aa implements DialogInterface$OnClickListener
{
    final DialogInterface$OnCancelListener a;
    
    aa(final DialogInterface$OnCancelListener a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        if (this.a != null) {
            this.a.onCancel(dialogInterface);
        }
    }
}
