// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.internal;

import android.os.IInterface;
import android.os.IBinder;
import android.os.Binder;

public abstract class IAccountAccessor$zza extends Binder implements IAccountAccessor
{
    public static IAccountAccessor zzaD(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
        if (queryLocalInterface != null && queryLocalInterface instanceof IAccountAccessor) {
            return (IAccountAccessor)queryLocalInterface;
        }
        return new IAccountAccessor$zza$zza(binder);
    }
}
