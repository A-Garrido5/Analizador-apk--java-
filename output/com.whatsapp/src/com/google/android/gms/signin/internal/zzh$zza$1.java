// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.signin.internal;

import com.google.android.gms.common.api.GoogleApiClient$ServerAuthCodeCallbacks$CheckResult;
import android.os.RemoteException;
import android.util.Log;
import java.util.Set;
import java.util.Collections;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

class zzh$zza$1 implements Runnable
{
    final List zzaKc;
    final String zzaKd;
    final zzf zzaKe;
    final zzh$zza zzaKf;
    
    zzh$zza$1(final zzh$zza zzaKf, final List zzaKc, final String zzaKd, final zzf zzaKe) {
        this.zzaKf = zzaKf;
        this.zzaKc = zzaKc;
        this.zzaKd = zzaKd;
        this.zzaKe = zzaKe;
    }
    
    @Override
    public void run() {
        try {
            final GoogleApiClient$ServerAuthCodeCallbacks$CheckResult onCheckServerAuthorization = zzh$zza.zza(this.zzaKf).onCheckServerAuthorization(this.zzaKd, Collections.unmodifiableSet((Set<?>)new HashSet<Object>(this.zzaKc)));
            this.zzaKe.zza(new CheckServerAuthResult(onCheckServerAuthorization.zzmA(), onCheckServerAuthorization.zzmB()));
        }
        catch (RemoteException ex) {
            Log.e("SignInClientImpl", "RemoteException thrown when processing checkServerAuthorization callback", (Throwable)ex);
        }
    }
}
