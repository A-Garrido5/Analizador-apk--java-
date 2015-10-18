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

public class at implements Parcelable$Creator
{
    static void a(final km km, final Parcel parcel, final int n) {
        final int a = b.a(parcel);
        b.a(parcel, 1, km.a());
        b.a(parcel, 2, (Parcelable)km.b(), n, false);
        b.a(parcel, a);
    }
    
    public km a(final Parcel parcel) {
        final int b = a.b(parcel);
        int f = 0;
        ko ko = null;
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
                    ko = (ko)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, (Parcelable$Creator)com.google.android.gms.internal.ko.CREATOR);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new a$a("Overread allowed size end=" + b, parcel);
        }
        return new km(f, ko);
    }
    
    public km[] a(final int n) {
        return new km[n];
    }
}
