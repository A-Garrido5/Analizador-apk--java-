// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.model.internal;

import android.os.IInterface;
import android.os.IBinder;
import android.os.Binder;

public abstract class zzd$zza extends Binder implements zzd
{
    public static zzd zzcK(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
        if (queryLocalInterface != null && queryLocalInterface instanceof zzd) {
            return (zzd)queryLocalInterface;
        }
        return new zzd$zza$zza(binder);
    }
}
