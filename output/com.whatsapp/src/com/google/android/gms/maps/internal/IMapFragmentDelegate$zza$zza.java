// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.internal;

import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.dynamic.zzd$zza;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.dynamic.zzd;
import android.os.Bundle;
import android.os.Parcel;
import android.os.IBinder;

class IMapFragmentDelegate$zza$zza implements IMapFragmentDelegate
{
    private IBinder zznF;
    
    IMapFragmentDelegate$zza$zza(final IBinder zznF) {
        this.zznF = zznF;
    }
    
    public IBinder asBinder() {
        return this.zznF;
    }
    
    @Override
    public void getMapAsync(final zzm zzm) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IMapFragmentDelegate");
            IBinder binder;
            if (zzm != null) {
                binder = zzm.asBinder();
            }
            else {
                binder = null;
            }
            obtain.writeStrongBinder(binder);
            this.zznF.transact(12, obtain, obtain2, 0);
            obtain2.readException();
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IMapFragmentDelegate");
            Label_0040: {
                if (bundle != null) {
                    obtain.writeInt(1);
                    bundle.writeToParcel(obtain, 0);
                    if (zzm$zza.a == 0) {
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
    public zzd onCreateView(final zzd zzd, final zzd zzd2, final Bundle bundle) {
        final int a = zzm$zza.a;
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IMapFragmentDelegate");
            IBinder binder;
            if (zzd != null) {
                binder = zzd.asBinder();
            }
            else {
                binder = null;
            }
            obtain.writeStrongBinder(binder);
            IBinder binder2 = null;
            if (zzd2 != null) {
                binder2 = zzd2.asBinder();
            }
            obtain.writeStrongBinder(binder2);
            Label_0099: {
                if (bundle != null) {
                    obtain.writeInt(1);
                    bundle.writeToParcel(obtain, 0);
                    if (a == 0) {
                        break Label_0099;
                    }
                    ++GoogleMap.a;
                }
                obtain.writeInt(0);
            }
            this.zznF.transact(4, obtain, obtain2, 0);
            obtain2.readException();
            return zzd$zza.zzbg(obtain2.readStrongBinder());
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public void onDestroy() {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IMapFragmentDelegate");
            this.zznF.transact(8, obtain, obtain2, 0);
            obtain2.readException();
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public void onDestroyView() {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IMapFragmentDelegate");
            this.zznF.transact(7, obtain, obtain2, 0);
            obtain2.readException();
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public void onInflate(final zzd zzd, final GoogleMapOptions googleMapOptions, final Bundle bundle) {
        final int a = zzm$zza.a;
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IMapFragmentDelegate");
            IBinder binder;
            if (zzd != null) {
                binder = zzd.asBinder();
            }
            else {
                binder = null;
            }
            obtain.writeStrongBinder(binder);
            Label_0069: {
                if (googleMapOptions != null) {
                    obtain.writeInt(1);
                    googleMapOptions.writeToParcel(obtain, 0);
                    if (a == 0) {
                        break Label_0069;
                    }
                }
                obtain.writeInt(0);
            }
            Label_0097: {
                if (bundle != null) {
                    obtain.writeInt(1);
                    bundle.writeToParcel(obtain, 0);
                    if (a == 0) {
                        break Label_0097;
                    }
                }
                obtain.writeInt(0);
            }
            this.zznF.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public void onLowMemory() {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IMapFragmentDelegate");
            this.zznF.transact(9, obtain, obtain2, 0);
            obtain2.readException();
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public void onPause() {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IMapFragmentDelegate");
            this.zznF.transact(6, obtain, obtain2, 0);
            obtain2.readException();
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public void onResume() {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IMapFragmentDelegate");
            this.zznF.transact(5, obtain, obtain2, 0);
            obtain2.readException();
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public void onSaveInstanceState(final Bundle bundle) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IMapFragmentDelegate");
            Label_0040: {
                if (bundle != null) {
                    obtain.writeInt(1);
                    bundle.writeToParcel(obtain, 0);
                    if (zzm$zza.a == 0) {
                        break Label_0040;
                    }
                }
                obtain.writeInt(0);
            }
            this.zznF.transact(10, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                bundle.readFromParcel(obtain2);
            }
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
