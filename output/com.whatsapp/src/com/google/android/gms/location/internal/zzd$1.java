// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.location.internal;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import android.os.Looper;
import com.google.android.gms.common.api.Api$Client;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;

class zzd$1 extends zzd$zza
{
    final zzd zzayA;
    final LocationRequest zzayy;
    final LocationListener zzayz;
    
    zzd$1(final zzd zzayA, final GoogleApiClient googleApiClient, final LocationRequest zzayy, final LocationListener zzayz) {
        this.zzayA = zzayA;
        this.zzayy = zzayy;
        this.zzayz = zzayz;
        super(googleApiClient);
    }
    
    @Override
    protected void zza(final Api$Client api$Client) {
        this.zza((zzj)api$Client);
    }
    
    protected void zza(final zzj zzj) {
        zzj.zza(this.zzayy, this.zzayz, null);
        this.setResult(Status.zzXP);
    }
}
