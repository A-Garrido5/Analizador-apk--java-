// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.model;

import com.google.android.gms.common.internal.safeparcel.a$a;
import com.google.android.gms.common.internal.safeparcel.a;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class l implements Parcelable$Creator
{
    static void a(final CircleOptions circleOptions, final Parcel parcel, final int n) {
        final int a = b.a(parcel);
        b.a(parcel, 1, circleOptions.a());
        b.a(parcel, 2, (Parcelable)circleOptions.b(), n, false);
        b.a(parcel, 3, circleOptions.c());
        b.a(parcel, 4, circleOptions.d());
        b.a(parcel, 5, circleOptions.e());
        b.a(parcel, 6, circleOptions.f());
        b.a(parcel, 7, circleOptions.g());
        b.a(parcel, 8, circleOptions.h());
        b.a(parcel, a);
    }
    
    public CircleOptions a(final Parcel parcel) {
        float j = 0.0f;
        boolean c = false;
        final int b = a.b(parcel);
        LatLng latLng = null;
        double k = 0.0;
        int f = 0;
        int f2 = 0;
        float i = 0.0f;
        int f3 = 0;
        while (parcel.dataPosition() < b) {
            final int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                default: {
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    continue;
                }
                case 1: {
                    f3 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, a);
                    continue;
                }
                case 2: {
                    latLng = (LatLng)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, (Parcelable$Creator)LatLng.CREATOR);
                    continue;
                }
                case 3: {
                    k = com.google.android.gms.common.internal.safeparcel.a.k(parcel, a);
                    continue;
                }
                case 4: {
                    i = com.google.android.gms.common.internal.safeparcel.a.j(parcel, a);
                    continue;
                }
                case 5: {
                    f2 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, a);
                    continue;
                }
                case 6: {
                    f = com.google.android.gms.common.internal.safeparcel.a.f(parcel, a);
                    continue;
                }
                case 7: {
                    j = com.google.android.gms.common.internal.safeparcel.a.j(parcel, a);
                    continue;
                }
                case 8: {
                    c = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new a$a("Overread allowed size end=" + b, parcel);
        }
        return new CircleOptions(f3, latLng, k, i, f2, f, j, c);
    }
    
    public CircleOptions[] a(final int n) {
        return new CircleOptions[n];
    }
}
