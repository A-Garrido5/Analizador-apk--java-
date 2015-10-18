// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.safeparcel.a$a;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class cm implements Parcelable$Creator
{
    static void a(final oa oa, final Parcel parcel, final int n) {
        final int a = b.a(parcel);
        b.a(parcel, 1, oa.bx, false);
        b.a(parcel, 1000, oa.bw);
        b.a(parcel, a);
    }
    
    public oa a(final Parcel parcel) {
        final int b = a.b(parcel);
        int f = 0;
        String m = null;
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
            }
        }
        if (parcel.dataPosition() != b) {
            throw new a$a("Overread allowed size end=" + b, parcel);
        }
        return new oa(f, m);
    }
    
    public oa[] a(final int n) {
        return new oa[n];
    }
}
