// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.dynamic;

import android.os.Parcel;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Binder;

public abstract class l extends Binder implements k
{
    public l() {
        this.attachInterface((IInterface)this, "com.google.android.gms.dynamic.IObjectWrapper");
    }
    
    public static k a(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        if (queryLocalInterface != null && queryLocalInterface instanceof k) {
            return (k)queryLocalInterface;
        }
        return new m(binder);
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
                parcel2.writeString("com.google.android.gms.dynamic.IObjectWrapper");
                return true;
            }
        }
    }
}
