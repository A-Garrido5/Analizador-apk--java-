// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.safeparcel.a$a;
import com.google.android.gms.common.internal.safeparcel.a;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class ax implements Parcelable$Creator
{
    static void a(final kr$a kr$a, final Parcel parcel, final int n) {
        final int a = b.a(parcel);
        b.a(parcel, 1, kr$a.a());
        b.a(parcel, 2, kr$a.b());
        b.a(parcel, 3, kr$a.c());
        b.a(parcel, 4, kr$a.d());
        b.a(parcel, 5, kr$a.e());
        b.a(parcel, 6, kr$a.f(), false);
        b.a(parcel, 7, kr$a.g());
        b.a(parcel, 8, kr$a.i(), false);
        b.a(parcel, 9, (Parcelable)kr$a.k(), n, false);
        b.a(parcel, a);
    }
    
    public kr$a a(final Parcel parcel) {
        km km = null;
        int f = 0;
        final int b = a.b(parcel);
        String m = null;
        String i = null;
        boolean c = false;
        int f2 = 0;
        boolean c2 = false;
        int f3 = 0;
        int f4 = 0;
        while (parcel.dataPosition() < b) {
            final int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                default: {
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    continue;
                }
                case 1: {
                    f4 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, a);
                    continue;
                }
                case 2: {
                    f3 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, a);
                    continue;
                }
                case 3: {
                    c2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a);
                    continue;
                }
                case 4: {
                    f2 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, a);
                    continue;
                }
                case 5: {
                    c = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a);
                    continue;
                }
                case 6: {
                    i = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 7: {
                    f = com.google.android.gms.common.internal.safeparcel.a.f(parcel, a);
                    continue;
                }
                case 8: {
                    m = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 9: {
                    km = (km)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, (Parcelable$Creator)com.google.android.gms.internal.km.CREATOR);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new a$a("Overread allowed size end=" + b, parcel);
        }
        return new kr$a(f4, f3, c2, f2, c, i, f, m, km);
    }
    
    public kr$a[] a(final int n) {
        return new kr$a[n];
    }
}
