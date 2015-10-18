// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class la implements Runnable
{
    private float a;
    private final PhotoView b;
    private boolean c;
    private long d;
    private float e;
    private float f;
    private boolean g;
    
    public la(final PhotoView b) {
        this.b = b;
    }
    
    public void a() {
        this.c = false;
        this.g = true;
        PhotoView.a(this.b, Math.round(PhotoView.a(this.b)));
        PhotoView.b(this.b, true);
        this.b.requestLayout();
        this.b.invalidate();
    }
    
    public void a(final float a) {
        Label_0049: {
            if (this.c) {
                this.a += a;
                if (!App.I) {
                    break Label_0049;
                }
            }
            this.a = a;
            this.e = 0.0f;
            this.d = -1L;
            this.b.post((Runnable)this);
        }
        this.f = this.a / 300.0f;
        this.g = false;
        this.c = true;
    }
    
    @Override
    public void run() {
        if (!this.g) {
            if (this.e != this.a) {
                final long currentTimeMillis = System.currentTimeMillis();
                long n;
                if (this.d != -1L) {
                    n = currentTimeMillis - this.d;
                }
                else {
                    n = 0L;
                }
                float n2 = this.f * n;
                if ((this.e < this.a && n2 + this.e > this.a) || (this.e > this.a && n2 + this.e < this.a)) {
                    n2 = this.a - this.e;
                }
                this.b.a(n2, false);
                this.e += n2;
                if (this.e == this.a) {
                    this.a();
                }
                this.d = currentTimeMillis;
            }
            if (!this.g) {
                this.b.post((Runnable)this);
            }
        }
    }
}
