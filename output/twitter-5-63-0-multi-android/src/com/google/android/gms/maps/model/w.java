// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.model;

import com.google.android.gms.common.internal.safeparcel.b;
import android.os.Parcel;

public class w
{
    static void a(final PolygonOptions polygonOptions, final Parcel parcel, final int n) {
        final int a = b.a(parcel);
        b.a(parcel, 1, polygonOptions.a());
        b.b(parcel, 2, polygonOptions.c(), false);
        b.c(parcel, 3, polygonOptions.b(), false);
        b.a(parcel, 4, polygonOptions.d());
        b.a(parcel, 5, polygonOptions.e());
        b.a(parcel, 6, polygonOptions.f());
        b.a(parcel, 7, polygonOptions.g());
        b.a(parcel, 8, polygonOptions.h());
        b.a(parcel, 9, polygonOptions.i());
        b.a(parcel, a);
    }
}
