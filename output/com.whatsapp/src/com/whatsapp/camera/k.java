// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.camera;

import android.view.View;
import android.view.View$OnLongClickListener;

class k implements View$OnLongClickListener
{
    final CameraActivity a;
    
    k(final CameraActivity a) {
        this.a = a;
    }
    
    public boolean onLongClick(final View view) {
        CameraActivity.g(this.a).setImageResource(2130837682);
        CameraActivity.c(this.a);
        return true;
    }
}
