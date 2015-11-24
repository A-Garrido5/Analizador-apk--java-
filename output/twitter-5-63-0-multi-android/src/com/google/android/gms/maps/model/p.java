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

public class p implements Parcelable$Creator
{
    static void a(final LatLngBounds latLngBounds, final Parcel parcel, final int n) {
        final int a = b.a(parcel);
        b.a(parcel, 1, latLngBounds.a());
        b.a(parcel, 2, (Parcelable)latLngBounds.a, n, false);
        b.a(parcel, 3, (Parcelable)latLngBounds.b, n, false);
        b.a(parcel, a);
    }
    
    public LatLngBounds a(final Parcel parcel) {
        LatLng latLng = null;
        final int b = a.b(parcel);
        int n = 0;
        LatLng latLng2 = null;
        while (parcel.dataPosition() < b) {
            final int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            LatLng latLng3 = null;
            LatLng latLng4 = null;
            int n2 = 0;
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                default: {
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    latLng3 = latLng;
                    latLng4 = latLng2;
                    n2 = n;
                    break;
                }
                case 1: {
                    final int f = com.google.android.gms.common.internal.safeparcel.a.f(parcel, a);
                    final LatLng latLng5 = latLng;
                    latLng4 = latLng2;
                    n2 = f;
                    latLng3 = latLng5;
                    break;
                }
                case 2: {
                    final LatLng latLng6 = (LatLng)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, (Parcelable$Creator)LatLng.CREATOR);
                    n2 = n;
                    latLng3 = latLng;
                    latLng4 = latLng6;
                    break;
                }
                case 3: {
                    latLng3 = (LatLng)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, (Parcelable$Creator)LatLng.CREATOR);
                    latLng4 = latLng2;
                    n2 = n;
                    break;
                }
            }
            n = n2;
            latLng2 = latLng4;
            latLng = latLng3;
        }
        if (parcel.dataPosition() != b) {
            throw new a$a("Overread allowed size end=" + b, parcel);
        }
        return new LatLngBounds(n, latLng2, latLng);
    }
    
    public LatLngBounds[] a(final int n) {
        return new LatLngBounds[n];
    }
}
