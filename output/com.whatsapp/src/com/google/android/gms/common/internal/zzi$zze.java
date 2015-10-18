// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.content.ComponentName;
import android.content.ServiceConnection;

public final class zzi$zze implements ServiceConnection
{
    private final int zzaaA;
    final zzi zzaax;
    
    public zzi$zze(final zzi zzaax, final int zzaaA) {
        this.zzaax = zzaax;
        this.zzaaA = zzaaA;
    }
    
    public void onServiceConnected(final ComponentName componentName, final IBinder binder) {
        zzu.zzb(binder, "Expecting a valid IBinder");
        zzi.zza(this.zzaax, zzp$zza.zzaG(binder));
        this.zzaax.zzbt(this.zzaaA);
    }
    
    public void onServiceDisconnected(final ComponentName componentName) {
        this.zzaax.mHandler.sendMessage(this.zzaax.mHandler.obtainMessage(4, this.zzaaA, 1));
    }
}
