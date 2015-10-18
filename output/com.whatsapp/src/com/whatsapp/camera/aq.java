// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.camera;

import android.view.View;
import android.view.View$OnClickListener;

class aq implements View$OnClickListener
{
    final CameraActivity a;
    
    aq(final CameraActivity a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        if (CameraActivity.k(this.a).isShowing()) {
            CameraActivity.k(this.a).dismiss();
            if (!CameraActivity.m) {
                return;
            }
        }
        CameraActivity.k(this.a).a((View)CameraActivity.s(this.a), CameraActivity.s(this.a), CameraActivity.s(this.a), (View)CameraActivity.i(this.a));
        CameraActivity.s(this.a).setImageResource(2130838880);
    }
}
