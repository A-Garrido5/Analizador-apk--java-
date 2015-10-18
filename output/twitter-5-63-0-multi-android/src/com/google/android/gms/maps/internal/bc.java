// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.internal;

import com.google.android.gms.maps.model.internal.x;
import android.os.Parcel;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Binder;

public abstract class bc extends Binder implements bb
{
    public bc() {
        this.attachInterface((IInterface)this, "com.google.android.gms.maps.internal.IOnInfoWindowClickListener");
    }
    
    public static bb a(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.maps.internal.IOnInfoWindowClickListener");
        if (queryLocalInterface != null && queryLocalInterface instanceof bb) {
            return (bb)queryLocalInterface;
        }
        return new bd(binder);
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
                parcel2.writeString("com.google.android.gms.maps.internal.IOnInfoWindowClickListener");
                return true;
            }
            case 1: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IOnInfoWindowClickListener");
                this.a(x.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
        }
    }
}
