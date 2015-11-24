// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.api;

import android.os.Looper;
import java.io.PrintWriter;
import java.io.FileDescriptor;

public interface GoogleApiClient
{
    void connect();
    
    void disconnect();
    
    void dump(final String p0, final FileDescriptor p1, final PrintWriter p2, final String[] p3);
    
    Looper getLooper();
    
    boolean isConnected();
    
    boolean isConnecting();
    
    void registerConnectionCallbacks(final GoogleApiClient$ConnectionCallbacks p0);
    
    void registerConnectionFailedListener(final GoogleApiClient$OnConnectionFailedListener p0);
    
    void unregisterConnectionCallbacks(final GoogleApiClient$ConnectionCallbacks p0);
    
    void unregisterConnectionFailedListener(final GoogleApiClient$OnConnectionFailedListener p0);
    
    Api$Client zza(final Api$ClientKey p0);
    
    zza$zza zzb(final zza$zza p0);
}
