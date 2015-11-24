// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;

class b implements b8
{
    final bj a;
    final aw b;
    final ImageView c;
    final n d;
    
    b(final aw b, final ImageView c, final bj a, final n d) {
        this.b = b;
        this.c = c;
        this.a = a;
        this.d = d;
    }
    
    @Override
    public String a() {
        return this.d.a();
    }
    
    @Override
    public Bitmap b() {
        Bitmap a;
        if (this.c.getTag() != this) {
            a = null;
        }
        else {
            a = this.a.a(GalleryPickerFragment.a(this.b.d));
            if (a == null) {
                return MediaGalleryBase.a(this.a, (Context)this.b.d.getActivity());
            }
        }
        return a;
    }
}
