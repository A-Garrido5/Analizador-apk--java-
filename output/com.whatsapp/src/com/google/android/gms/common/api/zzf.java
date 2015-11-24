// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.api;

import java.util.Iterator;
import com.google.android.gms.common.ConnectionResult;
import android.os.Bundle;

public class zzf implements zzh
{
    private final zzg zzWK;
    
    public zzf(final zzg zzWK) {
        this.zzWK = zzWK;
    }
    
    @Override
    public void begin() {
        this.zzWK.zzmL();
    }
    
    @Override
    public void connect() {
        this.zzWK.zzmM();
    }
    
    @Override
    public String getName() {
        return "DISCONNECTED";
    }
    
    @Override
    public void onConnected(final Bundle bundle) {
    }
    
    @Override
    public void onConnectionSuspended(final int n) {
    }
    
    @Override
    public void zza(final ConnectionResult connectionResult, final Api api, final int n) {
    }
    
    @Override
    public void zzaV(final int n) {
        final boolean a = Api.a;
        int n2;
        if (n == -1) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        if (n2 != 0) {
            final Iterator iterator = this.zzWK.zzXo.iterator();
            while (iterator.hasNext()) {
                iterator.next().cancel();
                if (a) {
                    break;
                }
            }
            this.zzWK.zzXo.clear();
            this.zzWK.zzmK();
            this.zzWK.zzXv.clear();
        }
    }
    
    @Override
    public zza$zza zzb(final zza$zza zza$zza) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }
}
