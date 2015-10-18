// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.internal;

import com.google.android.gms.dynamic.k;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.CameraPosition;
import android.os.Parcel;
import android.os.IInterface;
import android.os.IBinder;
import android.os.Binder;

public abstract class b extends Binder implements a
{
    public static a a(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
        if (queryLocalInterface != null && queryLocalInterface instanceof a) {
            return (a)queryLocalInterface;
        }
        return new c(binder);
    }
    
    public boolean onTransact(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        switch (n) {
            default: {
                return super.onTransact(n, parcel, parcel2, n2);
            }
            case 1598968902: {
                parcel2.writeString("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                return true;
            }
            case 1: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                final k a = this.a();
                parcel2.writeNoException();
                IBinder binder = null;
                if (a != null) {
                    binder = a.asBinder();
                }
                parcel2.writeStrongBinder(binder);
                return true;
            }
            case 2: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                final k b = this.b();
                parcel2.writeNoException();
                IBinder binder2 = null;
                if (b != null) {
                    binder2 = b.asBinder();
                }
                parcel2.writeStrongBinder(binder2);
                return true;
            }
            case 3: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                final k a2 = this.a(parcel.readFloat(), parcel.readFloat());
                parcel2.writeNoException();
                IBinder binder3 = null;
                if (a2 != null) {
                    binder3 = a2.asBinder();
                }
                parcel2.writeStrongBinder(binder3);
                return true;
            }
            case 4: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                final k a3 = this.a(parcel.readFloat());
                parcel2.writeNoException();
                IBinder binder4 = null;
                if (a3 != null) {
                    binder4 = a3.asBinder();
                }
                parcel2.writeStrongBinder(binder4);
                return true;
            }
            case 5: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                final k b2 = this.b(parcel.readFloat());
                parcel2.writeNoException();
                IBinder binder5 = null;
                if (b2 != null) {
                    binder5 = b2.asBinder();
                }
                parcel2.writeStrongBinder(binder5);
                return true;
            }
            case 6: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                final k a4 = this.a(parcel.readFloat(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                IBinder binder6 = null;
                if (a4 != null) {
                    binder6 = a4.asBinder();
                }
                parcel2.writeStrongBinder(binder6);
                return true;
            }
            case 7: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                CameraPosition a5;
                if (parcel.readInt() != 0) {
                    a5 = CameraPosition.CREATOR.a(parcel);
                }
                else {
                    a5 = null;
                }
                final k a6 = this.a(a5);
                parcel2.writeNoException();
                IBinder binder7 = null;
                if (a6 != null) {
                    binder7 = a6.asBinder();
                }
                parcel2.writeStrongBinder(binder7);
                return true;
            }
            case 8: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                LatLng a7;
                if (parcel.readInt() != 0) {
                    a7 = LatLng.CREATOR.a(parcel);
                }
                else {
                    a7 = null;
                }
                final k a8 = this.a(a7);
                parcel2.writeNoException();
                IBinder binder8 = null;
                if (a8 != null) {
                    binder8 = a8.asBinder();
                }
                parcel2.writeStrongBinder(binder8);
                return true;
            }
            case 9: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                LatLng a9;
                if (parcel.readInt() != 0) {
                    a9 = LatLng.CREATOR.a(parcel);
                }
                else {
                    a9 = null;
                }
                final k a10 = this.a(a9, parcel.readFloat());
                parcel2.writeNoException();
                IBinder binder9 = null;
                if (a10 != null) {
                    binder9 = a10.asBinder();
                }
                parcel2.writeStrongBinder(binder9);
                return true;
            }
            case 10: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                LatLngBounds a11;
                if (parcel.readInt() != 0) {
                    a11 = LatLngBounds.CREATOR.a(parcel);
                }
                else {
                    a11 = null;
                }
                final k a12 = this.a(a11, parcel.readInt());
                parcel2.writeNoException();
                IBinder binder10 = null;
                if (a12 != null) {
                    binder10 = a12.asBinder();
                }
                parcel2.writeStrongBinder(binder10);
                return true;
            }
            case 11: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                LatLngBounds a13;
                if (parcel.readInt() != 0) {
                    a13 = LatLngBounds.CREATOR.a(parcel);
                }
                else {
                    a13 = null;
                }
                final k a14 = this.a(a13, parcel.readInt(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                IBinder binder11 = null;
                if (a14 != null) {
                    binder11 = a14.asBinder();
                }
                parcel2.writeStrongBinder(binder11);
                return true;
            }
        }
    }
}
