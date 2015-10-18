// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.location;

import android.os.Parcel;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Binder;

public abstract class zzc$zza extends Binder implements zzc
{
    public zzc$zza() {
        this.attachInterface((IInterface)this, "com.google.android.gms.location.ILocationCallback");
    }
    
    public static zzc zzbS(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        if (queryLocalInterface != null && queryLocalInterface instanceof zzc) {
            return (zzc)queryLocalInterface;
        }
        return new zzc$zza$zza(binder);
    }
    
    public IBinder asBinder() {
        return (IBinder)this;
    }
    
    public boolean onTransact(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        final int a = LocationServices$zza.a;
        switch (n) {
            default: {
                return super.onTransact(n, parcel, parcel2, n2);
            }
            case 1598968902: {
                parcel2.writeString("com.google.android.gms.location.ILocationCallback");
                return true;
            }
            case 1: {
                parcel.enforceInterface("com.google.android.gms.location.ILocationCallback");
                LocationResult locationResult = null;
                Label_0093: {
                    if (parcel.readInt() != 0) {
                        locationResult = (LocationResult)LocationResult.CREATOR.createFromParcel(parcel);
                        if (a == 0) {
                            break Label_0093;
                        }
                    }
                    locationResult = null;
                }
                this.onLocationResult(locationResult);
                return true;
            }
            case 2: {
                parcel.enforceInterface("com.google.android.gms.location.ILocationCallback");
                final int int1 = parcel.readInt();
                LocationAvailability locationAvailability = null;
                if (int1 != 0) {
                    final LocationAvailability fromParcel = LocationAvailability.CREATOR.createFromParcel(parcel);
                    locationAvailability = null;
                    if (a == 0) {
                        locationAvailability = fromParcel;
                    }
                }
                this.onLocationAvailability(locationAvailability);
                return true;
            }
        }
    }
}
