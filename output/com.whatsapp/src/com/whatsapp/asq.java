// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class asq implements Runnable
{
    private boolean a;
    private long b;
    private float c;
    private float d;
    private final PhotoView e;
    private boolean f;
    
    public asq(final PhotoView e) {
        this.b = -1L;
        this.e = e;
    }
    
    public void a() {
        this.f = false;
        this.a = true;
    }
    
    public boolean a(final float c, final float d) {
        if (this.f) {
            return false;
        }
        this.b = -1L;
        this.c = c;
        this.d = d;
        this.a = false;
        this.f = true;
        this.e.postDelayed((Runnable)this, 250L);
        return true;
    }
    
    @Override
    public void run() {
        if (!this.a) {
            final long currentTimeMillis = System.currentTimeMillis();
            float n;
            if (this.b != -1L) {
                n = currentTimeMillis - this.b;
            }
            else {
                n = 0.0f;
            }
            if (this.b == -1L) {
                this.b = currentTimeMillis;
            }
            float n2 = 0.0f;
            float n3 = 0.0f;
            Label_0168: {
                if (n >= 100.0f) {
                    final float c = this.c;
                    final float d = this.d;
                    if (!App.I) {
                        n2 = d;
                        n3 = c;
                        break Label_0168;
                    }
                }
                final float n4 = 10.0f * (this.c / (100.0f - n));
                final float n5 = 10.0f * (this.d / (100.0f - n));
                float c2;
                if (Math.abs(n4) > Math.abs(this.c) || n4 == Float.NaN) {
                    c2 = this.c;
                }
                else {
                    c2 = n4;
                }
                if (Math.abs(n5) > Math.abs(this.d) || n5 == Float.NaN) {
                    final float d2 = this.d;
                    n3 = c2;
                    n2 = d2;
                }
                else {
                    n3 = c2;
                    n2 = n5;
                }
            }
            PhotoView.a(this.e, n3, n2);
            this.c -= n3;
            this.d -= n2;
            if (this.c == 0.0f && this.d == 0.0f) {
                this.a();
            }
            if (!this.a) {
                this.e.post((Runnable)this);
            }
        }
    }
}
