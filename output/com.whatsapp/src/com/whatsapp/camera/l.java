// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.camera;

class l implements Runnable
{
    final ShutterOverlay a;
    
    l(final ShutterOverlay a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        ShutterOverlay.a(this.a, false);
        this.a.invalidate();
    }
}
