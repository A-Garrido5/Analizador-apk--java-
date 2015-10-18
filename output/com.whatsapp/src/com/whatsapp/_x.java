// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.graphics.Bitmap;
import com.whatsapp.wallpaper.j;

class _x implements j
{
    final TouchImageView a;
    
    _x(final TouchImageView a) {
        this.a = a;
    }
    
    @Override
    public void a(final Bitmap bitmap) {
        if (this.a.t) {
            bitmap.recycle();
        }
    }
}
