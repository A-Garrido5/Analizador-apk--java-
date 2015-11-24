// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import java.util.List;
import com.google.android.gms.common.internal.safeparcel.a$a;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class cj implements Parcelable$Creator
{
    static void a(final nu nu, final Parcel parcel, final int n) {
        final int a = b.a(parcel);
        b.b(parcel, 1, nu.b, false);
        b.a(parcel, 1000, nu.a);
        b.a(parcel, 2, nu.a(), false);
        b.a(parcel, 3, nu.b());
        b.b(parcel, 4, nu.c, false);
        b.a(parcel, 6, nu.d, false);
        b.a(parcel, a);
    }
    
    public nu a(final Parcel parcel) {
        boolean c = false;
        List y = null;
        final int b = a.b(parcel);
        List c2 = null;
        String m = null;
        List c3 = null;
        int f = 0;
        while (parcel.dataPosition() < b) {
            final int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                default: {
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    continue;
                }
                case 1: {
                    c3 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a, (Parcelable$Creator)oa.CREATOR);
                    continue;
                }
                case 1000: {
                    f = com.google.android.gms.common.internal.safeparcel.a.f(parcel, a);
                    continue;
                }
                case 2: {
                    m = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 3: {
                    c = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a);
                    continue;
                }
                case 4: {
                    c2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a, (Parcelable$Creator)oe.CREATOR);
                    continue;
                }
                case 6: {
                    y = com.google.android.gms.common.internal.safeparcel.a.y(parcel, a);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new a$a("Overread allowed size end=" + b, parcel);
        }
        return new nu(f, c3, m, c, c2, y);
    }
    
    public nu[] a(final int n) {
        return new nu[n];
    }
}
