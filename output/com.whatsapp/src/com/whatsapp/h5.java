// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class h5 implements Runnable
{
    private float a;
    private long b;
    private float c;
    private boolean d;
    private boolean e;
    private final PhotoView f;
    
    public h5(final PhotoView f) {
        this.b = -1L;
        this.f = f;
    }
    
    static boolean a(final h5 h5) {
        return h5.d;
    }
    
    public void a() {
        this.d = false;
        this.e = true;
    }
    
    public boolean a(final float a, final float c) {
        if (this.d) {
            return false;
        }
        this.b = -1L;
        this.a = a;
        this.c = c;
        this.e = false;
        this.d = true;
        this.f.post((Runnable)this);
        return true;
    }
    
    @Override
    public void run() {
        final boolean i = App.I;
        if (!this.e) {
            final long currentTimeMillis = System.currentTimeMillis();
            float n;
            if (this.b != -1L) {
                n = (currentTimeMillis - this.b) / 1000.0f;
            }
            else {
                n = 0.0f;
            }
            final boolean a = PhotoView.a(this.f, n * this.a, n * this.c);
            this.b = currentTimeMillis;
            final float n2 = n * 1000.0f;
            Label_0137: {
                if (this.a > 0.0f) {
                    this.a -= n2;
                    if (this.a >= 0.0f) {
                        break Label_0137;
                    }
                    this.a = 0.0f;
                    if (!i) {
                        break Label_0137;
                    }
                }
                this.a += n2;
                if (this.a > 0.0f) {
                    this.a = 0.0f;
                }
            }
            Label_0200: {
                if (this.c > 0.0f) {
                    this.c -= n2;
                    if (this.c >= 0.0f) {
                        break Label_0200;
                    }
                    this.c = 0.0f;
                    if (!i) {
                        break Label_0200;
                    }
                }
                this.c += n2;
                if (this.c > 0.0f) {
                    this.c = 0.0f;
                }
            }
            if ((this.a == 0.0f && this.c == 0.0f) || !a) {
                this.a();
                PhotoView.a(this.f, false);
            }
            if (!this.e) {
                this.f.post((Runnable)this);
            }
        }
    }
}
