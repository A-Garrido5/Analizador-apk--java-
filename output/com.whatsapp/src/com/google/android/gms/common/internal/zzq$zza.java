// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Binder;

public abstract class zzq$zza extends Binder implements zzq
{
    public zzq$zza() {
        this.attachInterface((IInterface)this, "com.google.android.gms.common.internal.IResolveAccountCallbacks");
    }
    
    public IBinder asBinder() {
        return (IBinder)this;
    }
    
    public boolean onTransact(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        switch (n) {
            default: {
                return super.onTransact(n, parcel, parcel2, n2);
            }
            case 1598968902: {
                parcel2.writeString("com.google.android.gms.common.internal.IResolveAccountCallbacks");
                return true;
            }
            case 2: {
                parcel.enforceInterface("com.google.android.gms.common.internal.IResolveAccountCallbacks");
                ResolveAccountResponse resolveAccountResponse = null;
                Label_0082: {
                    if (parcel.readInt() != 0) {
                        resolveAccountResponse = (ResolveAccountResponse)ResolveAccountResponse.CREATOR.createFromParcel(parcel);
                        if (!zzi.a) {
                            break Label_0082;
                        }
                    }
                    resolveAccountResponse = null;
                }
                this.zzb(resolveAccountResponse);
                parcel2.writeNoException();
                return true;
            }
        }
    }
}
