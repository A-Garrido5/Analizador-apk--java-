// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.model.internal;

import java.util.List;
import android.os.Parcel;
import android.os.IInterface;
import android.os.IBinder;
import android.os.Binder;

public abstract class u extends Binder implements t
{
    public static t a(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
        if (queryLocalInterface != null && queryLocalInterface instanceof t) {
            return (t)queryLocalInterface;
        }
        return new v(binder);
    }
    
    public boolean onTransact(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        switch (n) {
            default: {
                return super.onTransact(n, parcel, parcel2, n2);
            }
            case 1598968902: {
                parcel2.writeString("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
                return true;
            }
            case 1: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
                final int a = this.a();
                parcel2.writeNoException();
                parcel2.writeInt(a);
                return true;
            }
            case 2: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
                final int b = this.b();
                parcel2.writeNoException();
                parcel2.writeInt(b);
                return true;
            }
            case 3: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
                final List c = this.c();
                parcel2.writeNoException();
                parcel2.writeBinderList(c);
                return true;
            }
            case 4: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
                final boolean d = this.d();
                parcel2.writeNoException();
                int n3 = 0;
                if (d) {
                    n3 = 1;
                }
                parcel2.writeInt(n3);
                return true;
            }
            case 5: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
                final boolean a2 = this.a(a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                int n4 = 0;
                if (a2) {
                    n4 = 1;
                }
                parcel2.writeInt(n4);
                return true;
            }
            case 6: {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
                final int e = this.e();
                parcel2.writeNoException();
                parcel2.writeInt(e);
                return true;
            }
        }
    }
}
