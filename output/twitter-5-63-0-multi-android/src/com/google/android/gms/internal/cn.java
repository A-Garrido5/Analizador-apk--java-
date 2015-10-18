// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import java.util.List;
import com.google.android.gms.common.internal.safeparcel.a$a;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.common.internal.safeparcel.a;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class cn implements Parcelable$Creator
{
    static void a(final oc oc, final Parcel parcel, final int n) {
        final int a = b.a(parcel);
        b.a(parcel, 1, oc.a(), false);
        b.a(parcel, 1000, oc.a);
        b.a(parcel, 2, (Parcelable)oc.b(), n, false);
        b.a(parcel, 3, oc.c(), false);
        b.b(parcel, 4, oc.d(), false);
        b.a(parcel, 5, oc.e(), false);
        b.a(parcel, 6, oc.f(), false);
        b.a(parcel, a);
    }
    
    public oc a(final Parcel parcel) {
        String m = null;
        final int b = a.b(parcel);
        int f = 0;
        String i = null;
        List c = null;
        String j = null;
        LatLng latLng = null;
        String k = null;
        while (parcel.dataPosition() < b) {
            final int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                default: {
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    continue;
                }
                case 1: {
                    k = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 1000: {
                    f = com.google.android.gms.common.internal.safeparcel.a.f(parcel, a);
                    continue;
                }
                case 2: {
                    latLng = (LatLng)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, (Parcelable$Creator)LatLng.CREATOR);
                    continue;
                }
                case 3: {
                    j = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 4: {
                    c = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a, (Parcelable$Creator)oa.CREATOR);
                    continue;
                }
                case 5: {
                    i = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 6: {
                    m = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new a$a("Overread allowed size end=" + b, parcel);
        }
        return new oc(f, k, latLng, j, c, i, m);
    }
    
    public oc[] a(final int n) {
        return new oc[n];
    }
}
