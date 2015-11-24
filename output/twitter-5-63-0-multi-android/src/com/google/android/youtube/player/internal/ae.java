// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.youtube.player.internal;

import android.os.Parcel;
import android.os.Bundle;
import android.os.IBinder;

final class ae implements ac
{
    private IBinder a;
    
    ae(final IBinder a) {
        this.a = a;
    }
    
    @Override
    public final void a(final f f, final int n, final String s, final String s2, final String s3, final Bundle bundle) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IServiceBroker");
            IBinder binder;
            if (f != null) {
                binder = f.asBinder();
            }
            else {
                binder = null;
            }
            obtain.writeStrongBinder(binder);
            obtain.writeInt(n);
            obtain.writeString(s);
            obtain.writeString(s2);
            obtain.writeString(s3);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            }
            else {
                obtain.writeInt(0);
            }
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
