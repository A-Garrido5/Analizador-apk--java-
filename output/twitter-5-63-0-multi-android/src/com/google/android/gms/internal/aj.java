// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import com.google.android.gms.dynamic.k;
import com.google.android.gms.dynamic.l;
import android.os.Parcel;
import android.os.IInterface;
import android.os.IBinder;
import android.os.Binder;

public abstract class aj extends Binder implements ai
{
    public static ai a(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        if (queryLocalInterface != null && queryLocalInterface instanceof ai) {
            return (ai)queryLocalInterface;
        }
        return new ak(binder);
    }
    
    public boolean onTransact(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        switch (n) {
            default: {
                return super.onTransact(n, parcel, parcel2, n2);
            }
            case 1598968902: {
                parcel2.writeString("com.google.android.gms.common.internal.ISignInButtonCreator");
                return true;
            }
            case 1: {
                parcel.enforceInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
                final k a = this.a(l.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                IBinder binder;
                if (a != null) {
                    binder = a.asBinder();
                }
                else {
                    binder = null;
                }
                parcel2.writeStrongBinder(binder);
                return true;
            }
        }
    }
}
