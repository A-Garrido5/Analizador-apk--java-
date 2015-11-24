// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.internal;

import com.google.android.gms.dynamic.k;
import android.os.Bundle;
import android.os.Parcel;
import android.os.IInterface;
import android.os.IBinder;
import android.os.Binder;

public abstract class n extends Binder implements m
{
    public static m a(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
        if (queryLocalInterface != null && queryLocalInterface instanceof m) {
            return (m)queryLocalInterface;
        }
        return new o(binder);
    }
    
    public boolean onTransact(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        switch (n) {
            default: {
                return super.onTransact(n, parcel, parcel2, n2);
            }
            case 1598968902: {
                parcel2.writeString("com.google.android.gms.maps.internal.IMapViewDelegate");
                return true;
            }
            case 1: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
                final d a = this.a();
                parcel2.writeNoException();
                IBinder binder = null;
                if (a != null) {
                    binder = a.asBinder();
                }
                parcel2.writeStrongBinder(binder);
                return true;
            }
            case 2: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
                final int int1 = parcel.readInt();
                Bundle bundle = null;
                if (int1 != 0) {
                    bundle = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                this.a(bundle);
                parcel2.writeNoException();
                return true;
            }
            case 3: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
                this.b();
                parcel2.writeNoException();
                return true;
            }
            case 4: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
                this.c();
                parcel2.writeNoException();
                return true;
            }
            case 5: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
                this.d();
                parcel2.writeNoException();
                return true;
            }
            case 6: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
                this.e();
                parcel2.writeNoException();
                return true;
            }
            case 7: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
                final int int2 = parcel.readInt();
                Bundle bundle2 = null;
                if (int2 != 0) {
                    bundle2 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                this.b(bundle2);
                parcel2.writeNoException();
                if (bundle2 != null) {
                    parcel2.writeInt(1);
                    bundle2.writeToParcel(parcel2, 1);
                }
                else {
                    parcel2.writeInt(0);
                }
                return true;
            }
            case 8: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
                final k f = this.f();
                parcel2.writeNoException();
                IBinder binder2 = null;
                if (f != null) {
                    binder2 = f.asBinder();
                }
                parcel2.writeStrongBinder(binder2);
                return true;
            }
            case 9: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
                this.a(br.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
        }
    }
}
