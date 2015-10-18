// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.model;

import com.google.android.gms.common.internal.safeparcel.b;
import android.os.Parcel;

public class y
{
    static void a(final PolylineOptions polylineOptions, final Parcel parcel, final int n) {
        final int a = b.a(parcel);
        b.a(parcel, 1, polylineOptions.a());
        b.b(parcel, 2, polylineOptions.b(), false);
        b.a(parcel, 3, polylineOptions.c());
        b.a(parcel, 4, polylineOptions.d());
        b.a(parcel, 5, polylineOptions.e());
        b.a(parcel, 6, polylineOptions.f());
        b.a(parcel, 7, polylineOptions.g());
        b.a(parcel, a);
    }
}
