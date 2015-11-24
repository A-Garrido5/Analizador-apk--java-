// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import java.lang.ref.SoftReference;
import android.graphics.Bitmap;
import com.whatsapp.protocol.c6;
import android.support.v4.util.LruCache;

class aq extends LruCache
{
    final b b;
    
    aq(final b b, final int n) {
        this.b = b;
        super(n);
    }
    
    protected int a(final c6 c6, final Bitmap bitmap) {
        return b8.a(bitmap) / 1024;
    }
    
    protected void a(final boolean b, final c6 c6, final Bitmap bitmap, final Bitmap bitmap2) {
        if (b) {
            b.a(this.b).put(c6, new SoftReference<Bitmap>(bitmap));
            b.b(this.b).remove(c6);
        }
    }
    
    @Override
    protected void entryRemoved(final boolean b, final Object o, final Object o2, final Object o3) {
        this.a(b, (c6)o, (Bitmap)o2, (Bitmap)o3);
    }
    
    @Override
    protected int sizeOf(final Object o, final Object o2) {
        return this.a((c6)o, (Bitmap)o2);
    }
}
