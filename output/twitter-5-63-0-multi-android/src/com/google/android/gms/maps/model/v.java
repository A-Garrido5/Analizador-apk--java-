// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.model;

import com.google.android.gms.common.internal.safeparcel.a$a;
import java.util.List;
import java.util.ArrayList;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class v implements Parcelable$Creator
{
    static void a(final PolygonOptions polygonOptions, final Parcel parcel, final int n) {
        final int a = b.a(parcel);
        b.a(parcel, 1, polygonOptions.a());
        b.b(parcel, 2, polygonOptions.c(), false);
        b.c(parcel, 3, polygonOptions.b(), false);
        b.a(parcel, 4, polygonOptions.d());
        b.a(parcel, 5, polygonOptions.e());
        b.a(parcel, 6, polygonOptions.f());
        b.a(parcel, 7, polygonOptions.g());
        b.a(parcel, 8, polygonOptions.h());
        b.a(parcel, 9, polygonOptions.i());
        b.a(parcel, a);
    }
    
    public PolygonOptions a(final Parcel parcel) {
        float j = 0.0f;
        boolean c = false;
        final int b = a.b(parcel);
        List c2 = null;
        final ArrayList list = new ArrayList();
        boolean c3 = false;
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
                    c2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a, (Parcelable$Creator)LatLng.CREATOR);
                    continue;
                }
                case 3: {
                    com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, list, this.getClass().getClassLoader());
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
                    c3 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a);
                    continue;
                }
                case 9: {
                    c = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new a$a("Overread allowed size end=" + b, parcel);
        }
        return new PolygonOptions(f3, c2, list, i, f2, f, j, c3, c);
    }
    
    public PolygonOptions[] a(final int n) {
        return new PolygonOptions[n];
    }
}
