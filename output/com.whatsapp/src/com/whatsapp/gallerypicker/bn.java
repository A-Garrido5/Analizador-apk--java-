// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import android.graphics.Bitmap;

class bn implements Runnable
{
    final Bitmap a;
    final Bitmap b;
    final i c;
    final b5 d;
    
    bn(final i c, final b5 d, final Bitmap b, final Bitmap a) {
        this.c = c;
        this.d = d;
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        this.d.a(this.b, this.a != null);
    }
}
