// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.google.android.gms.common.ConnectionResult;
import java.util.Iterator;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationRequest;
import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener;
import com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks;

class ji implements GoogleApiClient$ConnectionCallbacks, GoogleApiClient$OnConnectionFailedListener
{
    final ho a;
    
    ji(final ho a) {
        this.a = a;
    }
    
    @Override
    public void onConnected(final Bundle bundle) {
        final boolean i = App.I;
        for (final aq8 aq8 : ho.a(this.a).values()) {
            final LocationRequest create = LocationRequest.create();
            int priority;
            if (aq8.c(aq8)) {
                priority = 100;
            }
            else {
                priority = 102;
            }
            create.setPriority(priority);
            create.setInterval(aq8.b(aq8));
            create.setFastestInterval(1000L);
            create.setSmallestDisplacement(aq8.a(aq8));
            LocationServices.FusedLocationApi.requestLocationUpdates(ho.b(this.a), create, aq8);
            if (i) {
                break;
            }
        }
        if (ho.a(this.a).isEmpty()) {
            ho.b(this.a).disconnect();
        }
    }
    
    @Override
    public void onConnectionFailed(final ConnectionResult connectionResult) {
    }
    
    @Override
    public void onConnectionSuspended(final int n) {
    }
}
