// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Binder;

public abstract class m extends Binder implements l
{
    public m() {
        this.attachInterface((IInterface)this, "com.google.android.gms.location.ILocationListener");
    }
    
    public static l a(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
        if (queryLocalInterface != null && queryLocalInterface instanceof l) {
            return (l)queryLocalInterface;
        }
        return new n(binder);
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
                parcel2.writeString("com.google.android.gms.location.ILocationListener");
                return true;
            }
            case 1: {
                parcel.enforceInterface("com.google.android.gms.location.ILocationListener");
                Location location;
                if (parcel.readInt() != 0) {
                    location = (Location)Location.CREATOR.createFromParcel(parcel);
                }
                else {
                    location = null;
                }
                this.a(location);
                return true;
            }
        }
    }
}
