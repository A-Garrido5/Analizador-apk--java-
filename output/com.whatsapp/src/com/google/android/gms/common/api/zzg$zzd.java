// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.api;

public abstract class zzg$zzd implements GoogleApiClient$ConnectionCallbacks
{
    final zzg zzXE;
    
    public zzg$zzd(final zzg zzXE) {
        this.zzXE = zzXE;
    }
    
    @Override
    public void onConnectionSuspended(final int n) {
        zzg.zzb(this.zzXE).lock();
        try {
            zzg.zza(this.zzXE).onConnectionSuspended(n);
        }
        finally {
            zzg.zzb(this.zzXE).unlock();
        }
    }
}
