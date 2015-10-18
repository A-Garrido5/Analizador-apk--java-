// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class aad implements Runnable
{
    private final PhotoView a;
    private float b;
    private float c;
    private float d;
    private float e;
    private long f;
    private boolean g;
    private boolean h;
    private float i;
    private boolean j;
    
    public aad(final PhotoView a) {
        this.a = a;
    }
    
    public void a() {
        this.h = false;
        this.j = true;
    }
    
    public boolean a(final float b, final float e, final float d, final float c) {
        if (this.h) {
            return false;
        }
        this.d = d;
        this.c = c;
        this.e = e;
        this.f = System.currentTimeMillis();
        this.b = b;
        this.g = (this.e > this.b);
        this.i = (this.e - this.b) / 200.0f;
        this.h = true;
        this.j = false;
        this.a.post((Runnable)this);
        return true;
    }
    
    @Override
    public void run() {
        if (!this.j) {
            final float n = this.b + this.i * (System.currentTimeMillis() - this.f);
            PhotoView.a(this.a, n, this.d, this.c, true);
            if (n == this.e || this.g == n > this.e) {
                PhotoView.a(this.a, this.e, this.d, this.c, true);
                this.a();
            }
            if (!this.j) {
                this.a.post((Runnable)this);
            }
        }
    }
}
