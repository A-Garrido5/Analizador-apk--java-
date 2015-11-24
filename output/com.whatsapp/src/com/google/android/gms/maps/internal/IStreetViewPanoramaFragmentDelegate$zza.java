// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.internal;

import android.os.IInterface;
import android.os.IBinder;
import android.os.Binder;

public abstract class IStreetViewPanoramaFragmentDelegate$zza extends Binder implements IStreetViewPanoramaFragmentDelegate
{
    public static IStreetViewPanoramaFragmentDelegate zzcH(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
        if (queryLocalInterface != null && queryLocalInterface instanceof IStreetViewPanoramaFragmentDelegate) {
            return (IStreetViewPanoramaFragmentDelegate)queryLocalInterface;
        }
        return new IStreetViewPanoramaFragmentDelegate$zza$zza(binder);
    }
}
