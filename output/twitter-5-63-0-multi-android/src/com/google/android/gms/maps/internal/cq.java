// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.IBinder;

class cq implements co
{
    private IBinder a;
    
    cq(final IBinder a) {
        this.a = a;
    }
    
    @Override
    public void a(final s s) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnStreetViewPanoramaReadyCallback");
            IBinder binder;
            if (s != null) {
                binder = s.asBinder();
            }
            else {
                binder = null;
            }
            obtain.writeStrongBinder(binder);
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
