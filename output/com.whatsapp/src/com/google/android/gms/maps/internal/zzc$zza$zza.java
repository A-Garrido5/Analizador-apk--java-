// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.internal;

import com.google.android.gms.maps.model.internal.zzd$zza;
import com.google.android.gms.maps.StreetViewPanoramaOptions;
import android.os.Parcel;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.dynamic.zzd;
import android.os.IBinder;

class zzc$zza$zza implements zzc
{
    private IBinder zznF;
    
    zzc$zza$zza(final IBinder zznF) {
        this.zznF = zznF;
    }
    
    public IBinder asBinder() {
        return this.zznF;
    }
    
    @Override
    public IMapViewDelegate zza(final zzd zzd, final GoogleMapOptions googleMapOptions) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
            IBinder binder;
            if (zzd != null) {
                binder = zzd.asBinder();
            }
            else {
                binder = null;
            }
            obtain.writeStrongBinder(binder);
            Label_0059: {
                if (googleMapOptions != null) {
                    obtain.writeInt(1);
                    googleMapOptions.writeToParcel(obtain, 0);
                    if (zzm$zza.a == 0) {
                        break Label_0059;
                    }
                }
                obtain.writeInt(0);
            }
            this.zznF.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            return IMapViewDelegate$zza.zzcm(obtain2.readStrongBinder());
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public IStreetViewPanoramaViewDelegate zza(final zzd zzd, final StreetViewPanoramaOptions streetViewPanoramaOptions) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
            IBinder binder;
            if (zzd != null) {
                binder = zzd.asBinder();
            }
            else {
                binder = null;
            }
            obtain.writeStrongBinder(binder);
            Label_0059: {
                if (streetViewPanoramaOptions != null) {
                    obtain.writeInt(1);
                    streetViewPanoramaOptions.writeToParcel(obtain, 0);
                    if (zzm$zza.a == 0) {
                        break Label_0059;
                    }
                }
                obtain.writeInt(0);
            }
            this.zznF.transact(7, obtain, obtain2, 0);
            obtain2.readException();
            return IStreetViewPanoramaViewDelegate$zza.zzcI(obtain2.readStrongBinder());
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public void zzd(final zzd zzd, final int n) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
            IBinder binder;
            if (zzd != null) {
                binder = zzd.asBinder();
            }
            else {
                binder = null;
            }
            obtain.writeStrongBinder(binder);
            obtain.writeInt(n);
            this.zznF.transact(6, obtain, obtain2, 0);
            obtain2.readException();
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public IMapFragmentDelegate zzr(final zzd zzd) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
            IBinder binder;
            if (zzd != null) {
                binder = zzd.asBinder();
            }
            else {
                binder = null;
            }
            obtain.writeStrongBinder(binder);
            this.zznF.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            return IMapFragmentDelegate$zza.zzcl(obtain2.readStrongBinder());
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public IStreetViewPanoramaFragmentDelegate zzs(final zzd zzd) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
            IBinder binder;
            if (zzd != null) {
                binder = zzd.asBinder();
            }
            else {
                binder = null;
            }
            obtain.writeStrongBinder(binder);
            this.zznF.transact(8, obtain, obtain2, 0);
            obtain2.readException();
            return IStreetViewPanoramaFragmentDelegate$zza.zzcH(obtain2.readStrongBinder());
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public ICameraUpdateFactoryDelegate zzvC() {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
            this.zznF.transact(4, obtain, obtain2, 0);
            obtain2.readException();
            return ICameraUpdateFactoryDelegate$zza.zzce(obtain2.readStrongBinder());
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public com.google.android.gms.maps.model.internal.zzd zzvD() {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
            this.zznF.transact(5, obtain, obtain2, 0);
            obtain2.readException();
            return zzd$zza.zzcK(obtain2.readStrongBinder());
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
