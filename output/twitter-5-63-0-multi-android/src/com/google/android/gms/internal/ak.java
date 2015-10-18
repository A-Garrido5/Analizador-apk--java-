// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import com.google.android.gms.dynamic.l;
import android.os.Parcel;
import com.google.android.gms.dynamic.k;
import android.os.IBinder;

class ak implements ai
{
    private IBinder a;
    
    ak(final IBinder a) {
        this.a = a;
    }
    
    @Override
    public k a(final k k, final int n, final int n2) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.ISignInButtonCreator");
            IBinder binder;
            if (k != null) {
                binder = k.asBinder();
            }
            else {
                binder = null;
            }
            obtain.writeStrongBinder(binder);
            obtain.writeInt(n);
            obtain.writeInt(n2);
            this.a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return l.a(obtain2.readStrongBinder());
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
