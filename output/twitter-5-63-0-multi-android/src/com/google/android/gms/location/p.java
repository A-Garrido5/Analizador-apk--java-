// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.location;

import com.google.android.gms.common.internal.safeparcel.a$a;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class p implements Parcelable$Creator
{
    static void a(final e e, final Parcel parcel, final int n) {
        final int a = b.a(parcel);
        b.a(parcel, 1, e.a);
        b.a(parcel, 1000, e.a());
        b.a(parcel, 2, e.b);
        b.a(parcel, 3, e.c);
        b.a(parcel, a);
    }
    
    public e a(final Parcel parcel) {
        int f = 1;
        final int b = a.b(parcel);
        int f2 = 0;
        long h = 0L;
        int f3 = f;
        while (parcel.dataPosition() < b) {
            final int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                default: {
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    continue;
                }
                case 1: {
                    f3 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, a);
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
                case 3: {
                    h = com.google.android.gms.common.internal.safeparcel.a.h(parcel, a);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new a$a("Overread allowed size end=" + b, parcel);
        }
        return new e(f2, f3, f, h);
    }
    
    public e[] a(final int n) {
        return new e[n];
    }
}
