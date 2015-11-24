// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.gcm;

import android.os.IInterface;
import android.os.IBinder;
import android.os.Binder;

public abstract class zzb$zza extends Binder implements zzb
{
    public static boolean a;
    
    public static zzb zzbN(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.gcm.INetworkTaskCallback");
        if (queryLocalInterface != null && queryLocalInterface instanceof zzb) {
            return (zzb)queryLocalInterface;
        }
        return new zzb$zza$zza(binder);
    }
}
