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

public class ao implements Parcelable$Creator
{
    static void a(final jg$a jg$a, final Parcel parcel, final int n) {
        final int a = b.a(parcel);
        b.a(parcel, 1, jg$a.a(), false);
        b.a(parcel, 1000, jg$a.e());
        b.a(parcel, 2, jg$a.d(), false);
        b.a(parcel, 3, jg$a.b());
        b.a(parcel, 4, jg$a.c(), false);
        b.a(parcel, a);
    }
    
    public jg$a a(final Parcel parcel) {
        int f = 0;
        String m = null;
        final int b = a.b(parcel);
        List y = null;
        String i = null;
        int f2 = 0;
        while (parcel.dataPosition() < b) {
            final int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                default: {
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    continue;
                }
                case 1: {
                    i = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 1000: {
                    f2 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, a);
                    continue;
                }
                case 2: {
                    y = com.google.android.gms.common.internal.safeparcel.a.y(parcel, a);
                    continue;
                }
                case 3: {
                    f = com.google.android.gms.common.internal.safeparcel.a.f(parcel, a);
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
        return new jg$a(f2, i, y, f, m);
    }
    
    public jg$a[] a(final int n) {
        return new jg$a[n];
    }
}
