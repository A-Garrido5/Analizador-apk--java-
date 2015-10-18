// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.youtube.player.internal;

import android.os.Parcel;
import android.os.IBinder;

final class h implements f
{
    private IBinder a;
    
    h(final IBinder a) {
        this.a = a;
    }
    
    @Override
    public final void a(final String s, final IBinder binder) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IConnectionCallbacks");
            obtain.writeString(s);
            obtain.writeStrongBinder(binder);
            this.a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    public final IBinder asBinder() {
        return this.a;
    }
}
