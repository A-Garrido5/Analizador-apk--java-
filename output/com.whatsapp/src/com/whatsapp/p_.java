// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemClickListener;

class p_ implements AdapterView$OnItemClickListener
{
    final BroadcastDetails a;
    
    p_(final BroadcastDetails a) {
        this.a = a;
    }
    
    public void onItemClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        final a_9 a_9 = (a_9)view.getTag();
        if (a_9 != null) {
            BroadcastDetails.a(this.a, a_9);
            this.a.showDialog(3);
        }
    }
}
