// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnClickListener;

class t_ implements View$OnClickListener
{
    final GroupChatInfo a;
    
    t_(final GroupChatInfo a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        GroupChatInfo.w(this.a);
    }
}
