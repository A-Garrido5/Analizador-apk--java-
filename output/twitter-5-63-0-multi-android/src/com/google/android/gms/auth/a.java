// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.auth;

import com.google.android.gms.common.internal.safeparcel.a$a;
import com.google.android.gms.common.internal.safeparcel.b;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class a implements Parcelable$Creator
{
    static void a(final AccountChangeEvent accountChangeEvent, final Parcel parcel, final int n) {
        final int a = b.a(parcel);
        b.a(parcel, 1, accountChangeEvent.a);
        b.a(parcel, 2, accountChangeEvent.b);
        b.a(parcel, 3, accountChangeEvent.c, false);
        b.a(parcel, 4, accountChangeEvent.d);
        b.a(parcel, 5, accountChangeEvent.e);
        b.a(parcel, 6, accountChangeEvent.f, false);
        b.a(parcel, a);
    }
    
    public AccountChangeEvent a(final Parcel parcel) {
        String m = null;
        int f = 0;
        final int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        long h = 0L;
        int f2 = 0;
        String i = null;
        int f3 = 0;
        while (parcel.dataPosition() < b) {
            final int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                default: {
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    continue;
                }
                case 1: {
                    f3 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, a);
                    continue;
                }
                case 2: {
                    h = com.google.android.gms.common.internal.safeparcel.a.h(parcel, a);
                    continue;
                }
                case 3: {
                    i = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
                case 4: {
                    f2 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, a);
                    continue;
                }
                case 5: {
                    f = com.google.android.gms.common.internal.safeparcel.a.f(parcel, a);
                    continue;
                }
                case 6: {
                    m = com.google.android.gms.common.internal.safeparcel.a.m(parcel, a);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new a$a("Overread allowed size end=" + b, parcel);
        }
        return new AccountChangeEvent(f3, h, i, f2, f, m);
    }
    
    public AccountChangeEvent[] a(final int n) {
        return new AccountChangeEvent[n];
    }
}
