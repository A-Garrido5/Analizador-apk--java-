// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.location;

import android.os.Parcel;
import android.location.Location;
import android.os.IBinder;

class n implements l
{
    private IBinder a;
    
    n(final IBinder a) {
        this.a = a;
    }
    
    @Override
    public void a(final Location location) {
        final Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.location.ILocationListener");
            if (location != null) {
                obtain.writeInt(1);
                location.writeToParcel(obtain, 0);
            }
            else {
                obtain.writeInt(0);
            }
            this.a.transact(1, obtain, (Parcel)null, 1);
        }
        finally {
            obtain.recycle();
        }
    }
    
    public IBinder asBinder() {
        return this.a;
    }
}
