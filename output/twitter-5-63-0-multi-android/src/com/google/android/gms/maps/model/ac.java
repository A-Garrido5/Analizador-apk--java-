// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.model;

import com.google.android.gms.common.internal.safeparcel.a$a;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class ac implements Parcelable$Creator
{
    static void a(final StreetViewPanoramaOrientation streetViewPanoramaOrientation, final Parcel parcel, final int n) {
        final int a = b.a(parcel);
        b.a(parcel, 1, streetViewPanoramaOrientation.a());
        b.a(parcel, 2, streetViewPanoramaOrientation.a);
        b.a(parcel, 3, streetViewPanoramaOrientation.b);
        b.a(parcel, a);
    }
    
    public StreetViewPanoramaOrientation a(final Parcel parcel) {
        float j = 0.0f;
        final int b = a.b(parcel);
        int f = 0;
        float i = 0.0f;
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
                    i = com.google.android.gms.common.internal.safeparcel.a.j(parcel, a);
                    continue;
                }
                case 3: {
                    j = com.google.android.gms.common.internal.safeparcel.a.j(parcel, a);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new a$a("Overread allowed size end=" + b, parcel);
        }
        return new StreetViewPanoramaOrientation(f, i, j);
    }
    
    public StreetViewPanoramaOrientation[] a(final int n) {
        return new StreetViewPanoramaOrientation[n];
    }
}
