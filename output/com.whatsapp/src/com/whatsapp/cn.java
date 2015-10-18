// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class cn implements Runnable
{
    final GoogleMapView2 a;
    
    cn(final GoogleMapView2 a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        this.a.getMap().stopAnimation();
        GoogleMapView2.a(this.a, 0);
    }
}
