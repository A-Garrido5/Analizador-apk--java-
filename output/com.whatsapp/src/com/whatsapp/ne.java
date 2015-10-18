// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemClickListener;

class ne implements AdapterView$OnItemClickListener
{
    final ContactInfo a;
    
    ne(final ContactInfo a) {
        this.a = a;
    }
    
    public void onItemClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        final int n3 = n - 1;
        if (n3 >= 0 && n3 < ContactInfo.a(this.a).getCount()) {
            this.a.startActivity(Conversation.a(ContactInfo.a(this.a).a(n3)));
        }
    }
}
