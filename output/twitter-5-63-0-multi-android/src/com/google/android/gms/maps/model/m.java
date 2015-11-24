// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.model;

import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import android.os.Parcel;

public class m
{
    static void a(final CircleOptions circleOptions, final Parcel parcel, final int n) {
        final int a = b.a(parcel);
        b.a(parcel, 1, circleOptions.a());
        b.a(parcel, 2, (Parcelable)circleOptions.b(), n, false);
        b.a(parcel, 3, circleOptions.c());
        b.a(parcel, 4, circleOptions.d());
        b.a(parcel, 5, circleOptions.e());
        b.a(parcel, 6, circleOptions.f());
        b.a(parcel, 7, circleOptions.g());
        b.a(parcel, 8, circleOptions.h());
        b.a(parcel, a);
    }
}
