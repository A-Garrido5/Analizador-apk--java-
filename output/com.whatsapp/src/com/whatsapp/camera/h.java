// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.camera;

import android.content.Context;
import com.whatsapp.App;
import android.view.MotionEvent;
import android.view.View;
import android.view.View$OnTouchListener;

class h implements View$OnTouchListener
{
    final CameraActivity a;
    
    h(final CameraActivity a) {
        this.a = a;
    }
    
    public boolean onTouch(final View view, final MotionEvent motionEvent) {
        boolean b = true;
        if (CameraActivity.j(this.a).g()) {
            if (motionEvent.getAction() == (b ? 1 : 0)) {
                final CameraActivity a = this.a;
                if (System.currentTimeMillis() - CameraActivity.p(this.a) <= 1000L) {
                    b = false;
                }
                CameraActivity.a(a, b);
                if (!CameraActivity.m) {
                    return false;
                }
            }
            if (motionEvent.getAction() == 2 && -motionEvent.getY() > CameraActivity.r(this.a).getHeight()) {
                CameraActivity.a(this.a, false);
                App.a((Context)this.a, 2131231902, 0);
            }
        }
        return false;
    }
}
