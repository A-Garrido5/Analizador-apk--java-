// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.notification;

import android.view.View;
import com.whatsapp.up;
import android.view.View$OnClickListener;

class b implements View$OnClickListener
{
    final up a;
    final PopupNotification b;
    
    b(final PopupNotification b, final up a) {
        this.b = b;
        this.a = a;
    }
    
    public void onClick(final View view) {
        this.a.b();
    }
}
