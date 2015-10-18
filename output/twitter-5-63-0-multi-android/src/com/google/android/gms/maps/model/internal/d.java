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

public abstract class d extends Binder implements b
{
    public static b a(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
        if (queryLocalInterface != null && queryLocalInterface instanceof b) {
            return (b)queryLocalInterface;
        }
        return new f(binder);
    }
    
    public boolean onTransact(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        switch (n) {
            default: {
                return super.onTransact(n, parcel, parcel2, n2);
            }
            case 1598968902: {
                parcel2.writeString("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                return true;
            }
            case 1: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                this.a();
                parcel2.writeNoException();
                return true;
            }
            case 2: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                final String b = this.b();
                parcel2.writeNoException();
                parcel2.writeString(b);
                return true;
            }
            case 3: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                this.a(parcel.createTypedArrayList((Parcelable$Creator)LatLng.CREATOR));
                parcel2.writeNoException();
                return true;
            }
            case 4: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                final List c = this.c();
                parcel2.writeNoException();
                parcel2.writeTypedList(c);
                return true;
            }
            case 5: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                this.a(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            }
            case 6: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                final float d = this.d();
                parcel2.writeNoException();
                parcel2.writeFloat(d);
                return true;
            }
            case 7: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                this.a(parcel.readInt());
                parcel2.writeNoException();
                return true;
            }
            case 8: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                final int e = this.e();
                parcel2.writeNoException();
                parcel2.writeInt(e);
                return true;
            }
            case 9: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                this.b(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            }
            case 10: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                final float f = this.f();
                parcel2.writeNoException();
                parcel2.writeFloat(f);
                return true;
            }
            case 11: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                final int int1 = parcel.readInt();
                boolean b2 = false;
                if (int1 != 0) {
                    b2 = true;
                }
                this.a(b2);
                parcel2.writeNoException();
                return true;
            }
            case 12: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                final boolean g = this.g();
                parcel2.writeNoException();
                int n3 = 0;
                if (g) {
                    n3 = 1;
                }
                parcel2.writeInt(n3);
                return true;
            }
            case 13: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                final int int2 = parcel.readInt();
                boolean b3 = false;
                if (int2 != 0) {
                    b3 = true;
                }
                this.b(b3);
                parcel2.writeNoException();
                return true;
            }
            case 14: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                final boolean h = this.h();
                parcel2.writeNoException();
                int n4 = 0;
                if (h) {
                    n4 = 1;
                }
                parcel2.writeInt(n4);
                return true;
            }
            case 15: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                final boolean a = this.a(a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                int n5 = 0;
                if (a) {
                    n5 = 1;
                }
                parcel2.writeInt(n5);
                return true;
            }
            case 16: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                final int i = this.i();
                parcel2.writeNoException();
                parcel2.writeInt(i);
                return true;
            }
        }
    }
}
