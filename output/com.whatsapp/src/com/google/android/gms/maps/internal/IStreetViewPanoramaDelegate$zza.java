// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.internal;

import android.os.IInterface;
import android.os.IBinder;
import android.os.Binder;

public abstract class IStreetViewPanoramaDelegate$zza extends Binder implements IStreetViewPanoramaDelegate
{
    public static IStreetViewPanoramaDelegate zzcG(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
        if (queryLocalInterface != null && queryLocalInterface instanceof IStreetViewPanoramaDelegate) {
            return (IStreetViewPanoramaDelegate)queryLocalInterface;
        }
        return new IStreetViewPanoramaDelegate$zza$zza(binder);
    }
}
