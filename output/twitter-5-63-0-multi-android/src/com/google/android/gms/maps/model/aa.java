// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.model;

import com.google.android.gms.common.internal.safeparcel.a$a;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class aa implements Parcelable$Creator
{
    static void a(final StreetViewPanoramaLink streetViewPanoramaLink, final Parcel parcel, final int n) {
        final int a = b.a(parcel);
        b.a(parcel, 1, streetViewPanoramaLink.a());
        b.a(parcel, 2, streetViewPanoramaLink.a, false);
        b.a(parcel, 3, streetViewPanoramaLink.b);
        b.a(parcel, a);
    }
    
    public StreetViewPanoramaLink a(final Parcel parcel) {
        final int b = a.b(parcel);
        int f = 0;
        String m = null;
        float j = 0.0f;
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
                    m = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
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
        return new StreetViewPanoramaLink(f, m, j);
    }
    
    public StreetViewPanoramaLink[] a(final int n) {
        return new StreetViewPanoramaLink[n];
    }
}
