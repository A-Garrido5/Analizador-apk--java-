// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import com.google.android.gms.location.e;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.GeofencingRequest;
import java.util.List;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.location.l;
import android.app.PendingIntent;
import android.os.Parcel;
import android.location.Location;
import android.os.IBinder;

class bz implements bx
{
    private IBinder a;
    
    bz(final IBinder a) {
        this.a = a;
    }
    
    @Override
    public Location a() {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            this.a.transact(7, obtain, obtain2, 0);
            obtain2.readException();
            Location location;
            if (obtain2.readInt() != 0) {
                location = (Location)Location.CREATOR.createFromParcel(obtain2);
            }
            else {
                location = null;
            }
            return location;
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public Location a(final String s) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            obtain.writeString(s);
            this.a.transact(21, obtain, obtain2, 0);
            obtain2.readException();
            Location location;
            if (obtain2.readInt() != 0) {
                location = (Location)Location.CREATOR.createFromParcel(obtain2);
            }
            else {
                location = null;
            }
            return location;
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public void a(final long n, final boolean b, final PendingIntent pendingIntent) {
        int n2 = 1;
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            obtain.writeLong(n);
            if (!b) {
                n2 = 0;
            }
            obtain.writeInt(n2);
            if (pendingIntent != null) {
                obtain.writeInt(1);
                pendingIntent.writeToParcel(obtain, 0);
            }
            else {
                obtain.writeInt(0);
            }
            this.a.transact(5, obtain, obtain2, 0);
            obtain2.readException();
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public void a(final PendingIntent pendingIntent) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (pendingIntent != null) {
                obtain.writeInt(1);
                pendingIntent.writeToParcel(obtain, 0);
            }
            else {
                obtain.writeInt(0);
            }
            this.a.transact(6, obtain, obtain2, 0);
            obtain2.readException();
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public void a(final PendingIntent pendingIntent, final bu bu, final String s) {
        while (true) {
            final Parcel obtain = Parcel.obtain();
            final Parcel obtain2 = Parcel.obtain();
            while (true) {
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    }
                    else {
                        obtain.writeInt(0);
                    }
                    if (bu != null) {
                        final IBinder binder = bu.asBinder();
                        obtain.writeStrongBinder(binder);
                        obtain.writeString(s);
                        this.a.transact(2, obtain, obtain2, 0);
                        obtain2.readException();
                        return;
                    }
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
                final IBinder binder = null;
                continue;
            }
        }
    }
    
    @Override
    public void a(final Location location) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (location != null) {
                obtain.writeInt(1);
                location.writeToParcel(obtain, 0);
            }
            else {
                obtain.writeInt(0);
            }
            this.a.transact(13, obtain, obtain2, 0);
            obtain2.readException();
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public void a(final Location location, final int n) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (location != null) {
                obtain.writeInt(1);
                location.writeToParcel(obtain, 0);
            }
            else {
                obtain.writeInt(0);
            }
            obtain.writeInt(n);
            this.a.transact(26, obtain, obtain2, 0);
            obtain2.readException();
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public void a(final bu bu, final String s) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            IBinder binder;
            if (bu != null) {
                binder = bu.asBinder();
            }
            else {
                binder = null;
            }
            obtain.writeStrongBinder(binder);
            obtain.writeString(s);
            this.a.transact(4, obtain, obtain2, 0);
            obtain2.readException();
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public void a(final nl nl, final PendingIntent pendingIntent) {
        while (true) {
            final Parcel obtain = Parcel.obtain();
            final Parcel obtain2 = Parcel.obtain();
            while (true) {
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (nl != null) {
                        obtain.writeInt(1);
                        nl.writeToParcel(obtain, 0);
                    }
                    else {
                        obtain.writeInt(0);
                    }
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                        this.a.transact(53, obtain, obtain2, 0);
                        obtain2.readException();
                        return;
                    }
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
                obtain.writeInt(0);
                continue;
            }
        }
    }
    
    @Override
    public void a(final nl nl, final l l) {
        while (true) {
            final Parcel obtain = Parcel.obtain();
            final Parcel obtain2 = Parcel.obtain();
            while (true) {
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (nl != null) {
                        obtain.writeInt(1);
                        nl.writeToParcel(obtain, 0);
                    }
                    else {
                        obtain.writeInt(0);
                    }
                    if (l != null) {
                        final IBinder binder = l.asBinder();
                        obtain.writeStrongBinder(binder);
                        this.a.transact(52, obtain, obtain2, 0);
                        obtain2.readException();
                        return;
                    }
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
                final IBinder binder = null;
                continue;
            }
        }
    }
    
