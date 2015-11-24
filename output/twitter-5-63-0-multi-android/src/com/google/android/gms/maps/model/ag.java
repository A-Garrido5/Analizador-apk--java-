// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.model;

import com.google.android.gms.common.internal.safeparcel.b;
import android.os.Parcel;

public class ag
{
    static void a(final TileOverlayOptions tileOverlayOptions, final Parcel parcel, final int n) {
        final int a = b.a(parcel);
        b.a(parcel, 1, tileOverlayOptions.a());
        b.a(parcel, 2, tileOverlayOptions.b(), false);
        b.a(parcel, 3, tileOverlayOptions.d());
        b.a(parcel, 4, tileOverlayOptions.c());
        b.a(parcel, a);
    }
}
