// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.signin.internal;

import android.os.RemoteException;
import android.util.Log;

class zzh$zza$2 implements Runnable
{
    final String zzaKd;
    final zzf zzaKe;
    final zzh$zza zzaKf;
    final String zzaKg;
    
    zzh$zza$2(final zzh$zza zzaKf, final String zzaKd, final String zzaKg, final zzf zzaKe) {
        this.zzaKf = zzaKf;
        this.zzaKd = zzaKd;
        this.zzaKg = zzaKg;
        this.zzaKe = zzaKe;
    }
    
    @Override
    public void run() {
        try {
            this.zzaKe.zzal(zzh$zza.zza(this.zzaKf).onUploadServerAuthCode(this.zzaKd, this.zzaKg));
        }
        catch (RemoteException ex) {
            Log.e("SignInClientImpl", "RemoteException thrown when processing uploadServerAuthCode callback", (Throwable)ex);
        }
    }
}
