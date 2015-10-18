// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemClickListener;

class at_ implements AdapterView$OnItemClickListener
{
    final BlockList a;
    
    at_(final BlockList a) {
        this.a = a;
    }
    
    public void onItemClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        this.a.openContextMenu(view);
    }
}
