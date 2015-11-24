// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.model.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.safeparcel.a$a;
import android.graphics.Bitmap;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class g implements Parcelable$Creator
{
    static void a(final a a, final Parcel parcel, final int n) {
        final int a2 = b.a(parcel);
        b.a(parcel, 1, a.a());
        b.a(parcel, 2, a.b());
        b.a(parcel, 3, a.c(), false);
        b.a(parcel, 4, (Parcelable)a.d(), n, false);
        b.a(parcel, a2);
    }
    
    public a a(final Parcel parcel) {
        Bitmap bitmap = null;
        byte d = 0;
        final int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        Bundle o = null;
        int f = 0;
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
                    d = com.google.android.gms.common.internal.safeparcel.a.d(parcel, a);
                    continue;
                }
                case 3: {
                    o = com.google.android.gms.common.internal.safeparcel.a.o(parcel, a);
                    continue;
                }
                case 4: {
                    bitmap = (Bitmap)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, Bitmap.CREATOR);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new a$a("Overread allowed size end=" + b, parcel);
        }
        return new a(f, d, o, bitmap);
    }
    
    public a[] a(final int n) {
        return new a[n];
    }
}
