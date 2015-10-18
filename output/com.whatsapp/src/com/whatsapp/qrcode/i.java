// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.qrcode;

import android.hardware.Camera;
import android.hardware.Camera$PreviewCallback;

class i implements Camera$PreviewCallback
{
    final QrCodeActivity a;
    
    i(final QrCodeActivity a) {
        this.a = a;
    }
    
    public void onPreviewFrame(final byte[] array, final Camera camera) {
        QrCodeActivity.c(this.a).post((Runnable)new g(this, array));
    }
}
