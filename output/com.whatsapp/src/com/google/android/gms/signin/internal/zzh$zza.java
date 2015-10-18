// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.signin.internal;

import java.util.List;
import com.google.android.gms.common.api.GoogleApiClient$ServerAuthCodeCallbacks;
import java.util.concurrent.ExecutorService;
import com.google.android.gms.internal.zzpt;

class zzh$zza extends zzd$zza
{
    private final zzpt zzZU;
    private final ExecutorService zzaKb;
    
    public zzh$zza(final zzpt zzZU, final ExecutorService zzaKb) {
        this.zzZU = zzZU;
        this.zzaKb = zzaKb;
    }
    
    static GoogleApiClient$ServerAuthCodeCallbacks zza(final zzh$zza zzh$zza) {
        return zzh$zza.zzyb();
    }
    
    private GoogleApiClient$ServerAuthCodeCallbacks zzyb() {
        return this.zzZU.zzyb();
    }
    
    public void zza(final String s, final String s2, final zzf zzf) {
        this.zzaKb.submit(new zzh$zza$2(this, s, s2, zzf));
    }
    
    public void zza(final String s, final List list, final zzf zzf) {
        this.zzaKb.submit(new zzh$zza$1(this, list, s, zzf));
    }
}
