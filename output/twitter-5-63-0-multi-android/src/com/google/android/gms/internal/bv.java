// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.IInterface;
import android.os.IBinder;
import android.os.Binder;

public abstract class bv extends Binder implements bu
{
    public static bu a(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.location.internal.IGeofencerCallbacks");
        if (queryLocalInterface != null && queryLocalInterface instanceof bu) {
            return (bu)queryLocalInterface;
        }
        return new bw(binder);
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
                parcel2.writeString("com.google.android.gms.location.internal.IGeofencerCallbacks");
                return true;
            }
            case 1: {
                parcel.enforceInterface("com.google.android.gms.location.internal.IGeofencerCallbacks");
                this.a(parcel.readInt(), parcel.createStringArray());
                parcel2.writeNoException();
                return true;
            }
            case 2: {
                parcel.enforceInterface("com.google.android.gms.location.internal.IGeofencerCallbacks");
                this.b(parcel.readInt(), parcel.createStringArray());
                parcel2.writeNoException();
                return true;
            }
            case 3: {
                parcel.enforceInterface("com.google.android.gms.location.internal.IGeofencerCallbacks");
                final int int1 = parcel.readInt();
                PendingIntent pendingIntent;
                if (parcel.readInt() != 0) {
                    pendingIntent = (PendingIntent)PendingIntent.CREATOR.createFromParcel(parcel);
                }
                else {
                    pendingIntent = null;
                }
                this.a(int1, pendingIntent);
                parcel2.writeNoException();
                return true;
            }
        }
    }
}
