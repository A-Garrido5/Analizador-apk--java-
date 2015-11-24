// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.model.internal;

import com.google.android.gms.dynamic.l;
import com.google.android.gms.maps.model.LatLng;
import android.os.Parcel;
import android.os.IInterface;
import android.os.IBinder;
import android.os.Binder;

public abstract class x extends Binder implements w
{
    public static w a(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        if (queryLocalInterface != null && queryLocalInterface instanceof w) {
            return (w)queryLocalInterface;
        }
        return new y(binder);
    }
    
    public boolean onTransact(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        switch (n) {
            default: {
                return super.onTransact(n, parcel, parcel2, n2);
            }
            case 1598968902: {
                parcel2.writeString("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                return true;
            }
            case 1: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                this.a();
                parcel2.writeNoException();
                return true;
            }
            case 2: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                final String b = this.b();
                parcel2.writeNoException();
                parcel2.writeString(b);
                return true;
            }
            case 3: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
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
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
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
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                this.a(parcel.readString());
                parcel2.writeNoException();
                return true;
            }
            case 6: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                final String d = this.d();
                parcel2.writeNoException();
                parcel2.writeString(d);
                return true;
            }
            case 7: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                this.b(parcel.readString());
                parcel2.writeNoException();
                return true;
            }
            case 8: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                final String e = this.e();
                parcel2.writeNoException();
                parcel2.writeString(e);
                return true;
            }
            case 9: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                this.a(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            }
            case 10: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                final boolean f = this.f();
                parcel2.writeNoException();
                int n3 = 0;
                if (f) {
                    n3 = 1;
                }
                parcel2.writeInt(n3);
                return true;
            }
            case 11: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                this.g();
                parcel2.writeNoException();
                return true;
            }
            case 12: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                this.h();
                parcel2.writeNoException();
                return true;
            }
            case 13: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                final boolean i = this.i();
                parcel2.writeNoException();
                int n4 = 0;
                if (i) {
                    n4 = 1;
                }
                parcel2.writeInt(n4);
                return true;
            }
            case 14: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                final int int2 = parcel.readInt();
                boolean b2 = false;
                if (int2 != 0) {
                    b2 = true;
                }
                this.b(b2);
                parcel2.writeNoException();
                return true;
            }
            case 15: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                final boolean j = this.j();
                parcel2.writeNoException();
                int n5 = 0;
                if (j) {
                    n5 = 1;
                }
                parcel2.writeInt(n5);
                return true;
            }
            case 16: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                final boolean a2 = this.a(a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                int n6 = 0;
                if (a2) {
                    n6 = 1;
                }
                parcel2.writeInt(n6);
                return true;
            }
            case 17: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                final int k = this.k();
                parcel2.writeNoException();
                parcel2.writeInt(k);
                return true;
            }
            case 18: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                this.a(l.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            case 19: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                this.a(parcel.readFloat(), parcel.readFloat());
                parcel2.writeNoException();
                return true;
            }
            case 20: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                final int int3 = parcel.readInt();
                boolean b3 = false;
                if (int3 != 0) {
                    b3 = true;
                }
                this.c(b3);
                parcel2.writeNoException();
                return true;
            }
            case 21: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                final boolean l = this.l();
                parcel2.writeNoException();
                int n7 = 0;
                if (l) {
                    n7 = 1;
                }
                parcel2.writeInt(n7);
                return true;
            }
            case 22: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                this.a(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            }
            case 23: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                final float m = this.m();
                parcel2.writeNoException();
                parcel2.writeFloat(m);
                return true;
            }
            case 24: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                this.b(parcel.readFloat(), parcel.readFloat());
                parcel2.writeNoException();
                return true;
            }
            case 25: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                this.b(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            }
            case 26: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                final float n8 = this.n();
                parcel2.writeNoException();
                parcel2.writeFloat(n8);
                return true;
            }
            case 28: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                final int int4 = parcel.readInt();
                a a3 = null;
                if (int4 != 0) {
                    a3 = a.CREATOR.a(parcel);
                }
                this.a(a3);
                parcel2.writeNoException();
                return true;
            }
        }
    }
}
