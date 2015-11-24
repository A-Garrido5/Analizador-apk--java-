// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.internal;

import com.google.android.gms.common.internal.safeparcel.a$a;
import android.graphics.Point;
import com.google.android.gms.common.internal.safeparcel.a;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class cw implements Parcelable$Creator
{
    static void a(final y y, final Parcel parcel, final int n) {
        final int a = b.a(parcel);
        b.a(parcel, 1, y.a());
        b.a(parcel, 2, (Parcelable)y.b(), n, false);
        b.a(parcel, a);
    }
    
    public y a(final Parcel parcel) {
        final int b = a.b(parcel);
        int f = 0;
        Point point = null;
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
                    point = (Point)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, Point.CREATOR);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new a$a("Overread allowed size end=" + b, parcel);
        }
        return new y(f, point);
    }
    
    public y[] a(final int n) {
        return new y[n];
    }
}
