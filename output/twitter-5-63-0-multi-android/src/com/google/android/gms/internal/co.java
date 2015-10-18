// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.safeparcel.a$a;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class co implements Parcelable$Creator
{
    static void a(final oe oe, final Parcel parcel, final int n) {
        final int a = b.a(parcel);
        b.a(parcel, 1, oe.e, false);
        b.a(parcel, 1000, oe.d);
        b.a(parcel, 2, oe.f);
        b.a(parcel, a);
    }
    
    public oe a(final Parcel parcel) {
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
                    m = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 1000: {
                    f2 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, a);
                    continue;
                }
                case 2: {
                    f = com.google.android.gms.common.internal.safeparcel.a.f(parcel, a);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new a$a("Overread allowed size end=" + b, parcel);
        }
        return new oe(f2, m, f);
    }
    
    public oe[] a(final int n) {
        return new oe[n];
    }
}
