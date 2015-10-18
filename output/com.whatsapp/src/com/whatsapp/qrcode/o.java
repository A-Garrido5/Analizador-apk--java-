// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.qrcode;

import android.hardware.Camera;
import android.hardware.Camera$AutoFocusCallback;

class o implements Camera$AutoFocusCallback
{
    final QrCodeView a;
    
    o(final QrCodeView a) {
        this.a = a;
    }
    
    public void onAutoFocus(final boolean b, final Camera camera) {
        this.a.postDelayed((Runnable)new p(this), 2000L);
    }
}
