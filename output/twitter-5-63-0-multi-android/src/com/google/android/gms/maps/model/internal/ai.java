// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.model.internal;

import com.google.android.gms.common.internal.safeparcel.a$a;
import com.google.android.gms.common.internal.safeparcel.a;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class ai implements Parcelable$Creator
{
    static void a(final p p3, final Parcel parcel, final int n) {
        final int a = b.a(parcel);
        b.a(parcel, 1, p3.a());
        b.a(parcel, 2, (Parcelable)p3.b(), n, false);
        b.a(parcel, a);
    }
    
    public p a(final Parcel parcel) {
        final int b = a.b(parcel);
        int f = 0;
        com.google.android.gms.maps.model.internal.a a = null;
        while (parcel.dataPosition() < b) {
            final int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a2)) {
                default: {
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
                    continue;
                }
                case 1: {
                    f = com.google.android.gms.common.internal.safeparcel.a.f(parcel, a2);
                    continue;
                }
                case 2: {
                    a = (com.google.android.gms.maps.model.internal.a)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a2, (Parcelable$Creator)com.google.android.gms.maps.model.internal.a.CREATOR);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new a$a("Overread allowed size end=" + b, parcel);
        }
        return new p(f, a);
    }
    
    public p[] a(final int n) {
        return new p[n];
    }
}
