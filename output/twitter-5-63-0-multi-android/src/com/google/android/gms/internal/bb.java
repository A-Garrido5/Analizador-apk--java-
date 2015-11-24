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

public class bb implements Parcelable$Creator
{
    static void a(final ky ky, final Parcel parcel, final int n) {
        final int a = b.a(parcel);
        b.a(parcel, 1, ky.d());
        b.a(parcel, 2, ky.e(), false);
        b.a(parcel, 3, (Parcelable)ky.f(), n, false);
        b.a(parcel, a);
    }
    
    public ky a(final Parcel parcel) {
        kv kv = null;
        final int b = a.b(parcel);
        int f = 0;
        Parcel z = null;
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
                    z = com.google.android.gms.common.internal.safeparcel.a.z(parcel, a);
                    continue;
                }
                case 3: {
                    kv = (kv)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, (Parcelable$Creator)com.google.android.gms.internal.kv.CREATOR);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new a$a("Overread allowed size end=" + b, parcel);
        }
        return new ky(f, z, kv);
    }
    
    public ky[] a(final int n) {
        return new ky[n];
    }
}
