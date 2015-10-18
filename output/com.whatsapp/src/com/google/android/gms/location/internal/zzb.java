// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.location.internal;

import android.os.Bundle;
import android.os.IInterface;
import android.os.IBinder;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener;
import com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks;
import android.os.Looper;
import android.content.Context;
import com.google.android.gms.common.internal.zzi;

public class zzb extends zzi
{
    public static boolean b;
    protected final zzn zzayq;
    private final String zzayw;
    
    public zzb(final Context context, final Looper looper, final GoogleApiClient$ConnectionCallbacks googleApiClient$ConnectionCallbacks, final GoogleApiClient$OnConnectionFailedListener googleApiClient$OnConnectionFailedListener, final String zzayw, final zze zze) {
        super(context, looper, 23, googleApiClient$ConnectionCallbacks, googleApiClient$OnConnectionFailedListener, zze);
        this.zzayq = new zzb$1(this);
        this.zzayw = zzayw;
    }
    
    static void zza(final zzb zzb) {
        zzb.zznL();
    }
    
    @Override
    protected String getServiceDescriptor() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }
    
    @Override
    protected String getStartServiceAction() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }
    
    @Override
    protected IInterface zzT(final IBinder binder) {
        return (IInterface)this.zzbU(binder);
    }
    
    protected zzg zzbU(final IBinder binder) {
        return zzg$zza.zzbW(binder);
    }
    
    @Override
    protected Bundle zzkR() {
        final Bundle bundle = new Bundle();
        bundle.putString("client_name", this.zzayw);
        return bundle;
    }
}
