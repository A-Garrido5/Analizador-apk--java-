// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import java.util.concurrent.Executors;
import com.google.android.gms.signin.internal.zzh;
import com.google.android.gms.common.api.Api$Client;
import com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener;
import com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks;
import com.google.android.gms.common.internal.zze;
import android.os.Looper;
import android.content.Context;
import com.google.android.gms.common.api.Api$zza;

final class zzpq$1 implements Api$zza
{
    @Override
    public int getPriority() {
        return Integer.MAX_VALUE;
    }
    
    @Override
    public Api$Client zza(final Context context, final Looper looper, final zze zze, final Object o, final GoogleApiClient$ConnectionCallbacks googleApiClient$ConnectionCallbacks, final GoogleApiClient$OnConnectionFailedListener googleApiClient$OnConnectionFailedListener) {
        return this.zza(context, looper, zze, (zzpt)o, googleApiClient$ConnectionCallbacks, googleApiClient$OnConnectionFailedListener);
    }
    
    public zzh zza(final Context context, final Looper looper, final zze zze, final zzpt zzpt, final GoogleApiClient$ConnectionCallbacks googleApiClient$ConnectionCallbacks, final GoogleApiClient$OnConnectionFailedListener googleApiClient$OnConnectionFailedListener) {
        zzpt zzaJQ;
        if (zzpt == null) {
            zzaJQ = zzpt.zzaJQ;
        }
        else {
            zzaJQ = zzpt;
        }
        return new zzh(context, looper, true, zze, zzaJQ, googleApiClient$ConnectionCallbacks, googleApiClient$OnConnectionFailedListener, Executors.newSingleThreadExecutor());
    }
}
