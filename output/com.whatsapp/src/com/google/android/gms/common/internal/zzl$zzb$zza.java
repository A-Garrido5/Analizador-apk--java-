// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.internal;

import java.util.Iterator;
import android.os.IBinder;
import android.content.ComponentName;
import android.content.ServiceConnection;

public class zzl$zzb$zza implements ServiceConnection
{
    final zzl$zzb zzaaU;
    
    public zzl$zzb$zza(final zzl$zzb zzaaU) {
        this.zzaaU = zzaaU;
    }
    
    public void onServiceConnected(final ComponentName componentName, final IBinder binder) {
        final boolean a = zzi.a;
        synchronized (zzl.zza(this.zzaaU.zzaaT)) {
            zzl$zzb.zza(this.zzaaU, binder);
            zzl$zzb.zza(this.zzaaU, componentName);
            final Iterator<ServiceConnection> iterator = zzl$zzb.zzb(this.zzaaU).iterator();
            while (iterator.hasNext()) {
                iterator.next().onServiceConnected(componentName, binder);
                if (a) {
                    break;
                }
            }
            zzl$zzb.zza(this.zzaaU, 1);
        }
    }
    
    public void onServiceDisconnected(final ComponentName componentName) {
        final boolean a = zzi.a;
        synchronized (zzl.zza(this.zzaaU.zzaaT)) {
            zzl$zzb.zza(this.zzaaU, (IBinder)null);
            zzl$zzb.zza(this.zzaaU, componentName);
            final Iterator<ServiceConnection> iterator = zzl$zzb.zzb(this.zzaaU).iterator();
            while (iterator.hasNext()) {
                iterator.next().onServiceDisconnected(componentName);
                if (a) {
                    break;
                }
            }
            zzl$zzb.zza(this.zzaaU, 2);
        }
    }
}
