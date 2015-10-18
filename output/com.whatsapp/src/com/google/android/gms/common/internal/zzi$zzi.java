// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.internal;

import com.google.android.gms.common.ConnectionResult;
import android.os.Bundle;

public final class zzi$zzi extends zzi$zza
{
    final zzi zzaax;
    
    public zzi$zzi(final zzi zzaax, final int n, final Bundle bundle) {
        super(this.zzaax = zzaax, n, bundle);
    }
    
    @Override
    protected void zzg(final ConnectionResult connectionResult) {
        zzi.zza(this.zzaax).onReportAccountValidation(connectionResult);
        this.zzaax.onConnectionFailed(connectionResult);
    }
    
    @Override
    protected boolean zznO() {
        zzi.zza(this.zzaax).onReportAccountValidation(ConnectionResult.zzVG);
        return true;
    }
}
