// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.internal;

import android.os.IInterface;
import android.os.IBinder;
import android.os.Binder;

public abstract class IProjectionDelegate$zza extends Binder implements IProjectionDelegate
{
    public static IProjectionDelegate zzcE(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
        if (queryLocalInterface != null && queryLocalInterface instanceof IProjectionDelegate) {
            return (IProjectionDelegate)queryLocalInterface;
        }
        return new IProjectionDelegate$zza$zza(binder);
    }
}
