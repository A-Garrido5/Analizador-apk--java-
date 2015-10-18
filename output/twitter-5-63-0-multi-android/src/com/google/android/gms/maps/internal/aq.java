// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.internal;

import com.google.android.gms.dynamic.k;
import com.google.android.gms.maps.model.internal.x;
import android.os.Parcel;
import android.os.IInterface;
import android.os.IBinder;
import android.os.Binder;

public abstract class aq extends Binder implements ap
{
    public static ap a(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.maps.internal.IInfoWindowAdapter");
        if (queryLocalInterface != null && queryLocalInterface instanceof ap) {
            return (ap)queryLocalInterface;
        }
        return new ar(binder);
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
                parcel2.writeString("com.google.android.gms.maps.internal.IInfoWindowAdapter");
                return true;
            }
            case 1: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IInfoWindowAdapter");
                final k a = this.a(x.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                IBinder binder = null;
                if (a != null) {
                    binder = a.asBinder();
                }
                parcel2.writeStrongBinder(binder);
                return true;
            }
            case 2: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IInfoWindowAdapter");
                final k b = this.b(x.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                IBinder binder2 = null;
                if (b != null) {
                    binder2 = b.asBinder();
                }
                parcel2.writeStrongBinder(binder2);
                return true;
            }
        }
    }
}
