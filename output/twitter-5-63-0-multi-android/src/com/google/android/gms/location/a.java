// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.location;

import java.util.List;
import com.google.android.gms.common.internal.safeparcel.a$a;
import com.google.android.gms.common.internal.safeparcel.b;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class a implements Parcelable$Creator
{
    static void a(final ActivityRecognitionResult activityRecognitionResult, final Parcel parcel, final int n) {
        final int a = b.a(parcel);
        b.b(parcel, 1, activityRecognitionResult.a, false);
        b.a(parcel, 1000, activityRecognitionResult.a());
        b.a(parcel, 2, activityRecognitionResult.b);
        b.a(parcel, 3, activityRecognitionResult.c);
        b.a(parcel, a);
    }
    
    public ActivityRecognitionResult a(final Parcel parcel) {
        long h = 0L;
        final int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int f = 0;
        List c = null;
        long h2 = h;
        while (parcel.dataPosition() < b) {
            final int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                default: {
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    continue;
                }
                case 1: {
                    c = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a, (Parcelable$Creator)DetectedActivity.CREATOR);
                    continue;
                }
                case 1000: {
                    f = com.google.android.gms.common.internal.safeparcel.a.f(parcel, a);
                    continue;
                }
                case 2: {
                    h2 = com.google.android.gms.common.internal.safeparcel.a.h(parcel, a);
                    continue;
                }
                case 3: {
                    h = com.google.android.gms.common.internal.safeparcel.a.h(parcel, a);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != b) {
            throw new a$a("Overread allowed size end=" + b, parcel);
        }
        return new ActivityRecognitionResult(f, c, h2, h);
    }
    
    public ActivityRecognitionResult[] a(final int n) {
        return new ActivityRecognitionResult[n];
    }
}
