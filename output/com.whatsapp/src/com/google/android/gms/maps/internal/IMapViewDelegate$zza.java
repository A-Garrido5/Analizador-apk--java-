// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.internal;

import android.os.IInterface;
import android.os.IBinder;
import android.os.Binder;

public abstract class IMapViewDelegate$zza extends Binder implements IMapViewDelegate
{
    public static IMapViewDelegate zzcm(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
        if (queryLocalInterface != null && queryLocalInterface instanceof IMapViewDelegate) {
            return (IMapViewDelegate)queryLocalInterface;
        }
        return new IMapViewDelegate$zza$zza(binder);
    }
}
