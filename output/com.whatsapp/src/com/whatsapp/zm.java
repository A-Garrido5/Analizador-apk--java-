// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemClickListener;

class zm implements AdapterView$OnItemClickListener
{
    final SetStatus a;
    
    zm(final SetStatus a) {
        this.a = a;
    }
    
    public void onItemClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        this.a.e(SetStatus.r.get(n));
    }
}
