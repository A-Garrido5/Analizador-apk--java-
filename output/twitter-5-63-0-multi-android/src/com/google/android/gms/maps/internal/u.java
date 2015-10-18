// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.internal;

import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.dynamic.l;
import android.os.Parcel;
import com.google.android.gms.dynamic.k;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
import android.os.IBinder;

class u implements s
{
    private IBinder a;
    
    u(final IBinder a) {
        this.a = a;
    }
    
    @Override
    public k a(final StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            if (streetViewPanoramaOrientation != null) {
                obtain.writeInt(1);
                streetViewPanoramaOrientation.writeToParcel(obtain, 0);
            }
            else {
                obtain.writeInt(0);
            }
            this.a.transact(19, obtain, obtain2, 0);
            obtain2.readException();
            return l.a(obtain2.readStrongBinder());
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public StreetViewPanoramaOrientation a(final k k) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            IBinder binder;
            if (k != null) {
                binder = k.asBinder();
            }
            else {
                binder = null;
            }
            obtain.writeStrongBinder(binder);
            this.a.transact(18, obtain, obtain2, 0);
            obtain2.readException();
            final int int1 = obtain2.readInt();
            StreetViewPanoramaOrientation a = null;
            if (int1 != 0) {
                a = StreetViewPanoramaOrientation.CREATOR.a(obtain2);
            }
            return a;
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public void a(final cf cf) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            IBinder binder;
            if (cf != null) {
                binder = cf.asBinder();
            }
            else {
                binder = null;
            }
            obtain.writeStrongBinder(binder);
            this.a.transact(16, obtain, obtain2, 0);
            obtain2.readException();
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public void a(final ci ci) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            IBinder binder;
            if (ci != null) {
                binder = ci.asBinder();
            }
            else {
                binder = null;
            }
            obtain.writeStrongBinder(binder);
            this.a.transact(15, obtain, obtain2, 0);
            obtain2.readException();
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public void a(final cl cl) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            IBinder binder;
            if (cl != null) {
                binder = cl.asBinder();
            }
            else {
                binder = null;
            }
            obtain.writeStrongBinder(binder);
            this.a.transact(17, obtain, obtain2, 0);
            obtain2.readException();
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public void a(final LatLng latLng) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            if (latLng != null) {
                obtain.writeInt(1);
                latLng.writeToParcel(obtain, 0);
            }
            else {
                obtain.writeInt(0);
            }
            this.a.transact(12, obtain, obtain2, 0);
            obtain2.readException();
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public void a(final LatLng latLng, final int n) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            if (latLng != null) {
                obtain.writeInt(1);
                latLng.writeToParcel(obtain, 0);
            }
            else {
                obtain.writeInt(0);
            }
            obtain.writeInt(n);
            this.a.transact(13, obtain, obtain2, 0);
            obtain2.readException();
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public void a(final StreetViewPanoramaCamera streetViewPanoramaCamera, final long n) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            if (streetViewPanoramaCamera != null) {
                obtain.writeInt(1);
                streetViewPanoramaCamera.writeToParcel(obtain, 0);
            }
            else {
                obtain.writeInt(0);
            }
            obtain.writeLong(n);
            this.a.transact(9, obtain, obtain2, 0);
            obtain2.readException();
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public void a(final String s) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            obtain.writeString(s);
            this.a.transact(11, obtain, obtain2, 0);
            obtain2.readException();
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public void a(final boolean b) {
        int n = 1;
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            if (!b) {
                n = 0;
            }
            obtain.writeInt(n);
            this.a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public boolean a() {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            this.a.transact(5, obtain, obtain2, 0);
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
    
    public IBinder asBinder() {
        return this.a;
    }
    
    @Override
    public void b(final boolean b) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            int n = 0;
            if (b) {
                n = 1;
            }
            obtain.writeInt(n);
            this.a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public boolean b() {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            this.a.transact(6, obtain, obtain2, 0);
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
    public void c(final boolean b) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            int n = 0;
            if (b) {
                n = 1;
            }
            obtain.writeInt(n);
            this.a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public boolean c() {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            this.a.transact(7, obtain, obtain2, 0);
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
    public void d(final boolean b) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            int n = 0;
            if (b) {
                n = 1;
            }
            obtain.writeInt(n);
            this.a.transact(4, obtain, obtain2, 0);
            obtain2.readException();
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public boolean d() {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            this.a.transact(8, obtain, obtain2, 0);
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
    public StreetViewPanoramaCamera e() {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            this.a.transact(10, obtain, obtain2, 0);
            obtain2.readException();
            StreetViewPanoramaCamera a;
            if (obtain2.readInt() != 0) {
                a = StreetViewPanoramaCamera.CREATOR.a(obtain2);
            }
            else {
                a = null;
            }
            return a;
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public StreetViewPanoramaLocation f() {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            this.a.transact(14, obtain, obtain2, 0);
            obtain2.readException();
            StreetViewPanoramaLocation a;
            if (obtain2.readInt() != 0) {
                a = StreetViewPanoramaLocation.CREATOR.a(obtain2);
            }
            else {
                a = null;
            }
            return a;
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
