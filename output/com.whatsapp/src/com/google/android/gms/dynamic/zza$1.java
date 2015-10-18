// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.dynamic;

import java.util.Iterator;
import android.os.Bundle;

class zza$1 implements zzf
{
    final zza zzajl;
    
    zza$1(final zza zzajl) {
        this.zzajl = zzajl;
    }
    
    @Override
    public void zza(final LifecycleDelegate lifecycleDelegate) {
        final boolean a = zzd$zza.a;
        zza.zza(this.zzajl, lifecycleDelegate);
        final Iterator iterator = zza.zza(this.zzajl).iterator();
        while (iterator.hasNext()) {
            iterator.next().zzb(zza.zzb(this.zzajl));
            if (a) {
                break;
            }
        }
        zza.zza(this.zzajl).clear();
        zza.zza(this.zzajl, (Bundle)null);
    }
}
