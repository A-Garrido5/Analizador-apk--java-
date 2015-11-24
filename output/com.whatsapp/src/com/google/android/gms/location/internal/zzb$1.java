// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.location.internal;

import android.os.IInterface;

class zzb$1 implements zzn
{
    final zzb zzayx;
    
    zzb$1(final zzb zzayx) {
        this.zzayx = zzayx;
    }
    
    @Override
    public void zznL() {
        zzb.zza(this.zzayx);
    }
    
    @Override
    public IInterface zznM() {
        return (IInterface)this.zzut();
    }
    
    public zzg zzut() {
        return (zzg)this.zzayx.zznM();
    }
}
