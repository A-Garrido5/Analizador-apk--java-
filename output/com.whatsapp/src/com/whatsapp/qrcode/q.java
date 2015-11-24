// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.qrcode;

class q implements Runnable
{
    final QrCodeActivity a;
    
    q(final QrCodeActivity a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        this.a.a(2131231853);
        this.a.setSupportProgressBarIndeterminateVisibility(false);
        QrCodeActivity.a(this.a, (String)null);
        QrCodeActivity.d(this.a);
    }
}
