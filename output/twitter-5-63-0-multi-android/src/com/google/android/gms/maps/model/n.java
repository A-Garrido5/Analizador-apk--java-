// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.model;

import android.os.IBinder;
import com.google.android.gms.common.internal.safeparcel.a$a;
import com.google.android.gms.common.internal.safeparcel.a;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class n implements Parcelable$Creator
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
    
    public GroundOverlayOptions a(final Parcel parcel) {
        final int b = a.b(parcel);
        int f = 0;
        IBinder n = null;
        LatLng latLng = null;
        float j = 0.0f;
        float i = 0.0f;
        LatLngBounds latLngBounds = null;
        float k = 0.0f;
        float l = 0.0f;
        boolean c = false;
        float m = 0.0f;
        float j2 = 0.0f;
        float j3 = 0.0f;
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
                    latLng = (LatLng)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, (Parcelable$Creator)LatLng.CREATOR);
                    continue;
                }
                case 4: {
                    j = com.google.android.gms.common.internal.safeparcel.a.j(parcel, a);
                    continue;
                }
                case 5: {
                    i = com.google.android.gms.common.internal.safeparcel.a.j(parcel, a);
                    continue;
                }
                case 6: {
                    latLngBounds = (LatLngBounds)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, (Parcelable$Creator)LatLngBounds.CREATOR);
                    continue;
                }
                case 7: {
                    k = com.google.android.gms.common.internal.safeparcel.a.j(parcel, a);
                    continue;
                }
                case 8: {
                    l = com.google.android.gms.common.internal.safeparcel.a.j(parcel, a);
                    continue;
                }
                case 9: {
                    c = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a);
                    continue;
                }
                case 10: {
                    m = com.google.android.gms.common.internal.safeparcel.a.j(parcel, a);
                    continue;
                }
                case 11: {
                    j2 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, a);
                    continue;
                }
                case 12: {
                    j3 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, a);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new a$a("Overread allowed size end=" + b, parcel);
        }
        return new GroundOverlayOptions(f, n, latLng, j, i, latLngBounds, k, l, c, m, j2, j3);
    }
    
    public GroundOverlayOptions[] a(final int n) {
        return new GroundOverlayOptions[n];
    }
}
