// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.model;

import com.google.android.gms.common.internal.safeparcel.b;
import android.os.Parcel;

public class s
{
    static void a(final LatLng latLng, final Parcel parcel, final int n) {
        final int a = b.a(parcel);
        b.a(parcel, 1, latLng.a());
        b.a(parcel, 2, latLng.a);
        b.a(parcel, 3, latLng.b);
        b.a(parcel, a);
    }
}
