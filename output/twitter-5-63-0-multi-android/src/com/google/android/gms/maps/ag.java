// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps;

import com.google.android.gms.common.internal.safeparcel.a$a;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.common.internal.safeparcel.a;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class ag implements Parcelable$Creator
{
    static void a(final GoogleMapOptions googleMapOptions, final Parcel parcel, final int n) {
        final int a = b.a(parcel);
        b.a(parcel, 1, googleMapOptions.a());
        b.a(parcel, 2, googleMapOptions.b());
        b.a(parcel, 3, googleMapOptions.c());
        b.a(parcel, 4, googleMapOptions.l());
        b.a(parcel, 5, (Parcelable)googleMapOptions.m(), n, false);
        b.a(parcel, 6, googleMapOptions.d());
        b.a(parcel, 7, googleMapOptions.e());
        b.a(parcel, 8, googleMapOptions.f());
        b.a(parcel, 9, googleMapOptions.g());
        b.a(parcel, 10, googleMapOptions.h());
        b.a(parcel, 11, googleMapOptions.i());
        b.a(parcel, 12, googleMapOptions.j());
        b.a(parcel, 14, googleMapOptions.k());
        b.a(parcel, a);
    }
    
    public GoogleMapOptions a(final Parcel parcel) {
        final int b = a.b(parcel);
        int f = 0;
        byte d = 0;
        byte d2 = 0;
        int f2 = 0;
        CameraPosition cameraPosition = null;
        byte d3 = 0;
        byte d4 = 0;
        byte d5 = 0;
        byte d6 = 0;
        byte d7 = 0;
        byte d8 = 0;
        byte d9 = 0;
        byte d10 = 0;
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
                    d = com.google.android.gms.common.internal.safeparcel.a.d(parcel, a);
                    continue;
                }
                case 3: {
                    d2 = com.google.android.gms.common.internal.safeparcel.a.d(parcel, a);
                    continue;
                }
                case 4: {
                    f2 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, a);
                    continue;
                }
                case 5: {
                    cameraPosition = (CameraPosition)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, (Parcelable$Creator)CameraPosition.CREATOR);
                    continue;
                }
                case 6: {
                    d3 = com.google.android.gms.common.internal.safeparcel.a.d(parcel, a);
                    continue;
                }
                case 7: {
                    d4 = com.google.android.gms.common.internal.safeparcel.a.d(parcel, a);
                    continue;
                }
                case 8: {
                    d5 = com.google.android.gms.common.internal.safeparcel.a.d(parcel, a);
                    continue;
                }
                case 9: {
                    d6 = com.google.android.gms.common.internal.safeparcel.a.d(parcel, a);
                    continue;
                }
                case 10: {
                    d7 = com.google.android.gms.common.internal.safeparcel.a.d(parcel, a);
                    continue;
                }
                case 11: {
                    d8 = com.google.android.gms.common.internal.safeparcel.a.d(parcel, a);
                    continue;
                }
                case 12: {
                    d9 = com.google.android.gms.common.internal.safeparcel.a.d(parcel, a);
                    continue;
                }
                case 14: {
                    d10 = com.google.android.gms.common.internal.safeparcel.a.d(parcel, a);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new a$a("Overread allowed size end=" + b, parcel);
        }
        return new GoogleMapOptions(f, d, d2, f2, cameraPosition, d3, d4, d5, d6, d7, d8, d9, d10);
    }
    
    public GoogleMapOptions[] a(final int n) {
        return new GoogleMapOptions[n];
    }
}
