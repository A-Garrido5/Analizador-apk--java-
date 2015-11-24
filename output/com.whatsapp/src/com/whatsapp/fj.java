// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.model.LatLng;

class fj implements Runnable
{
    final boolean a;
    final LocationPicker2 b;
    
    fj(final LocationPicker2 b, final boolean a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        if (LocationPicker2.k(this.b) == null || this.a) {
            LocationPicker2.g(this.b).animateCamera(CameraUpdateFactory.newLatLng(new LatLng(LocationPicker2.y(this.b).getLatitude(), LocationPicker2.y(this.b).getLongitude())));
            LocationPicker2.a(this.b, LocationPicker2.y(this.b), Math.max((int)LocationPicker2.y(this.b).getAccuracy(), 100), null, true);
        }
    }
}
