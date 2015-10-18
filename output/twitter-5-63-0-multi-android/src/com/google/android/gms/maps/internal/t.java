// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.internal;

import com.google.android.gms.dynamic.k;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
import com.google.android.gms.dynamic.l;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import android.os.Parcel;
import android.os.IInterface;
import android.os.IBinder;
import android.os.Binder;

public abstract class t extends Binder implements s
{
    public static s a(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
        if (queryLocalInterface != null && queryLocalInterface instanceof s) {
            return (s)queryLocalInterface;
        }
        return new u(binder);
    }
    
    public boolean onTransact(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        switch (n) {
            default: {
                return super.onTransact(n, parcel, parcel2, n2);
            }
            case 1598968902: {
                parcel2.writeString("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                return true;
            }
            case 1: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                final int int1 = parcel.readInt();
                boolean b = false;
                if (int1 != 0) {
                    b = true;
                }
                this.a(b);
                parcel2.writeNoException();
                return true;
            }
            case 2: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                final int int2 = parcel.readInt();
                boolean b2 = false;
                if (int2 != 0) {
                    b2 = true;
                }
                this.b(b2);
                parcel2.writeNoException();
                return true;
            }
            case 3: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                final int int3 = parcel.readInt();
                boolean b3 = false;
                if (int3 != 0) {
                    b3 = true;
                }
                this.c(b3);
                parcel2.writeNoException();
                return true;
            }
            case 4: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                final int int4 = parcel.readInt();
                boolean b4 = false;
                if (int4 != 0) {
                    b4 = true;
                }
                this.d(b4);
                parcel2.writeNoException();
                return true;
            }
            case 5: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                final boolean a = this.a();
                parcel2.writeNoException();
                int n3 = 0;
                if (a) {
                    n3 = 1;
                }
                parcel2.writeInt(n3);
                return true;
            }
            case 6: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                final boolean b5 = this.b();
                parcel2.writeNoException();
                int n4 = 0;
                if (b5) {
                    n4 = 1;
                }
                parcel2.writeInt(n4);
                return true;
            }
            case 7: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                final boolean c = this.c();
                parcel2.writeNoException();
                int n5 = 0;
                if (c) {
                    n5 = 1;
                }
                parcel2.writeInt(n5);
                return true;
            }
            case 8: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                final boolean d = this.d();
                parcel2.writeNoException();
                int n6 = 0;
                if (d) {
                    n6 = 1;
                }
                parcel2.writeInt(n6);
                return true;
            }
            case 9: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                StreetViewPanoramaCamera a2;
                if (parcel.readInt() != 0) {
                    a2 = StreetViewPanoramaCamera.CREATOR.a(parcel);
                }
                else {
                    a2 = null;
                }
                this.a(a2, parcel.readLong());
                parcel2.writeNoException();
                return true;
            }
            case 10: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                final StreetViewPanoramaCamera e = this.e();
                parcel2.writeNoException();
                if (e != null) {
                    parcel2.writeInt(1);
                    e.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            }
            case 11: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                this.a(parcel.readString());
                parcel2.writeNoException();
                return true;
            }
            case 12: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                final int int5 = parcel.readInt();
                LatLng a3 = null;
                if (int5 != 0) {
                    a3 = LatLng.CREATOR.a(parcel);
                }
                this.a(a3);
                parcel2.writeNoException();
                return true;
            }
            case 13: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                final int int6 = parcel.readInt();
                LatLng a4 = null;
                if (int6 != 0) {
                    a4 = LatLng.CREATOR.a(parcel);
                }
                this.a(a4, parcel.readInt());
                parcel2.writeNoException();
                return true;
            }
            case 14: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                final StreetViewPanoramaLocation f = this.f();
                parcel2.writeNoException();
                if (f != null) {
                    parcel2.writeInt(1);
                    f.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            }
            case 15: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                this.a(cj.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            case 16: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                this.a(cg.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            case 17: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                this.a(cm.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            case 18: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                final StreetViewPanoramaOrientation a5 = this.a(l.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                if (a5 != null) {
                    parcel2.writeInt(1);
                    a5.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            }
            case 19: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                StreetViewPanoramaOrientation a6;
                if (parcel.readInt() != 0) {
                    a6 = StreetViewPanoramaOrientation.CREATOR.a(parcel);
                }
                else {
                    a6 = null;
                }
                final k a7 = this.a(a6);
                parcel2.writeNoException();
                IBinder binder = null;
                if (a7 != null) {
                    binder = a7.asBinder();
                }
                parcel2.writeStrongBinder(binder);
                return true;
            }
        }
    }
}
