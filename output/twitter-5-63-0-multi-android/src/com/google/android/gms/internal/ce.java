// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import java.util.List;
import com.google.android.gms.common.internal.safeparcel.a$a;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.common.internal.safeparcel.a;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class ce implements Parcelable$Creator
{
    static void a(final nl nl, final Parcel parcel, final int n) {
        final int a = b.a(parcel);
        b.a(parcel, 1, (Parcelable)nl.b, n, false);
        b.a(parcel, 1000, nl.a());
        b.a(parcel, 2, nl.c);
        b.a(parcel, 3, nl.d);
        b.a(parcel, 4, nl.e);
        b.b(parcel, 5, nl.f, false);
        b.a(parcel, 6, nl.g, false);
        b.a(parcel, a);
    }
    
    public nl a(final Parcel parcel) {
        String m = null;
        boolean c = true;
        boolean c2 = false;
        final int b = a.b(parcel);
        List list = nl.a;
        boolean c3 = c;
        LocationRequest locationRequest = null;
        int f = 0;
        while (parcel.dataPosition() < b) {
            final int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                default: {
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    continue;
                }
                case 1: {
                    locationRequest = (LocationRequest)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, (Parcelable$Creator)LocationRequest.CREATOR);
                    continue;
                }
                case 1000: {
                    f = com.google.android.gms.common.internal.safeparcel.a.f(parcel, a);
                    continue;
                }
                case 2: {
                    c2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a);
                    continue;
                }
                case 3: {
                    c3 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a);
                    continue;
                }
                case 4: {
                    c = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a);
                    continue;
                }
                case 5: {
                    list = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a, (Parcelable$Creator)nd.CREATOR);
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
        return new nl(f, locationRequest, c2, c3, c, list, m);
    }
    
    public nl[] a(final int n) {
        return new nl[n];
    }
}
