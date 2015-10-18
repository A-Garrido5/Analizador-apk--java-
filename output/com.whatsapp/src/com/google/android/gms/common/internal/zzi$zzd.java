// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;

public final class zzi$zzd extends zzo$zza
{
    private final int zzaaA;
    private zzi zzaaz;
    
    public zzi$zzd(final zzi zzaaz, final int zzaaA) {
        this.zzaaz = zzaaz;
        this.zzaaA = zzaaA;
    }
    
    private void zznS() {
        this.zzaaz = null;
    }
    
    public void zza(final int n, final IBinder binder, final Bundle bundle) {
        zzu.zzb(this.zzaaz, "onPostInitComplete can be called only once per call to getRemoteService");
        this.zzaaz.zza(n, binder, bundle, this.zzaaA);
        this.zznS();
    }
    
    public void zzb(final int n, final Bundle bundle) {
        zzu.zzb(this.zzaaz, "onAccountValidationComplete can be called only once per call to validateAccount");
        this.zzaaz.zza(n, bundle, this.zzaaA);
        this.zznS();
    }
}
