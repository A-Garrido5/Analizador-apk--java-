// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.internal;

import android.os.Bundle;
import com.google.android.gms.maps.GoogleMapOptions;
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
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
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
                parcel2.writeString("com.google.android.gms.maps.internal.IMapFragmentDelegate");
                return true;
            }
            case 1: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
                final d a = this.a();
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
                parcel.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
                final com.google.android.gms.dynamic.k a2 = com.google.android.gms.dynamic.l.a(parcel.readStrongBinder());
                GoogleMapOptions a3;
                if (parcel.readInt() != 0) {
                    a3 = GoogleMapOptions.CREATOR.a(parcel);
                }
                else {
                    a3 = null;
                }
                Bundle bundle;
                if (parcel.readInt() != 0) {
                    bundle = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                else {
                    bundle = null;
                }
                this.a(a2, a3, bundle);
                parcel2.writeNoException();
                return true;
            }
            case 3: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
                Bundle bundle2;
                if (parcel.readInt() != 0) {
                    bundle2 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                else {
                    bundle2 = null;
                }
                this.a(bundle2);
                parcel2.writeNoException();
                return true;
            }
            case 4: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
                final com.google.android.gms.dynamic.k a4 = com.google.android.gms.dynamic.l.a(parcel.readStrongBinder());
                final com.google.android.gms.dynamic.k a5 = com.google.android.gms.dynamic.l.a(parcel.readStrongBinder());
                Bundle bundle3;
                if (parcel.readInt() != 0) {
                    bundle3 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                else {
                    bundle3 = null;
                }
                final com.google.android.gms.dynamic.k a6 = this.a(a4, a5, bundle3);
                parcel2.writeNoException();
                IBinder binder2 = null;
                if (a6 != null) {
                    binder2 = a6.asBinder();
                }
                parcel2.writeStrongBinder(binder2);
                return true;
            }
            case 5: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
                this.b();
                parcel2.writeNoException();
                return true;
            }
            case 6: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
                this.c();
                parcel2.writeNoException();
                return true;
            }
            case 7: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
                this.d();
                parcel2.writeNoException();
                return true;
            }
            case 8: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
                this.e();
                parcel2.writeNoException();
                return true;
            }
            case 9: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
                this.f();
                parcel2.writeNoException();
                return true;
            }
            case 10: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
                Bundle bundle4;
                if (parcel.readInt() != 0) {
                    bundle4 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                else {
                    bundle4 = null;
                }
                this.b(bundle4);
                parcel2.writeNoException();
                if (bundle4 != null) {
                    parcel2.writeInt(1);
                    bundle4.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            }
            case 11: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
                final boolean g = this.g();
                parcel2.writeNoException();
                int n3;
                if (g) {
                    n3 = 1;
                }
                else {
                    n3 = 0;
                }
                parcel2.writeInt(n3);
                return true;
            }
            case 12: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
                this.a(br.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
        }
    }
}
