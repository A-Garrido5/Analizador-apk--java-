// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.model.internal;

import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import android.os.Parcel;
import android.os.IBinder;

class zzi$zza$zza implements zzi
{
    private IBinder zznF;
    
    zzi$zza$zza(final IBinder zznF) {
        this.zznF = zznF;
    }
    
    public IBinder asBinder() {
        return this.zznF;
    }
    
    @Override
    public String getId() {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
            this.zznF.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public LatLng getPosition() {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
            this.zznF.transact(4, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                final LatLng zzeP = LatLng.CREATOR.zzeP(obtain2);
                if (zzi$zza.a == 0) {
                    return zzeP;
                }
            }
            return null;
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public int hashCodeRemote() {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
            this.zznF.transact(17, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public void hideInfoWindow() {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
            this.zznF.transact(12, obtain, obtain2, 0);
            obtain2.readException();
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public void setPosition(final LatLng latLng) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
            Label_0040: {
                if (latLng != null) {
                    obtain.writeInt(1);
                    latLng.writeToParcel(obtain, 0);
                    if (zzi$zza.a == 0) {
                        break Label_0040;
                    }
                }
                obtain.writeInt(0);
            }
            this.zznF.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public void setVisible(final boolean b) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
            int n = 0;
            if (b) {
                n = 1;
            }
            obtain.writeInt(n);
            this.zznF.transact(14, obtain, obtain2, 0);
            obtain2.readException();
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public void showInfoWindow() {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
            this.zznF.transact(11, obtain, obtain2, 0);
            obtain2.readException();
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public boolean zzh(final zzi zzi) {
        final int a = zzi$zza.a;
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
            IBinder binder;
            if (zzi != null) {
                binder = zzi.asBinder();
            }
            else {
                binder = null;
            }
            obtain.writeStrongBinder(binder);
            this.zznF.transact(16, obtain, obtain2, 0);
            obtain2.readException();
            final int int1 = obtain2.readInt();
            boolean b = false;
            if (int1 != 0) {
                b = true;
            }
            obtain2.recycle();
            obtain.recycle();
            if (a != 0) {
                ++GoogleMap.a;
            }
            return b;
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public void zzv(final zzd zzd) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
            IBinder binder;
            if (zzd != null) {
                binder = zzd.asBinder();
            }
            else {
                binder = null;
            }
            obtain.writeStrongBinder(binder);
            this.zznF.transact(18, obtain, obtain2, 0);
            obtain2.readException();
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
