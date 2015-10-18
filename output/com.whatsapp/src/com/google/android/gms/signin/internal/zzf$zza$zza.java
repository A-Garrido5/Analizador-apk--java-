// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.signin.internal;

import com.google.android.gms.common.internal.zzq;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.common.internal.IAccountAccessor;
import android.os.Parcel;
import com.google.android.gms.common.internal.AuthAccountRequest;
import android.os.IBinder;

class zzf$zza$zza implements zzf
{
    private IBinder zznF;
    
    zzf$zza$zza(final IBinder zznF) {
        this.zznF = zznF;
    }
    
    public IBinder asBinder() {
        return this.zznF;
    }
    
    @Override
    public void zza(final AuthAccountRequest authAccountRequest, final zze zze) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
            Label_0041: {
                if (authAccountRequest != null) {
                    obtain.writeInt(1);
                    authAccountRequest.writeToParcel(obtain, 0);
                    if (zze$zza.a == 0) {
                        break Label_0041;
                    }
                }
                obtain.writeInt(0);
            }
            IBinder binder;
            if (zze != null) {
                binder = zze.asBinder();
            }
            else {
                binder = null;
            }
            obtain.writeStrongBinder(binder);
            this.zznF.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public void zza(final IAccountAccessor accountAccessor, final int n, final boolean b) {
        final int a = zze$zza.a;
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
            IBinder binder;
            if (accountAccessor != null) {
                binder = accountAccessor.asBinder();
            }
            else {
                binder = null;
            }
            obtain.writeStrongBinder(binder);
            obtain.writeInt(n);
            int n2 = 0;
            if (b) {
                n2 = 1;
            }
            obtain.writeInt(n2);
            this.zznF.transact(9, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
            if (a != 0) {
                ++zzu.a;
            }
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public void zza(final ResolveAccountRequest resolveAccountRequest, final zzq zzq) {
        final int a = zze$zza.a;
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
            Label_0048: {
                if (resolveAccountRequest != null) {
                    obtain.writeInt(1);
                    resolveAccountRequest.writeToParcel(obtain, 0);
                    if (a == 0) {
                        break Label_0048;
                    }
                }
                obtain.writeInt(0);
            }
            IBinder binder;
            if (zzq != null) {
                binder = zzq.asBinder();
            }
            else {
                binder = null;
            }
            obtain.writeStrongBinder(binder);
            this.zznF.transact(5, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
            if (zzu.a != 0) {
                zze$zza.a = a + 1;
            }
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public void zza(final CheckServerAuthResult checkServerAuthResult) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
            Label_0040: {
                if (checkServerAuthResult != null) {
                    obtain.writeInt(1);
                    checkServerAuthResult.writeToParcel(obtain, 0);
                    if (zze$zza.a == 0) {
                        break Label_0040;
                    }
                }
                obtain.writeInt(0);
            }
            this.zznF.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public void zzal(final boolean b) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
            int n = 0;
            if (b) {
                n = 1;
            }
            obtain.writeInt(n);
            this.zznF.transact(4, obtain, obtain2, 0);
            obtain2.readException();
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public void zziQ(final int n) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
            obtain.writeInt(n);
            this.zznF.transact(7, obtain, obtain2, 0);
            obtain2.readException();
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
