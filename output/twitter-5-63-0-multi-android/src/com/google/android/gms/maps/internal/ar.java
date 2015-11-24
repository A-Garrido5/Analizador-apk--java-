// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.internal;

import com.google.android.gms.dynamic.l;
import android.os.Parcel;
import com.google.android.gms.dynamic.k;
import com.google.android.gms.maps.model.internal.w;
import android.os.IBinder;

class ar implements ap
{
    private IBinder a;
    
    ar(final IBinder a) {
        this.a = a;
    }
    
    @Override
    public k a(final w w) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IInfoWindowAdapter");
            IBinder binder;
            if (w != null) {
                binder = w.asBinder();
            }
            else {
                binder = null;
            }
            obtain.writeStrongBinder(binder);
            this.a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return l.a(obtain2.readStrongBinder());
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    public IBinder asBinder() {
        return this.a;
    }
    
    @Override
    public k b(final w w) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IInfoWindowAdapter");
            IBinder binder;
            if (w != null) {
                binder = w.asBinder();
            }
            else {
                binder = null;
            }
            obtain.writeStrongBinder(binder);
            this.a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            return l.a(obtain2.readStrongBinder());
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
