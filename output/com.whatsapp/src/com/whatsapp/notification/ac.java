// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.notification;

import android.view.View;
import android.view.View$OnClickListener;

class ac implements View$OnClickListener
{
    final PopupNotification a;
    
    ac(final PopupNotification a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        PopupNotification.c(this.a);
    }
}
