// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

public class qs implements qp
{
    private final qo a;
    private final qq b;
    private final qr c;
    
    public qs(final qr c, final qq b, final qo a) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    private void a(final Drawable drawable) {
        this.c.b(drawable);
    }
    
    private boolean c() {
        return this.c.r() >= 1.0f;
    }
    
    @Override
    public void a() {
        this.a.a(this.c.r());
        if (this.c()) {
            this.a((Drawable)this.a.a(this.b.s()));
            return;
        }
        this.a(this.a.a());
    }
    
    @Override
    public void a(final Bitmap bitmap, final boolean b) {
        this.a.a(bitmap, b);
        this.a();
    }
    
    @Override
    public void b() {
        this.a.b();
        this.a();
    }
}
