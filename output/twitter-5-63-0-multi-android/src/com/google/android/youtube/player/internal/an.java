// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.youtube.player.internal;

import android.os.Parcel;
import android.os.IBinder;

final class an implements al
{
    private IBinder a;
    
    an(final IBinder a) {
        this.a = a;
    }
    
    @Override
    public final IBinder a() {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IYouTubeService");
            this.a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readStrongBinder();
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public final ai a(final af af) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IYouTubeService");
            IBinder binder;
            if (af != null) {
                binder = af.asBinder();
            }
            else {
                binder = null;
            }
            obtain.writeStrongBinder(binder);
            this.a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            return aj.a(obtain2.readStrongBinder());
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public final void a(final boolean b) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IYouTubeService");
            int n = 0;
            if (b) {
                n = 1;
            }
            obtain.writeInt(n);
            this.a.transact(3, obtain, obtain2, 0);
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
