// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.accounts.Account;
import android.os.IBinder;

class IAccountAccessor$zza$zza implements IAccountAccessor
{
    private IBinder zznF;
    
    IAccountAccessor$zza$zza(final IBinder zznF) {
        this.zznF = zznF;
    }
    
    public IBinder asBinder() {
        return this.zznF;
    }
    
    @Override
    public Account getAccount() {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IAccountAccessor");
            this.zznF.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                final Account account = (Account)Account.CREATOR.createFromParcel(obtain2);
                if (!zzi.a) {
                    return account;
                }
            }
            return null;
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
