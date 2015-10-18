// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.location;

import com.google.android.gms.common.internal.safeparcel.a$a;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class o implements Parcelable$Creator
{
    static void a(final LocationRequest locationRequest, final Parcel parcel, final int n) {
        final int a = b.a(parcel);
        b.a(parcel, 1, locationRequest.a);
        b.a(parcel, 1000, locationRequest.b());
        b.a(parcel, 2, locationRequest.b);
        b.a(parcel, 3, locationRequest.c);
        b.a(parcel, 4, locationRequest.d);
        b.a(parcel, 5, locationRequest.e);
        b.a(parcel, 6, locationRequest.f);
        b.a(parcel, 7, locationRequest.g);
        b.a(parcel, 8, locationRequest.h);
        b.a(parcel, a);
    }
    
    public LocationRequest a(final Parcel parcel) {
        final int b = a.b(parcel);
        int f = 0;
        int f2 = 102;
        long h = 3600000L;
        long h2 = 600000L;
        boolean c = false;
        long h3 = Long.MAX_VALUE;
        int f3 = Integer.MAX_VALUE;
        float j = 0.0f;
        long h4 = 0L;
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
                case 1000: {
                    f = com.google.android.gms.common.internal.safeparcel.a.f(parcel, a);
                    continue;
                }
                case 2: {
                    h = com.google.android.gms.common.internal.safeparcel.a.h(parcel, a);
                    continue;
                }
                case 3: {
                    h2 = com.google.android.gms.common.internal.safeparcel.a.h(parcel, a);
                    continue;
                }
                case 4: {
                    c = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a);
                    continue;
                }
                case 5: {
                    h3 = com.google.android.gms.common.internal.safeparcel.a.h(parcel, a);
                    continue;
                }
                case 6: {
                    f3 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, a);
                    continue;
                }
                case 7: {
                    j = com.google.android.gms.common.internal.safeparcel.a.j(parcel, a);
                    continue;
                }
                case 8: {
                    h4 = com.google.android.gms.common.internal.safeparcel.a.h(parcel, a);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new a$a("Overread allowed size end=" + b, parcel);
        }
        return new LocationRequest(f, f2, h, h2, c, h3, f3, j, h4);
    }
    
    public LocationRequest[] a(final int n) {
        return new LocationRequest[n];
    }
}
