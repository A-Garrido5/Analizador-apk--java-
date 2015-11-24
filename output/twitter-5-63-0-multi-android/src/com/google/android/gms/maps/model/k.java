// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.model;

import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import android.os.Parcel;

public class k
{
    static void a(final CameraPosition cameraPosition, final Parcel parcel, final int n) {
        final int a = b.a(parcel);
        b.a(parcel, 1, cameraPosition.a());
        b.a(parcel, 2, (Parcelable)cameraPosition.a, n, false);
        b.a(parcel, 3, cameraPosition.b);
        b.a(parcel, 4, cameraPosition.c);
        b.a(parcel, 5, cameraPosition.d);
        b.a(parcel, a);
    }
}
