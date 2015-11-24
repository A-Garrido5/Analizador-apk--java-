// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import com.google.android.gms.common.data.DataHolder;
import android.os.Parcel;
import android.os.IInterface;
import android.os.IBinder;
import android.os.Binder;

public abstract class cq extends Binder implements cp
{
    public static cp a(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.location.places.internal.IPlacesCallbacks");
        if (queryLocalInterface != null && queryLocalInterface instanceof cp) {
            return (cp)queryLocalInterface;
        }
        return new cr(binder);
    }
    
    public boolean onTransact(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        switch (n) {
            default: {
                return super.onTransact(n, parcel, parcel2, n2);
            }
            case 1598968902: {
                parcel2.writeString("com.google.android.gms.location.places.internal.IPlacesCallbacks");
                return true;
            }
            case 1: {
                parcel.enforceInterface("com.google.android.gms.location.places.internal.IPlacesCallbacks");
                final int int1 = parcel.readInt();
                DataHolder a = null;
                if (int1 != 0) {
                    a = DataHolder.CREATOR.a(parcel);
                }
                this.a(a);
                return true;
            }
            case 2: {
                parcel.enforceInterface("com.google.android.gms.location.places.internal.IPlacesCallbacks");
                final int int2 = parcel.readInt();
                DataHolder a2 = null;
                if (int2 != 0) {
                    a2 = DataHolder.CREATOR.a(parcel);
                }
                this.b(a2);
                return true;
            }
            case 3: {
                parcel.enforceInterface("com.google.android.gms.location.places.internal.IPlacesCallbacks");
                final int int3 = parcel.readInt();
                DataHolder a3 = null;
                if (int3 != 0) {
                    a3 = DataHolder.CREATOR.a(parcel);
                }
                this.c(a3);
                return true;
            }
        }
    }
}
