// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.model.internal;

import android.os.Parcel;
import android.os.IInterface;
import android.os.IBinder;
import android.os.Binder;

public abstract class ad extends Binder implements ac
{
    public static ac a(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
        if (queryLocalInterface != null && queryLocalInterface instanceof ac) {
            return (ac)queryLocalInterface;
        }
        return new ae(binder);
    }
    
    public boolean onTransact(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        switch (n) {
            default: {
                return super.onTransact(n, parcel, parcel2, n2);
            }
            case 1598968902: {
                parcel2.writeString("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                return true;
            }
            case 1: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                this.a();
                parcel2.writeNoException();
                return true;
            }
            case 2: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                this.b();
                parcel2.writeNoException();
                return true;
            }
            case 3: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                final String c = this.c();
                parcel2.writeNoException();
                parcel2.writeString(c);
                return true;
            }
            case 4: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                this.a(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            }
            case 5: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                final float d = this.d();
                parcel2.writeNoException();
                parcel2.writeFloat(d);
                return true;
            }
            case 6: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                final int int1 = parcel.readInt();
                boolean b = false;
                if (int1 != 0) {
                    b = true;
                }
                this.a(b);
                parcel2.writeNoException();
                return true;
            }
            case 7: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                final boolean e = this.e();
                parcel2.writeNoException();
                int n3 = 0;
                if (e) {
                    n3 = 1;
                }
                parcel2.writeInt(n3);
                return true;
            }
            case 8: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                final boolean a = this.a(a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                int n4 = 0;
                if (a) {
                    n4 = 1;
                }
                parcel2.writeInt(n4);
                return true;
            }
            case 9: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                final int f = this.f();
                parcel2.writeNoException();
                parcel2.writeInt(f);
                return true;
            }
            case 10: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                final int int2 = parcel.readInt();
                boolean b2 = false;
                if (int2 != 0) {
                    b2 = true;
                }
                this.b(b2);
                parcel2.writeNoException();
                return true;
            }
            case 11: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                final boolean g = this.g();
                parcel2.writeNoException();
                int n5 = 0;
                if (g) {
                    n5 = 1;
                }
                parcel2.writeInt(n5);
                return true;
            }
        }
    }
}
