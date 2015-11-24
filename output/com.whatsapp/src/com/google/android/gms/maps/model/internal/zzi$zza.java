// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.model.internal;

import android.os.IInterface;
import android.os.IBinder;
import android.os.Binder;

public abstract class zzi$zza extends Binder implements zzi
{
    public static int a;
    
    public static zzi zzcP(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        if (queryLocalInterface != null && queryLocalInterface instanceof zzi) {
            return (zzi)queryLocalInterface;
        }
        return new zzi$zza$zza(binder);
    }
}
