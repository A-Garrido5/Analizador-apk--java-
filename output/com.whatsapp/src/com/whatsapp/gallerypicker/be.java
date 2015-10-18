// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemClickListener;

class be implements AdapterView$OnItemClickListener
{
    final MediaPicker a;
    
    be(final MediaPicker a) {
        this.a = a;
    }
    
    public void onItemClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        final bj a = this.a.o.a(n);
        MediaPicker.a(this.a, view);
        MediaPicker.a(this.a, a);
    }
}
