// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.protocol.bt;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemClickListener;

class ahg implements AdapterView$OnItemClickListener
{
    final ao2 a;
    
    ahg(final ao2 a) {
        this.a = a;
    }
    
    public void onItemClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        boolean b = true;
        final bt bt = this.a.g.get(n);
        if (this.a.k.size() != (b ? 1 : 0) || this.a.k.get(0) != bt) {
            b = false;
        }
        this.a.k.clear();
        this.a.k.add(this.a.g.get(n));
        ao2.c(this.a).notifyDataSetChanged();
        this.a.a(bt, b);
    }
}
