// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.location.internal;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationServices$zza;

abstract class zzd$zza extends LocationServices$zza
{
    public zzd$zza(final GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }
    
    public Result createFailedResult(final Status status) {
        return this.zzb(status);
    }
    
    public Status zzb(final Status status) {
        return status;
    }
}
