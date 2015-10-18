// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.api;

import com.google.android.gms.common.ConnectionResult;

class zze$zza$1 implements Runnable
{
    final zze zzXf;
    final ConnectionResult zzXg;
    final zze$zza zzXh;
    
    zze$zza$1(final zze$zza zzXh, final zze zzXf, final ConnectionResult zzXg) {
        this.zzXh = zzXh;
        this.zzXf = zzXf;
        this.zzXg = zzXg;
    }
    
    @Override
    public void run() {
        zze.zzc(this.zzXf, this.zzXg);
    }
}
