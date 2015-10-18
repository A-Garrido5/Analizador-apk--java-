// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemClickListener;

class bb implements AdapterView$OnItemClickListener
{
    final GalleryPickerFragment a;
    
    bb(final GalleryPickerFragment a) {
        this.a = a;
    }
    
    public void onItemClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        GalleryPickerFragment.a(this.a, n, view);
    }
}
