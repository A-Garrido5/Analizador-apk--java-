// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.internal;

import com.google.android.gms.common.ConnectionResult;
import android.os.Bundle;

public final class zzi$zzh extends zzi$zza
{
    final zzi zzaax;
    
    public zzi$zzh(final zzi zzaax) {
        super(this.zzaax = zzaax, 0, null);
    }
    
    @Override
    protected void zzg(final ConnectionResult connectionResult) {
        zzi.zza(this.zzaax).onReportServiceBinding(connectionResult);
        this.zzaax.onConnectionFailed(connectionResult);
    }
    
    @Override
    protected boolean zznO() {
        zzi.zza(this.zzaax).onReportServiceBinding(ConnectionResult.zzVG);
        return true;
    }
}
