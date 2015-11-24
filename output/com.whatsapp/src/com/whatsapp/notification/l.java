// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.notification;

import com.whatsapp.App;
import android.view.View;
import android.view.View$OnClickListener;

class l implements View$OnClickListener
{
    final PopupNotification a;
    
    l(final PopupNotification a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        App.av();
        if (PopupNotification.p(this.a) != null) {
            PopupNotification.l(this.a).add(PopupNotification.p(this.a).a);
        }
        if (PopupNotification.d(this.a) != null) {
            PopupNotification.n(this.a).add(PopupNotification.d(this.a).u);
        }
    }
}
