// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.safeparcel.a$a;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class cu implements Parcelable$Creator
{
    static void a(final ov ov, final Parcel parcel, final int n) {
        final int a = b.a(parcel);
        b.a(parcel, 1, ov.a);
        b.a(parcel, 2, ov.b, false);
        b.a(parcel, 3, ov.c);
        b.a(parcel, 4, ov.d);
        b.a(parcel, 5, ov.e, false);
        b.a(parcel, 6, ov.f, false);
        b.a(parcel, 7, ov.g);
        b.a(parcel, 8, ov.h, false);
        b.a(parcel, a);
    }
    
    public ov a(final Parcel parcel) {
        int f = 0;
        String m = null;
        final int b = a.b(parcel);
        boolean c = true;
        String i = null;
        String j = null;
        int f2 = 0;
        String k = null;
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
                    k = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 3: {
                    f2 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, a);
                    continue;
                }
                case 4: {
                    f = com.google.android.gms.common.internal.safeparcel.a.f(parcel, a);
                    continue;
                }
                case 5: {
                    j = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 6: {
                    i = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 7: {
                    c = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a);
                    continue;
                }
                case 8: {
                    m = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new a$a("Overread allowed size end=" + b, parcel);
        }
        return new ov(f3, k, f2, f, j, i, c, m);
    }
    
    public ov[] a(final int n) {
        return new ov[n];
    }
}
