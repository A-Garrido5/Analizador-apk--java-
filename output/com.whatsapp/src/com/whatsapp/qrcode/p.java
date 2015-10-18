// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.qrcode;

class p implements Runnable
{
    final o a;
    
    p(final o a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        if (QrCodeView.d(this.a.a) != null) {
            QrCodeView.d(this.a.a).autoFocus(this.a.a.a);
        }
    }
}
