// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.gcm;

import android.os.Parcel;
import android.os.IBinder;

class zzb$zza$zza implements zzb
{
    private IBinder zznF;
    
    zzb$zza$zza(final IBinder zznF) {
        this.zznF = zznF;
    }
    
    public IBinder asBinder() {
        return this.zznF;
    }
    
    @Override
    public void zzgg(final int n) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.gcm.INetworkTaskCallback");
            obtain.writeInt(n);
            this.zznF.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
