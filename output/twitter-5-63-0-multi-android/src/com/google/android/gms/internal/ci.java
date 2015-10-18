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

public class ci implements Parcelable$Creator
{
    static void a(final ns ns, final Parcel parcel, final int n) {
        final int a = b.a(parcel);
        b.a(parcel, 1, ns.b());
        b.a(parcel, 1000, ns.a());
        b.a(parcel, 2, ns.c());
        b.a(parcel, 3, (Parcelable)ns.d(), n, false);
        b.a(parcel, a);
    }
    
    public ns a(final Parcel parcel) {
        int f = 0;
        final int b = a.b(parcel);
        int f2 = -1;
        nu nu = null;
        int f3 = 0;
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
                    f3 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, a);
                    continue;
                }
                case 2: {
                    f2 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, a);
                    continue;
                }
                case 3: {
                    nu = (nu)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, (Parcelable$Creator)com.google.android.gms.internal.nu.CREATOR);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new a$a("Overread allowed size end=" + b, parcel);
        }
        return new ns(f3, f, f2, nu);
    }
    
    public ns[] a(final int n) {
        return new ns[n];
    }
}
