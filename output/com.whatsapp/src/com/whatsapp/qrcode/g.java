// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.qrcode;

class g implements Runnable
{
    final byte[] a;
    final i b;
    
    g(final i b, final byte[] a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        QrCodeActivity.a(this.b.a, this.a);
    }
}
