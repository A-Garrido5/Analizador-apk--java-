// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.safeparcel.a$a;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class cf implements Parcelable$Creator
{
    static void a(final nn nn, final Parcel parcel, final int n) {
        final int a = b.a(parcel);
        b.a(parcel, 1, nn.f(), false);
        b.a(parcel, 1000, nn.a());
        b.a(parcel, 2, nn.g());
        b.a(parcel, 3, nn.b());
        b.a(parcel, 4, nn.c());
        b.a(parcel, 5, nn.d());
        b.a(parcel, 6, nn.e());
        b.a(parcel, 7, nn.h());
        b.a(parcel, 8, nn.i());
        b.a(parcel, 9, nn.j());
        b.a(parcel, a);
    }
    
    public nn a(final Parcel parcel) {
        final int b = a.b(parcel);
        int f = 0;
        String m = null;
        int f2 = 0;
        short e = 0;
        double k = 0.0;
        double i = 0.0;
        float j = 0.0f;
        long h = 0L;
        int f3 = 0;
        int f4 = -1;
        while (parcel.dataPosition() < b) {
            final int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                default: {
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    continue;
                }
                case 1: {
                    m = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
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
                    e = com.google.android.gms.common.internal.safeparcel.a.e(parcel, a);
                    continue;
                }
                case 4: {
                    k = com.google.android.gms.common.internal.safeparcel.a.k(parcel, a);
                    continue;
                }
                case 5: {
                    i = com.google.android.gms.common.internal.safeparcel.a.k(parcel, a);
                    continue;
                }
                case 6: {
                    j = com.google.android.gms.common.internal.safeparcel.a.j(parcel, a);
                    continue;
                }
                case 7: {
                    f2 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, a);
                    continue;
                }
                case 8: {
                    f3 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, a);
                    continue;
                }
                case 9: {
                    f4 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, a);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new a$a("Overread allowed size end=" + b, parcel);
        }
        return new nn(f, m, f2, e, k, i, j, h, f3, f4);
    }
    
    public nn[] a(final int n) {
        return new nn[n];
    }
}
