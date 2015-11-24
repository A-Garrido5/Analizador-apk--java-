// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.model;

import com.google.android.gms.common.internal.safeparcel.a$a;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class ad implements Parcelable$Creator
{
    static void a(final Tile tile, final Parcel parcel, final int n) {
        final int a = b.a(parcel);
        b.a(parcel, 1, tile.a());
        b.a(parcel, 2, tile.a);
        b.a(parcel, 3, tile.b);
        b.a(parcel, 4, tile.c, false);
        b.a(parcel, a);
    }
    
    public Tile a(final Parcel parcel) {
        int f = 0;
        final int b = a.b(parcel);
        byte[] p = null;
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
                    p = com.google.android.gms.common.internal.safeparcel.a.p(parcel, a);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new a$a("Overread allowed size end=" + b, parcel);
        }
        return new Tile(f3, f2, f, p);
    }
    
    public Tile[] a(final int n) {
        return new Tile[n];
    }
}
