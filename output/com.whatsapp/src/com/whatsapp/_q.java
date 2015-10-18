// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Bundle;
import android.location.Location;
import android.location.LocationListener;

class _q implements LocationListener
{
    final lh a;
    
    _q(final lh a) {
        this.a = a;
    }
    
    public void onLocationChanged(final Location d) {
        final lh a = this.a;
        ++a.c;
        this.a.d = d;
        if (this.a.c >= 2 || d.getAccuracy() < 200.0f) {
            this.a.f = true;
            this.a.c = 0;
        }
    }
    
    public void onProviderDisabled(final String s) {
    }
    
    public void onProviderEnabled(final String s) {
    }
    
    public void onStatusChanged(final String s, final int n, final Bundle bundle) {
    }
}
