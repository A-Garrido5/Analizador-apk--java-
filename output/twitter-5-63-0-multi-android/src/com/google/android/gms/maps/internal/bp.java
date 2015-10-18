// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.internal;

import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;
import android.os.IBinder;

class bp implements bn
{
    private IBinder a;
    
    bp(final IBinder a) {
        this.a = a;
    }
    
    @Override
    public void a(final LatLng latLng) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMapLongClickListener");
            if (latLng != null) {
                obtain.writeInt(1);
                latLng.writeToParcel(obtain, 0);
            }
            else {
                obtain.writeInt(0);
            }
            this.a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    public IBinder asBinder() {
        return this.a;
    }
}
