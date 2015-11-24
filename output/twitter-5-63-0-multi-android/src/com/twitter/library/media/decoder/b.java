// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.decoder;

import com.twitter.internal.android.util.Size;
import android.graphics.Bitmap;

class b
{
    public final Bitmap a;
    public final Size b;
    
    public b(final Bitmap a) {
        this.a = a;
        Size b;
        if (a != null) {
            b = Size.a(a);
        }
        else {
            b = Size.a;
        }
        this.b = b;
    }
    
    public b(final Size b) {
        this.a = null;
        this.b = b;
    }
}
