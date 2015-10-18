// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.safeparcel.a$a;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class ck implements Parcelable$Creator
{
    static void a(final nw nw, final Parcel parcel, final int n) {
        final int a = b.a(parcel);
        b.a(parcel, 1, nw.a);
        b.a(parcel, 2, nw.a(), false);
        b.a(parcel, 3, nw.b(), false);
        b.a(parcel, 4, nw.c(), false);
        b.a(parcel, a);
    }
    
    public nw a(final Parcel parcel) {
        String m = null;
        final int b = a.b(parcel);
        int f = 0;
        String i = null;
        String j = null;
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
        return new nw(f, j, i, m);
    }
    
    public nw[] a(final int n) {
        return new nw[n];
    }
}
