// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.model;

import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import android.os.Parcel;

public class ai
{
    static void a(final VisibleRegion visibleRegion, final Parcel parcel, final int n) {
        final int a = b.a(parcel);
        b.a(parcel, 1, visibleRegion.a());
        b.a(parcel, 2, (Parcelable)visibleRegion.a, n, false);
        b.a(parcel, 3, (Parcelable)visibleRegion.b, n, false);
        b.a(parcel, 4, (Parcelable)visibleRegion.c, n, false);
        b.a(parcel, 5, (Parcelable)visibleRegion.d, n, false);
        b.a(parcel, 6, (Parcelable)visibleRegion.e, n, false);
        b.a(parcel, a);
    }
}
