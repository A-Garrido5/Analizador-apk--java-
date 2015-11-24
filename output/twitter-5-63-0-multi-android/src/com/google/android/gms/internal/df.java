// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import com.google.android.gms.auth.AccountChangeEventsResponse;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import android.os.Bundle;
import android.os.Parcel;
import android.os.IInterface;
import android.os.IBinder;
import android.os.Binder;

public abstract class df extends Binder implements de
{
    public static de a(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
        if (queryLocalInterface != null && queryLocalInterface instanceof de) {
            return (de)queryLocalInterface;
        }
        return new dg(binder);
    }
    
    public boolean onTransact(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        switch (n) {
            default: {
                return super.onTransact(n, parcel, parcel2, n2);
            }
            case 1598968902: {
                parcel2.writeString("com.google.android.auth.IAuthManagerService");
                return true;
            }
            case 1: {
                parcel.enforceInterface("com.google.android.auth.IAuthManagerService");
                final String string = parcel.readString();
                final String string2 = parcel.readString();
                final int int1 = parcel.readInt();
                Bundle bundle = null;
                if (int1 != 0) {
                    bundle = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                final Bundle a = this.a(string, string2, bundle);
                parcel2.writeNoException();
                if (a != null) {
                    parcel2.writeInt(1);
                    a.writeToParcel(parcel2, 1);
                }
                else {
                    parcel2.writeInt(0);
                }
                return true;
            }
            case 2: {
                parcel.enforceInterface("com.google.android.auth.IAuthManagerService");
                final String string3 = parcel.readString();
                final int int2 = parcel.readInt();
                Bundle bundle2 = null;
                if (int2 != 0) {
                    bundle2 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                final Bundle a2 = this.a(string3, bundle2);
                parcel2.writeNoException();
                if (a2 != null) {
                    parcel2.writeInt(1);
                    a2.writeToParcel(parcel2, 1);
                }
                else {
                    parcel2.writeInt(0);
                }
                return true;
            }
            case 3: {
                parcel.enforceInterface("com.google.android.auth.IAuthManagerService");
                final int int3 = parcel.readInt();
                AccountChangeEventsRequest a3 = null;
                if (int3 != 0) {
                    a3 = AccountChangeEventsRequest.CREATOR.a(parcel);
                }
                final AccountChangeEventsResponse a4 = this.a(a3);
                parcel2.writeNoException();
                if (a4 != null) {
                    parcel2.writeInt(1);
                    a4.writeToParcel(parcel2, 1);
                }
                else {
                    parcel2.writeInt(0);
                }
                return true;
            }
        }
    }
}
