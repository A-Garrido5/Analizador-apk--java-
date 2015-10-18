// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.internal;

import android.graphics.Bitmap;
import com.google.android.gms.maps.model.internal.x;
import android.os.Parcel;
import android.os.IInterface;
import android.os.IBinder;
import android.os.Binder;

public abstract class at extends Binder implements as
{
    public static as a(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.maps.internal.IInfoWindowRenderer");
        if (queryLocalInterface != null && queryLocalInterface instanceof as) {
            return (as)queryLocalInterface;
        }
        return new au(binder);
    }
    
    public boolean onTransact(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        switch (n) {
            default: {
                return super.onTransact(n, parcel, parcel2, n2);
            }
            case 1598968902: {
                parcel2.writeString("com.google.android.gms.maps.internal.IInfoWindowRenderer");
                return true;
            }
            case 1: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IInfoWindowRenderer");
                final Bitmap a = this.a(x.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                if (a != null) {
                    parcel2.writeInt(1);
                    a.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            }
        }
    }
}
