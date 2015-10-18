// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Build$VERSION;
import android.graphics.Bitmap;
import android.support.v4.util.LruCache;

class i6 extends LruCache
{
    final App b;
    
    i6(final App b, final int n) {
        this.b = b;
        super(n);
    }
    
    protected int a(final String s, final Bitmap bitmap) {
        if (Build$VERSION.SDK_INT < 12) {
            return bitmap.getRowBytes() * bitmap.getHeight() / 1024;
        }
        return bitmap.getByteCount() / 1024;
    }
    
    @Override
    protected int sizeOf(final Object o, final Object o2) {
        return this.a((String)o, (Bitmap)o2);
    }
}
