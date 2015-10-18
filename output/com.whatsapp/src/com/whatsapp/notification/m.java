// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.notification;

import com.whatsapp.z8;
import com.whatsapp.Conversation;
import com.whatsapp.App;
import android.view.View;
import android.view.View$OnClickListener;

class m implements View$OnClickListener
{
    final PopupNotification a;
    
    m(final PopupNotification a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        App.a.stop();
        final String trim = PopupNotification.i(this.a).getText().toString().trim();
        if (PopupNotification.d(this.a) != null && trim.length() > 0) {
            Conversation.v.put(PopupNotification.d(this.a).u, trim);
        }
        this.a.startActivity(Conversation.a(z8.a(PopupNotification.p(this.a).a.a)));
        PopupNotification.m(this.a);
        this.a.finish();
    }
}
