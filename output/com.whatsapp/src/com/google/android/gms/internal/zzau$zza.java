// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import android.os.IInterface;
import android.os.IBinder;
import android.os.Binder;

public abstract class zzau$zza extends Binder implements zzau
{
    public static zzau zza(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
        if (queryLocalInterface != null && queryLocalInterface instanceof zzau) {
            return (zzau)queryLocalInterface;
        }
        return new zzau$zza$zza(binder);
    }
}
