// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.notification;

import android.app.Activity;
import com.whatsapp.App;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class g implements DialogInterface$OnClickListener
{
    final PopupNotification a;
    
    g(final PopupNotification a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        App.a(this.a, false, PopupNotification.d(this.a).u);
        this.a.removeDialog(106);
    }
}
