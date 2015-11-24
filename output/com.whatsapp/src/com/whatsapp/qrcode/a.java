// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.qrcode;

class a implements Runnable
{
    final QrCodeActivity a;
    
    a(final QrCodeActivity a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        QrCodeActivity.d(this.a);
    }
}
