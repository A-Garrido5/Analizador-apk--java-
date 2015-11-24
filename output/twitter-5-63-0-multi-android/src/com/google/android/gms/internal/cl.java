// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.safeparcel.a$a;
import com.google.android.gms.common.internal.safeparcel.a;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class cl implements Parcelable$Creator
{
    static void a(final ny ny, final Parcel parcel, final int n) {
        final int a = b.a(parcel);
        b.a(parcel, 1000, ny.b);
        b.a(parcel, 2, (Parcelable)ny.a(), n, false);
        b.a(parcel, 3, ny.b());
        b.a(parcel, 4, ny.c());
        b.a(parcel, a);
    }
    
    public ny a(final Parcel parcel) {
        final int b = a.b(parcel);
        int f = 0;
        nu nu = null;
        long n = ny.a;
        int f2 = 102;
        while (parcel.dataPosition() < b) {
            final int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                default: {
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    continue;
                }
                case 1000: {
                    f = com.google.android.gms.common.internal.safeparcel.a.f(parcel, a);
                    continue;
                }
                case 2: {
                    nu = (nu)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, (Parcelable$Creator)com.google.android.gms.internal.nu.CREATOR);
                    continue;
                }
                case 3: {
                    n = com.google.android.gms.common.internal.safeparcel.a.h(parcel, a);
                    continue;
                }
                case 4: {
                    f2 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, a);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new a$a("Overread allowed size end=" + b, parcel);
        }
        return new ny(f, nu, n, f2);
    }
    
    public ny[] a(final int n) {
        return new ny[n];
    }
}
