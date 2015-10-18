// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.model.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.safeparcel.a$a;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class h implements Parcelable$Creator
{
    static void a(final c c, final Parcel parcel, final int n) {
        final int a = b.a(parcel);
        b.a(parcel, 1, c.a());
        b.a(parcel, 2, c.b());
        b.a(parcel, 3, c.c(), false);
        b.a(parcel, a);
    }
    
    public c a(final Parcel parcel) {
        int f = 0;
        final int b = a.b(parcel);
        Bundle o = null;
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
                    f = com.google.android.gms.common.internal.safeparcel.a.f(parcel, a);
                    continue;
                }
                case 3: {
                    o = com.google.android.gms.common.internal.safeparcel.a.o(parcel, a);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new a$a("Overread allowed size end=" + b, parcel);
        }
        return new c(f2, f, o);
    }
    
    public c[] a(final int n) {
        return new c[n];
    }
}
