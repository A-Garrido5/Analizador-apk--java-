// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.model;

import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import android.os.Parcel;

public class u
{
    static void a(final MarkerOptions markerOptions, final Parcel parcel, final int n) {
        final int a = b.a(parcel);
        b.a(parcel, 1, markerOptions.a());
        b.a(parcel, 2, (Parcelable)markerOptions.c(), n, false);
        b.a(parcel, 3, markerOptions.d(), false);
        b.a(parcel, 4, markerOptions.e(), false);
        b.a(parcel, 5, markerOptions.b(), false);
        b.a(parcel, 6, markerOptions.f());
        b.a(parcel, 7, markerOptions.g());
        b.a(parcel, 8, markerOptions.h());
        b.a(parcel, 9, markerOptions.i());
        b.a(parcel, a);
    }
}
