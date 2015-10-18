// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Binder;

public abstract class zzo$zza extends Binder implements zzo
{
    public zzo$zza() {
        this.attachInterface((IInterface)this, "com.google.android.gms.common.internal.IGmsCallbacks");
    }
    
    public IBinder asBinder() {
        return (IBinder)this;
    }
    
    public boolean onTransact(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        final boolean a = zzi.a;
        switch (n) {
            default: {
                return super.onTransact(n, parcel, parcel2, n2);
            }
            case 1598968902: {
                parcel2.writeString("com.google.android.gms.common.internal.IGmsCallbacks");
                return true;
            }
            case 1: {
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsCallbacks");
                final int int1 = parcel.readInt();
                final IBinder strongBinder = parcel.readStrongBinder();
                Bundle bundle = null;
                Label_0105: {
                    if (parcel.readInt() != 0) {
                        bundle = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                        if (!a) {
                            break Label_0105;
                        }
                    }
                    bundle = null;
                }
                this.zza(int1, strongBinder, bundle);
                parcel2.writeNoException();
                return true;
            }
            case 2: {
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsCallbacks");
                final int int2 = parcel.readInt();
                Bundle bundle2 = null;
                Label_0162: {
                    if (parcel.readInt() != 0) {
                        bundle2 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                        if (!a) {
                            break Label_0162;
                        }
                    }
                    bundle2 = null;
                }
                this.zzb(int2, bundle2);
                parcel2.writeNoException();
                return true;
            }
        }
    }
}
