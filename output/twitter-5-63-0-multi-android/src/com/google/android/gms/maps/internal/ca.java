// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.IInterface;
import android.os.IBinder;
import android.os.Binder;

public abstract class ca extends Binder implements bz
{
    public static bz a(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener");
        if (queryLocalInterface != null && queryLocalInterface instanceof bz) {
            return (bz)queryLocalInterface;
        }
        return new cb(binder);
    }
    
    public IBinder asBinder() {
        return (IBinder)this;
    }
    
    public boolean onTransact(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        switch (n) {
            default: {
                return super.onTransact(n, parcel, parcel2, n2);
            }
            case 1598968902: {
                parcel2.writeString("com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener");
                return true;
            }
            case 1: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener");
                final boolean a = this.a();
                parcel2.writeNoException();
                int n3;
                if (a) {
                    n3 = 1;
                }
                else {
                    n3 = 0;
                }
                parcel2.writeInt(n3);
                return true;
            }
        }
    }
}
