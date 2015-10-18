// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.api;

import com.google.android.gms.common.ConnectionResult;

class zzg$4 implements GoogleApiClient$OnConnectionFailedListener
{
    final zzg zzXE;
    final Api zzXF;
    final int zzXG;
    
    zzg$4(final zzg zzXE, final Api zzXF, final int zzXG) {
        this.zzXE = zzXE;
        this.zzXF = zzXF;
        this.zzXG = zzXG;
    }
    
    @Override
    public void onConnectionFailed(final ConnectionResult connectionResult) {
        zzg.zza(this.zzXE).zza(connectionResult, this.zzXF, this.zzXG);
    }
}
