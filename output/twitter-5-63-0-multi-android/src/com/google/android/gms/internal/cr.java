// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import android.os.IBinder;

class cr implements cp
{
    private IBinder a;
    
    cr(final IBinder a) {
        this.a = a;
    }
    
    @Override
    public void a(final DataHolder dataHolder) {
        final Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IPlacesCallbacks");
            if (dataHolder != null) {
                obtain.writeInt(1);
                dataHolder.writeToParcel(obtain, 0);
            }
            else {
                obtain.writeInt(0);
            }
            this.a.transact(1, obtain, (Parcel)null, 1);
        }
        finally {
            obtain.recycle();
        }
    }
    
    public IBinder asBinder() {
        return this.a;
    }
    
    @Override
    public void b(final DataHolder dataHolder) {
        final Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IPlacesCallbacks");
            if (dataHolder != null) {
                obtain.writeInt(1);
                dataHolder.writeToParcel(obtain, 0);
            }
            else {
                obtain.writeInt(0);
            }
            this.a.transact(2, obtain, (Parcel)null, 1);
        }
        finally {
            obtain.recycle();
        }
    }
    
    @Override
    public void c(final DataHolder dataHolder) {
        final Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IPlacesCallbacks");
            if (dataHolder != null) {
                obtain.writeInt(1);
                dataHolder.writeToParcel(obtain, 0);
            }
            else {
                obtain.writeInt(0);
            }
            this.a.transact(3, obtain, (Parcel)null, 1);
        }
        finally {
            obtain.recycle();
        }
    }
}
