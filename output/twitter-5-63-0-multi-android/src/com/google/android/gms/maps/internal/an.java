// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.internal;

import com.google.android.gms.dynamic.k;
import com.google.android.gms.maps.StreetViewPanoramaOptions;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.dynamic.l;
import android.os.Parcel;
import android.os.IInterface;
import android.os.IBinder;
import android.os.Binder;

public abstract class an extends Binder implements am
{
    public static am a(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
        if (queryLocalInterface != null && queryLocalInterface instanceof am) {
            return (am)queryLocalInterface;
        }
        return new ao(binder);
    }
    
    public boolean onTransact(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        switch (n) {
            default: {
                return super.onTransact(n, parcel, parcel2, n2);
            }
            case 1598968902: {
                parcel2.writeString("com.google.android.gms.maps.internal.ICreator");
                return true;
            }
            case 1: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                this.a(l.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            case 2: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                final j b = this.b(l.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                IBinder binder = null;
                if (b != null) {
                    binder = b.asBinder();
                }
                parcel2.writeStrongBinder(binder);
                return true;
            }
            case 3: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                final k a = l.a(parcel.readStrongBinder());
                GoogleMapOptions a2;
                if (parcel.readInt() != 0) {
                    a2 = GoogleMapOptions.CREATOR.a(parcel);
                }
                else {
                    a2 = null;
                }
                final m a3 = this.a(a, a2);
                parcel2.writeNoException();
                IBinder binder2 = null;
                if (a3 != null) {
                    binder2 = a3.asBinder();
                }
                parcel2.writeStrongBinder(binder2);
                return true;
            }
            case 4: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                final a a4 = this.a();
                parcel2.writeNoException();
                IBinder binder3 = null;
                if (a4 != null) {
                    binder3 = a4.asBinder();
                }
                parcel2.writeStrongBinder(binder3);
                return true;
            }
            case 5: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                final com.google.android.gms.maps.model.internal.j b2 = this.b();
                parcel2.writeNoException();
                IBinder binder4 = null;
                if (b2 != null) {
                    binder4 = b2.asBinder();
                }
                parcel2.writeStrongBinder(binder4);
                return true;
            }
            case 6: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                this.a(l.a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                return true;
            }
            case 7: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                final k a5 = l.a(parcel.readStrongBinder());
                StreetViewPanoramaOptions a6;
                if (parcel.readInt() != 0) {
                    a6 = StreetViewPanoramaOptions.CREATOR.a(parcel);
                }
                else {
                    a6 = null;
                }
                final z a7 = this.a(a5, a6);
                parcel2.writeNoException();
                IBinder binder5 = null;
                if (a7 != null) {
                    binder5 = a7.asBinder();
                }
                parcel2.writeStrongBinder(binder5);
                return true;
            }
            case 8: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                final v c = this.c(l.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                IBinder binder6 = null;
                if (c != null) {
                    binder6 = c.asBinder();
                }
                parcel2.writeStrongBinder(binder6);
                return true;
            }
        }
    }
}
