// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.internal;

import com.google.android.gms.maps.model.internal.zzi$zza;
import android.os.Parcel;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Binder;

public abstract class zzh$zza extends Binder implements zzh
{
    public zzh$zza() {
        this.attachInterface((IInterface)this, "com.google.android.gms.maps.internal.IOnInfoWindowClickListener");
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
                parcel2.writeString("com.google.android.gms.maps.internal.IOnInfoWindowClickListener");
                return true;
            }
            case 1: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IOnInfoWindowClickListener");
                this.zze(zzi$zza.zzcP(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
        }
    }
}
