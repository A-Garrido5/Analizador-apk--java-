// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.graphics.Bitmap;
import com.google.android.gms.maps.model.internal.w;
import android.os.IBinder;

class au implements as
{
    private IBinder a;
    
    au(final IBinder a) {
        this.a = a;
    }
    
    @Override
    public Bitmap a(final w w, final int n, final int n2) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IInfoWindowRenderer");
            IBinder binder;
            if (w != null) {
                binder = w.asBinder();
            }
            else {
                binder = null;
            }
            obtain.writeStrongBinder(binder);
            obtain.writeInt(n);
            obtain.writeInt(n2);
            this.a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            final int int1 = obtain2.readInt();
            Bitmap bitmap = null;
            if (int1 != 0) {
                bitmap = (Bitmap)Bitmap.CREATOR.createFromParcel(obtain2);
            }
            return bitmap;
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    public IBinder asBinder() {
        return this.a;
    }
}
