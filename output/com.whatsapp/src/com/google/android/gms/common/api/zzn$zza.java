// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.api;

import android.os.Bundle;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import android.content.Context;
import com.google.android.gms.common.ConnectionResult;
import android.support.v4.content.Loader;

class zzn$zza extends Loader implements GoogleApiClient$ConnectionCallbacks, GoogleApiClient$OnConnectionFailedListener
{
    public final GoogleApiClient zzYb;
    private boolean zzYg;
    private ConnectionResult zzYh;
    
    public zzn$zza(final Context context, final GoogleApiClient zzYb) {
        super(context);
        this.zzYb = zzYb;
    }
    
    private void zzf(final ConnectionResult zzYh) {
        this.zzYh = zzYh;
        if (this.isStarted() && !this.isAbandoned()) {
            this.deliverResult(zzYh);
        }
    }
    
    @Override
    public void dump(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        super.dump(s, fileDescriptor, printWriter, array);
        this.zzYb.dump(s, fileDescriptor, printWriter, array);
    }
    
    @Override
    public void onConnected(final Bundle bundle) {
        this.zzYg = false;
        this.zzf(ConnectionResult.zzVG);
    }
    
    @Override
    public void onConnectionFailed(final ConnectionResult connectionResult) {
        this.zzYg = true;
        this.zzf(connectionResult);
    }
    
    @Override
    public void onConnectionSuspended(final int n) {
    }
    
    @Override
    protected void onReset() {
        this.zzYh = null;
        this.zzYg = false;
        this.zzYb.unregisterConnectionCallbacks(this);
        this.zzYb.unregisterConnectionFailedListener(this);
        this.zzYb.disconnect();
    }
    
    @Override
    protected void onStartLoading() {
        super.onStartLoading();
        this.zzYb.registerConnectionCallbacks(this);
        this.zzYb.registerConnectionFailedListener(this);
        if (this.zzYh != null) {
            this.deliverResult(this.zzYh);
        }
        if (!this.zzYb.isConnected() && !this.zzYb.isConnecting() && !this.zzYg) {
            this.zzYb.connect();
        }
    }
    
    @Override
    protected void onStopLoading() {
        this.zzYb.disconnect();
    }
    
    public boolean zzmX() {
        return this.zzYg;
    }
}
