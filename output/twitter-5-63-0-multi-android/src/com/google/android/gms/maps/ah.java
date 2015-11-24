// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps;

import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import android.os.Parcel;

public class ah
{
    static void a(final GoogleMapOptions googleMapOptions, final Parcel parcel, final int n) {
        final int a = b.a(parcel);
        b.a(parcel, 1, googleMapOptions.a());
        b.a(parcel, 2, googleMapOptions.b());
        b.a(parcel, 3, googleMapOptions.c());
        b.a(parcel, 4, googleMapOptions.l());
        b.a(parcel, 5, (Parcelable)googleMapOptions.m(), n, false);
        b.a(parcel, 6, googleMapOptions.d());
        b.a(parcel, 7, googleMapOptions.e());
        b.a(parcel, 8, googleMapOptions.f());
        b.a(parcel, 9, googleMapOptions.g());
        b.a(parcel, 10, googleMapOptions.h());
        b.a(parcel, 11, googleMapOptions.i());
        b.a(parcel, a);
    }
}
