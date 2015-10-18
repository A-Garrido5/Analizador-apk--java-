// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.model.internal;

import com.google.android.gms.maps.model.LatLng;
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
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
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
                parcel2.writeString("com.google.android.gms.maps.model.internal.ICircleDelegate");
                return true;
            }
            case 1: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                this.a();
                parcel2.writeNoException();
                return true;
            }
            case 2: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                final String b = this.b();
                parcel2.writeNoException();
                parcel2.writeString(b);
                return true;
            }
            case 3: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                LatLng a;
                if (parcel.readInt() != 0) {
                    a = LatLng.CREATOR.a(parcel);
                }
                else {
                    a = null;
                }
                this.a(a);
                parcel2.writeNoException();
                return true;
            }
            case 4: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
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
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                this.a(parcel.readDouble());
                parcel2.writeNoException();
                return true;
            }
            case 6: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                final double d = this.d();
                parcel2.writeNoException();
                parcel2.writeDouble(d);
                return true;
            }
            case 7: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                this.a(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            }
            case 8: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                final float e = this.e();
                parcel2.writeNoException();
                parcel2.writeFloat(e);
                return true;
            }
            case 9: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                this.a(parcel.readInt());
                parcel2.writeNoException();
                return true;
            }
            case 10: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                final int f = this.f();
                parcel2.writeNoException();
                parcel2.writeInt(f);
                return true;
            }
            case 11: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                this.b(parcel.readInt());
                parcel2.writeNoException();
                return true;
            }
            case 12: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                final int g = this.g();
                parcel2.writeNoException();
                parcel2.writeInt(g);
                return true;
            }
            case 13: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                this.b(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            }
            case 14: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                final float h = this.h();
                parcel2.writeNoException();
                parcel2.writeFloat(h);
                return true;
            }
            case 15: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
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
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
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
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                final boolean a2 = this.a(a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                int n4 = 0;
                if (a2) {
                    n4 = 1;
                }
                parcel2.writeInt(n4);
                return true;
            }
            case 18: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                final int j = this.j();
                parcel2.writeNoException();
                parcel2.writeInt(j);
                return true;
            }
        }
    }
}
