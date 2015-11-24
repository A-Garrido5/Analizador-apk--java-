// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnClickListener;

class ahc implements View$OnClickListener
{
    final GroupChatInfo a;
    
    ahc(final GroupChatInfo a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        if (adc.f(GroupChatInfo.l(this.a))) {
            this.a.showDialog(50);
            if (!App.I) {
                return;
            }
        }
        this.a.f(this.a.getString(2131231791));
    }
}
