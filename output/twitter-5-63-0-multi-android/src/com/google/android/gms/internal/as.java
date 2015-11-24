// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.safeparcel.a$a;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class as implements Parcelable$Creator
{
    static void a(final kk kk, final Parcel parcel, final int n) {
        final int a = b.a(parcel);
        b.a(parcel, 1, kk.a);
        b.a(parcel, 2, kk.b, false);
        b.a(parcel, 3, kk.c);
        b.a(parcel, a);
    }
    
    public kk a(final Parcel parcel) {
        int f = 0;
        final int b = a.b(parcel);
        String m = null;
        int f2 = 0;
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
                case 2: {
                    m = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 3: {
                    f = com.google.android.gms.common.internal.safeparcel.a.f(parcel, a);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new a$a("Overread allowed size end=" + b, parcel);
        }
        return new kk(f2, m, f);
    }
    
    public kk[] a(final int n) {
        return new kk[n];
    }
}
