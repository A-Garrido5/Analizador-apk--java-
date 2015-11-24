// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.internal;

import android.os.IInterface;
import android.os.IBinder;
import android.os.Binder;

public abstract class IMapFragmentDelegate$zza extends Binder implements IMapFragmentDelegate
{
    public static IMapFragmentDelegate zzcl(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
        if (queryLocalInterface != null && queryLocalInterface instanceof IMapFragmentDelegate) {
            return (IMapFragmentDelegate)queryLocalInterface;
        }
        return new IMapFragmentDelegate$zza$zza(binder);
    }
}
