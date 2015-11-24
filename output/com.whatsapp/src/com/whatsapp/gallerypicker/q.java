// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import android.graphics.Bitmap;

class q implements b8
{
    final bj a;
    final u b;
    final MediaGalleryBase$MediaItemView c;
    
    q(final u b, final MediaGalleryBase$MediaItemView c, final bj a) {
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    @Override
    public String a() {
        return this.a.b();
    }
    
    @Override
    public Bitmap b() {
        Bitmap a;
        if (this.c.getTag() != this) {
            a = null;
        }
        else {
            a = this.a.a(MediaGalleryBase.c(this.b.d));
            if (a == null) {
                return MediaGalleryBase.a(this.a, this.b.d.getBaseContext());
            }
        }
        return a;
    }
}
