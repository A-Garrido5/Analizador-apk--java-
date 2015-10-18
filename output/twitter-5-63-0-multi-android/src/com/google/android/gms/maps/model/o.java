// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.model;

import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import android.os.Parcel;

public class o
{
    static void a(final GroundOverlayOptions groundOverlayOptions, final Parcel parcel, final int n) {
        final int a = b.a(parcel);
        b.a(parcel, 1, groundOverlayOptions.b());
        b.a(parcel, 2, groundOverlayOptions.a(), false);
        b.a(parcel, 3, (Parcelable)groundOverlayOptions.c(), n, false);
        b.a(parcel, 4, groundOverlayOptions.d());
        b.a(parcel, 5, groundOverlayOptions.e());
        b.a(parcel, 6, (Parcelable)groundOverlayOptions.f(), n, false);
        b.a(parcel, 7, groundOverlayOptions.g());
        b.a(parcel, 8, groundOverlayOptions.h());
        b.a(parcel, 9, groundOverlayOptions.l());
        b.a(parcel, 10, groundOverlayOptions.i());
        b.a(parcel, 11, groundOverlayOptions.j());
        b.a(parcel, 12, groundOverlayOptions.k());
        b.a(parcel, a);
    }
}
