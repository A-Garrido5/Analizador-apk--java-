// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.internal;

import com.google.android.gms.dynamic.zzd$zza;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.maps.model.LatLng;
import android.os.Parcel;
import com.google.android.gms.maps.model.VisibleRegion;
import android.os.IBinder;

class IProjectionDelegate$zza$zza implements IProjectionDelegate
{
    private IBinder zznF;
    
    IProjectionDelegate$zza$zza(final IBinder zznF) {
        this.zznF = zznF;
    }
    
    public IBinder asBinder() {
        return this.zznF;
    }
    
    @Override
    public VisibleRegion getVisibleRegion() {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IProjectionDelegate");
            this.zznF.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                final VisibleRegion zzeZ = VisibleRegion.CREATOR.zzeZ(obtain2);
                if (zzm$zza.a == 0) {
                    return zzeZ;
                }
            }
            return null;
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public zzd toScreenLocation(final LatLng latLng) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IProjectionDelegate");
            Label_0040: {
                if (latLng != null) {
                    obtain.writeInt(1);
                    latLng.writeToParcel(obtain, 0);
                    if (zzm$zza.a == 0) {
                        break Label_0040;
                    }
                }
                obtain.writeInt(0);
            }
            this.zznF.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            return zzd$zza.zzbg(obtain2.readStrongBinder());
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