    @Override
    public void a(final ns ns, final oh oh, final PendingIntent pendingIntent) {
    Label_0068_Outer:
        while (true) {
            final Parcel obtain = Parcel.obtain();
            final Parcel obtain2 = Parcel.obtain();
            while (true) {
            Label_0134:
                while (true) {
                    try {
                        obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                        if (ns != null) {
                            obtain.writeInt(1);
                            ns.writeToParcel(obtain, 0);
                        }
                        else {
                            obtain.writeInt(0);
                        }
                        if (oh != null) {
                            obtain.writeInt(1);
                            oh.writeToParcel(obtain, 0);
                            if (pendingIntent != null) {
                                obtain.writeInt(1);
                                pendingIntent.writeToParcel(obtain, 0);
                                this.a.transact(48, obtain, obtain2, 0);
                                obtain2.readException();
                                return;
                            }
                            break Label_0134;
                        }
                    }
                    finally {
                        obtain2.recycle();
                        obtain.recycle();
                    }
                    obtain.writeInt(0);
                    continue Label_0068_Outer;
                }
                obtain.writeInt(0);
                continue;
            }
        }
    }
    
    @Override
    public void a(final nu nu, final oh oh, final cp cp) {
    Label_0063_Outer:
        while (true) {
            final Parcel obtain = Parcel.obtain();
            final Parcel obtain2 = Parcel.obtain();
            while (true) {
            Label_0136:
                while (true) {
                    try {
                        obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                        if (nu != null) {
                            obtain.writeInt(1);
                            nu.writeToParcel(obtain, 0);
                        }
                        else {
                            obtain.writeInt(0);
                        }
                        if (oh != null) {
                            obtain.writeInt(1);
                            oh.writeToParcel(obtain, 0);
                            if (cp != null) {
                                final IBinder binder = cp.asBinder();
                                obtain.writeStrongBinder(binder);
                                this.a.transact(17, obtain, obtain2, 0);
                                obtain2.readException();
                                return;
                            }
                            break Label_0136;
                        }
                    }
                    finally {
                        obtain2.recycle();
                        obtain.recycle();
                    }
                    obtain.writeInt(0);
                    continue Label_0063_Outer;
                }
                final IBinder binder = null;
                continue;
            }
        }
    }
    
