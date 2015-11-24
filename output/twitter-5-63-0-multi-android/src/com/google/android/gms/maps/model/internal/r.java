// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.model.internal;

import com.google.android.gms.dynamic.l;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.LatLng;
import android.os.Parcel;
import android.os.IInterface;
import android.os.IBinder;
import android.os.Binder;

public abstract class r extends Binder implements q
{
    public static q a(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
        if (queryLocalInterface != null && queryLocalInterface instanceof q) {
            return (q)queryLocalInterface;
        }
        return new s(binder);
    }
    
    public boolean onTransact(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        switch (n) {
            default: {
                return super.onTransact(n, parcel, parcel2, n2);
            }
            case 1598968902: {
                parcel2.writeString("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                return true;
            }
            case 1: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                this.a();
                parcel2.writeNoException();
                return true;
            }
            case 2: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                final String b = this.b();
                parcel2.writeNoException();
                parcel2.writeString(b);
                return true;
            }
            case 3: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                final int int1 = parcel.readInt();
                LatLng a = null;
                if (int1 != 0) {
                    a = LatLng.CREATOR.a(parcel);
                }
                this.a(a);
                parcel2.writeNoException();
                return true;
            }
            case 4: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                final LatLng c = this.c();
                parcel2.writeNoException();
                if (c != null) {
                    parcel2.writeInt(1);
                    c.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            }
            case 5: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                this.a(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            }
            case 6: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                this.a(parcel.readFloat(), parcel.readFloat());
                parcel2.writeNoException();
                return true;
            }
            case 7: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                final float d = this.d();
                parcel2.writeNoException();
                parcel2.writeFloat(d);
                return true;
            }
            case 8: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                final float e = this.e();
                parcel2.writeNoException();
                parcel2.writeFloat(e);
                return true;
            }
            case 9: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                final int int2 = parcel.readInt();
                LatLngBounds a2 = null;
                if (int2 != 0) {
                    a2 = LatLngBounds.CREATOR.a(parcel);
                }
                this.a(a2);
                parcel2.writeNoException();
                return true;
            }
            case 10: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                final LatLngBounds f = this.f();
                parcel2.writeNoException();
                if (f != null) {
                    parcel2.writeInt(1);
                    f.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            }
            case 11: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                this.b(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            }
            case 12: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                final float g = this.g();
                parcel2.writeNoException();
                parcel2.writeFloat(g);
                return true;
            }
            case 13: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                this.c(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            }
            case 14: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                final float h = this.h();
                parcel2.writeNoException();
                parcel2.writeFloat(h);
                return true;
            }
            case 15: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                this.a(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            }
            case 16: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                final boolean i = this.i();
                parcel2.writeNoException();
                int n3 = 0;
                if (i) {
                    n3 = 1;
                }
                parcel2.writeInt(n3);
                return true;
            }
            case 17: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                this.d(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            }
            case 18: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                final float j = this.j();
                parcel2.writeNoException();
                parcel2.writeFloat(j);
                return true;
            }
            case 19: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                final boolean a3 = this.a(a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                int n4 = 0;
                if (a3) {
                    n4 = 1;
                }
                parcel2.writeInt(n4);
                return true;
            }
            case 20: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                final int k = this.k();
                parcel2.writeNoException();
                parcel2.writeInt(k);
                return true;
            }
            case 21: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                this.a(l.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            case 22: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                final int int3 = parcel.readInt();
                a a4 = null;
                if (int3 != 0) {
                    a4 = a.CREATOR.a(parcel);
                }
                this.a(a4);
                parcel2.writeNoException();
                return true;
            }
        }
    }
}
