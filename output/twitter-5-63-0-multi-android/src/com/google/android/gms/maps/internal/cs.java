// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.internal;

import com.google.android.gms.dynamic.l;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Binder;

public abstract class cs extends Binder implements cr
{
    public cs() {
        this.attachInterface((IInterface)this, "com.google.android.gms.maps.internal.ISnapshotReadyCallback");
    }
    
    public static cr a(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
        if (queryLocalInterface != null && queryLocalInterface instanceof cr) {
            return (cr)queryLocalInterface;
        }
        return new ct(binder);
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
                parcel2.writeString("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
                return true;
            }
            case 1: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
                Bitmap bitmap;
                if (parcel.readInt() != 0) {
                    bitmap = (Bitmap)Bitmap.CREATOR.createFromParcel(parcel);
                }
                else {
                    bitmap = null;
                }
                this.a(bitmap);
                parcel2.writeNoException();
                return true;
            }
            case 2: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
                this.a(l.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
        }
    }
}
