// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.internal;

import com.google.android.gms.common.ConnectionResult;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Collection;
import com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks;
import android.os.Message;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.ArrayList;
import android.os.Handler;
import android.os.Handler$Callback;

public final class zzj implements Handler$Callback
{
    private final Handler mHandler;
    private final zzj$zza zzaaC;
    private final ArrayList zzaaD;
    final ArrayList zzaaE;
    private final ArrayList zzaaF;
    private volatile boolean zzaaG;
    private final AtomicInteger zzaaH;
    private boolean zzaaI;
    private final Object zzqt;
    
    public zzj(final Looper looper, final zzj$zza zzaaC) {
        this.zzaaD = new ArrayList();
        this.zzaaE = new ArrayList();
        this.zzaaF = new ArrayList();
        this.zzaaG = false;
        this.zzaaH = new AtomicInteger(0);
        this.zzaaI = false;
        this.zzqt = new Object();
        this.zzaaC = zzaaC;
        this.mHandler = new Handler(looper, (Handler$Callback)this);
    }
    
    public boolean handleMessage(final Message message) {
        if (message.what == 1) {
            final GoogleApiClient$ConnectionCallbacks googleApiClient$ConnectionCallbacks = (GoogleApiClient$ConnectionCallbacks)message.obj;
            synchronized (this.zzqt) {
                if (this.zzaaG && this.zzaaC.isConnected() && this.zzaaD.contains(googleApiClient$ConnectionCallbacks)) {
                    googleApiClient$ConnectionCallbacks.onConnected(this.zzaaC.zzlM());
                }
                return true;
            }
        }
        Log.wtf("GmsClientEvents", "Don't know how to handle this message.");
        return false;
    }
    
    public void registerConnectionCallbacks(final GoogleApiClient$ConnectionCallbacks googleApiClient$ConnectionCallbacks) {
        zzu.zzu(googleApiClient$ConnectionCallbacks);
        synchronized (this.zzqt) {
            Label_0068: {
                if (this.zzaaD.contains(googleApiClient$ConnectionCallbacks)) {
                    Log.w("GmsClientEvents", "registerConnectionCallbacks(): listener " + googleApiClient$ConnectionCallbacks + " is already registered");
                    if (!zzi.a) {
                        break Label_0068;
                    }
                }
                this.zzaaD.add(googleApiClient$ConnectionCallbacks);
            }
            // monitorexit(this.zzqt)
            if (this.zzaaC.isConnected()) {
                this.mHandler.sendMessage(this.mHandler.obtainMessage(1, (Object)googleApiClient$ConnectionCallbacks));
            }
        }
    }
    
    public void registerConnectionFailedListener(final GoogleApiClient$OnConnectionFailedListener googleApiClient$OnConnectionFailedListener) {
        zzu.zzu(googleApiClient$OnConnectionFailedListener);
        synchronized (this.zzqt) {
            if (this.zzaaF.contains(googleApiClient$OnConnectionFailedListener)) {
                Log.w("GmsClientEvents", "registerConnectionFailedListener(): listener " + googleApiClient$OnConnectionFailedListener + " is already registered");
                if (!zzi.a) {
                    return;
                }
            }
            this.zzaaF.add(googleApiClient$OnConnectionFailedListener);
        }
    }
    
    public void unregisterConnectionCallbacks(final GoogleApiClient$ConnectionCallbacks googleApiClient$ConnectionCallbacks) {
        zzu.zzu(googleApiClient$ConnectionCallbacks);
        synchronized (this.zzqt) {
            if (!this.zzaaD.remove(googleApiClient$ConnectionCallbacks)) {
                Log.w("GmsClientEvents", "unregisterConnectionCallbacks(): listener " + googleApiClient$ConnectionCallbacks + " not found");
                if (!zzi.a) {
                    return;
                }
            }
            if (this.zzaaI) {
                this.zzaaE.add(googleApiClient$ConnectionCallbacks);
            }
        }
    }
    
    public void unregisterConnectionFailedListener(final GoogleApiClient$OnConnectionFailedListener googleApiClient$OnConnectionFailedListener) {
        zzu.zzu(googleApiClient$OnConnectionFailedListener);
        synchronized (this.zzqt) {
            if (!this.zzaaF.remove(googleApiClient$OnConnectionFailedListener)) {
                Log.w("GmsClientEvents", "unregisterConnectionFailedListener(): listener " + googleApiClient$OnConnectionFailedListener + " not found");
            }
        }
    }
    
