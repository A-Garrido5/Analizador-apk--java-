// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.app.Activity;
import android.view.View;
import android.view.View$OnClickListener;

class a8y implements View$OnClickListener
{
    final QuickContactActivity a;
    
    a8y(final QuickContactActivity a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        final boolean i = App.I;
        Label_0080: {
            if (QuickContactActivity.c(this.a).m()) {
                GroupChatInfo.a(QuickContactActivity.c(this.a), this.a);
                if (!i) {
                    break Label_0080;
                }
            }
            if (QuickContactActivity.c(this.a).k()) {
                ListChatInfo.a(QuickContactActivity.c(this.a), this.a);
                if (!i) {
                    break Label_0080;
                }
            }
            ContactInfo.a(QuickContactActivity.c(this.a), this.a);
        }
        QuickContactActivity.a(this.a, false);
    }
}
