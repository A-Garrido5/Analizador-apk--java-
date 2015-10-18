// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.youtube.player.internal;

import android.os.Parcel;
import android.os.IBinder;
import android.os.Binder;

public abstract class m extends Binder implements l
{
    public IBinder asBinder() {
        return (IBinder)this;
    }
    
    public boolean onTransact(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        switch (n) {
            default: {
                return super.onTransact(n, parcel, parcel2, n2);
            }
            case 1598968902: {
                parcel2.writeString("com.google.android.youtube.player.internal.IOnFullscreenListener");
                return true;
            }
            case 1: {
                parcel.enforceInterface("com.google.android.youtube.player.internal.IOnFullscreenListener");
                this.a(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            }
        }
    }
}
