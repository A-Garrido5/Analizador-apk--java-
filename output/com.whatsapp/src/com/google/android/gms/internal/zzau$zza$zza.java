// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzu;
import android.os.Parcel;
import android.os.Bundle;
import android.accounts.Account;
import android.os.IBinder;

class zzau$zza$zza implements zzau
{
    private IBinder zznF;
    
    zzau$zza$zza(final IBinder zznF) {
        this.zznF = zznF;
    }
    
    public IBinder asBinder() {
        return this.zznF;
    }
    
    @Override
    public Bundle zza(final Account account, final String s, final Bundle bundle) {
        final boolean a = zzkf.a;
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.auth.IAuthManagerService");
            Label_0058: {
                if (account != null) {
                    obtain.writeInt(1);
                    account.writeToParcel(obtain, 0);
                    if (!a) {
                        break Label_0058;
                    }
                    ++zzu.a;
                }
                obtain.writeInt(0);
            }
            obtain.writeString(s);
            Label_0092: {
                if (bundle != null) {
                    obtain.writeInt(1);
                    bundle.writeToParcel(obtain, 0);
                    if (!a) {
                        break Label_0092;
                    }
                }
                obtain.writeInt(0);
            }
            this.zznF.transact(5, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                final Bundle bundle2 = (Bundle)Bundle.CREATOR.createFromParcel(obtain2);
                if (!a) {
                    return bundle2;
                }
            }
            return null;
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public Bundle zza(final String s, final Bundle bundle) {
        while (true) {
            final boolean a = zzkf.a;
            final Parcel obtain = Parcel.obtain();
            final Parcel obtain2 = Parcel.obtain();
            while (true) {
                Label_0151: {
                    try {
                        obtain.writeInterfaceToken("com.google.android.auth.IAuthManagerService");
                        obtain.writeString(s);
                        Label_0054: {
                            if (bundle != null) {
                                obtain.writeInt(1);
                                bundle.writeToParcel(obtain, 0);
                                if (!a) {
                                    break Label_0054;
                                }
                            }
                            obtain.writeInt(0);
                        }
                        this.zznF.transact(2, obtain, obtain2, 0);
                        obtain2.readException();
                        Bundle bundle2 = null;
                        Label_0105: {
                            if (obtain2.readInt() != 0) {
                                bundle2 = (Bundle)Bundle.CREATOR.createFromParcel(obtain2);
                                if (!a) {
                                    break Label_0105;
                                }
                            }
                            bundle2 = null;
                        }
                        obtain2.recycle();
                        obtain.recycle();
                        if (zzu.a != 0) {
                            final boolean a2 = false;
                            if (!a) {
                                break Label_0151;
                            }
                            zzkf.a = a2;
                        }
                        return bundle2;
                    }
                    finally {
                        obtain2.recycle();
                        obtain.recycle();
                    }
                }
                final boolean a2 = true;
                continue;
            }
        }
    }
}
