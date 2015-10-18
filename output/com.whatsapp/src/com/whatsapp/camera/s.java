// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.camera;

import android.hardware.Camera;
import android.hardware.Camera$AutoFocusCallback;

class s implements Camera$AutoFocusCallback
{
    final CameraView a;
    
    s(final CameraView a) {
        this.a = a;
    }
    
    public void onAutoFocus(final boolean b, final Camera camera) {
        CameraView.a(this.a).a(b);
    }
}
