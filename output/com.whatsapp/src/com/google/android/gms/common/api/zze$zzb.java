// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.api;

import com.google.android.gms.common.internal.ResolveAccountResponse;
import java.lang.ref.WeakReference;
import com.google.android.gms.common.internal.zzq$zza;

class zze$zzb extends zzq$zza
{
    private final WeakReference zzXe;
    
    zze$zzb(final zze zze) {
        this.zzXe = new WeakReference((T)zze);
    }
    
    public void zzb(final ResolveAccountResponse resolveAccountResponse) {
        final zze zze = (zze)this.zzXe.get();
        if (zze == null) {
            return;
        }
        com.google.android.gms.common.api.zze.zzb(zze).zzXs.post((Runnable)new zze$zzb$1(this, zze, resolveAccountResponse));
    }
}
