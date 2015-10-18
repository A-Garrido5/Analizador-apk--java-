// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.dynamic;

class zza$7 implements zza$zza
{
    final zza zzajl;
    
    zza$7(final zza zzajl) {
        this.zzajl = zzajl;
    }
    
    @Override
    public int getState() {
        return 5;
    }
    
    @Override
    public void zzb(final LifecycleDelegate lifecycleDelegate) {
        zza.zzb(this.zzajl).onResume();
    }
}
