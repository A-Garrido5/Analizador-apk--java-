// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.protocol.bi;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemLongClickListener;

class a3 implements AdapterView$OnItemLongClickListener
{
    final MediaGallery a;
    
    a3(final MediaGallery a) {
        this.a = a;
    }
    
    public boolean onItemLongClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        final bi a = MediaGallery.d(this.a).a(n);
        if (MediaGallery.e(this.a) != null) {
            MediaGallery.a(this.a, a, view);
            if (!App.I) {
                return true;
            }
        }
        MediaGallery.b(this.a).put(a.a, a);
        view.setSelected(true);
        MediaGallery.a(this.a, this.a.startSupportActionMode(MediaGallery.a(this.a)));
        return true;
    }
}
