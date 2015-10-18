// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.model;

import com.google.android.gms.common.internal.safeparcel.a$a;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class r implements Parcelable$Creator
{
    static void a(final LatLng latLng, final Parcel parcel, final int n) {
        final int a = b.a(parcel);
        b.a(parcel, 1, latLng.a());
        b.a(parcel, 2, latLng.a);
        b.a(parcel, 3, latLng.b);
        b.a(parcel, a);
    }
    
    public LatLng a(final Parcel parcel) {
        double k = 0.0;
        final int b = a.b(parcel);
        int f = 0;
        double i = k;
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
                    i = com.google.android.gms.common.internal.safeparcel.a.k(parcel, a);
                    continue;
                }
                case 3: {
                    k = com.google.android.gms.common.internal.safeparcel.a.k(parcel, a);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new a$a("Overread allowed size end=" + b, parcel);
        }
        return new LatLng(f, i, k);
    }
    
    public LatLng[] a(final int n) {
        return new LatLng[n];
    }
}
