// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.camera;

import android.app.Activity;
import com.whatsapp.l1;

class g extends l1
{
    final CameraActivity k;
    
    g(final CameraActivity k, final Activity activity) {
        this.k = k;
        super(activity);
    }
    
    @Override
    public void dismiss() {
        super.dismiss();
        CameraActivity.s(this.k).setImageResource(2130838878);
    }
}
