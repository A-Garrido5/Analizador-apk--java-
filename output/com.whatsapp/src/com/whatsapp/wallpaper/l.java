// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.wallpaper;

class l implements Runnable
{
    final r a;
    final ImageViewTouchBase b;
    final boolean c;
    
    l(final ImageViewTouchBase b, final r a, final boolean c) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    @Override
    public void run() {
        this.b.setImageRotateBitmapResetBase(this.a, this.c);
    }
}
