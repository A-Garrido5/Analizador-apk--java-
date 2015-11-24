// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.internal;

import com.google.android.gms.maps.model.internal.t;
import com.google.android.gms.maps.model.internal.m;
import android.location.Location;
import com.google.android.gms.maps.model.internal.ac;
import com.google.android.gms.maps.model.internal.q;
import com.google.android.gms.maps.model.internal.w;
import com.google.android.gms.maps.model.internal.z;
import com.google.android.gms.maps.model.internal.b;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.internal.p;
import com.google.android.gms.maps.model.internal.c;
import android.os.Bundle;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.dynamic.l;
import android.os.Parcel;
import android.os.IInterface;
import android.os.IBinder;
import android.os.Binder;

public abstract class e extends Binder implements d
{
    public static d a(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (queryLocalInterface != null && queryLocalInterface instanceof d) {
            return (d)queryLocalInterface;
        }
        return new f(binder);
    }
    
    public boolean onTransact(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        switch (n) {
            default: {
                return super.onTransact(n, parcel, parcel2, n2);
            }
            case 1598968902: {
                parcel2.writeString("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                return true;
            }
            case 1: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                final CameraPosition a = this.a();
                parcel2.writeNoException();
                if (a != null) {
                    parcel2.writeInt(1);
                    a.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            }
            case 2: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                final float b = this.b();
                parcel2.writeNoException();
                parcel2.writeFloat(b);
                return true;
            }
            case 3: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                final float c = this.c();
                parcel2.writeNoException();
                parcel2.writeFloat(c);
                return true;
            }
            case 4: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                this.a(l.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            case 5: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                this.b(l.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            case 6: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                this.a(l.a(parcel.readStrongBinder()), ak.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            case 7: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                this.a(l.a(parcel.readStrongBinder()), parcel.readInt(), ak.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            case 8: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                this.d();
                parcel2.writeNoException();
                return true;
            }
            case 9: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                PolylineOptions a2;
                if (parcel.readInt() != 0) {
                    a2 = PolylineOptions.CREATOR.a(parcel);
                }
                else {
                    a2 = null;
                }
                final b a3 = this.a(a2);
                parcel2.writeNoException();
                IBinder binder = null;
                if (a3 != null) {
                    binder = a3.asBinder();
                }
                parcel2.writeStrongBinder(binder);
                return true;
            }
            case 10: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                PolygonOptions a4;
                if (parcel.readInt() != 0) {
                    a4 = PolygonOptions.CREATOR.a(parcel);
                }
                else {
                    a4 = null;
                }
                final z a5 = this.a(a4);
                parcel2.writeNoException();
                IBinder binder2 = null;
                if (a5 != null) {
                    binder2 = a5.asBinder();
                }
                parcel2.writeStrongBinder(binder2);
                return true;
            }
            case 11: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                MarkerOptions a6;
                if (parcel.readInt() != 0) {
                    a6 = MarkerOptions.CREATOR.a(parcel);
                }
                else {
                    a6 = null;
                }
                final w a7 = this.a(a6);
                parcel2.writeNoException();
                IBinder binder3 = null;
                if (a7 != null) {
                    binder3 = a7.asBinder();
                }
                parcel2.writeStrongBinder(binder3);
                return true;
            }
            case 12: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                GroundOverlayOptions a8;
                if (parcel.readInt() != 0) {
                    a8 = GroundOverlayOptions.CREATOR.a(parcel);
                }
                else {
                    a8 = null;
                }
                final q a9 = this.a(a8);
                parcel2.writeNoException();
                IBinder binder4 = null;
                if (a9 != null) {
                    binder4 = a9.asBinder();
                }
                parcel2.writeStrongBinder(binder4);
                return true;
            }
            case 13: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                TileOverlayOptions a10;
                if (parcel.readInt() != 0) {
                    a10 = TileOverlayOptions.CREATOR.a(parcel);
                }
                else {
                    a10 = null;
                }
                final ac a11 = this.a(a10);
                parcel2.writeNoException();
                IBinder binder5 = null;
                if (a11 != null) {
                    binder5 = a11.asBinder();
                }
                parcel2.writeStrongBinder(binder5);
                return true;
            }
            case 14: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                this.e();
                parcel2.writeNoException();
                return true;
            }
            case 15: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                final int f = this.f();
                parcel2.writeNoException();
                parcel2.writeInt(f);
                return true;
            }
            case 16: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                this.a(parcel.readInt());
                parcel2.writeNoException();
                return true;
            }
            case 17: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
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
            case 18: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                final int int1 = parcel.readInt();
                boolean b2 = false;
                if (int1 != 0) {
                    b2 = true;
                }
                this.a(b2);
                parcel2.writeNoException();
                return true;
            }
            case 19: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                final boolean h = this.h();
                parcel2.writeNoException();
                int n4 = 0;
                if (h) {
                    n4 = 1;
                }
                parcel2.writeInt(n4);
                return true;
            }
            case 20: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                final boolean b3 = this.b(parcel.readInt() != 0);
                parcel2.writeNoException();
                int n5 = 0;
                if (b3) {
                    n5 = 1;
                }
                parcel2.writeInt(n5);
                return true;
            }
            case 21: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                final boolean i = this.i();
                parcel2.writeNoException();
                int n6 = 0;
                if (i) {
                    n6 = 1;
                }
                parcel2.writeInt(n6);
                return true;
            }
            case 22: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                final int int2 = parcel.readInt();
                boolean b4 = false;
                if (int2 != 0) {
                    b4 = true;
                }
                this.c(b4);
                parcel2.writeNoException();
                return true;
            }
            case 23: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                final Location j = this.j();
                parcel2.writeNoException();
                if (j != null) {
                    parcel2.writeInt(1);
                    j.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            }
            case 24: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                this.a(h.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            case 25: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                final com.google.android.gms.maps.internal.ac k = this.k();
                parcel2.writeNoException();
                IBinder binder6 = null;
                if (k != null) {
                    binder6 = k.asBinder();
                }
                parcel2.writeStrongBinder(binder6);
                return true;
            }
            case 26: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                final com.google.android.gms.maps.internal.p l = this.l();
                parcel2.writeNoException();
                IBinder binder7 = null;
                if (l != null) {
                    binder7 = l.asBinder();
                }
                parcel2.writeStrongBinder(binder7);
                return true;
            }
            case 27: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                this.a(aw.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            case 28: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                this.a(bi.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            case 29: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                this.a(bo.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            case 30: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                this.a(bu.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            case 31: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                this.a(bx.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            case 32: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                this.a(bc.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            case 33: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                this.a(aq.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            case 35: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                CircleOptions a12;
                if (parcel.readInt() != 0) {
                    a12 = CircleOptions.CREATOR.a(parcel);
                }
                else {
                    a12 = null;
                }
                final m a13 = this.a(a12);
                parcel2.writeNoException();
                IBinder binder8 = null;
                if (a13 != null) {
                    binder8 = a13.asBinder();
                }
                parcel2.writeStrongBinder(binder8);
                return true;
            }
            case 36: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                this.a(cd.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            case 37: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                this.a(ca.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            case 38: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                this.a(cs.a(parcel.readStrongBinder()), l.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            case 39: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                this.a(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            }
            case 40: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                final boolean m = this.m();
                parcel2.writeNoException();
                int n7 = 0;
                if (m) {
                    n7 = 1;
                }
                parcel2.writeInt(n7);
                return true;
            }
            case 41: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                final int int3 = parcel.readInt();
                boolean b5 = false;
                if (int3 != 0) {
                    b5 = true;
                }
                this.d(b5);
                parcel2.writeNoException();
                return true;
            }
            case 42: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                this.a(bl.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            case 44: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                final t n8 = this.n();
                parcel2.writeNoException();
                IBinder binder9 = null;
                if (n8 != null) {
                    binder9 = n8.asBinder();
                }
                parcel2.writeStrongBinder(binder9);
                return true;
            }
            case 45: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                this.a(az.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            case 53: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                this.a(br.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            case 54: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                Bundle bundle;
                if (parcel.readInt() != 0) {
                    bundle = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                else {
                    bundle = null;
                }
                this.a(bundle);
                parcel2.writeNoException();
                return true;
            }
            case 55: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                this.o();
                parcel2.writeNoException();
                return true;
            }
            case 56: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                this.p();
                parcel2.writeNoException();
                return true;
            }
            case 57: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                this.q();
                parcel2.writeNoException();
                return true;
            }
            case 58: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                this.r();
                parcel2.writeNoException();
                return true;
            }
            case 59: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                final boolean s = this.s();
                parcel2.writeNoException();
                int n9 = 0;
                if (s) {
                    n9 = 1;
                }
                parcel2.writeInt(n9);
                return true;
            }
            case 60: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                Bundle bundle2;
                if (parcel.readInt() != 0) {
                    bundle2 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                else {
                    bundle2 = null;
                }
                this.b(bundle2);
                parcel2.writeNoException();
                if (bundle2 != null) {
                    parcel2.writeInt(1);
                    bundle2.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            }
            case 61: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                this.a(parcel.readString());
                parcel2.writeNoException();
                return true;
            }
            case 64: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                final int int4 = parcel.readInt();
                c a14 = null;
                if (int4 != 0) {
                    a14 = c.CREATOR.a(parcel);
                }
                this.a(a14);
                parcel2.writeNoException();
                return true;
            }
            case 65: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                final int int5 = parcel.readInt();
                c a15 = null;
                if (int5 != 0) {
                    a15 = c.CREATOR.a(parcel);
                }
                this.b(a15);
                parcel2.writeNoException();
                return true;
            }
            case 66: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                final int int6 = parcel.readInt();
                c a16 = null;
                if (int6 != 0) {
                    a16 = c.CREATOR.a(parcel);
                }
                this.a(a16, ak.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            case 67: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                final int int7 = parcel.readInt();
                c a17 = null;
                if (int7 != 0) {
                    a17 = c.CREATOR.a(parcel);
                }
                this.a(a17, parcel.readInt(), ak.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            case 68: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                MarkerOptions a18;
                if (parcel.readInt() != 0) {
                    a18 = MarkerOptions.CREATOR.a(parcel);
                }
                else {
                    a18 = null;
                }
                p a19;
                if (parcel.readInt() != 0) {
                    a19 = p.CREATOR.a(parcel);
                }
                else {
                    a19 = null;
                }
                final w a20 = this.a(a18, a19);
                parcel2.writeNoException();
                IBinder binder10 = null;
                if (a20 != null) {
                    binder10 = a20.asBinder();
                }
                parcel2.writeStrongBinder(binder10);
                return true;
            }
            case 69: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                this.a(at.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            case 70: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                GroundOverlayOptions a21;
                if (parcel.readInt() != 0) {
                    a21 = GroundOverlayOptions.CREATOR.a(parcel);
                }
                else {
                    a21 = null;
                }
                com.google.android.gms.maps.model.internal.e a22;
                if (parcel.readInt() != 0) {
                    a22 = com.google.android.gms.maps.model.internal.e.CREATOR.a(parcel);
                }
                else {
                    a22 = null;
                }
                final q a23 = this.a(a21, a22);
                parcel2.writeNoException();
                IBinder binder11 = null;
                if (a23 != null) {
                    binder11 = a23.asBinder();
                }
                parcel2.writeStrongBinder(binder11);
                return true;
            }
        }
    }
}
