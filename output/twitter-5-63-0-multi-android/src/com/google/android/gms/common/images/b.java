// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import com.google.android.gms.internal.ar;

final class b extends ar
{
    protected int a(final f f, final Bitmap bitmap) {
        return bitmap.getHeight() * bitmap.getRowBytes();
    }
    
    protected void a(final boolean b, final f f, final Bitmap bitmap, final Bitmap bitmap2) {
        super.a(b, f, bitmap, bitmap2);
    }
}
