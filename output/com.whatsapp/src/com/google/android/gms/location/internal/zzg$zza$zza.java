// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.location.internal;

import android.location.Location;
import android.os.Parcel;
import android.os.IBinder;

class zzg$zza$zza implements zzg
{
    private IBinder zznF;
    
    zzg$zza$zza(final IBinder zznF) {
        this.zznF = zznF;
    }
    
    public IBinder asBinder() {
        return this.zznF;
    }
    
    @Override
    public void zza(final LocationRequestUpdateData locationRequestUpdateData) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            Label_0040: {
                if (locationRequestUpdateData != null) {
                    obtain.writeInt(1);
                    locationRequestUpdateData.writeToParcel(obtain, 0);
                    if (zzj.c == 0) {
                        break Label_0040;
                    }
                }
                obtain.writeInt(0);
            }
            this.zznF.transact(59, obtain, obtain2, 0);
            obtain2.readException();
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public void zzac(final boolean b) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            int n = 0;
            if (b) {
                n = 1;
            }
            obtain.writeInt(n);
            this.zznF.transact(12, obtain, obtain2, 0);
            obtain2.readException();
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public Location zzdl(final String s) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            obtain.writeString(s);
            this.zznF.transact(21, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                final Location location = (Location)Location.CREATOR.createFromParcel(obtain2);
                if (zzj.c == 0) {
                    return location;
                }
            }
            return null;
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
