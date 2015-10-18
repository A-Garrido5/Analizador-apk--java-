// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.camera;

import android.hardware.Camera$ShutterCallback;

class p implements Camera$ShutterCallback
{
    final CameraView a;
    final y b;
    
    p(final CameraView a, final y b) {
        this.a = a;
        this.b = b;
    }
    
    public void onShutter() {
        this.b.a();
    }
}
