// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemClickListener;

class ko implements AdapterView$OnItemClickListener
{
    final GroupChatInfo a;
    
    ko(final GroupChatInfo a) {
        this.a = a;
    }
    
    public void onItemClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        final a_9 a_9 = (a_9)view.getTag();
        if (a_9 != null && GroupChatInfo.r(this.a).containsKey(a_9.u)) {
            GroupChatInfo.c(this.a, a_9.u);
            if (!App.I) {
                return;
            }
        }
        if (a_9 != null) {
            GroupChatInfo.a(this.a, a_9);
            view.showContextMenu();
        }
    }
}
