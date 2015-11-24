// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.location.internal;

import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.common.api.zza$zza;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationServices;
import android.location.Location;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.FusedLocationProviderApi;

public class zzd implements FusedLocationProviderApi
{
    @Override
    public Location getLastLocation(final GoogleApiClient googleApiClient) {
        final zzj zze = LocationServices.zze(googleApiClient);
        try {
            return zze.getLastLocation();
        }
        catch (Exception ex) {
            return null;
        }
    }
    
    @Override
    public PendingResult removeLocationUpdates(final GoogleApiClient googleApiClient, final LocationListener locationListener) {
        return googleApiClient.zzb(new zzd$7(this, googleApiClient, locationListener));
    }
    
    @Override
    public PendingResult requestLocationUpdates(final GoogleApiClient googleApiClient, final LocationRequest locationRequest, final LocationListener locationListener) {
        return googleApiClient.zzb(new zzd$1(this, googleApiClient, locationRequest, locationListener));
    }
}
