// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.internal;

import android.os.IInterface;
import android.os.IBinder;
import android.os.Binder;

public abstract class zzr$zza extends Binder implements zzr
{
    public static zzr zzaI(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        if (queryLocalInterface != null && queryLocalInterface instanceof zzr) {
            return (zzr)queryLocalInterface;
        }
        return new zzr$zza$zza(binder);
    }
}
