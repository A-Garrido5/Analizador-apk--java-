// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.youtube.player.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.IInterface;
import android.os.IBinder;
import android.os.Binder;

public abstract class ad extends Binder implements ac
{
    public static ac a(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.youtube.player.internal.IServiceBroker");
        if (queryLocalInterface != null && queryLocalInterface instanceof ac) {
            return (ac)queryLocalInterface;
        }
        return new ae(binder);
    }
    
    public boolean onTransact(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        switch (n) {
            default: {
                return super.onTransact(n, parcel, parcel2, n2);
            }
            case 1598968902: {
                parcel2.writeString("com.google.android.youtube.player.internal.IServiceBroker");
                return true;
            }
            case 1: {
                parcel.enforceInterface("com.google.android.youtube.player.internal.IServiceBroker");
                final IBinder strongBinder = parcel.readStrongBinder();
                f f;
                if (strongBinder == null) {
                    f = null;
                }
                else {
                    final IInterface queryLocalInterface = strongBinder.queryLocalInterface("com.google.android.youtube.player.internal.IConnectionCallbacks");
                    if (queryLocalInterface != null && queryLocalInterface instanceof f) {
                        f = (f)queryLocalInterface;
                    }
                    else {
                        f = new h(strongBinder);
                    }
                }
                final int int1 = parcel.readInt();
                final String string = parcel.readString();
                final String string2 = parcel.readString();
                final String string3 = parcel.readString();
                final int int2 = parcel.readInt();
                Bundle bundle = null;
                if (int2 != 0) {
                    bundle = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                this.a(f, int1, string, string2, string3, bundle);
                parcel2.writeNoException();
                return true;
            }
        }
    }
}
