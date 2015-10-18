// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.internal;

import android.os.IInterface;
import android.os.IBinder;
import com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener;
import com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks;
import android.os.Looper;
import android.content.Context;
import com.google.android.gms.common.api.Api$zzb;

public class zzz extends zzi
{
    private final Api$zzb zzabf;
    
    public zzz(final Context context, final Looper looper, final int n, final GoogleApiClient$ConnectionCallbacks googleApiClient$ConnectionCallbacks, final GoogleApiClient$OnConnectionFailedListener googleApiClient$OnConnectionFailedListener, final zze zze, final Api$zzb zzabf) {
        super(context, looper, n, googleApiClient$ConnectionCallbacks, googleApiClient$OnConnectionFailedListener, zze);
        this.zzabf = zzabf;
    }
    
    @Override
    protected String getServiceDescriptor() {
        return this.zzabf.getServiceDescriptor();
    }
    
    @Override
    protected String getStartServiceAction() {
        return this.zzabf.getStartServiceAction();
    }
    
    @Override
    protected IInterface zzT(final IBinder binder) {
        return this.zzabf.zzT(binder);
    }
}
