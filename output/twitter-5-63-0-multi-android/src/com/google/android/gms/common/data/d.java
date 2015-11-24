// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.safeparcel.a$a;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class d implements Parcelable$Creator
{
    static void a(final a a, final Parcel parcel, final int n) {
        final int a2 = b.a(parcel);
        b.a(parcel, 1, a.a);
        b.a(parcel, 2, (Parcelable)a.b, n, false);
        b.a(parcel, 3, a.c);
        b.a(parcel, a2);
    }
    
    public a a(final Parcel parcel) {
        int n = 0;
        final int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        int n2 = 0;
        while (parcel.dataPosition() < b) {
            final int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            int f = 0;
            ParcelFileDescriptor parcelFileDescriptor2 = null;
            int n3 = 0;
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                default: {
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    f = n;
                    parcelFileDescriptor2 = parcelFileDescriptor;
                    n3 = n2;
                    break;
                }
                case 1: {
                    final int f2 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, a);
                    final int n4 = n;
                    parcelFileDescriptor2 = parcelFileDescriptor;
                    n3 = f2;
                    f = n4;
                    break;
                }
                case 2: {
                    final ParcelFileDescriptor parcelFileDescriptor3 = (ParcelFileDescriptor)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, ParcelFileDescriptor.CREATOR);
                    n3 = n2;
                    f = n;
                    parcelFileDescriptor2 = parcelFileDescriptor3;
                    break;
                }
                case 3: {
                    f = com.google.android.gms.common.internal.safeparcel.a.f(parcel, a);
                    parcelFileDescriptor2 = parcelFileDescriptor;
                    n3 = n2;
                    break;
                }
            }
            n2 = n3;
            parcelFileDescriptor = parcelFileDescriptor2;
            n = f;
        }
        if (parcel.dataPosition() != b) {
            throw new a$a("Overread allowed size end=" + b, parcel);
        }
        return new a(n2, parcelFileDescriptor, n);
    }
    
    public a[] a(final int n) {
        return new a[n];
    }
}
