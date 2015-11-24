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

public class ay implements Parcelable$Creator
{
    static void a(final kv$b kv$b, final Parcel parcel, final int n) {
        final int a = b.a(parcel);
        b.a(parcel, 1, kv$b.a);
        b.a(parcel, 2, kv$b.b, false);
        b.a(parcel, 3, (Parcelable)kv$b.c, n, false);
        b.a(parcel, a);
    }
    
    public kv$b a(final Parcel parcel) {
        kr$a kr$a = null;
        final int b = a.b(parcel);
        int f = 0;
        String m = null;
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
                    m = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 3: {
                    kr$a = (kr$a)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, (Parcelable$Creator)com.google.android.gms.internal.kr$a.CREATOR);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new a$a("Overread allowed size end=" + b, parcel);
        }
        return new kv$b(f, m, kr$a);
    }
    
    public kv$b[] a(final int n) {
        return new kv$b[n];
    }
}
