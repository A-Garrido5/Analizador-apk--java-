// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.api;

import com.google.android.gms.common.ConnectionResult;

class zze$1 implements Runnable
{
    final ConnectionResult zzXc;
    final zze zzXd;
    
    zze$1(final zze zzXd, final ConnectionResult zzXc) {
        this.zzXd = zzXd;
        this.zzXc = zzXc;
    }
    
    @Override
    public void run() {
        zze.zza(this.zzXd).lock();
        try {
            zze.zza(this.zzXd, this.zzXc);
        }
        finally {
            zze.zza(this.zzXd).unlock();
        }
    }
}
