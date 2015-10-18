// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Bundle;
import android.location.Location;
import android.location.LocationListener;

class rl implements LocationListener
{
    final lh a;
    
    rl(final lh a) {
        this.a = a;
    }
    
    public void onLocationChanged(final Location e) {
        this.a.e = e;
    }
    
    public void onProviderDisabled(final String s) {
    }
    
    public void onProviderEnabled(final String s) {
    }
    
    public void onStatusChanged(final String s, final int n, final Bundle bundle) {
    }
}
