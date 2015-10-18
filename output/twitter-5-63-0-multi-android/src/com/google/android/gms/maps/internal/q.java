// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.internal;

import com.google.android.gms.maps.model.VisibleRegion;
import com.google.android.gms.dynamic.k;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.dynamic.l;
import android.os.Parcel;
import android.os.IInterface;
import android.os.IBinder;
import android.os.Binder;

public abstract class q extends Binder implements p
{
    public static p a(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
        if (queryLocalInterface != null && queryLocalInterface instanceof p) {
            return (p)queryLocalInterface;
        }
        return new r(binder);
    }
    
    public boolean onTransact(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        switch (n) {
            default: {
                return super.onTransact(n, parcel, parcel2, n2);
            }
            case 1598968902: {
                parcel2.writeString("com.google.android.gms.maps.internal.IProjectionDelegate");
                return true;
            }
            case 1: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
                final LatLng a = this.a(l.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                if (a != null) {
                    parcel2.writeInt(1);
                    a.writeToParcel(parcel2, 1);
                }
                else {
                    parcel2.writeInt(0);
                }
                return true;
            }
            case 2: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
                LatLng a2;
                if (parcel.readInt() != 0) {
                    a2 = LatLng.CREATOR.a(parcel);
                }
                else {
                    a2 = null;
                }
                final k a3 = this.a(a2);
                parcel2.writeNoException();
                IBinder binder = null;
                if (a3 != null) {
                    binder = a3.asBinder();
                }
                parcel2.writeStrongBinder(binder);
                return true;
            }
            case 3: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
                final VisibleRegion a4 = this.a();
                parcel2.writeNoException();
                if (a4 != null) {
                    parcel2.writeInt(1);
                    a4.writeToParcel(parcel2, 1);
                }
                else {
                    parcel2.writeInt(0);
                }
                return true;
            }
            case 4: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
                final int int1 = parcel.readInt();
                y a5 = null;
                if (int1 != 0) {
                    a5 = y.CREATOR.a(parcel);
                }
                final LatLng a6 = this.a(a5);
                parcel2.writeNoException();
                if (a6 != null) {
                    parcel2.writeInt(1);
                    a6.writeToParcel(parcel2, 1);
                }
                else {
                    parcel2.writeInt(0);
                }
                return true;
            }
            case 5: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
                final int int2 = parcel.readInt();
                LatLng a7 = null;
                if (int2 != 0) {
                    a7 = LatLng.CREATOR.a(parcel);
                }
                final y b = this.b(a7);
                parcel2.writeNoException();
                if (b != null) {
                    parcel2.writeInt(1);
                    b.writeToParcel(parcel2, 1);
                }
                else {
                    parcel2.writeInt(0);
                }
                return true;
            }
        }
    }
}
