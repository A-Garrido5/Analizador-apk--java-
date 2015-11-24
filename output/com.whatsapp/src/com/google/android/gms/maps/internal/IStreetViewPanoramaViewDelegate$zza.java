// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.internal;

import android.os.IInterface;
import android.os.IBinder;
import android.os.Binder;

public abstract class IStreetViewPanoramaViewDelegate$zza extends Binder implements IStreetViewPanoramaViewDelegate
{
    public static IStreetViewPanoramaViewDelegate zzcI(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
        if (queryLocalInterface != null && queryLocalInterface instanceof IStreetViewPanoramaViewDelegate) {
            return (IStreetViewPanoramaViewDelegate)queryLocalInterface;
        }
        return new IStreetViewPanoramaViewDelegate$zza$zza(binder);
    }
}
