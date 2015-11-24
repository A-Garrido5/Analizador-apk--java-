// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.api;

import com.google.android.gms.common.internal.zzu;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.lang.ref.WeakReference;

class zze$zzc implements GoogleApiClient$ConnectionProgressReportCallbacks
{
    private final WeakReference zzXe;
    private final Api zzXk;
    private final int zzXl;
    
    public zze$zzc(final zze zze, final Api zzXk, final int zzXl) {
        this.zzXe = new WeakReference((T)zze);
        this.zzXk = zzXk;
        this.zzXl = zzXl;
    }
    
    @Override
    public void onReportAccountValidation(final ConnectionResult connectionResult) {
        boolean b = true;
        final zze zze = (zze)this.zzXe.get();
        if (zze == null) {
            return;
        }
        Label_0068: {
            if (Looper.myLooper() != com.google.android.gms.common.api.zze.zzb(zze).getLooper()) {
                break Label_0068;
            }
            while (true) {
                zzu.zza(b, "onReportAccountValidation must be called on the GoogleApiClient handler thread");
                com.google.android.gms.common.api.zze.zza(zze).lock();
                try {
                    if (!com.google.android.gms.common.api.zze.zza(zze, 1)) {
                        return;
                    }
                    if (!connectionResult.isSuccess()) {
                        com.google.android.gms.common.api.zze.zza(zze, connectionResult, this.zzXk, this.zzXl);
                    }
                    if (com.google.android.gms.common.api.zze.zzf(zze)) {
                        com.google.android.gms.common.api.zze.zzh(zze);
                    }
                    return;
                    b = false;
                }
                finally {
                    com.google.android.gms.common.api.zze.zza(zze).unlock();
                }
            }
        }
    }
    
    @Override
    public void onReportServiceBinding(final ConnectionResult connectionResult) {
        final zze zze = (zze)this.zzXe.get();
        if (zze == null) {
            return;
        }
        final Looper myLooper = Looper.myLooper();
        final Looper looper = com.google.android.gms.common.api.zze.zzb(zze).getLooper();
        boolean b = false;
        if (myLooper == looper) {
            b = true;
        }
        zzu.zza(b, "onReportServiceBinding must be called on the GoogleApiClient handler thread");
        com.google.android.gms.common.api.zze.zza(zze).lock();
        try {
            if (!com.google.android.gms.common.api.zze.zza(zze, 0)) {
                return;
            }
            if (!connectionResult.isSuccess()) {
                com.google.android.gms.common.api.zze.zza(zze, connectionResult, this.zzXk, this.zzXl);
            }
            if (com.google.android.gms.common.api.zze.zzf(zze)) {
                com.google.android.gms.common.api.zze.zzg(zze);
            }
        }
        finally {
            com.google.android.gms.common.api.zze.zza(zze).unlock();
        }
    }
}
