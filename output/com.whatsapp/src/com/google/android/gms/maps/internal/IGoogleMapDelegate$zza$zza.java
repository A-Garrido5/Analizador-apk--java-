// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.internal;

import android.location.Location;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.maps.model.internal.zzi$zza;
import android.os.Parcel;
import com.google.android.gms.maps.model.internal.zzi;
import com.google.android.gms.maps.model.MarkerOptions;
import android.os.IBinder;

class IGoogleMapDelegate$zza$zza implements IGoogleMapDelegate
{
    private IBinder zznF;
    
    IGoogleMapDelegate$zza$zza(final IBinder zznF) {
        this.zznF = zznF;
    }
    
    @Override
    public zzi addMarker(final MarkerOptions markerOptions) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            Label_0040: {
                if (markerOptions != null) {
                    obtain.writeInt(1);
                    markerOptions.writeToParcel(obtain, 0);
                    if (zzm$zza.a == 0) {
                        break Label_0040;
                    }
                }
                obtain.writeInt(0);
            }
            this.zznF.transact(11, obtain, obtain2, 0);
            obtain2.readException();
            return zzi$zza.zzcP(obtain2.readStrongBinder());
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public void animateCamera(final zzd zzd) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            IBinder binder;
            if (zzd != null) {
                binder = zzd.asBinder();
            }
            else {
                binder = null;
            }
            obtain.writeStrongBinder(binder);
            this.zznF.transact(5, obtain, obtain2, 0);
            obtain2.readException();
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    public IBinder asBinder() {
        return this.zznF;
    }
    
    @Override
    public void clear() {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            this.zznF.transact(14, obtain, obtain2, 0);
            obtain2.readException();
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public CameraPosition getCameraPosition() {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            this.zznF.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                final CameraPosition zzeL = CameraPosition.CREATOR.zzeL(obtain2);
                if (zzm$zza.a == 0) {
                    return zzeL;
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
    public Location getMyLocation() {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            this.zznF.transact(23, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                final Location location = (Location)Location.CREATOR.createFromParcel(obtain2);
                if (zzm$zza.a == 0) {
                    return location;
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
    public IProjectionDelegate getProjection() {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            this.zznF.transact(26, obtain, obtain2, 0);
            obtain2.readException();
            return IProjectionDelegate$zza.zzcE(obtain2.readStrongBinder());
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public IUiSettingsDelegate getUiSettings() {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            this.zznF.transact(25, obtain, obtain2, 0);
            obtain2.readException();
            return IUiSettingsDelegate$zza.zzcJ(obtain2.readStrongBinder());
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public boolean isTrafficEnabled() {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            this.zznF.transact(17, obtain, obtain2, 0);
            obtain2.readException();
            final int int1 = obtain2.readInt();
            boolean b = false;
            if (int1 != 0) {
                b = true;
            }
            return b;
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public void moveCamera(final zzd zzd) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            IBinder binder;
            if (zzd != null) {
                binder = zzd.asBinder();
            }
            else {
                binder = null;
            }
            obtain.writeStrongBinder(binder);
            this.zznF.transact(4, obtain, obtain2, 0);
            obtain2.readException();
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public boolean setIndoorEnabled(final boolean b) {
        int n = 1;
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            int n2;
            if (b) {
                n2 = n;
            }
            else {
                n2 = 0;
            }
            obtain.writeInt(n2);
            this.zznF.transact(20, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() == 0) {
                n = 0;
            }
            return n != 0;
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public void setMapType(final int n) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            obtain.writeInt(n);
            this.zznF.transact(16, obtain, obtain2, 0);
            obtain2.readException();
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public void setMyLocationEnabled(final boolean b) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            int n = 0;
            if (b) {
                n = 1;
            }
            obtain.writeInt(n);
            this.zznF.transact(22, obtain, obtain2, 0);
            obtain2.readException();
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public void setOnCameraChangeListener(final zzf zzf) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            IBinder binder;
            if (zzf != null) {
                binder = zzf.asBinder();
            }
            else {
                binder = null;
            }
            obtain.writeStrongBinder(binder);
            this.zznF.transact(27, obtain, obtain2, 0);
            obtain2.readException();
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public void setOnInfoWindowClickListener(final zzh zzh) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            IBinder binder;
            if (zzh != null) {
                binder = zzh.asBinder();
            }
            else {
                binder = null;
            }
            obtain.writeStrongBinder(binder);
            this.zznF.transact(32, obtain, obtain2, 0);
            obtain2.readException();
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public void setOnMapClickListener(final zzj zzj) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            IBinder binder;
            if (zzj != null) {
                binder = zzj.asBinder();
            }
            else {
                binder = null;
            }
            obtain.writeStrongBinder(binder);
            this.zznF.transact(28, obtain, obtain2, 0);
            obtain2.readException();
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public void setOnMarkerClickListener(final zzn zzn) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            IBinder binder;
            if (zzn != null) {
                binder = zzn.asBinder();
            }
            else {
                binder = null;
            }
            obtain.writeStrongBinder(binder);
            this.zznF.transact(30, obtain, obtain2, 0);
            obtain2.readException();
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public void setPadding(final int n, final int n2, final int n3, final int n4) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            obtain.writeInt(n);
            obtain.writeInt(n2);
            obtain.writeInt(n3);
            obtain.writeInt(n4);
            this.zznF.transact(39, obtain, obtain2, 0);
            obtain2.readException();
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public void setTrafficEnabled(final boolean b) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            int n = 0;
            if (b) {
                n = 1;
            }
            obtain.writeInt(n);
            this.zznF.transact(18, obtain, obtain2, 0);
            obtain2.readException();
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public void stopAnimation() {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            this.zznF.transact(8, obtain, obtain2, 0);
            obtain2.readException();
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
