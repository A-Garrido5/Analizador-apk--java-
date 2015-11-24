// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.notification;

import android.view.View;
import android.view.View$OnClickListener;

class t implements View$OnClickListener
{
    final PopupNotification a;
    
    t(final PopupNotification a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        PopupNotification.f(this.a);
    }
}