    @Override
    public void a(final nw nw, final oh oh) {
        while (true) {
            final Parcel obtain = Parcel.obtain();
            while (true) {
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (nw != null) {
                        obtain.writeInt(1);
                        nw.writeToParcel(obtain, 0);
                    }
                    else {
                        obtain.writeInt(0);
                    }
                    if (oh != null) {
                        obtain.writeInt(1);
                        oh.writeToParcel(obtain, 0);
                        this.a.transact(25, obtain, (Parcel)null, 1);
                        return;
                    }
                }
                finally {
                    obtain.recycle();
                }
                obtain.writeInt(0);
                continue;
            }
        }
    }
    
    @Override
    public void a(final ny ny, final oh oh, final PendingIntent pendingIntent) {
    Label_0068_Outer:
        while (true) {
            final Parcel obtain = Parcel.obtain();
            final Parcel obtain2 = Parcel.obtain();
            while (true) {
            Label_0134:
                while (true) {
                    try {
                        obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                        if (ny != null) {
                            obtain.writeInt(1);
                            ny.writeToParcel(obtain, 0);
                        }
                        else {
                            obtain.writeInt(0);
                        }
                        if (oh != null) {
                            obtain.writeInt(1);
                            oh.writeToParcel(obtain, 0);
                            if (pendingIntent != null) {
                                obtain.writeInt(1);
                                pendingIntent.writeToParcel(obtain, 0);
                                this.a.transact(18, obtain, obtain2, 0);
                                obtain2.readException();
                                return;
                            }
                            break Label_0134;
                        }
                    }
                    finally {
                        obtain2.recycle();
                        obtain.recycle();
                    }
                    obtain.writeInt(0);
                    continue Label_0068_Outer;
                }
                obtain.writeInt(0);
                continue;
            }
        }
    }
    
    @Override
    public void a(final oc oc, final oh oh, final cp cp) {
    Label_0063_Outer:
        while (true) {
            final Parcel obtain = Parcel.obtain();
            final Parcel obtain2 = Parcel.obtain();
            while (true) {
            Label_0136:
                while (true) {
                    try {
                        obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                        if (oc != null) {
                            obtain.writeInt(1);
                            oc.writeToParcel(obtain, 0);
                        }
                        else {
                            obtain.writeInt(0);
                        }
                        if (oh != null) {
                            obtain.writeInt(1);
                            oh.writeToParcel(obtain, 0);
                            if (cp != null) {
                                final IBinder binder = cp.asBinder();
                                obtain.writeStrongBinder(binder);
                                this.a.transact(46, obtain, obtain2, 0);
                                obtain2.readException();
                                return;
                            }
                            break Label_0136;
                        }
                    }
                    finally {
                        obtain2.recycle();
                        obtain.recycle();
                    }
                    obtain.writeInt(0);
                    continue Label_0063_Outer;
                }
                final IBinder binder = null;
                continue;
            }
        }
    }
    
    @Override
    public void a(final oe oe, final LatLngBounds latLngBounds, final List list, final oh oh, final cp cp) {
        Parcel obtain;
        Parcel obtain2;
        IBinder binder;
        Label_0076_Outer:Label_0090_Outer:
        while (true) {
            obtain = Parcel.obtain();
            obtain2 = Parcel.obtain();
            while (true) {
            Label_0172:
                while (true) {
                Label_0163:
                    while (true) {
                        try {
                            obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                            if (oe != null) {
                                obtain.writeInt(1);
                                oe.writeToParcel(obtain, 0);
                            }
                            else {
                                obtain.writeInt(0);
                            }
                            if (latLngBounds != null) {
                                obtain.writeInt(1);
                                latLngBounds.writeToParcel(obtain, 0);
                                obtain.writeStringList(list);
                                if (oh == null) {
                                    break Label_0163;
                                }
                                obtain.writeInt(1);
                                oh.writeToParcel(obtain, 0);
                                if (cp != null) {
                                    binder = cp.asBinder();
                                    obtain.writeStrongBinder(binder);
                                    this.a.transact(50, obtain, obtain2, 0);
                                    obtain2.readException();
                                    return;
                                }
                                break Label_0172;
                            }
                        }
                        finally {
                            obtain2.recycle();
                            obtain.recycle();
                        }
                        obtain.writeInt(0);
                        continue Label_0076_Outer;
                    }
                    obtain.writeInt(0);
                    continue Label_0090_Outer;
                }
                binder = null;
                continue;
            }
        }
    }
    
    @Override
    public void a(final oh oh, final PendingIntent pendingIntent) {
        while (true) {
            final Parcel obtain = Parcel.obtain();
            final Parcel obtain2 = Parcel.obtain();
            while (true) {
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (oh != null) {
                        obtain.writeInt(1);
                        oh.writeToParcel(obtain, 0);
                    }
                    else {
                        obtain.writeInt(0);
                    }
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                        this.a.transact(19, obtain, obtain2, 0);
                        obtain2.readException();
                        return;
                    }
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
                obtain.writeInt(0);
                continue;
            }
        }
    }
    
    @Override
    public void a(final GeofencingRequest geofencingRequest, final PendingIntent pendingIntent, final bu bu) {
    Label_0063_Outer:
        while (true) {
            final Parcel obtain = Parcel.obtain();
            final Parcel obtain2 = Parcel.obtain();
            while (true) {
            Label_0136:
                while (true) {
                    try {
                        obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                        if (geofencingRequest != null) {
                            obtain.writeInt(1);
                            geofencingRequest.writeToParcel(obtain, 0);
                        }
                        else {
                            obtain.writeInt(0);
                        }
                        if (pendingIntent != null) {
                            obtain.writeInt(1);
                            pendingIntent.writeToParcel(obtain, 0);
                            if (bu != null) {
                                final IBinder binder = bu.asBinder();
                                obtain.writeStrongBinder(binder);
                                this.a.transact(57, obtain, obtain2, 0);
                                obtain2.readException();
                                return;
                            }
                            break Label_0136;
                        }
                    }
                    finally {
                        obtain2.recycle();
                        obtain.recycle();
                    }
                    obtain.writeInt(0);
                    continue Label_0063_Outer;
                }
                final IBinder binder = null;
                continue;
            }
        }
    }
    
    @Override
    public void a(final LocationRequest locationRequest, final PendingIntent pendingIntent) {
        while (true) {
            final Parcel obtain = Parcel.obtain();
            final Parcel obtain2 = Parcel.obtain();
            while (true) {
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (locationRequest != null) {
                        obtain.writeInt(1);
                        locationRequest.writeToParcel(obtain, 0);
                    }
                    else {
                        obtain.writeInt(0);
                    }
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                        this.a.transact(9, obtain, obtain2, 0);
                        obtain2.readException();
                        return;
                    }
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
                obtain.writeInt(0);
                continue;
            }
        }
    }
    
    @Override
    public void a(final LocationRequest locationRequest, final l l) {
        while (true) {
            final Parcel obtain = Parcel.obtain();
            final Parcel obtain2 = Parcel.obtain();
            while (true) {
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (locationRequest != null) {
                        obtain.writeInt(1);
                        locationRequest.writeToParcel(obtain, 0);
                    }
                    else {
                        obtain.writeInt(0);
                    }
                    if (l != null) {
                        final IBinder binder = l.asBinder();
                        obtain.writeStrongBinder(binder);
                        this.a.transact(8, obtain, obtain2, 0);
                        obtain2.readException();
                        return;
                    }
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
                final IBinder binder = null;
                continue;
            }
        }
    }
    
    @Override
    public void a(final LocationRequest locationRequest, final l l, final String s) {
        while (true) {
            final Parcel obtain = Parcel.obtain();
            final Parcel obtain2 = Parcel.obtain();
            while (true) {
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (locationRequest != null) {
                        obtain.writeInt(1);
                        locationRequest.writeToParcel(obtain, 0);
                    }
                    else {
                        obtain.writeInt(0);
                    }
                    if (l != null) {
                        final IBinder binder = l.asBinder();
                        obtain.writeStrongBinder(binder);
                        obtain.writeString(s);
                        this.a.transact(20, obtain, obtain2, 0);
                        obtain2.readException();
                        return;
                    }
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
                final IBinder binder = null;
                continue;
            }
        }
    }
    
    @Override
    public void a(final l l) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            IBinder binder;
            if (l != null) {
                binder = l.asBinder();
            }
            else {
                binder = null;
            }
            obtain.writeStrongBinder(binder);
            this.a.transact(10, obtain, obtain2, 0);
            obtain2.readException();
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public void a(final LatLng latLng, final nu nu, final oh oh, final cp cp) {
        Parcel obtain;
        Parcel obtain2;
        IBinder binder;
        Label_0068_Outer:Label_0082_Outer:
        while (true) {
            obtain = Parcel.obtain();
            obtain2 = Parcel.obtain();
            while (true) {
            Label_0164:
                while (true) {
                Label_0155:
                    while (true) {
                        try {
                            obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                            if (latLng != null) {
                                obtain.writeInt(1);
                                latLng.writeToParcel(obtain, 0);
                            }
                            else {
                                obtain.writeInt(0);
                            }
                            if (nu != null) {
                                obtain.writeInt(1);
                                nu.writeToParcel(obtain, 0);
                                if (oh == null) {
                                    break Label_0155;
                                }
                                obtain.writeInt(1);
                                oh.writeToParcel(obtain, 0);
                                if (cp != null) {
                                    binder = cp.asBinder();
                                    obtain.writeStrongBinder(binder);
                                    this.a.transact(16, obtain, obtain2, 0);
                                    obtain2.readException();
                                    return;
                                }
                                break Label_0164;
                            }
                        }
                        finally {
                            obtain2.recycle();
                            obtain.recycle();
                        }
                        obtain.writeInt(0);
                        continue Label_0068_Outer;
                    }
                    obtain.writeInt(0);
                    continue Label_0082_Outer;
                }
                binder = null;
                continue;
            }
        }
    }
    
    @Override
    public void a(final LatLngBounds latLngBounds, final int n, final nu nu, final oh oh, final cp cp) {
        Parcel obtain;
        Parcel obtain2;
        IBinder binder;
        Label_0076_Outer:Label_0090_Outer:
        while (true) {
            obtain = Parcel.obtain();
            obtain2 = Parcel.obtain();
            while (true) {
            Label_0172:
                while (true) {
                Label_0163:
                    while (true) {
                        try {
                            obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                            if (latLngBounds != null) {
                                obtain.writeInt(1);
                                latLngBounds.writeToParcel(obtain, 0);
                            }
                            else {
                                obtain.writeInt(0);
                            }
                            obtain.writeInt(n);
                            if (nu != null) {
                                obtain.writeInt(1);
                                nu.writeToParcel(obtain, 0);
                                if (oh == null) {
                                    break Label_0163;
                                }
                                obtain.writeInt(1);
                                oh.writeToParcel(obtain, 0);
                                if (cp != null) {
                                    binder = cp.asBinder();
                                    obtain.writeStrongBinder(binder);
                                    this.a.transact(14, obtain, obtain2, 0);
                                    obtain2.readException();
                                    return;
                                }
                                break Label_0172;
                            }
                        }
                        finally {
                            obtain2.recycle();
                            obtain.recycle();
                        }
                        obtain.writeInt(0);
                        continue Label_0076_Outer;
                    }
                    obtain.writeInt(0);
                    continue Label_0090_Outer;
                }
                binder = null;
                continue;
            }
        }
    }
    
    @Override
    public void a(final LatLngBounds latLngBounds, final int n, final String s, final nu nu, final oh oh, final cp cp) {
        Parcel obtain;
        Parcel obtain2;
        IBinder binder;
        Label_0084_Outer:Label_0098_Outer:
        while (true) {
            obtain = Parcel.obtain();
            obtain2 = Parcel.obtain();
            while (true) {
            Label_0180:
                while (true) {
                Label_0171:
                    while (true) {
                        try {
                            obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                            if (latLngBounds != null) {
                                obtain.writeInt(1);
                                latLngBounds.writeToParcel(obtain, 0);
                            }
                            else {
                                obtain.writeInt(0);
                            }
                            obtain.writeInt(n);
                            obtain.writeString(s);
                            if (nu != null) {
                                obtain.writeInt(1);
                                nu.writeToParcel(obtain, 0);
                                if (oh == null) {
                                    break Label_0171;
                                }
                                obtain.writeInt(1);
                                oh.writeToParcel(obtain, 0);
                                if (cp != null) {
                                    binder = cp.asBinder();
                                    obtain.writeStrongBinder(binder);
                                    this.a.transact(47, obtain, obtain2, 0);
                                    obtain2.readException();
                                    return;
                                }
                                break Label_0180;
                            }
                        }
                        finally {
                            obtain2.recycle();
                            obtain.recycle();
                        }
                        obtain.writeInt(0);
                        continue Label_0084_Outer;
                    }
                    obtain.writeInt(0);
                    continue Label_0098_Outer;
                }
                binder = null;
                continue;
            }
        }
    }
    
    @Override
    public void a(final String s, final oh oh, final cp cp) {
        while (true) {
            final Parcel obtain = Parcel.obtain();
            final Parcel obtain2 = Parcel.obtain();
            while (true) {
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    obtain.writeString(s);
                    if (oh != null) {
                        obtain.writeInt(1);
                        oh.writeToParcel(obtain, 0);
                    }
                    else {
                        obtain.writeInt(0);
                    }
                    if (cp != null) {
                        final IBinder binder = cp.asBinder();
                        obtain.writeStrongBinder(binder);
                        this.a.transact(15, obtain, obtain2, 0);
                        obtain2.readException();
                        return;
                    }
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
                final IBinder binder = null;
                continue;
            }
        }
    }
    
    @Override
    public void a(final String s, final LatLngBounds latLngBounds, final nq nq, final oh oh, final cp cp) {
        Parcel obtain;
        Parcel obtain2;
        IBinder binder;
        Label_0076_Outer:Label_0090_Outer:
        while (true) {
            obtain = Parcel.obtain();
            obtain2 = Parcel.obtain();
            while (true) {
            Label_0172:
                while (true) {
                Label_0163:
                    while (true) {
                        try {
                            obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                            obtain.writeString(s);
                            if (latLngBounds != null) {
                                obtain.writeInt(1);
                                latLngBounds.writeToParcel(obtain, 0);
                            }
                            else {
                                obtain.writeInt(0);
                            }
                            if (nq != null) {
                                obtain.writeInt(1);
                                nq.writeToParcel(obtain, 0);
                                if (oh == null) {
                                    break Label_0163;
                                }
                                obtain.writeInt(1);
                                oh.writeToParcel(obtain, 0);
                                if (cp != null) {
                                    binder = cp.asBinder();
                                    obtain.writeStrongBinder(binder);
                                    this.a.transact(55, obtain, obtain2, 0);
                                    obtain2.readException();
                                    return;
                                }
                                break Label_0172;
                            }
                        }
                        finally {
                            obtain2.recycle();
                            obtain.recycle();
                        }
                        obtain.writeInt(0);
                        continue Label_0076_Outer;
                    }
                    obtain.writeInt(0);
                    continue Label_0090_Outer;
                }
                binder = null;
                continue;
            }
        }
    }
    
    @Override
    public void a(final List list, final PendingIntent pendingIntent, final bu bu, final String s) {
        while (true) {
            final Parcel obtain = Parcel.obtain();
            final Parcel obtain2 = Parcel.obtain();
            while (true) {
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    obtain.writeTypedList(list);
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    }
                    else {
                        obtain.writeInt(0);
                    }
                    if (bu != null) {
                        final IBinder binder = bu.asBinder();
                        obtain.writeStrongBinder(binder);
                        obtain.writeString(s);
                        this.a.transact(1, obtain, obtain2, 0);
                        obtain2.readException();
                        return;
                    }
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
                final IBinder binder = null;
                continue;
            }
        }
    }
    
    @Override
    public void a(final List list, final oh oh, final cp cp) {
        while (true) {
            final Parcel obtain = Parcel.obtain();
            final Parcel obtain2 = Parcel.obtain();
            while (true) {
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    obtain.writeStringList(list);
                    if (oh != null) {
                        obtain.writeInt(1);
                        oh.writeToParcel(obtain, 0);
                    }
                    else {
                        obtain.writeInt(0);
                    }
                    if (cp != null) {
                        final IBinder binder = cp.asBinder();
                        obtain.writeStrongBinder(binder);
                        this.a.transact(58, obtain, obtain2, 0);
                        obtain2.readException();
                        return;
                    }
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
                final IBinder binder = null;
                continue;
            }
        }
    }
    
    @Override
    public void a(final boolean b) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            int n = 0;
            if (b) {
                n = 1;
            }
            obtain.writeInt(n);
            this.a.transact(12, obtain, obtain2, 0);
            obtain2.readException();
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public void a(final String[] array, final bu bu, final String s) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            obtain.writeStringArray(array);
            IBinder binder;
            if (bu != null) {
                binder = bu.asBinder();
            }
            else {
                binder = null;
            }
            obtain.writeStrongBinder(binder);
            obtain.writeString(s);
            this.a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
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
    public IBinder b() {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            this.a.transact(51, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readStrongBinder();
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public e b(final String s) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            obtain.writeString(s);
            this.a.transact(34, obtain, obtain2, 0);
            obtain2.readException();
            e a;
            if (obtain2.readInt() != 0) {
                a = e.CREATOR.a(obtain2);
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
    public void b(final PendingIntent pendingIntent) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (pendingIntent != null) {
                obtain.writeInt(1);
                pendingIntent.writeToParcel(obtain, 0);
            }
            else {
                obtain.writeInt(0);
            }
            this.a.transact(11, obtain, obtain2, 0);
            obtain2.readException();
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public void b(final oh oh, final PendingIntent pendingIntent) {
        while (true) {
            final Parcel obtain = Parcel.obtain();
            final Parcel obtain2 = Parcel.obtain();
            while (true) {
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (oh != null) {
                        obtain.writeInt(1);
                        oh.writeToParcel(obtain, 0);
                    }
                    else {
                        obtain.writeInt(0);
                    }
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                        this.a.transact(49, obtain, obtain2, 0);
                        obtain2.readException();
                        return;
                    }
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
                obtain.writeInt(0);
                continue;
            }
        }
    }
    
    @Override
    public void b(final String s, final oh oh, final cp cp) {
        while (true) {
            final Parcel obtain = Parcel.obtain();
            final Parcel obtain2 = Parcel.obtain();
            while (true) {
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    obtain.writeString(s);
                    if (oh != null) {
                        obtain.writeInt(1);
                        oh.writeToParcel(obtain, 0);
                    }
                    else {
                        obtain.writeInt(0);
                    }
                    if (cp != null) {
                        final IBinder binder = cp.asBinder();
                        obtain.writeStrongBinder(binder);
                        this.a.transact(42, obtain, obtain2, 0);
                        obtain2.readException();
                        return;
                    }
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
                final IBinder binder = null;
                continue;
            }
        }
    }
    
    @Override
    public IBinder c() {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            this.a.transact(54, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readStrongBinder();
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
