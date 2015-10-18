// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.location.internal;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.Api$Client;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationListener;

class zzd$7 extends zzd$zza
{
    final zzd zzayA;
    final LocationListener zzayz;
    
    zzd$7(final zzd zzayA, final GoogleApiClient googleApiClient, final LocationListener zzayz) {
        this.zzayA = zzayA;
        this.zzayz = zzayz;
        super(googleApiClient);
    }
    
    @Override
    protected void zza(final Api$Client api$Client) {
        this.zza((zzj)api$Client);
    }
    
    protected void zza(final zzj zzj) {
        zzj.zza(this.zzayz);
        this.setResult(Status.zzXP);
    }
}
