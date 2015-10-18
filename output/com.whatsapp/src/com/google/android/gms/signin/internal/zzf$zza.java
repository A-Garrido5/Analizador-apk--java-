// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.signin.internal;

import android.os.IInterface;
import android.os.IBinder;
import android.os.Binder;

public abstract class zzf$zza extends Binder implements zzf
{
    public static zzf zzdD(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (queryLocalInterface != null && queryLocalInterface instanceof zzf) {
            return (zzf)queryLocalInterface;
        }
        return new zzf$zza$zza(binder);
    }
}
