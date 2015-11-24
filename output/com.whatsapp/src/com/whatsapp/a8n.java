// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemClickListener;

class a8n implements AdapterView$OnItemClickListener
{
    final ListChatInfo a;
    
    a8n(final ListChatInfo a) {
        this.a = a;
    }
    
    public void onItemClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        final a_9 a_9 = (a_9)view.getTag();
        if (a_9 != null) {
            ListChatInfo.b(this.a, a_9);
            view.showContextMenu();
        }
    }
}
