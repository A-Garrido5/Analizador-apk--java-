// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.location;

import com.google.android.gms.common.api.PendingResult;
import android.location.Location;
import com.google.android.gms.common.api.GoogleApiClient;

public interface FusedLocationProviderApi
{
    Location getLastLocation(final GoogleApiClient p0);
    
    PendingResult removeLocationUpdates(final GoogleApiClient p0, final LocationListener p1);
    
    PendingResult requestLocationUpdates(final GoogleApiClient p0, final LocationRequest p1, final LocationListener p2);
}
