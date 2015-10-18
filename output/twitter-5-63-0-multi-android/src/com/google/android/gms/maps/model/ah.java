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

public class ah implements Parcelable$Creator
{
    static void a(final VisibleRegion visibleRegion, final Parcel parcel, final int n) {
        final int a = b.a(parcel);
        b.a(parcel, 1, visibleRegion.a());
        b.a(parcel, 2, (Parcelable)visibleRegion.a, n, false);
        b.a(parcel, 3, (Parcelable)visibleRegion.b, n, false);
        b.a(parcel, 4, (Parcelable)visibleRegion.c, n, false);
        b.a(parcel, 5, (Parcelable)visibleRegion.d, n, false);
        b.a(parcel, 6, (Parcelable)visibleRegion.e, n, false);
        b.a(parcel, a);
    }
    
    public VisibleRegion a(final Parcel parcel) {
        LatLngBounds latLngBounds = null;
        final int b = a.b(parcel);
        int f = 0;
        LatLng latLng = null;
        LatLng latLng2 = null;
        LatLng latLng3 = null;
        LatLng latLng4 = null;
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
                    latLng4 = (LatLng)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, (Parcelable$Creator)LatLng.CREATOR);
                    continue;
                }
                case 3: {
                    latLng3 = (LatLng)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, (Parcelable$Creator)LatLng.CREATOR);
                    continue;
                }
                case 4: {
                    latLng2 = (LatLng)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, (Parcelable$Creator)LatLng.CREATOR);
                    continue;
                }
                case 5: {
                    latLng = (LatLng)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, (Parcelable$Creator)LatLng.CREATOR);
                    continue;
                }
                case 6: {
                    latLngBounds = (LatLngBounds)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, (Parcelable$Creator)LatLngBounds.CREATOR);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new a$a("Overread allowed size end=" + b, parcel);
        }
        return new VisibleRegion(f, latLng4, latLng3, latLng2, latLng, latLngBounds);
    }
    
    public VisibleRegion[] a(final int n) {
        return new VisibleRegion[n];
    }
}
