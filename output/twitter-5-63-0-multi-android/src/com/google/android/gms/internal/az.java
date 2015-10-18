// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import java.util.ArrayList;
import com.google.android.gms.common.internal.safeparcel.a$a;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.List;
import com.google.android.gms.common.internal.safeparcel.b;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class az implements Parcelable$Creator
{
    static void a(final kv kv, final Parcel parcel, final int n) {
        final int a = b.a(parcel);
        b.a(parcel, 1, kv.b());
        b.b(parcel, 2, kv.c(), false);
        b.a(parcel, 3, kv.d(), false);
        b.a(parcel, a);
    }
    
    public kv a(final Parcel parcel) {
        String m = null;
        final int b = a.b(parcel);
        int f = 0;
        ArrayList c = null;
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
                    c = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a, (Parcelable$Creator)kv$a.CREATOR);
                    continue;
                }
                case 3: {
                    m = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new a$a("Overread allowed size end=" + b, parcel);
        }
        return new kv(f, c, m);
    }
    
    public kv[] a(final int n) {
        return new kv[n];
    }
}
