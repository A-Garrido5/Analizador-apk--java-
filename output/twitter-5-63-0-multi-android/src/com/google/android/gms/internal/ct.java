// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.safeparcel.a$a;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class ct implements Parcelable$Creator
{
    static void a(final or or, final Parcel parcel, final int n) {
        final int a = b.a(parcel);
        b.a(parcel, 1, or.a);
        b.a(parcel, 2, or.b);
        b.a(parcel, 3, or.c, false);
        b.a(parcel, 4, or.d, false);
        b.a(parcel, 5, or.e, false);
        b.a(parcel, a);
    }
    
    public or a(final Parcel parcel) {
        Bundle o = null;
        final int b = a.b(parcel);
        int f = 0;
        long h = 0L;
        byte[] p = null;
        String m = null;
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
                    h = com.google.android.gms.common.internal.safeparcel.a.h(parcel, a);
                    continue;
                }
                case 3: {
                    m = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 4: {
                    p = com.google.android.gms.common.internal.safeparcel.a.p(parcel, a);
                    continue;
                }
                case 5: {
                    o = com.google.android.gms.common.internal.safeparcel.a.o(parcel, a);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new a$a("Overread allowed size end=" + b, parcel);
        }
        return new or(f, h, m, p, o);
    }
    
    public or[] a(final int n) {
        return new or[n];
    }
}
