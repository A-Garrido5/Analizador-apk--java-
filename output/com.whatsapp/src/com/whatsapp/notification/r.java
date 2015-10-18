// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.notification;

import android.view.View;
import android.view.View$OnClickListener;

class r implements View$OnClickListener
{
    final PopupNotification a;
    
    r(final PopupNotification a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        PopupNotification.o(this.a).a(this.a.findViewById(2131755719));
    }
}
