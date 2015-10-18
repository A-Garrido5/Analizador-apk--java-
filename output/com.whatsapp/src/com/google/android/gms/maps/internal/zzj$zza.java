// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.internal;

import com.google.android.gms.maps.model.LatLng;
import android.os.Parcel;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Binder;

public abstract class zzj$zza extends Binder implements zzj
{
    public zzj$zza() {
        this.attachInterface((IInterface)this, "com.google.android.gms.maps.internal.IOnMapClickListener");
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
                parcel2.writeString("com.google.android.gms.maps.internal.IOnMapClickListener");
                return true;
            }
            case 1: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IOnMapClickListener");
                LatLng zzeP = null;
                Label_0077: {
                    if (parcel.readInt() != 0) {
                        zzeP = LatLng.CREATOR.zzeP(parcel);
                        if (zzm$zza.a == 0) {
                            break Label_0077;
                        }
                    }
                    zzeP = null;
                }
                this.onMapClick(zzeP);
                parcel2.writeNoException();
                return true;
            }
        }
    }
}
