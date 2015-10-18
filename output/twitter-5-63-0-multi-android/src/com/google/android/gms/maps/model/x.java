// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.model;

import java.util.List;
import com.google.android.gms.common.internal.safeparcel.a$a;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class x implements Parcelable$Creator
{
    static void a(final PolylineOptions polylineOptions, final Parcel parcel, final int n) {
        final int a = b.a(parcel);
        b.a(parcel, 1, polylineOptions.a());
        b.b(parcel, 2, polylineOptions.b(), false);
        b.a(parcel, 3, polylineOptions.c());
        b.a(parcel, 4, polylineOptions.d());
        b.a(parcel, 5, polylineOptions.e());
        b.a(parcel, 6, polylineOptions.f());
        b.a(parcel, 7, polylineOptions.g());
        b.a(parcel, a);
    }
    
    public PolylineOptions a(final Parcel parcel) {
        float j = 0.0f;
        boolean c = false;
        final int b = a.b(parcel);
        List c2 = null;
        boolean c3 = false;
        int f = 0;
        float i = 0.0f;
        int f2 = 0;
        while (parcel.dataPosition() < b) {
            final int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                default: {
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    continue;
                }
                case 1: {
                    f2 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, a);
                    continue;
                }
                case 2: {
                    c2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a, (Parcelable$Creator)LatLng.CREATOR);
                    continue;
                }
                case 3: {
                    i = com.google.android.gms.common.internal.safeparcel.a.j(parcel, a);
                    continue;
                }
                case 4: {
                    f = com.google.android.gms.common.internal.safeparcel.a.f(parcel, a);
                    continue;
                }
                case 5: {
                    j = com.google.android.gms.common.internal.safeparcel.a.j(parcel, a);
                    continue;
                }
                case 6: {
                    c3 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a);
                    continue;
                }
                case 7: {
                    c = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new a$a("Overread allowed size end=" + b, parcel);
        }
        return new PolylineOptions(f2, c2, i, f, j, c3, c);
    }
    
    public PolylineOptions[] a(final int n) {
        return new PolylineOptions[n];
    }
}
