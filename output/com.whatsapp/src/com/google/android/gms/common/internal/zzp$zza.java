// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.internal;

import android.os.IInterface;
import android.os.IBinder;
import android.os.Binder;

public abstract class zzp$zza extends Binder implements zzp
{
    public static zzp zzaG(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (queryLocalInterface != null && queryLocalInterface instanceof zzp) {
            return (zzp)queryLocalInterface;
        }
        return new zzp$zza$zza(binder);
    }
}
