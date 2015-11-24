// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.data;

import android.os.Bundle;
import com.google.android.gms.common.internal.safeparcel.a$a;
import android.database.CursorWindow;
import com.google.android.gms.common.internal.safeparcel.a;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class e implements Parcelable$Creator
{
    static void a(final DataHolder dataHolder, final Parcel parcel, final int n) {
        final int a = b.a(parcel);
        b.a(parcel, 1, dataHolder.c(), false);
        b.a(parcel, 1000, dataHolder.b());
        b.a(parcel, 2, (Parcelable[])dataHolder.d(), n, false);
        b.a(parcel, 3, dataHolder.e());
        b.a(parcel, 4, dataHolder.f(), false);
        b.a(parcel, a);
    }
    
    public DataHolder a(final Parcel parcel) {
        int f = 0;
        Bundle o = null;
        final int b = a.b(parcel);
        CursorWindow[] array = null;
        String[] x = null;
        int f2 = 0;
        while (parcel.dataPosition() < b) {
            final int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                default: {
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    continue;
                }
                case 1: {
                    x = com.google.android.gms.common.internal.safeparcel.a.x(parcel, a);
                    continue;
                }
                case 1000: {
                    f2 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, a);
                    continue;
                }
                case 2: {
                    array = (CursorWindow[])com.google.android.gms.common.internal.safeparcel.a.b(parcel, a, CursorWindow.CREATOR);
                    continue;
                }
                case 3: {
                    f = com.google.android.gms.common.internal.safeparcel.a.f(parcel, a);
                    continue;
                }
                case 4: {
                    o = com.google.android.gms.common.internal.safeparcel.a.o(parcel, a);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new a$a("Overread allowed size end=" + b, parcel);
        }
        final DataHolder dataHolder = new DataHolder(f2, x, array, f, o);
        dataHolder.a();
        return dataHolder;
    }
    
    public DataHolder[] a(final int n) {
        return new DataHolder[n];
    }
}
