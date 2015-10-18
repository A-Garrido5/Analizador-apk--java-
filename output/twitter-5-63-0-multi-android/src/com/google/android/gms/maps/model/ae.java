// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.model;

import com.google.android.gms.common.internal.safeparcel.b;
import android.os.Parcel;

public class ae
{
    static void a(final Tile tile, final Parcel parcel, final int n) {
        final int a = b.a(parcel);
        b.a(parcel, 1, tile.a());
        b.a(parcel, 2, tile.a);
        b.a(parcel, 3, tile.b);
        b.a(parcel, 4, tile.c, false);
        b.a(parcel, a);
    }
}
