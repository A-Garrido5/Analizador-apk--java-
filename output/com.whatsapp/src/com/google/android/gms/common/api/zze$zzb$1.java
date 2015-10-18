// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.api;

import com.google.android.gms.common.internal.ResolveAccountResponse;

class zze$zzb$1 implements Runnable
{
    final zze zzXf;
    final ResolveAccountResponse zzXi;
    final zze$zzb zzXj;
    
    zze$zzb$1(final zze$zzb zzXj, final zze zzXf, final ResolveAccountResponse zzXi) {
        this.zzXj = zzXj;
        this.zzXf = zzXf;
        this.zzXi = zzXi;
    }
    
    @Override
    public void run() {
        zze.zza(this.zzXf, this.zzXi);
    }
}
