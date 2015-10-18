// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnClickListener;

class hz implements View$OnClickListener
{
    final GroupChatInfo a;
    
    hz(final GroupChatInfo a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        if (adc.f(GroupChatInfo.l(this.a))) {
            this.a.showDialog(2);
            if (!App.I) {
                return;
            }
        }
        this.a.showDialog(1);
    }
}
