// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.model.internal;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.IInterface;
import android.os.IBinder;
import android.os.Binder;

public abstract class k extends Binder implements j
{
    public static j a(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
        if (queryLocalInterface != null && queryLocalInterface instanceof j) {
            return (j)queryLocalInterface;
        }
        return new l(binder);
    }
    
    public boolean onTransact(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        switch (n) {
            default: {
                return super.onTransact(n, parcel, parcel2, n2);
            }
            case 1598968902: {
                parcel2.writeString("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                return true;
            }
            case 1: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                final com.google.android.gms.dynamic.k a = this.a(parcel.readInt());
                parcel2.writeNoException();
                IBinder binder;
                if (a != null) {
                    binder = a.asBinder();
                }
                else {
                    binder = null;
                }
                parcel2.writeStrongBinder(binder);
                return true;
            }
            case 2: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                final com.google.android.gms.dynamic.k a2 = this.a(parcel.readString());
                parcel2.writeNoException();
                IBinder binder2 = null;
                if (a2 != null) {
                    binder2 = a2.asBinder();
                }
                parcel2.writeStrongBinder(binder2);
                return true;
            }
            case 3: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                final com.google.android.gms.dynamic.k b = this.b(parcel.readString());
                parcel2.writeNoException();
                IBinder binder3 = null;
                if (b != null) {
                    binder3 = b.asBinder();
                }
                parcel2.writeStrongBinder(binder3);
                return true;
            }
            case 4: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                final com.google.android.gms.dynamic.k a3 = this.a();
                parcel2.writeNoException();
                IBinder binder4 = null;
                if (a3 != null) {
                    binder4 = a3.asBinder();
                }
                parcel2.writeStrongBinder(binder4);
                return true;
            }
            case 5: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                final com.google.android.gms.dynamic.k a4 = this.a(parcel.readFloat());
                parcel2.writeNoException();
                IBinder binder5 = null;
                if (a4 != null) {
                    binder5 = a4.asBinder();
                }
                parcel2.writeStrongBinder(binder5);
                return true;
            }
            case 6: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                Bitmap bitmap;
                if (parcel.readInt() != 0) {
                    bitmap = (Bitmap)Bitmap.CREATOR.createFromParcel(parcel);
                }
                else {
                    bitmap = null;
                }
                final com.google.android.gms.dynamic.k a5 = this.a(bitmap);
                parcel2.writeNoException();
                IBinder binder6 = null;
                if (a5 != null) {
                    binder6 = a5.asBinder();
                }
                parcel2.writeStrongBinder(binder6);
                return true;
            }
            case 7: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                final com.google.android.gms.dynamic.k c = this.c(parcel.readString());
                parcel2.writeNoException();
                IBinder binder7 = null;
                if (c != null) {
                    binder7 = c.asBinder();
                }
                parcel2.writeStrongBinder(binder7);
                return true;
            }
        }
    }
}
