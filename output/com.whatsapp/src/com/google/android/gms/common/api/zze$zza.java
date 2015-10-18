// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.api;

import com.google.android.gms.signin.internal.AuthAccountResult;
import com.google.android.gms.common.ConnectionResult;
import java.lang.ref.WeakReference;
import com.google.android.gms.signin.internal.zzb;

class zze$zza extends zzb
{
    private final WeakReference zzXe;
    
    zze$zza(final com.google.android.gms.common.api.zze zze) {
        this.zzXe = new WeakReference((T)zze);
    }
    
    @Override
    public void zza(final ConnectionResult connectionResult, final AuthAccountResult authAccountResult) {
        final com.google.android.gms.common.api.zze zze = (com.google.android.gms.common.api.zze)this.zzXe.get();
        if (zze == null) {
            return;
        }
        com.google.android.gms.common.api.zze.zzb(zze).zzXs.post((Runnable)new zze$zza$1(this, zze, connectionResult));
    }
}
