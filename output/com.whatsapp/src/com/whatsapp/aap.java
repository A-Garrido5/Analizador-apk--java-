// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.widget.CompoundButton$OnCheckedChangeListener;
import android.widget.CompoundButton;
import android.widget.TextView;

class aap implements Runnable
{
    final GroupChatInfo a;
    
    aap(final GroupChatInfo a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        final View viewById = this.a.findViewById(2131755596);
        final TextView textView = (TextView)this.a.findViewById(2131755594);
        viewById.setVisibility(4);
        GroupChatInfo.c(this.a).setVisibility(0);
        if (dt.c.a(GroupChatInfo.l(this.a))) {
            textView.setPaintFlags(0x8 | textView.getPaintFlags());
            textView.setEnabled(true);
            ((CompoundButton)GroupChatInfo.c(this.a)).setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)null);
            ((CompoundButton)GroupChatInfo.c(this.a)).setChecked(true);
            ((CompoundButton)GroupChatInfo.c(this.a)).setOnCheckedChangeListener(this.a.O);
            if (!App.I) {
                return;
            }
        }
        textView.setPaintFlags(0xFFFFFFF7 & textView.getPaintFlags());
        textView.setEnabled(false);
        ((CompoundButton)GroupChatInfo.c(this.a)).setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)null);
        ((CompoundButton)GroupChatInfo.c(this.a)).setChecked(false);
        ((CompoundButton)GroupChatInfo.c(this.a)).setOnCheckedChangeListener(this.a.O);
    }
}
