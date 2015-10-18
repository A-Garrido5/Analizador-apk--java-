// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import android.graphics.Bitmap;
import com.whatsapp.PhotoView;
import android.net.Uri;

class x implements b5
{
    final ImagePreview a;
    final Uri b;
    final PhotoView c;
    
    x(final ImagePreview a, final PhotoView c, final Uri b) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    @Override
    public void a() {
    }
    
    @Override
    public void a(final Bitmap bitmap, final boolean b) {
        if (this.c.getTag() == this.b) {
            this.c.a(bitmap);
        }
    }
}
