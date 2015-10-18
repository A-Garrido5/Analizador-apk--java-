// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.model.internal;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.dynamic.zzd$zza;
import android.os.Parcel;
import android.graphics.Bitmap;
import android.os.IBinder;

class zzd$zza$zza implements zzd
{
    private IBinder zznF;
    
    zzd$zza$zza(final IBinder zznF) {
        this.zznF = zznF;
    }
    
    public IBinder asBinder() {
        return this.zznF;
    }
    
    @Override
    public com.google.android.gms.dynamic.zzd zzb(final Bitmap bitmap) {
        final int a = zzi$zza.a;
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            Label_0043: {
                if (bitmap != null) {
                    obtain.writeInt(1);
                    bitmap.writeToParcel(obtain, 0);
                    if (a == 0) {
                        break Label_0043;
                    }
                }
                obtain.writeInt(0);
            }
            this.zznF.transact(6, obtain, obtain2, 0);
            obtain2.readException();
            final com.google.android.gms.dynamic.zzd zzbg = zzd$zza.zzbg(obtain2.readStrongBinder());
            obtain2.recycle();
            obtain.recycle();
            if (GoogleMap.a != 0) {
                zzi$zza.a = a + 1;
            }
            return zzbg;
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public com.google.android.gms.dynamic.zzd zzhD(final int n) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            obtain.writeInt(n);
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
