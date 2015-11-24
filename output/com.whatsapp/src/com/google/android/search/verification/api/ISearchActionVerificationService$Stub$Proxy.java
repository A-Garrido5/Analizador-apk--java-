// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.search.verification.api;

import android.os.Bundle;
import android.content.Intent;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import android.os.Parcel;
import android.os.IBinder;

class ISearchActionVerificationService$Stub$Proxy implements ISearchActionVerificationService
{
    private IBinder mRemote;
    
    ISearchActionVerificationService$Stub$Proxy(final IBinder mRemote) {
        this.mRemote = mRemote;
    }
    
    public IBinder asBinder() {
        return this.mRemote;
    }
    
    @Override
    public int getVersion() {
        while (true) {
            final boolean a = ISearchActionVerificationService$Stub.a;
            final Parcel obtain = Parcel.obtain();
            final Parcel obtain2 = Parcel.obtain();
            while (true) {
                Label_0084: {
                    try {
                        obtain.writeInterfaceToken("com.google.android.search.verification.api.ISearchActionVerificationService");
                        this.mRemote.transact(2, obtain, obtain2, 0);
                        obtain2.readException();
                        final int int1 = obtain2.readInt();
                        obtain2.recycle();
                        obtain.recycle();
                        if (SearchActionVerificationClientService.a) {
                            final boolean a2 = false;
                            if (!a) {
                                break Label_0084;
                            }
                            ISearchActionVerificationService$Stub.a = a2;
                        }
                        return int1;
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
    
    @Override
    public boolean isSearchAction(final Intent intent, final Bundle bundle) {
        boolean b = true;
        final boolean a = ISearchActionVerificationService$Stub.a;
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.search.verification.api.ISearchActionVerificationService");
            Label_0066: {
                if (intent != null) {
                    obtain.writeInt(1);
                    intent.writeToParcel(obtain, 0);
                    if (!a) {
                        break Label_0066;
                    }
                    SearchActionVerificationClientService.a = (!SearchActionVerificationClientService.a && b);
                }
                obtain.writeInt(0);
            }
            Label_0094: {
                if (bundle != null) {
                    obtain.writeInt(1);
                    bundle.writeToParcel(obtain, 0);
                    if (!a) {
                        break Label_0094;
                    }
                }
                obtain.writeInt(0);
            }
            this.mRemote.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() == 0) {
                b = false;
            }
            return b;
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
