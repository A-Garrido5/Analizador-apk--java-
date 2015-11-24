// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.camera;

import android.view.View;
import com.whatsapp.util.co;

class ah extends co
{
    final CameraActivity b;
    
    ah(final CameraActivity b) {
        this.b = b;
    }
    
    @Override
    public void a(final View view) {
        CameraActivity.l(this.b).delete();
        CameraActivity.b(this.b);
    }
}
