// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.notification;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class d implements DialogInterface$OnClickListener
{
    final PopupNotification a;
    
    d(final PopupNotification a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.a.removeDialog(106);
    }
}
