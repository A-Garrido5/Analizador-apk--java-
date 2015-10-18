// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.internal;

import com.google.android.gms.dynamic.zzd$zza;
import android.os.Parcel;
import com.google.android.gms.dynamic.zzd;
import android.os.IBinder;

class zzr$zza$zza implements zzr
{
    private IBinder zznF;
    
    zzr$zza$zza(final IBinder zznF) {
        this.zznF = zznF;
    }
    
    public IBinder asBinder() {
        return this.zznF;
    }
    
    @Override
    public zzd zza(final zzd zzd, final int n, final int n2) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.ISignInButtonCreator");
            IBinder binder;
            if (zzd != null) {
                binder = zzd.asBinder();
            }
            else {
                binder = null;
            }
            obtain.writeStrongBinder(binder);
            obtain.writeInt(n);
            obtain.writeInt(n2);
            this.zznF.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return zzd$zza.zzbg(obtain2.readStrongBinder());
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
