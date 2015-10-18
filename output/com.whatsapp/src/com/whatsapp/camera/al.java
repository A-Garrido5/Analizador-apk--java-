// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.camera;

import android.view.View;
import com.whatsapp.util.co;

class al extends co
{
    final CameraActivity b;
    
    al(final CameraActivity b) {
        this.b = b;
    }
    
    @Override
    public void a(final View view) {
        if (!CameraActivity.j(this.b).g() && CameraActivity.l(this.b) == null) {
            CameraActivity.q(this.b);
        }
    }
}
