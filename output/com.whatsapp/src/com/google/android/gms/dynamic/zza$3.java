// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.dynamic;

import android.os.Bundle;

class zza$3 implements zza$zza
{
    final zza zzajl;
    final Bundle zzajo;
    
    zza$3(final zza zzajl, final Bundle zzajo) {
        this.zzajl = zzajl;
        this.zzajo = zzajo;
    }
    
    @Override
    public int getState() {
        return 1;
    }
    
    @Override
    public void zzb(final LifecycleDelegate lifecycleDelegate) {
        zza.zzb(this.zzajl).onCreate(this.zzajo);
    }
}
