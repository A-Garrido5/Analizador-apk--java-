// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.internal;

import com.google.android.gms.maps.model.VisibleRegion;
import com.google.android.gms.dynamic.l;
import android.os.Parcel;
import com.google.android.gms.dynamic.k;
import com.google.android.gms.maps.model.LatLng;
import android.os.IBinder;

class r implements p
{
    private IBinder a;
    
    r(final IBinder a) {
        this.a = a;
    }
    
    @Override
    public k a(final LatLng latLng) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IProjectionDelegate");
            if (latLng != null) {
                obtain.writeInt(1);
                latLng.writeToParcel(obtain, 0);
            }
            else {
                obtain.writeInt(0);
            }
            this.a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            return l.a(obtain2.readStrongBinder());
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public LatLng a(final k k) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IProjectionDelegate");
            IBinder binder;
            if (k != null) {
                binder = k.asBinder();
            }
            else {
                binder = null;
            }
            obtain.writeStrongBinder(binder);
            this.a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            final int int1 = obtain2.readInt();
            LatLng a = null;
            if (int1 != 0) {
                a = LatLng.CREATOR.a(obtain2);
            }
            return a;
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public LatLng a(final y y) {
        while (true) {
            final Parcel obtain = Parcel.obtain();
            final Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IProjectionDelegate");
                if (y != null) {
                    obtain.writeInt(1);
                    y.writeToParcel(obtain, 0);
                }
                else {
                    obtain.writeInt(0);
                }
                this.a.transact(4, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() != 0) {
                    return LatLng.CREATOR.a(obtain2);
                }
            }
            finally {
                obtain2.recycle();
                obtain.recycle();
            }
            return null;
        }
    }
    
    @Override
    public VisibleRegion a() {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IProjectionDelegate");
            this.a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            VisibleRegion a;
            if (obtain2.readInt() != 0) {
                a = VisibleRegion.CREATOR.a(obtain2);
            }
            else {
                a = null;
            }
            return a;
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
    public y b(final LatLng latLng) {
        while (true) {
            final Parcel obtain = Parcel.obtain();
            final Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IProjectionDelegate");
                if (latLng != null) {
                    obtain.writeInt(1);
                    latLng.writeToParcel(obtain, 0);
                }
                else {
                    obtain.writeInt(0);
                }
                this.a.transact(5, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() != 0) {
                    return y.CREATOR.a(obtain2);
                }
            }
            finally {
                obtain2.recycle();
                obtain.recycle();
            }
            return null;
        }
    }
}
