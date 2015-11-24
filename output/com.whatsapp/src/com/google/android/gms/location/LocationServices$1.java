// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.location;

import com.google.android.gms.location.internal.zzj;
import com.google.android.gms.common.api.Api$ApiOptions$NoOptions;
import com.google.android.gms.common.api.Api$Client;
import com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener;
import com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks;
import com.google.android.gms.common.internal.zze;
import android.os.Looper;
import android.content.Context;
import com.google.android.gms.common.api.Api$zza;

final class LocationServices$1 implements Api$zza
{
    @Override
    public int getPriority() {
        return Integer.MAX_VALUE;
    }
    
    @Override
    public Api$Client zza(final Context context, final Looper looper, final zze zze, final Object o, final GoogleApiClient$ConnectionCallbacks googleApiClient$ConnectionCallbacks, final GoogleApiClient$OnConnectionFailedListener googleApiClient$OnConnectionFailedListener) {
        return this.zzo(context, looper, zze, (Api$ApiOptions$NoOptions)o, googleApiClient$ConnectionCallbacks, googleApiClient$OnConnectionFailedListener);
    }
    
    public zzj zzo(final Context context, final Looper looper, final zze zze, final Api$ApiOptions$NoOptions api$ApiOptions$NoOptions, final GoogleApiClient$ConnectionCallbacks googleApiClient$ConnectionCallbacks, final GoogleApiClient$OnConnectionFailedListener googleApiClient$OnConnectionFailedListener) {
        return new zzj(context, looper, googleApiClient$ConnectionCallbacks, googleApiClient$OnConnectionFailedListener, "locationServices", zze);
    }
}
