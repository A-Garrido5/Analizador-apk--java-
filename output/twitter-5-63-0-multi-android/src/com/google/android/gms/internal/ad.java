// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Binder;

public abstract class ad extends Binder implements ac
{
    public ad() {
        this.attachInterface((IInterface)this, "com.google.android.gms.common.internal.IGmsCallbacks");
    }
    
    public static ac a(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.common.internal.IGmsCallbacks");
        if (queryLocalInterface != null && queryLocalInterface instanceof ac) {
            return (ac)queryLocalInterface;
        }
        return new ae(binder);
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
                parcel2.writeString("com.google.android.gms.common.internal.IGmsCallbacks");
                return true;
            }
            case 1: {
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsCallbacks");
                final int int1 = parcel.readInt();
                final IBinder strongBinder = parcel.readStrongBinder();
                Bundle bundle;
                if (parcel.readInt() != 0) {
                    bundle = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                else {
                    bundle = null;
                }
                this.a(int1, strongBinder, bundle);
                parcel2.writeNoException();
                return true;
            }
        }
    }
}
