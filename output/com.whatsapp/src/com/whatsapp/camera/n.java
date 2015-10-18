// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.camera;

import android.view.View;
import android.view.View$OnClickListener;

class n implements View$OnClickListener
{
    final CameraActivity a;
    
    n(final CameraActivity a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        CameraActivity.a(this.a, 90 + CameraActivity.w(this.a));
        if (CameraActivity.w(this.a) >= 360) {
            CameraActivity.a(this.a, -360 + CameraActivity.w(this.a));
        }
        CameraActivity.d(this.a).f();
    }
}
