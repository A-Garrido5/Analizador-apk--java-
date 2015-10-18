// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.internal;

import com.google.android.gms.maps.model.LatLng;
import android.os.Parcel;
import android.os.IInterface;
import android.os.IBinder;
import android.os.Binder;

public abstract class bi extends Binder implements bh
{
    public static bh a(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMapClickListener");
        if (queryLocalInterface != null && queryLocalInterface instanceof bh) {
            return (bh)queryLocalInterface;
        }
        return new bj(binder);
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
                parcel2.writeString("com.google.android.gms.maps.internal.IOnMapClickListener");
                return true;
            }
            case 1: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IOnMapClickListener");
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
        }
    }
}
