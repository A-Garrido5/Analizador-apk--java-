// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.internal;

import com.google.android.gms.maps.model.CameraPosition;
import android.os.Parcel;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Binder;

public abstract class zzf$zza extends Binder implements zzf
{
    public zzf$zza() {
        this.attachInterface((IInterface)this, "com.google.android.gms.maps.internal.IOnCameraChangeListener");
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
                parcel2.writeString("com.google.android.gms.maps.internal.IOnCameraChangeListener");
                return true;
            }
            case 1: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IOnCameraChangeListener");
                CameraPosition zzeL = null;
                Label_0077: {
                    if (parcel.readInt() != 0) {
                        zzeL = CameraPosition.CREATOR.zzeL(parcel);
                        if (zzm$zza.a == 0) {
                            break Label_0077;
                        }
                    }
                    zzeL = null;
                }
                this.onCameraChange(zzeL);
                parcel2.writeNoException();
                return true;
            }
        }
    }
}
