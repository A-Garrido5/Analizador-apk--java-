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

public class t implements Parcelable$Creator
{
    static void a(final MarkerOptions markerOptions, final Parcel parcel, final int n) {
        final int a = b.a(parcel);
        b.a(parcel, 1, markerOptions.a());
        b.a(parcel, 2, (Parcelable)markerOptions.c(), n, false);
        b.a(parcel, 3, markerOptions.d(), false);
        b.a(parcel, 4, markerOptions.e(), false);
        b.a(parcel, 5, markerOptions.b(), false);
        b.a(parcel, 6, markerOptions.f());
        b.a(parcel, 7, markerOptions.g());
        b.a(parcel, 8, markerOptions.h());
        b.a(parcel, 9, markerOptions.i());
        b.a(parcel, 10, markerOptions.j());
        b.a(parcel, 11, markerOptions.k());
        b.a(parcel, 12, markerOptions.l());
        b.a(parcel, 13, markerOptions.m());
        b.a(parcel, 14, markerOptions.n());
        b.a(parcel, a);
    }
    
    public MarkerOptions a(final Parcel parcel) {
        final int b = a.b(parcel);
        int f = 0;
        LatLng latLng = null;
        String m = null;
        String i = null;
        IBinder n = null;
        float j = 0.0f;
        float k = 0.0f;
        boolean c = false;
        boolean c2 = false;
        boolean c3 = false;
        float l = 0.0f;
        float j2 = 0.5f;
        float j3 = 0.0f;
        float j4 = 1.0f;
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
                    latLng = (LatLng)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, (Parcelable$Creator)LatLng.CREATOR);
                    continue;
                }
                case 3: {
                    m = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 4: {
                    i = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 5: {
                    n = com.google.android.gms.common.internal.safeparcel.a.n(parcel, a);
                    continue;
                }
                case 6: {
                    j = com.google.android.gms.common.internal.safeparcel.a.j(parcel, a);
                    continue;
                }
                case 7: {
                    k = com.google.android.gms.common.internal.safeparcel.a.j(parcel, a);
                    continue;
                }
                case 8: {
                    c = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a);
                    continue;
                }
                case 9: {
                    c2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a);
                    continue;
                }
                case 10: {
                    c3 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a);
                    continue;
                }
                case 11: {
                    l = com.google.android.gms.common.internal.safeparcel.a.j(parcel, a);
                    continue;
                }
                case 12: {
                    j2 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, a);
                    continue;
                }
                case 13: {
                    j3 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, a);
                    continue;
                }
                case 14: {
                    j4 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, a);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new a$a("Overread allowed size end=" + b, parcel);
        }
        return new MarkerOptions(f, latLng, m, i, n, j, k, c, c2, c3, l, j2, j3, j4);
    }
    
    public MarkerOptions[] a(final int n) {
        return new MarkerOptions[n];
    }
}
