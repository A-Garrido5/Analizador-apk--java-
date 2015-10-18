// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class aaj implements Runnable
{
    final LocationSharingService a;
    
    aaj(final LocationSharingService a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        this.a.stopSelf();
    }
}
