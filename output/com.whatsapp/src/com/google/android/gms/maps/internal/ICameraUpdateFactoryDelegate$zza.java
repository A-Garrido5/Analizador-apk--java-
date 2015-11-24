// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.internal;

import android.os.IInterface;
import android.os.IBinder;
import android.os.Binder;

public abstract class ICameraUpdateFactoryDelegate$zza extends Binder implements ICameraUpdateFactoryDelegate
{
    public static ICameraUpdateFactoryDelegate zzce(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
        if (queryLocalInterface != null && queryLocalInterface instanceof ICameraUpdateFactoryDelegate) {
            return (ICameraUpdateFactoryDelegate)queryLocalInterface;
        }
        return new ICameraUpdateFactoryDelegate$zza$zza(binder);
    }
}
