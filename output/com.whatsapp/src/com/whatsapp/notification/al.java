// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.notification;

import android.view.View;
import android.view.View$OnClickListener;

class al implements View$OnClickListener
{
    final PopupNotification a;
    
    al(final PopupNotification a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        PopupNotification.k(this.a);
    }
}
