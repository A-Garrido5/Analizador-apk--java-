// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.safeparcel.a$a;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class f implements Parcelable$Creator
{
    static void a(final if if1, final Parcel parcel, final int n) {
        final int a = b.a(parcel);
        b.a(parcel, 1, if1.b);
        b.a(parcel, 1000, if1.a);
        b.a(parcel, 2, if1.c, false);
        b.a(parcel, 3, if1.d, false);
        b.a(parcel, a);
    }
    
    public if a(final Parcel parcel) {
        byte[] p = null;
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
                    f = com.google.android.gms.common.internal.safeparcel.a.f(parcel, a);
                    continue;
                }
                case 1000: {
                    f2 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, a);
                    continue;
                }
                case 2: {
                    o = com.google.android.gms.common.internal.safeparcel.a.o(parcel, a);
                    continue;
                }
                case 3: {
                    p = com.google.android.gms.common.internal.safeparcel.a.p(parcel, a);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new a$a("Overread allowed size end=" + b, parcel);
        }
        return new if(f2, f, o, p);
    }
    
    public if[] a(final int n) {
        return new if[n];
    }
}
