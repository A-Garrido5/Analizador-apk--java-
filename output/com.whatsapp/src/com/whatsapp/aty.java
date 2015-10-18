// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.widget.CompoundButton;
import android.widget.CompoundButton$OnCheckedChangeListener;

class aty implements CompoundButton$OnCheckedChangeListener
{
    final GroupChatInfo a;
    
    aty(final GroupChatInfo a) {
        this.a = a;
    }
    
    public void onCheckedChanged(final CompoundButton compoundButton, final boolean b) {
        this.a.findViewById(2131755594).setEnabled(false);
        GroupChatInfo.c(this.a).setVisibility(4);
        this.a.findViewById(2131755596).setVisibility(0);
        if (b) {
            App.a(new a_(this, GroupChatInfo.l(this.a), 0L));
            if (!App.I) {
                return;
            }
        }
        App.a(new aw(this, GroupChatInfo.l(this.a)));
    }
}
