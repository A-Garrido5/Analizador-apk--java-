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

public class ab implements Parcelable$Creator
{
    static void a(final StreetViewPanoramaLocation streetViewPanoramaLocation, final Parcel parcel, final int n) {
        final int a = b.a(parcel);
        b.a(parcel, 1, streetViewPanoramaLocation.a());
        b.a(parcel, 2, (Parcelable[])streetViewPanoramaLocation.a, n, false);
        b.a(parcel, 3, (Parcelable)streetViewPanoramaLocation.b, n, false);
        b.a(parcel, 4, streetViewPanoramaLocation.c, false);
        b.a(parcel, a);
    }
    
    public StreetViewPanoramaLocation a(final Parcel parcel) {
        String s = null;
        final int b = a.b(parcel);
        int n = 0;
        LatLng latLng = null;
        StreetViewPanoramaLink[] array = null;
        while (parcel.dataPosition() < b) {
            final int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            String m = null;
            LatLng latLng2 = null;
            StreetViewPanoramaLink[] array2 = null;
            int n2 = 0;
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                default: {
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    m = s;
                    latLng2 = latLng;
                    array2 = array;
                    n2 = n;
                    break;
                }
                case 1: {
                    final int f = com.google.android.gms.common.internal.safeparcel.a.f(parcel, a);
                    final String s2 = s;
                    latLng2 = latLng;
                    array2 = array;
                    n2 = f;
                    m = s2;
                    break;
                }
                case 2: {
                    final StreetViewPanoramaLink[] array3 = (StreetViewPanoramaLink[])com.google.android.gms.common.internal.safeparcel.a.b(parcel, a, (Parcelable$Creator)StreetViewPanoramaLink.CREATOR);
                    n2 = n;
                    final LatLng latLng3 = latLng;
                    array2 = array3;
                    m = s;
                    latLng2 = latLng3;
                    break;
                }
                case 3: {
                    final LatLng latLng4 = (LatLng)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, (Parcelable$Creator)LatLng.CREATOR);
                    array2 = array;
                    n2 = n;
                    final String s3 = s;
                    latLng2 = latLng4;
                    m = s3;
                    break;
                }
                case 4: {
                    m = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    latLng2 = latLng;
                    array2 = array;
                    n2 = n;
                    break;
                }
            }
            n = n2;
            array = array2;
            latLng = latLng2;
            s = m;
        }
        if (parcel.dataPosition() != b) {
            throw new a$a("Overread allowed size end=" + b, parcel);
        }
        return new StreetViewPanoramaLocation(n, array, latLng, s);
    }
    
    public StreetViewPanoramaLocation[] a(final int n) {
        return new StreetViewPanoramaLocation[n];
    }
}
