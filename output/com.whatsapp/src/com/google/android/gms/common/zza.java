// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common;

import android.os.Looper;
import android.os.IBinder;
import android.content.ComponentName;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.BlockingQueue;
import android.content.ServiceConnection;

public class zza implements ServiceConnection
{
    boolean zzVE;
    private final BlockingQueue zzVF;
    
    public zza() {
        this.zzVE = false;
        this.zzVF = new LinkedBlockingQueue();
    }
    
    public void onServiceConnected(final ComponentName componentName, final IBinder binder) {
        this.zzVF.add(binder);
    }
    
    public void onServiceDisconnected(final ComponentName componentName) {
    }
    
    public IBinder zzmh() {
        try {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                throw new IllegalStateException("BlockingServiceConnection.getService() called on main thread");
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        try {
            if (this.zzVE) {
                throw new IllegalStateException();
            }
        }
        catch (IllegalStateException ex2) {
            throw ex2;
        }
        this.zzVE = true;
        return this.zzVF.take();
    }
}
