// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.api;

import com.google.android.gms.common.internal.safeparcel.a$a;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class ah implements Parcelable$Creator
{
    static void a(final Scope scope, final Parcel parcel, final int n) {
        final int a = b.a(parcel);
        b.a(parcel, 1, scope.a);
        b.a(parcel, 2, scope.a(), false);
        b.a(parcel, a);
    }
    
    public Scope a(final Parcel parcel) {
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
            }
        }
        if (parcel.dataPosition() != b) {
            throw new a$a("Overread allowed size end=" + b, parcel);
        }
        return new Scope(f, m);
    }
    
    public Scope[] a(final int n) {
        return new Scope[n];
    }
}
