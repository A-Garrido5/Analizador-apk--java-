// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps;

import com.google.android.gms.common.internal.safeparcel.a$a;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.common.internal.safeparcel.a;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class ai implements Parcelable$Creator
{
    static void a(final StreetViewPanoramaOptions streetViewPanoramaOptions, final Parcel parcel, final int n) {
        final int a = b.a(parcel);
        b.a(parcel, 1, streetViewPanoramaOptions.a());
        b.a(parcel, 2, (Parcelable)streetViewPanoramaOptions.g(), n, false);
        b.a(parcel, 3, streetViewPanoramaOptions.j(), false);
        b.a(parcel, 4, (Parcelable)streetViewPanoramaOptions.h(), n, false);
        b.a(parcel, 5, streetViewPanoramaOptions.i(), false);
        b.a(parcel, 6, streetViewPanoramaOptions.b());
        b.a(parcel, 7, streetViewPanoramaOptions.c());
        b.a(parcel, 8, streetViewPanoramaOptions.d());
        b.a(parcel, 9, streetViewPanoramaOptions.e());
        b.a(parcel, 10, streetViewPanoramaOptions.f());
        b.a(parcel, a);
    }
    
    public StreetViewPanoramaOptions a(final Parcel parcel) {
        Integer g = null;
        byte d = 0;
        final int b = a.b(parcel);
        byte d2 = 0;
        byte d3 = 0;
        byte d4 = 0;
        byte d5 = 0;
        LatLng latLng = null;
        String m = null;
        StreetViewPanoramaCamera streetViewPanoramaCamera = null;
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
                    streetViewPanoramaCamera = (StreetViewPanoramaCamera)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, (Parcelable$Creator)StreetViewPanoramaCamera.CREATOR);
                    continue;
                }
                case 3: {
                    m = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 4: {
                    latLng = (LatLng)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, (Parcelable$Creator)LatLng.CREATOR);
                    continue;
                }
                case 5: {
                    g = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    continue;
                }
                case 6: {
                    d5 = com.google.android.gms.common.internal.safeparcel.a.d(parcel, a);
                    continue;
                }
                case 7: {
                    d4 = com.google.android.gms.common.internal.safeparcel.a.d(parcel, a);
                    continue;
                }
                case 8: {
                    d3 = com.google.android.gms.common.internal.safeparcel.a.d(parcel, a);
                    continue;
                }
                case 9: {
                    d2 = com.google.android.gms.common.internal.safeparcel.a.d(parcel, a);
                    continue;
                }
                case 10: {
                    d = com.google.android.gms.common.internal.safeparcel.a.d(parcel, a);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new a$a("Overread allowed size end=" + b, parcel);
        }
        return new StreetViewPanoramaOptions(f, streetViewPanoramaCamera, m, latLng, g, d5, d4, d3, d2, d);
    }
    
    public StreetViewPanoramaOptions[] a(final int n) {
        return new StreetViewPanoramaOptions[n];
    }
}
