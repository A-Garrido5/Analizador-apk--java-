// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import com.google.android.gms.location.e;
import java.util.ArrayList;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import android.location.Location;
import com.google.android.gms.location.m;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.GeofencingRequest;
import java.util.List;
import android.app.PendingIntent;
import android.os.Parcelable$Creator;
import android.os.Parcel;
import android.os.IInterface;
import android.os.IBinder;
import android.os.Binder;

public abstract class by extends Binder implements bx
{
    public static bx a(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (queryLocalInterface != null && queryLocalInterface instanceof bx) {
            return (bx)queryLocalInterface;
        }
        return new bz(binder);
    }
    
    public boolean onTransact(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        switch (n) {
            default: {
                return super.onTransact(n, parcel, parcel2, n2);
            }
            case 1598968902: {
                parcel2.writeString("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                return true;
            }
            case 1: {
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                final ArrayList typedArrayList = parcel.createTypedArrayList((Parcelable$Creator)nn.CREATOR);
                PendingIntent pendingIntent;
                if (parcel.readInt() != 0) {
                    pendingIntent = (PendingIntent)PendingIntent.CREATOR.createFromParcel(parcel);
                }
                else {
                    pendingIntent = null;
                }
                this.a(typedArrayList, pendingIntent, bv.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            }
            case 57: {
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                GeofencingRequest geofencingRequest;
                if (parcel.readInt() != 0) {
                    geofencingRequest = (GeofencingRequest)GeofencingRequest.CREATOR.createFromParcel(parcel);
                }
                else {
                    geofencingRequest = null;
                }
                PendingIntent pendingIntent2;
                if (parcel.readInt() != 0) {
                    pendingIntent2 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(parcel);
                }
                else {
                    pendingIntent2 = null;
                }
                this.a(geofencingRequest, pendingIntent2, bv.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            case 2: {
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                PendingIntent pendingIntent3;
                if (parcel.readInt() != 0) {
                    pendingIntent3 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(parcel);
                }
                else {
                    pendingIntent3 = null;
                }
                this.a(pendingIntent3, bv.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            }
            case 3: {
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                this.a(parcel.createStringArray(), bv.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            }
            case 4: {
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                this.a(bv.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            }
            case 5: {
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                final long long1 = parcel.readLong();
                final boolean b = parcel.readInt() != 0;
                PendingIntent pendingIntent4;
                if (parcel.readInt() != 0) {
                    pendingIntent4 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(parcel);
                }
                else {
                    pendingIntent4 = null;
                }
                this.a(long1, b, pendingIntent4);
                parcel2.writeNoException();
                return true;
            }
            case 6: {
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                PendingIntent pendingIntent5;
                if (parcel.readInt() != 0) {
                    pendingIntent5 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(parcel);
                }
                else {
                    pendingIntent5 = null;
                }
                this.a(pendingIntent5);
                parcel2.writeNoException();
                return true;
            }
            case 7: {
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                final Location a = this.a();
                parcel2.writeNoException();
                if (a != null) {
                    parcel2.writeInt(1);
                    a.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            }
            case 8: {
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                final int int1 = parcel.readInt();
                LocationRequest a2 = null;
                if (int1 != 0) {
                    a2 = LocationRequest.CREATOR.a(parcel);
                }
                this.a(a2, m.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            case 20: {
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                final int int2 = parcel.readInt();
                LocationRequest a3 = null;
                if (int2 != 0) {
                    a3 = LocationRequest.CREATOR.a(parcel);
                }
                this.a(a3, m.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            }
            case 9: {
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                LocationRequest a4;
                if (parcel.readInt() != 0) {
                    a4 = LocationRequest.CREATOR.a(parcel);
                }
                else {
                    a4 = null;
                }
                PendingIntent pendingIntent6;
                if (parcel.readInt() != 0) {
                    pendingIntent6 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(parcel);
                }
                else {
                    pendingIntent6 = null;
                }
                this.a(a4, pendingIntent6);
                parcel2.writeNoException();
                return true;
            }
            case 52: {
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                final int int3 = parcel.readInt();
                nl a5 = null;
                if (int3 != 0) {
                    a5 = nl.CREATOR.a(parcel);
                }
                this.a(a5, m.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            case 53: {
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                nl a6;
                if (parcel.readInt() != 0) {
                    a6 = nl.CREATOR.a(parcel);
                }
                else {
                    a6 = null;
                }
                PendingIntent pendingIntent7;
                if (parcel.readInt() != 0) {
                    pendingIntent7 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(parcel);
                }
                else {
                    pendingIntent7 = null;
                }
                this.a(a6, pendingIntent7);
                parcel2.writeNoException();
                return true;
            }
            case 10: {
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                this.a(m.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            case 11: {
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                PendingIntent pendingIntent8;
                if (parcel.readInt() != 0) {
                    pendingIntent8 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(parcel);
                }
                else {
                    pendingIntent8 = null;
                }
                this.b(pendingIntent8);
                parcel2.writeNoException();
                return true;
            }
            case 12: {
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                final int int4 = parcel.readInt();
                boolean b2 = false;
                if (int4 != 0) {
                    b2 = true;
                }
                this.a(b2);
                parcel2.writeNoException();
                return true;
            }
            case 13: {
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                Location location;
                if (parcel.readInt() != 0) {
                    location = (Location)Location.CREATOR.createFromParcel(parcel);
                }
                else {
                    location = null;
                }
                this.a(location);
                parcel2.writeNoException();
                return true;
            }
            case 14: {
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                LatLngBounds a7;
                if (parcel.readInt() != 0) {
                    a7 = LatLngBounds.CREATOR.a(parcel);
                }
                else {
                    a7 = null;
                }
                final int int5 = parcel.readInt();
                nu a8;
                if (parcel.readInt() != 0) {
                    a8 = nu.CREATOR.a(parcel);
                }
                else {
                    a8 = null;
                }
                oh a9;
                if (parcel.readInt() != 0) {
                    a9 = oh.CREATOR.a(parcel);
                }
                else {
                    a9 = null;
                }
                this.a(a7, int5, a8, a9, cq.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            case 47: {
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                LatLngBounds a10;
                if (parcel.readInt() != 0) {
                    a10 = LatLngBounds.CREATOR.a(parcel);
                }
                else {
                    a10 = null;
                }
                final int int6 = parcel.readInt();
                final String string = parcel.readString();
                nu a11;
                if (parcel.readInt() != 0) {
                    a11 = nu.CREATOR.a(parcel);
                }
                else {
                    a11 = null;
                }
                final int int7 = parcel.readInt();
                oh a12 = null;
                if (int7 != 0) {
                    a12 = oh.CREATOR.a(parcel);
                }
                this.a(a10, int6, string, a11, a12, cq.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            case 15: {
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                final String string2 = parcel.readString();
                final int int8 = parcel.readInt();
                oh a13 = null;
                if (int8 != 0) {
                    a13 = oh.CREATOR.a(parcel);
                }
                this.a(string2, a13, cq.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            case 16: {
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                LatLng a14;
                if (parcel.readInt() != 0) {
                    a14 = LatLng.CREATOR.a(parcel);
                }
                else {
                    a14 = null;
                }
                nu a15;
                if (parcel.readInt() != 0) {
                    a15 = nu.CREATOR.a(parcel);
                }
                else {
                    a15 = null;
                }
                final int int9 = parcel.readInt();
                oh a16 = null;
                if (int9 != 0) {
                    a16 = oh.CREATOR.a(parcel);
                }
                this.a(a14, a15, a16, cq.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            case 17: {
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                nu a17;
                if (parcel.readInt() != 0) {
                    a17 = nu.CREATOR.a(parcel);
                }
                else {
                    a17 = null;
                }
                final int int10 = parcel.readInt();
                oh a18 = null;
                if (int10 != 0) {
                    a18 = oh.CREATOR.a(parcel);
                }
                this.a(a17, a18, cq.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            case 42: {
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                final String string3 = parcel.readString();
                final int int11 = parcel.readInt();
                oh a19 = null;
                if (int11 != 0) {
                    a19 = oh.CREATOR.a(parcel);
                }
                this.b(string3, a19, cq.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            case 58: {
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                final ArrayList stringArrayList = parcel.createStringArrayList();
                final int int12 = parcel.readInt();
                oh a20 = null;
                if (int12 != 0) {
                    a20 = oh.CREATOR.a(parcel);
                }
                this.a(stringArrayList, a20, cq.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            case 50: {
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                oe a21;
                if (parcel.readInt() != 0) {
                    a21 = oe.CREATOR.a(parcel);
                }
                else {
                    a21 = null;
                }
                LatLngBounds a22;
                if (parcel.readInt() != 0) {
                    a22 = LatLngBounds.CREATOR.a(parcel);
                }
                else {
                    a22 = null;
                }
                final ArrayList stringArrayList2 = parcel.createStringArrayList();
                oh a23;
                if (parcel.readInt() != 0) {
                    a23 = oh.CREATOR.a(parcel);
                }
                else {
                    a23 = null;
                }
                this.a(a21, a22, stringArrayList2, a23, cq.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            case 18: {
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                ny a24;
                if (parcel.readInt() != 0) {
                    a24 = ny.CREATOR.a(parcel);
                }
                else {
                    a24 = null;
                }
                oh a25;
                if (parcel.readInt() != 0) {
                    a25 = oh.CREATOR.a(parcel);
                }
                else {
                    a25 = null;
                }
                PendingIntent pendingIntent9;
                if (parcel.readInt() != 0) {
                    pendingIntent9 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(parcel);
                }
                else {
                    pendingIntent9 = null;
                }
                this.a(a24, a25, pendingIntent9);
                parcel2.writeNoException();
                return true;
            }
            case 19: {
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                oh a26;
                if (parcel.readInt() != 0) {
                    a26 = oh.CREATOR.a(parcel);
                }
                else {
                    a26 = null;
                }
                PendingIntent pendingIntent10;
                if (parcel.readInt() != 0) {
                    pendingIntent10 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(parcel);
                }
                else {
                    pendingIntent10 = null;
                }
                this.a(a26, pendingIntent10);
                parcel2.writeNoException();
                return true;
            }
            case 48: {
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                ns a27;
                if (parcel.readInt() != 0) {
                    a27 = ns.CREATOR.a(parcel);
                }
                else {
                    a27 = null;
                }
                oh a28;
                if (parcel.readInt() != 0) {
                    a28 = oh.CREATOR.a(parcel);
                }
                else {
                    a28 = null;
                }
                PendingIntent pendingIntent11;
                if (parcel.readInt() != 0) {
                    pendingIntent11 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(parcel);
                }
                else {
                    pendingIntent11 = null;
                }
                this.a(a27, a28, pendingIntent11);
                parcel2.writeNoException();
                return true;
            }
            case 49: {
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                oh a29;
                if (parcel.readInt() != 0) {
                    a29 = oh.CREATOR.a(parcel);
                }
                else {
                    a29 = null;
                }
                PendingIntent pendingIntent12;
                if (parcel.readInt() != 0) {
                    pendingIntent12 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(parcel);
                }
                else {
                    pendingIntent12 = null;
                }
                this.b(a29, pendingIntent12);
                parcel2.writeNoException();
                return true;
            }
            case 55: {
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                final String string4 = parcel.readString();
                LatLngBounds a30;
                if (parcel.readInt() != 0) {
                    a30 = LatLngBounds.CREATOR.a(parcel);
                }
                else {
                    a30 = null;
                }
                nq a31;
                if (parcel.readInt() != 0) {
                    a31 = nq.CREATOR.a(parcel);
                }
                else {
                    a31 = null;
                }
                oh a32;
                if (parcel.readInt() != 0) {
                    a32 = oh.CREATOR.a(parcel);
                }
                else {
                    a32 = null;
                }
                this.a(string4, a30, a31, a32, cq.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            case 46: {
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                oc oc;
                if (parcel.readInt() != 0) {
                    oc = (oc)com.google.android.gms.internal.oc.CREATOR.createFromParcel(parcel);
                }
                else {
                    oc = null;
                }
                final int int13 = parcel.readInt();
                oh a33 = null;
                if (int13 != 0) {
                    a33 = oh.CREATOR.a(parcel);
                }
                this.a(oc, a33, cq.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            case 21: {
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                final Location a34 = this.a(parcel.readString());
                parcel2.writeNoException();
                if (a34 != null) {
                    parcel2.writeInt(1);
                    a34.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            }
            case 25: {
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                nw a35;
                if (parcel.readInt() != 0) {
                    a35 = nw.CREATOR.a(parcel);
                }
                else {
                    a35 = null;
                }
                final int int14 = parcel.readInt();
                oh a36 = null;
                if (int14 != 0) {
                    a36 = oh.CREATOR.a(parcel);
                }
                this.a(a35, a36);
                return true;
            }
            case 26: {
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                Location location2;
                if (parcel.readInt() != 0) {
                    location2 = (Location)Location.CREATOR.createFromParcel(parcel);
                }
                else {
                    location2 = null;
                }
                this.a(location2, parcel.readInt());
                parcel2.writeNoException();
                return true;
            }
            case 34: {
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                final e b3 = this.b(parcel.readString());
                parcel2.writeNoException();
                if (b3 != null) {
                    parcel2.writeInt(1);
                    b3.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            }
            case 51: {
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                final IBinder b4 = this.b();
                parcel2.writeNoException();
                parcel2.writeStrongBinder(b4);
                return true;
            }
            case 54: {
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                final IBinder c = this.c();
                parcel2.writeNoException();
                parcel2.writeStrongBinder(c);
                return true;
            }
        }
    }
}