    public void zzbu(final int n) {
        while (true) {
            final boolean a = zzi.a;
            this.mHandler.removeMessages(1);
        Label_0094_Outer:
            while (true) {
                while (true) {
                    Label_0139: {
                        synchronized (this.zzqt) {
                            this.zzaaI = true;
                            final ArrayList<GoogleApiClient$ConnectionCallbacks> list = new ArrayList<GoogleApiClient$ConnectionCallbacks>(this.zzaaD);
                            final int value = this.zzaaH.get();
                            final Iterator<GoogleApiClient$ConnectionCallbacks> iterator = list.iterator();
                            if (iterator.hasNext()) {
                                final GoogleApiClient$ConnectionCallbacks googleApiClient$ConnectionCallbacks = iterator.next();
                                if (this.zzaaG && this.zzaaH.get() == value) {
                                    if (this.zzaaD.contains(googleApiClient$ConnectionCallbacks)) {
                                        googleApiClient$ConnectionCallbacks.onConnectionSuspended(n);
                                    }
                                    break Label_0139;
                                }
                            }
                            this.zzaaE.clear();
                            this.zzaaI = false;
                            return;
                        }
                    }
                    if (a) {
                        continue;
                    }
                    break;
                }
                continue Label_0094_Outer;
            }
        }
    }
    
    public void zzg(final Bundle bundle) {
        while (true) {
            final boolean a = zzi.a;
        Label_0139_Outer:
            while (true) {
                while (true) {
                    Label_0220: {
                        while (true) {
                            Label_0214: {
                                synchronized (this.zzqt) {
                                    zzu.zzU(!this.zzaaI);
                                    this.mHandler.removeMessages(1);
                                    this.zzaaI = true;
                                    zzu.zzU(this.zzaaE.size() == 0);
                                    final ArrayList<GoogleApiClient$ConnectionCallbacks> list = new ArrayList<GoogleApiClient$ConnectionCallbacks>(this.zzaaD);
                                    final int value = this.zzaaH.get();
                                    final Iterator<GoogleApiClient$ConnectionCallbacks> iterator = list.iterator();
                                    if (iterator.hasNext()) {
                                        final GoogleApiClient$ConnectionCallbacks googleApiClient$ConnectionCallbacks = iterator.next();
                                        if (this.zzaaG && this.zzaaC.isConnected() && this.zzaaH.get() == value) {
                                            if (!this.zzaaE.contains(googleApiClient$ConnectionCallbacks)) {
                                                googleApiClient$ConnectionCallbacks.onConnected(bundle);
                                            }
                                            break Label_0220;
                                        }
                                    }
                                    this.zzaaE.clear();
                                    this.zzaaI = false;
                                    // monitorexit(this.zzqt)
                                    if (zzu.a != 0) {
                                        if (!a) {
                                            break Label_0214;
                                        }
                                        final boolean a2 = false;
                                        zzi.a = a2;
                                    }
                                    return;
                                }
                            }
                            final boolean a2 = true;
                            continue;
                        }
                    }
                    if (a) {
                        continue;
                    }
                    break;
                }
                continue Label_0139_Outer;
            }
        }
    }
    
    public void zzh(final ConnectionResult connectionResult) {
        while (true) {
            final boolean a = zzi.a;
            this.mHandler.removeMessages(1);
            while (true) {
                synchronized (this.zzqt) {
                    final ArrayList<GoogleApiClient$OnConnectionFailedListener> list = new ArrayList<GoogleApiClient$OnConnectionFailedListener>(this.zzaaF);
                    final int value = this.zzaaH.get();
                    final Iterator<GoogleApiClient$OnConnectionFailedListener> iterator = list.iterator();
                    if (!iterator.hasNext()) {
                        return;
                    }
                    final GoogleApiClient$OnConnectionFailedListener googleApiClient$OnConnectionFailedListener = iterator.next();
                    if (!this.zzaaG || this.zzaaH.get() != value) {
                        return;
                    }
                    if (this.zzaaF.contains(googleApiClient$OnConnectionFailedListener)) {
                        googleApiClient$OnConnectionFailedListener.onConnectionFailed(connectionResult);
                    }
                }
                if (a) {
                    return;
                }
                continue;
            }
        }
    }
    
    public void zznT() {
        this.zzaaG = false;
        this.zzaaH.incrementAndGet();
    }
    
    public void zznU() {
        this.zzaaG = true;
    }
}
