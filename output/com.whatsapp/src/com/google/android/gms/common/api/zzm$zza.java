// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.api;

import com.google.android.gms.common.ConnectionResult;
import java.io.PrintWriter;
import java.io.FileDescriptor;

class zzm$zza implements GoogleApiClient$OnConnectionFailedListener
{
    public final int zzYa;
    public final GoogleApiClient zzYb;
    public final GoogleApiClient$OnConnectionFailedListener zzYc;
    final zzm zzYd;
    
    public zzm$zza(final zzm zzYd, final int zzYa, final GoogleApiClient zzYb, final GoogleApiClient$OnConnectionFailedListener zzYc) {
        this.zzYd = zzYd;
        this.zzYa = zzYa;
        this.zzYb = zzYb;
        this.zzYc = zzYc;
        zzYb.registerConnectionFailedListener(this);
    }
    
    public void dump(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        printWriter.append(s).append("GoogleApiClient #").print(this.zzYa);
        printWriter.println(":");
        this.zzYb.dump(s + "  ", fileDescriptor, printWriter, array);
    }
    
    @Override
    public void onConnectionFailed(final ConnectionResult connectionResult) {
        zzm.zzd(this.zzYd).post((Runnable)new zzm$zzb(this.zzYd, this.zzYa, connectionResult));
    }
    
    public void zzmW() {
        this.zzYb.unregisterConnectionFailedListener(this);
        this.zzYb.disconnect();
    }
}
