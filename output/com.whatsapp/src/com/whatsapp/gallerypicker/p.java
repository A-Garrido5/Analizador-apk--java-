// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import android.os.Build$VERSION;
import android.graphics.Bitmap;
import android.support.v4.util.LruCache;

final class p extends LruCache
{
    p(final int n) {
        super(n);
    }
    
    protected int a(final String s, final Bitmap bitmap) {
        if (Build$VERSION.SDK_INT < 12) {
            final int n = bitmap.getRowBytes() * bitmap.getHeight() / 1024;
            if (MediaGalleryBase.v == 0) {
                return n;
            }
        }
        return bitmap.getByteCount() / 1024;
    }
    
    @Override
    protected int sizeOf(final Object o, final Object o2) {
        return this.a((String)o, (Bitmap)o2);
    }
}
