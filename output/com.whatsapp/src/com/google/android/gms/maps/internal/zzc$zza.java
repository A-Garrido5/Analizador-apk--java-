// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.internal;

import android.os.IInterface;
import android.os.IBinder;
import android.os.Binder;

public abstract class zzc$zza extends Binder implements zzc
{
    public static zzc zzcg(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
        if (queryLocalInterface != null && queryLocalInterface instanceof zzc) {
            return (zzc)queryLocalInterface;
        }
        return new zzc$zza$zza(binder);
    }
}
