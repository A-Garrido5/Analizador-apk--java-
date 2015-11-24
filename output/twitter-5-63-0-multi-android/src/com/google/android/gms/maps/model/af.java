// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.model;

import android.os.IBinder;
import com.google.android.gms.common.internal.safeparcel.a$a;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class af implements Parcelable$Creator
{
    static void a(final TileOverlayOptions tileOverlayOptions, final Parcel parcel, final int n) {
        final int a = b.a(parcel);
        b.a(parcel, 1, tileOverlayOptions.a());
        b.a(parcel, 2, tileOverlayOptions.b(), false);
        b.a(parcel, 3, tileOverlayOptions.d());
        b.a(parcel, 4, tileOverlayOptions.c());
        b.a(parcel, 5, tileOverlayOptions.e());
        b.a(parcel, a);
    }
    
    public TileOverlayOptions a(final Parcel parcel) {
        boolean c = false;
        final int b = a.b(parcel);
        IBinder n = null;
        float j = 0.0f;
        boolean c2 = true;
        int f = 0;
        while (parcel.dataPosition() < b) {
            final int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                default: {
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    continue;
                }
                case 1: {
                    f = com.google.android.gms.common.internal.safeparcel.a.f(parcel, a);
                    continue;
                }
                case 2: {
                    n = com.google.android.gms.common.internal.safeparcel.a.n(parcel, a);
                    continue;
                }
                case 3: {
                    c = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a);
                    continue;
                }
                case 4: {
                    j = com.google.android.gms.common.internal.safeparcel.a.j(parcel, a);
                    continue;
                }
                case 5: {
                    c2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new a$a("Overread allowed size end=" + b, parcel);
        }
        return new TileOverlayOptions(f, n, c, j, c2);
    }
    
    public TileOverlayOptions[] a(final int n) {
        return new TileOverlayOptions[n];
    }
}
