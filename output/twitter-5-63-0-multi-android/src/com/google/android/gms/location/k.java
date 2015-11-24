// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.location;

import java.util.List;
import com.google.android.gms.common.internal.safeparcel.a$a;
import com.google.android.gms.internal.nn;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class k implements Parcelable$Creator
{
    static void a(final GeofencingRequest geofencingRequest, final Parcel parcel, final int n) {
        final int a = b.a(parcel);
        b.b(parcel, 1, geofencingRequest.b(), false);
        b.a(parcel, 1000, geofencingRequest.a());
        b.a(parcel, 2, geofencingRequest.c());
        b.a(parcel, a);
    }
    
    public GeofencingRequest a(final Parcel parcel) {
        int f = 0;
        final int b = a.b(parcel);
        List c = null;
        int f2 = 0;
        while (parcel.dataPosition() < b) {
            final int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                default: {
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    continue;
                }
                case 1: {
                    c = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a, (Parcelable$Creator)nn.CREATOR);
                    continue;
                }
                case 1000: {
                    f2 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, a);
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
        return new GeofencingRequest(f2, c, f);
    }
    
    public GeofencingRequest[] a(final int n) {
        return new GeofencingRequest[n];
    }
}
