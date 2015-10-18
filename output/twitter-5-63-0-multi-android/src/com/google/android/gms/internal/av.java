// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.safeparcel.a$a;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class av implements Parcelable$Creator
{
    static void a(final ko$a ko$a, final Parcel parcel, final int n) {
        final int a = b.a(parcel);
        b.a(parcel, 1, ko$a.a);
        b.a(parcel, 2, ko$a.b, false);
        b.a(parcel, 3, ko$a.c);
        b.a(parcel, a);
    }
    
    public ko$a a(final Parcel parcel) {
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
        return new ko$a(f2, m, f);
    }
    
    public ko$a[] a(final int n) {
        return new ko$a[n];
    }
}
