// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.gcm;

import android.os.RemoteException;
import android.util.Log;
import android.os.IBinder;

class GcmTaskService$zza extends Thread
{
    private final String mTag;
    private final zzb zzavN;
    final GcmTaskService zzavO;
    
    GcmTaskService$zza(final GcmTaskService zzavO, final String mTag, final IBinder binder) {
        this.zzavO = zzavO;
        this.mTag = mTag;
        this.zzavN = zzb$zza.zzbN(binder);
    }
    
    @Override
    public void run() {
        final int onRunTask = this.zzavO.onRunTask(new TaskParams(this.mTag));
        try {
            this.zzavN.zzgg(onRunTask);
        }
        catch (RemoteException ex) {
            Log.e("GcmTaskService", "Error reporting result of operation to scheduler for " + this.mTag);
        }
        finally {
            GcmTaskService.zza(this.zzavO, this.mTag);
        }
    }
}
