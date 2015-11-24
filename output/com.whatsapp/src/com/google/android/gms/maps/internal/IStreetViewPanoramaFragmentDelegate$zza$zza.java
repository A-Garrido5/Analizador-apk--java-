// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.internal;

import com.google.android.gms.maps.StreetViewPanoramaOptions;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.dynamic.zzd$zza;
import com.google.android.gms.dynamic.zzd;
import android.os.Bundle;
import android.os.Parcel;
import android.os.IBinder;

class IStreetViewPanoramaFragmentDelegate$zza$zza implements IStreetViewPanoramaFragmentDelegate
{
    private IBinder zznF;
    
    IStreetViewPanoramaFragmentDelegate$zza$zza(final IBinder zznF) {
        this.zznF = zznF;
    }
    
    public IBinder asBinder() {
        return this.zznF;
    }
    
    @Override
    public void getStreetViewPanoramaAsync(final zzv zzv) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
            IBinder binder;
            if (zzv != null) {
                binder = zzv.asBinder();
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
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
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
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
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
            Label_0091: {
                if (bundle != null) {
                    obtain.writeInt(1);
                    bundle.writeToParcel(obtain, 0);
                    if (a == 0) {
                        break Label_0091;
                    }
                }
                obtain.writeInt(0);
            }
            this.zznF.transact(4, obtain, obtain2, 0);
            obtain2.readException();
            final zzd zzbg = zzd$zza.zzbg(obtain2.readStrongBinder());
            obtain2.recycle();
            obtain.recycle();
            if (GoogleMap.a != 0) {
                zzm$zza.a = a + 1;
            }
            return zzbg;
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
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
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
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
            this.zznF.transact(7, obtain, obtain2, 0);
            obtain2.readException();
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public void onInflate(final zzd zzd, final StreetViewPanoramaOptions streetViewPanoramaOptions, final Bundle bundle) {
        final int a = zzm$zza.a;
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
            IBinder binder;
            if (zzd != null) {
                binder = zzd.asBinder();
            }
            else {
                binder = null;
            }
            obtain.writeStrongBinder(binder);
            Label_0069: {
                if (streetViewPanoramaOptions != null) {
                    obtain.writeInt(1);
                    streetViewPanoramaOptions.writeToParcel(obtain, 0);
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
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
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
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
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
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
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
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
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
