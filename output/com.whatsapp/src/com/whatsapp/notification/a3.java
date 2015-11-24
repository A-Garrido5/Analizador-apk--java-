// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.notification;

import com.whatsapp.App;
import android.view.View;
import android.view.View$OnClickListener;

class a3 implements View$OnClickListener
{
    final PopupNotification a;
    
    a3(final PopupNotification a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        App.a.stop();
        PopupNotification.m(this.a);
        this.a.finish();
    }
}
