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

public class ba implements Parcelable$Creator
{
    static void a(final kv$a kv$a, final Parcel parcel, final int n) {
        final int a = b.a(parcel);
        b.a(parcel, 1, kv$a.a);
        b.a(parcel, 2, kv$a.b, false);
        b.b(parcel, 3, kv$a.c, false);
        b.a(parcel, a);
    }
    
    public kv$a a(final Parcel parcel) {
        ArrayList c = null;
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
                    c = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a, (Parcelable$Creator)kv$b.CREATOR);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new a$a("Overread allowed size end=" + b, parcel);
        }
        return new kv$a(f, m, c);
    }
    
    public kv$a[] a(final int n) {
        return new kv$a[n];
    }
}
