// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.auth;

import java.util.List;
import com.google.android.gms.common.internal.safeparcel.a$a;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class c implements Parcelable$Creator
{
    static void a(final AccountChangeEventsResponse accountChangeEventsResponse, final Parcel parcel, final int n) {
        final int a = b.a(parcel);
        b.a(parcel, 1, accountChangeEventsResponse.a);
        b.b(parcel, 2, accountChangeEventsResponse.b, false);
        b.a(parcel, a);
    }
    
    public AccountChangeEventsResponse a(final Parcel parcel) {
        final int b = a.b(parcel);
        int f = 0;
        List c = null;
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
                    c = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a, (Parcelable$Creator)AccountChangeEvent.CREATOR);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new a$a("Overread allowed size end=" + b, parcel);
        }
        return new AccountChangeEventsResponse(f, c);
    }
    
    public AccountChangeEventsResponse[] a(final int n) {
        return new AccountChangeEventsResponse[n];
    }
}
