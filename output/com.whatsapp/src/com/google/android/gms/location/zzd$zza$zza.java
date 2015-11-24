// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.location;

import android.os.Parcel;
import android.location.Location;
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
    public void onLocationChanged(final Location location) {
        final Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.location.ILocationListener");
            Label_0036: {
                if (location != null) {
                    obtain.writeInt(1);
                    location.writeToParcel(obtain, 0);
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
