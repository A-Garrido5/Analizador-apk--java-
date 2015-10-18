// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.qrcode;

import android.hardware.Camera;

class d implements Runnable
{
    final QrCodeActivity a;
    
    d(final QrCodeActivity a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        final Camera c = QrCodeActivity.e(this.a).c();
        if (c != null) {
            c.setOneShotPreviewCallback(QrCodeActivity.g(this.a));
        }
    }
}
