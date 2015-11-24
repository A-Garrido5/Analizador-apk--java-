// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.api;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zzq;
import android.os.Bundle;

class zze$zzd implements GoogleApiClient$ConnectionCallbacks, GoogleApiClient$OnConnectionFailedListener
{
    final zze zzXd;
    
    private zze$zzd(final zze zzXd) {
        this.zzXd = zzXd;
    }
    
    zze$zzd(final zze zze, final zze$1 zze$1) {
        this(zze);
    }
    
    @Override
    public void onConnected(final Bundle bundle) {
        zze.zzc(this.zzXd).zza(new zze$zzb(this.zzXd));
    }
    
    @Override
    public void onConnectionFailed(final ConnectionResult connectionResult) {
        zze.zza(this.zzXd).lock();
        try {
            if (zze.zzb(this.zzXd, connectionResult)) {
                zze.zzd(this.zzXd);
                zze.zze(this.zzXd);
                if (!Api.a) {
                    return;
                }
            }
            zze.zza(this.zzXd, connectionResult);
        }
        finally {
            zze.zza(this.zzXd).unlock();
        }
    }
    
    @Override
    public void onConnectionSuspended(final int n) {
    }
}
