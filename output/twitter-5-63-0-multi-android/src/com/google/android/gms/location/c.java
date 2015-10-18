// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.location;

import com.google.android.gms.common.internal.safeparcel.a$a;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class c implements Parcelable$Creator
{
    static void a(final DetectedActivity detectedActivity, final Parcel parcel, final int n) {
        final int a = b.a(parcel);
        b.a(parcel, 1, detectedActivity.b);
        b.a(parcel, 1000, detectedActivity.c());
        b.a(parcel, 2, detectedActivity.c);
        b.a(parcel, a);
    }
    
    public DetectedActivity a(final Parcel parcel) {
        int f = 0;
        final int b = a.b(parcel);
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
                    f2 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, a);
                    continue;
                }
                case 1000: {
                    f3 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, a);
                    continue;
                }
                case 2: {
                    f = com.google.android.gms.common.internal.safeparcel.a.f(parcel, a);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new a$a("Overread allowed size end=" + b, parcel);
        }
        return new DetectedActivity(f3, f2, f);
    }
    
    public DetectedActivity[] a(final int n) {
        return new DetectedActivity[n];
    }
}
