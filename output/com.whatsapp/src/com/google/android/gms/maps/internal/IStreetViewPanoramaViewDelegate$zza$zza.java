// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.internal;

import android.os.Bundle;
import com.google.android.gms.dynamic.zzd$zza;
import com.google.android.gms.dynamic.zzd;
import android.os.Parcel;
import android.os.IBinder;

class IStreetViewPanoramaViewDelegate$zza$zza implements IStreetViewPanoramaViewDelegate
{
    private IBinder zznF;
    
    IStreetViewPanoramaViewDelegate$zza$zza(final IBinder zznF) {
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
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
            IBinder binder;
            if (zzv != null) {
                binder = zzv.asBinder();
            }
            else {
                binder = null;
            }
            obtain.writeStrongBinder(binder);
            this.zznF.transact(9, obtain, obtain2, 0);
            obtain2.readException();
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public zzd getView() {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
            this.zznF.transact(8, obtain, obtain2, 0);
            obtain2.readException();
            return zzd$zza.zzbg(obtain2.readStrongBinder());
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
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
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
            this.zznF.transact(2, obtain, obtain2, 0);
            obtain2.readException();
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
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
            this.zznF.transact(5, obtain, obtain2, 0);
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
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
            this.zznF.transact(6, obtain, obtain2, 0);
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
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
            this.zznF.transact(4, obtain, obtain2, 0);
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
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
            this.zznF.transact(3, obtain, obtain2, 0);
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
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
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
            this.zznF.transact(7, obtain, obtain2, 0);
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
