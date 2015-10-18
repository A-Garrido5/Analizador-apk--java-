// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.safeparcel.a$a;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class cs implements Parcelable$Creator
{
    static void a(final oh oh, final Parcel parcel, final int n) {
        final int a = b.a(parcel);
        b.a(parcel, 1, oh.c, false);
        b.a(parcel, 1000, oh.b);
        b.a(parcel, 2, oh.d, false);
        b.a(parcel, 3, oh.e, false);
        b.a(parcel, 4, oh.f, false);
        b.a(parcel, a);
    }
    
    public oh a(final Parcel parcel) {
        String m = null;
        final int b = a.b(parcel);
        int f = 0;
        String i = null;
        String j = null;
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
                    j = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 3: {
                    i = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 4: {
                    m = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new a$a("Overread allowed size end=" + b, parcel);
        }
        return new oh(f, k, j, i, m);
    }
    
    public oh[] a(final int n) {
        return new oh[n];
    }
}
