// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.camera;

import android.view.View;
import android.view.View$OnClickListener;

class ao implements View$OnClickListener
{
    final CameraActivity a;
    
    ao(final CameraActivity a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        CameraActivity.a(this.a, CameraActivity.j(this.a).a());
    }
}
