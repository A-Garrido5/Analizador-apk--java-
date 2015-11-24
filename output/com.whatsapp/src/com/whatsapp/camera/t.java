// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.camera;

import android.content.Context;
import com.whatsapp.App;

class t implements i
{
    final CameraActivity a;
    
    t(final CameraActivity a) {
        this.a = a;
    }
    
    @Override
    public void a() {
        App.a((Context)this.a, 2131230880, 1);
        this.a.finish();
    }
    
    @Override
    public void a(float n) {
        final float a = CameraActivity.a(this.a).a();
        if (a < 1.0f) {
            return;
        }
        if (n > a) {
            n = a;
        }
        CameraActivity.a(this.a).a(n, CameraActivity.j(this.a).setZoomLevel(Math.round(CameraActivity.j(this.a).h() * (n - 1.0f) / (a - 1.0f))) / 100.0f);
    }
    
    @Override
    public void a(final float n, final float n2) {
        CameraActivity.n(this.a).a(n, n2);
    }
    
    @Override
    public void a(final boolean b) {
        CameraActivity.n(this.a).a(b);
    }
    
    @Override
    public void b() {
        CameraActivity.v(this.a);
    }
    
    @Override
    public void b(final float n) {
        CameraActivity.a(this.a).b();
    }
    
    @Override
    public void c(final float n) {
        CameraActivity.a(this.a).a(n);
    }
}
