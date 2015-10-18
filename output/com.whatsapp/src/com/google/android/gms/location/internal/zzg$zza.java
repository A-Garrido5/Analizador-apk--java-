// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.location.internal;

import android.os.IInterface;
import android.os.IBinder;
import android.os.Binder;

public abstract class zzg$zza extends Binder implements zzg
{
    public static zzg zzbW(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (queryLocalInterface != null && queryLocalInterface instanceof zzg) {
            return (zzg)queryLocalInterface;
        }
        return new zzg$zza$zza(binder);
    }
}
