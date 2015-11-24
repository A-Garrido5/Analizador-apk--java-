// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.wallpaper;

class o implements Runnable
{
    final Runnable a;
    final float b;
    final float c;
    final float d;
    final float e;
    final float f;
    final long g;
    final ImageViewTouchBase h;
    
    o(final ImageViewTouchBase h, final float e, final long g, final float d, final float b, final float f, final float c, final Runnable a) {
        this.h = h;
        this.e = e;
        this.g = g;
        this.d = d;
        this.b = b;
        this.f = f;
        this.c = c;
        this.a = a;
    }
    
    @Override
    public void run() {
        final float min = Math.min(this.e, System.currentTimeMillis() - this.g);
        this.h.a(this.d + min * this.b, this.f, this.c);
        if (this.a != null) {
            this.a.run();
        }
        if (min < this.e) {
            this.h.j.post((Runnable)this);
        }
    }
}
