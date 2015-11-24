// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.qrcode;

class h implements Runnable
{
    final QrCodeActivity a;
    
    h(final QrCodeActivity a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        this.a.setSupportProgressBarIndeterminateVisibility(true);
    }
}
