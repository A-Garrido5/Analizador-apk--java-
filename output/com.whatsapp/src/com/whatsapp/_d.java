// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.GoogleMap$OnCameraChangeListener;

class _d implements GoogleMap$OnCameraChangeListener
{
    final LocationPicker2 a;
    
    _d(final LocationPicker2 a) {
        this.a = a;
    }
    
    @Override
    public void onCameraChange(final CameraPosition cameraPosition) {
        LocationPicker2.p(this.a).lat = cameraPosition.target.latitude;
        LocationPicker2.p(this.a).lon = cameraPosition.target.longitude;
        LocationPicker2.p(this.a).name = null;
        LocationPicker2.p(this.a).address = null;
        if (LocationPicker2.l(this.a).getVisibility() == 8) {
            LocationPicker2.b(this.a).removeCallbacks((Runnable)LocationPicker2.x(this.a));
            LocationPicker2.a(this.a, new aog(this.a, cameraPosition.target.latitude, cameraPosition.target.longitude));
            LocationPicker2.b(this.a).post((Runnable)LocationPicker2.x(this.a));
        }
    }
}
