// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.auth;

import com.google.android.gms.common.internal.safeparcel.a$a;
import com.google.android.gms.common.internal.safeparcel.a;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class b implements Parcelable$Creator
{
    static void a(final AccountChangeEventsRequest accountChangeEventsRequest, final Parcel parcel, final int n) {
        final int a = com.google.android.gms.common.internal.safeparcel.b.a(parcel);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1, accountChangeEventsRequest.a);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, accountChangeEventsRequest.b);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 3, accountChangeEventsRequest.c, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, a);
    }
    
    public AccountChangeEventsRequest a(final Parcel parcel) {
        int f = 0;
        final int b = a.b(parcel);
        String m = null;
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
                    m = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new a$a("Overread allowed size end=" + b, parcel);
        }
        return new AccountChangeEventsRequest(f2, f, m);
    }
    
    public AccountChangeEventsRequest[] a(final int n) {
        return new AccountChangeEventsRequest[n];
    }
}
