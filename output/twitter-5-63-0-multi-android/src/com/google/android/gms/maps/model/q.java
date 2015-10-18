// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.model;

import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import android.os.Parcel;

public class q
{
    static void a(final LatLngBounds latLngBounds, final Parcel parcel, final int n) {
        final int a = b.a(parcel);
        b.a(parcel, 1, latLngBounds.a());
        b.a(parcel, 2, (Parcelable)latLngBounds.a, n, false);
        b.a(parcel, 3, (Parcelable)latLngBounds.b, n, false);
        b.a(parcel, a);
    }
}
