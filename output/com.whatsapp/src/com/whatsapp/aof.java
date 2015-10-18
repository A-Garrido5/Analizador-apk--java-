// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.widget.PopupWindow$OnDismissListener;

class aof implements PopupWindow$OnDismissListener
{
    final Conversation a;
    
    aof(final Conversation a) {
        this.a = a;
    }
    
    public void onDismiss() {
        if (Conversation.C(this.a).c()) {
            Conversation.f(this.a).postDelayed(Conversation.d(this.a), 1000L);
            Conversation.z(this.a);
            if (!App.I) {
                return;
            }
        }
        Conversation.f(this.a).setUnfreezeHeight();
        Conversation.f(this.a).requestLayout();
    }
}
