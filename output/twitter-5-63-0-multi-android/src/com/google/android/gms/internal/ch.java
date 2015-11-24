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

public class ch implements Parcelable$Creator
{
    static void a(final nq nq, final Parcel parcel, final int n) {
        final int a = b.a(parcel);
        b.a(parcel, 1, nq.a());
        b.a(parcel, 1000, nq.a);
        b.b(parcel, 2, nq.c, false);
        b.a(parcel, a);
    }
    
    public nq a(final Parcel parcel) {
        boolean c = false;
        final int b = a.b(parcel);
        List c2 = null;
        int f = 0;
        while (parcel.dataPosition() < b) {
            final int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                default: {
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    continue;
                }
                case 1: {
                    c = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a);
                    continue;
                }
                case 1000: {
                    f = com.google.android.gms.common.internal.safeparcel.a.f(parcel, a);
                    continue;
                }
                case 2: {
                    c2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a, (Parcelable$Creator)oa.CREATOR);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new a$a("Overread allowed size end=" + b, parcel);
        }
        return new nq(f, c, c2);
    }
    
    public nq[] a(final int n) {
        return new nq[n];
    }
}
