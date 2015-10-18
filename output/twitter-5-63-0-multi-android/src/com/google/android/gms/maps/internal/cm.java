// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.internal;

import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
import android.os.Parcel;
import android.os.IInterface;
import android.os.IBinder;
import android.os.Binder;

public abstract class cm extends Binder implements cl
{
    public static cl a(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.maps.internal.IOnStreetViewPanoramaClickListener");
        if (queryLocalInterface != null && queryLocalInterface instanceof cl) {
            return (cl)queryLocalInterface;
        }
        return new cn(binder);
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
                parcel2.writeString("com.google.android.gms.maps.internal.IOnStreetViewPanoramaClickListener");
                return true;
            }
            case 1: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IOnStreetViewPanoramaClickListener");
                StreetViewPanoramaOrientation a;
                if (parcel.readInt() != 0) {
                    a = StreetViewPanoramaOrientation.CREATOR.a(parcel);
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
