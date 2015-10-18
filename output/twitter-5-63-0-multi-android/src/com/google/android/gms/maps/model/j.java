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

public class j implements Parcelable$Creator
{
    static void a(final CameraPosition cameraPosition, final Parcel parcel, final int n) {
        final int a = b.a(parcel);
        b.a(parcel, 1, cameraPosition.a());
        b.a(parcel, 2, (Parcelable)cameraPosition.a, n, false);
        b.a(parcel, 3, cameraPosition.b);
        b.a(parcel, 4, cameraPosition.c);
        b.a(parcel, 5, cameraPosition.d);
        b.a(parcel, a);
    }
    
    public CameraPosition a(final Parcel parcel) {
        float j = 0.0f;
        final int b = a.b(parcel);
        int f = 0;
        LatLng latLng = null;
        float i = 0.0f;
        float k = 0.0f;
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
                    latLng = (LatLng)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, (Parcelable$Creator)LatLng.CREATOR);
                    continue;
                }
                case 3: {
                    k = com.google.android.gms.common.internal.safeparcel.a.j(parcel, a);
                    continue;
                }
                case 4: {
                    i = com.google.android.gms.common.internal.safeparcel.a.j(parcel, a);
                    continue;
                }
                case 5: {
                    j = com.google.android.gms.common.internal.safeparcel.a.j(parcel, a);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new a$a("Overread allowed size end=" + b, parcel);
        }
        return new CameraPosition(f, latLng, k, i, j);
    }
    
    public CameraPosition[] a(final int n) {
        return new CameraPosition[n];
    }
}
