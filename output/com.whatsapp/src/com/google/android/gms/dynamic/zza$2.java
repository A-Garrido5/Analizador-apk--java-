// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.dynamic;

import android.os.Bundle;
import android.app.Activity;

class zza$2 implements zza$zza
{
    final zza zzajl;
    final Activity zzajm;
    final Bundle zzajn;
    final Bundle zzajo;
    
    zza$2(final zza zzajl, final Activity zzajm, final Bundle zzajn, final Bundle zzajo) {
        this.zzajl = zzajl;
        this.zzajm = zzajm;
        this.zzajn = zzajn;
        this.zzajo = zzajo;
    }
    
    @Override
    public int getState() {
        return 0;
    }
    
    @Override
    public void zzb(final LifecycleDelegate lifecycleDelegate) {
        zza.zzb(this.zzajl).onInflate(this.zzajm, this.zzajn, this.zzajo);
    }
}
