// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.internal;

import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.dynamic.l;
import android.os.Parcel;
import com.google.android.gms.dynamic.k;
import android.os.IBinder;

class c implements a
{
    private IBinder a;
    
    c(final IBinder a) {
        this.a = a;
    }
    
    @Override
    public k a() {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            this.a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return l.a(obtain2.readStrongBinder());
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public k a(final float n) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            obtain.writeFloat(n);
            this.a.transact(4, obtain, obtain2, 0);
            obtain2.readException();
            return l.a(obtain2.readStrongBinder());
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public k a(final float n, final float n2) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            obtain.writeFloat(n);
            obtain.writeFloat(n2);
            this.a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            return l.a(obtain2.readStrongBinder());
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public k a(final float n, final int n2, final int n3) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            obtain.writeFloat(n);
            obtain.writeInt(n2);
            obtain.writeInt(n3);
            this.a.transact(6, obtain, obtain2, 0);
            obtain2.readException();
            return l.a(obtain2.readStrongBinder());
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public k a(final CameraPosition cameraPosition) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            if (cameraPosition != null) {
                obtain.writeInt(1);
                cameraPosition.writeToParcel(obtain, 0);
            }
            else {
                obtain.writeInt(0);
            }
            this.a.transact(7, obtain, obtain2, 0);
            obtain2.readException();
            return l.a(obtain2.readStrongBinder());
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public k a(final LatLng latLng) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            if (latLng != null) {
                obtain.writeInt(1);
                latLng.writeToParcel(obtain, 0);
            }
            else {
                obtain.writeInt(0);
            }
            this.a.transact(8, obtain, obtain2, 0);
            obtain2.readException();
            return l.a(obtain2.readStrongBinder());
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public k a(final LatLng latLng, final float n) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            if (latLng != null) {
                obtain.writeInt(1);
                latLng.writeToParcel(obtain, 0);
            }
            else {
                obtain.writeInt(0);
            }
            obtain.writeFloat(n);
            this.a.transact(9, obtain, obtain2, 0);
            obtain2.readException();
            return l.a(obtain2.readStrongBinder());
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public k a(final LatLngBounds latLngBounds, final int n) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            if (latLngBounds != null) {
                obtain.writeInt(1);
                latLngBounds.writeToParcel(obtain, 0);
            }
            else {
                obtain.writeInt(0);
            }
            obtain.writeInt(n);
            this.a.transact(10, obtain, obtain2, 0);
            obtain2.readException();
            return l.a(obtain2.readStrongBinder());
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public k a(final LatLngBounds latLngBounds, final int n, final int n2, final int n3) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            if (latLngBounds != null) {
                obtain.writeInt(1);
                latLngBounds.writeToParcel(obtain, 0);
            }
            else {
                obtain.writeInt(0);
            }
            obtain.writeInt(n);
            obtain.writeInt(n2);
            obtain.writeInt(n3);
            this.a.transact(11, obtain, obtain2, 0);
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
    public k b() {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
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
    public k b(final float n) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            obtain.writeFloat(n);
            this.a.transact(5, obtain, obtain2, 0);
            obtain2.readException();
            return l.a(obtain2.readStrongBinder());
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
