// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.internal;

import com.google.android.gms.maps.model.internal.zzi$zza;
import android.os.Parcel;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Binder;

public abstract class zzn$zza extends Binder implements zzn
{
    public zzn$zza() {
        this.attachInterface((IInterface)this, "com.google.android.gms.maps.internal.IOnMarkerClickListener");
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
                parcel2.writeString("com.google.android.gms.maps.internal.IOnMarkerClickListener");
                return true;
            }
            case 1: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IOnMarkerClickListener");
                final boolean zza = this.zza(zzi$zza.zzcP(parcel.readStrongBinder()));
                parcel2.writeNoException();
                int n3;
                if (zza) {
                    n3 = 1;
                }
                else {
                    n3 = 0;
                }
                parcel2.writeInt(n3);
                return true;
            }
        }
    }
}
