// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.internal;

import android.os.IInterface;
import android.os.IBinder;
import android.os.Binder;

public abstract class IGoogleMapDelegate$zza extends Binder implements IGoogleMapDelegate
{
    public static IGoogleMapDelegate zzch(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (queryLocalInterface != null && queryLocalInterface instanceof IGoogleMapDelegate) {
            return (IGoogleMapDelegate)queryLocalInterface;
        }
        return new IGoogleMapDelegate$zza$zza(binder);
    }
}
