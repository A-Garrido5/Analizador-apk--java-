// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Binder;

public abstract class bl extends Binder implements bk
{
    public bl() {
        this.attachInterface((IInterface)this, "com.google.android.gms.maps.internal.IOnMapLoadedCallback");
    }
    
    public static bk a(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMapLoadedCallback");
        if (queryLocalInterface != null && queryLocalInterface instanceof bk) {
            return (bk)queryLocalInterface;
        }
        return new bm(binder);
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
                parcel2.writeString("com.google.android.gms.maps.internal.IOnMapLoadedCallback");
                return true;
            }
            case 1: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IOnMapLoadedCallback");
                this.a();
                parcel2.writeNoException();
                return true;
            }
        }
    }
}
