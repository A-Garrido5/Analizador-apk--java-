// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.api;

import java.util.Iterator;
import com.google.android.gms.common.ConnectionResult;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.util.Log;

public class zzd implements zzh
{
    private final zzg zzWK;
    
    public zzd(final zzg zzWK) {
        this.zzWK = zzWK;
    }
    
    private void zza(final zzg$zze zzg$zze) {
        this.zzWK.zzb(zzg$zze);
        final Api$Client zza = this.zzWK.zza(zzg$zze.zzms());
        if (!zza.isConnected() && this.zzWK.zzXv.containsKey(zzg$zze.zzms())) {
            zzg$zze.zzr(new Status(17));
            return;
        }
        zzg$zze.zzb(zza);
    }
    
    @Override
    public void begin() {
        final boolean a = Api.a;
        while (!this.zzWK.zzXo.isEmpty()) {
            try {
                this.zza(this.zzWK.zzXo.remove());
                continue;
            }
            catch (DeadObjectException ex) {
                Log.w("GoogleApiClientConnected", "Service died while flushing queue", (Throwable)ex);
                if (!a) {
                    continue;
                }
            }
            break;
        }
    }
    
    @Override
    public void connect() {
    }
    
    @Override
    public String getName() {
        return "CONNECTED";
    }
    
    @Override
    public void onConnected(final Bundle bundle) {
    }
    
    @Override
    public void onConnectionSuspended(final int n) {
        Label_0043: {
            switch (n) {
                case 2: {
                    this.zzaV(n);
                    this.zzWK.connect();
                    if (Api.a) {
                        break Label_0043;
                    }
                    break;
                }
                case 1: {
                    this.zzWK.zzmQ();
                    this.zzaV(n);
                }
            }
        }
    }
    
    @Override
    public void zza(final ConnectionResult connectionResult, final Api api, final int n) {
    }
    
    @Override
    public void zzaV(final int n) {
        final boolean a = Api.a;
        boolean b;
        if (n == -1) {
            b = true;
        }
        else {
            b = false;
        }
        Label_0092: {
            if (b) {
                this.zzWK.zzmK();
                this.zzWK.zzXv.clear();
                if (!a) {
                    break Label_0092;
                }
            }
            final Iterator<zzg$zze> iterator = (Iterator<zzg$zze>)this.zzWK.zzXA.iterator();
            while (iterator.hasNext()) {
                iterator.next().forceFailureUnlessReady(new Status(8, "The connection to Google Play services was lost"));
                if (a) {
                    break;
                }
            }
        }
        this.zzWK.zze(null);
        if (!b) {
            this.zzWK.zzXn.zzbu(n);
        }
        this.zzWK.zzXn.zznT();
    }
    
    @Override
    public zza$zza zzb(final zza$zza zza$zza) {
        try {
            this.zza(zza$zza);
            return zza$zza;
        }
        catch (DeadObjectException ex) {
            this.zzaV(1);
            return zza$zza;
        }
    }
}
