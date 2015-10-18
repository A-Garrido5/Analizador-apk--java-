// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.safeparcel.a$a;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class bo implements Parcelable$Creator
{
    static void a(final nd nd, final Parcel parcel, final int n) {
        final int a = b.a(parcel);
        b.a(parcel, 1, nd.a);
        b.a(parcel, 1000, nd.a());
        b.a(parcel, 2, nd.b, false);
        b.a(parcel, a);
    }
    
    public nd a(final Parcel parcel) {
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
                    f = com.google.android.gms.common.internal.safeparcel.a.f(parcel, a);
                    continue;
                }
                case 1000: {
                    f2 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, a);
                    continue;
                }
                case 2: {
                    m = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new a$a("Overread allowed size end=" + b, parcel);
        }
        return new nd(f2, f, m);
    }
    
    public nd[] a(final int n) {
        return new nd[n];
    }
}
