// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.model.internal;

import java.util.List;
import android.os.Parcelable$Creator;
import com.google.android.gms.maps.model.LatLng;
import android.os.Parcel;
import android.os.IInterface;
import android.os.IBinder;
import android.os.Binder;

public abstract class aa extends Binder implements z
{
    public static z a(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        if (queryLocalInterface != null && queryLocalInterface instanceof z) {
            return (z)queryLocalInterface;
        }
        return new ab(binder);
    }
    
    public boolean onTransact(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        switch (n) {
            default: {
                return super.onTransact(n, parcel, parcel2, n2);
            }
            case 1598968902: {
                parcel2.writeString("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                return true;
            }
            case 1: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                this.a();
                parcel2.writeNoException();
                return true;
            }
            case 2: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                final String b = this.b();
                parcel2.writeNoException();
                parcel2.writeString(b);
                return true;
            }
            case 3: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                this.a(parcel.createTypedArrayList((Parcelable$Creator)LatLng.CREATOR));
                parcel2.writeNoException();
                return true;
            }
            case 4: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                final List c = this.c();
                parcel2.writeNoException();
                parcel2.writeTypedList(c);
                return true;
            }
            case 5: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                this.b(parcel.readArrayList(this.getClass().getClassLoader()));
                parcel2.writeNoException();
                return true;
            }
            case 6: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                final List d = this.d();
                parcel2.writeNoException();
                parcel2.writeList(d);
                return true;
            }
            case 7: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                this.a(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            }
            case 8: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                final float e = this.e();
                parcel2.writeNoException();
                parcel2.writeFloat(e);
                return true;
            }
            case 9: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                this.a(parcel.readInt());
                parcel2.writeNoException();
                return true;
            }
            case 10: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                final int f = this.f();
                parcel2.writeNoException();
                parcel2.writeInt(f);
                return true;
            }
            case 11: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                this.b(parcel.readInt());
                parcel2.writeNoException();
                return true;
            }
            case 12: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                final int g = this.g();
                parcel2.writeNoException();
                parcel2.writeInt(g);
                return true;
            }
            case 13: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                this.b(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            }
            case 14: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                final float h = this.h();
                parcel2.writeNoException();
                parcel2.writeFloat(h);
                return true;
            }
            case 15: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                final int int1 = parcel.readInt();
                boolean b2 = false;
                if (int1 != 0) {
                    b2 = true;
                }
                this.a(b2);
                parcel2.writeNoException();
                return true;
            }
            case 16: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
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
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                final int int2 = parcel.readInt();
                boolean b3 = false;
                if (int2 != 0) {
                    b3 = true;
                }
                this.b(b3);
                parcel2.writeNoException();
                return true;
            }
            case 18: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                final boolean j = this.j();
                parcel2.writeNoException();
                int n4 = 0;
                if (j) {
                    n4 = 1;
                }
                parcel2.writeInt(n4);
                return true;
            }
            case 19: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                final boolean a = this.a(a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                int n5 = 0;
                if (a) {
                    n5 = 1;
                }
                parcel2.writeInt(n5);
                return true;
            }
            case 20: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                final int k = this.k();
                parcel2.writeNoException();
                parcel2.writeInt(k);
                return true;
            }
        }
    }
}
