// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Bundle;
import com.google.android.gms.common.internal.safeparcel.a$a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.a;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class n implements Parcelable$Creator
{
    static void a(final jj jj, final Parcel parcel, final int n) {
        final int a = b.a(parcel);
        b.a(parcel, 1, jj.a);
        b.a(parcel, 2, jj.b);
        b.a(parcel, 3, jj.c);
        b.a(parcel, 4, jj.d, false);
        b.a(parcel, 5, jj.e, false);
        b.a(parcel, 6, (Parcelable[])jj.f, n, false);
        b.a(parcel, 7, jj.g, false);
        b.a(parcel, a);
    }
    
    public jj a(final Parcel parcel) {
        int f = 0;
        Bundle o = null;
        final int b = a.b(parcel);
        Scope[] array = null;
        IBinder n = null;
        String m = null;
        int f2 = 0;
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
                    f2 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, a);
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
                case 5: {
                    n = com.google.android.gms.common.internal.safeparcel.a.n(parcel, a);
                    continue;
                }
                case 6: {
                    array = (Scope[])com.google.android.gms.common.internal.safeparcel.a.b(parcel, a, Scope.CREATOR);
                    continue;
                }
                case 7: {
                    o = com.google.android.gms.common.internal.safeparcel.a.o(parcel, a);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new a$a("Overread allowed size end=" + b, parcel);
        }
        return new jj(f3, f2, f, m, n, array, o);
    }
    
    public jj[] a(final int n) {
        return new jj[n];
    }
}
