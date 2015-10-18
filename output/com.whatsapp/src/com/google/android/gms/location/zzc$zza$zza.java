// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.location;

import android.os.Parcel;
import android.os.IBinder;

class zzc$zza$zza implements zzc
{
    private IBinder zznF;
    
    zzc$zza$zza(final IBinder zznF) {
        this.zznF = zznF;
    }
    
    public IBinder asBinder() {
        return this.zznF;
    }
    
    @Override
    public void onLocationAvailability(final LocationAvailability locationAvailability) {
        final Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.location.ILocationCallback");
            Label_0036: {
                if (locationAvailability != null) {
                    obtain.writeInt(1);
                    locationAvailability.writeToParcel(obtain, 0);
                    if (LocationServices$zza.a == 0) {
                        break Label_0036;
                    }
                }
                obtain.writeInt(0);
            }
            this.zznF.transact(2, obtain, (Parcel)null, 1);
        }
        finally {
            obtain.recycle();
        }
    }
    
    @Override
    public void onLocationResult(final LocationResult locationResult) {
        final Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.location.ILocationCallback");
            Label_0036: {
                if (locationResult != null) {
                    obtain.writeInt(1);
                    locationResult.writeToParcel(obtain, 0);
                    if (LocationServices$zza.a == 0) {
                        break Label_0036;
                    }
                }
                obtain.writeInt(0);
            }
            this.zznF.transact(1, obtain, (Parcel)null, 1);
        }
        finally {
            obtain.recycle();
        }
    }
}
