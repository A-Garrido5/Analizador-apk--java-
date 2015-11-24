// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.location.internal;

import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationListener;
import android.location.Location;
import android.util.Log;
import com.google.android.gms.location.copresence.internal.CopresenceApiOptions;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener;
import com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks;
import android.os.Looper;
import android.content.Context;

public class zzj extends zzb
{
    public static int c;
    private final com.google.android.gms.location.internal.zzi zzayR;
    private final com.google.android.gms.location.copresence.internal.zzb zzayS;
    
    public zzj(final Context context, final Looper looper, final GoogleApiClient$ConnectionCallbacks googleApiClient$ConnectionCallbacks, final GoogleApiClient$OnConnectionFailedListener googleApiClient$OnConnectionFailedListener, final String s, final zze zze) {
        this(context, looper, googleApiClient$ConnectionCallbacks, googleApiClient$OnConnectionFailedListener, s, zze, CopresenceApiOptions.zzayn);
    }
    
    public zzj(final Context context, final Looper looper, final GoogleApiClient$ConnectionCallbacks googleApiClient$ConnectionCallbacks, final GoogleApiClient$OnConnectionFailedListener googleApiClient$OnConnectionFailedListener, final String s, final zze zze, final CopresenceApiOptions copresenceApiOptions) {
        super(context, looper, googleApiClient$ConnectionCallbacks, googleApiClient$OnConnectionFailedListener, s, zze);
        this.zzayR = new com.google.android.gms.location.internal.zzi(context, this.zzayq);
        this.zzayS = com.google.android.gms.location.copresence.internal.zzb.zza(context, zze.getAccountName(), zze.zzny(), this.zzayq, copresenceApiOptions);
    }
    
    @Override
    public void disconnect() {
        synchronized (this.zzayR) {
            Label_0030: {
                if (!this.isConnected()) {
                    break Label_0030;
                }
                try {
                    this.zzayR.removeAllListeners();
                    this.zzayR.zzux();
                    super.disconnect();
                }
                catch (Exception ex) {
                    Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", (Throwable)ex);
                }
            }
        }
    }
    
    public Location getLastLocation() {
        return this.zzayR.getLastLocation();
    }
    
    @Override
    public boolean requiresAccount() {
        return true;
    }
    
    public void zza(final LocationListener locationListener) {
        this.zzayR.zza(locationListener);
    }
    
    public void zza(final LocationRequest locationRequest, final LocationListener locationListener, final Looper looper) {
        synchronized (this.zzayR) {
            this.zzayR.zza(locationRequest, locationListener, looper);
        }
    }
}
