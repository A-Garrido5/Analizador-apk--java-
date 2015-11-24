// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.internal;

import com.google.android.gms.maps.model.internal.x;
import android.os.Parcel;
import android.os.IInterface;
import android.os.IBinder;
import android.os.Binder;

public abstract class bu extends Binder implements bt
{
    public static bt a(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMarkerClickListener");
        if (queryLocalInterface != null && queryLocalInterface instanceof bt) {
            return (bt)queryLocalInterface;
        }
        return new bv(binder);
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
                parcel2.writeString("com.google.android.gms.maps.internal.IOnMarkerClickListener");
                return true;
            }
            case 1: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IOnMarkerClickListener");
                final boolean a = this.a(x.a(parcel.readStrongBinder()));
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
