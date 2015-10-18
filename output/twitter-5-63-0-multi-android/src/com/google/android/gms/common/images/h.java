// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.images;

import com.google.android.gms.common.internal.safeparcel.a$a;
import android.net.Uri;
import com.google.android.gms.common.internal.safeparcel.a;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class h implements Parcelable$Creator
{
    static void a(final WebImage webImage, final Parcel parcel, final int n) {
        final int a = b.a(parcel);
        b.a(parcel, 1, webImage.a());
        b.a(parcel, 2, (Parcelable)webImage.b(), n, false);
        b.a(parcel, 3, webImage.c());
        b.a(parcel, 4, webImage.d());
        b.a(parcel, a);
    }
    
    public WebImage a(final Parcel parcel) {
        int n = 0;
        final int b = a.b(parcel);
        Uri uri = null;
        int n2 = 0;
        int n3 = 0;
        while (parcel.dataPosition() < b) {
            final int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            int f = 0;
            int n4 = 0;
            Uri uri2 = null;
            int n5 = 0;
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                default: {
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    f = n;
                    n4 = n2;
                    uri2 = uri;
                    n5 = n3;
                    break;
                }
                case 1: {
                    final int f2 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, a);
                    final int n6 = n;
                    n4 = n2;
                    uri2 = uri;
                    n5 = f2;
                    f = n6;
                    break;
                }
                case 2: {
                    final Uri uri3 = (Uri)com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, Uri.CREATOR);
                    n5 = n3;
                    final int n7 = n2;
                    uri2 = uri3;
                    f = n;
                    n4 = n7;
                    break;
                }
                case 3: {
                    final int f3 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, a);
                    uri2 = uri;
                    n5 = n3;
                    final int n8 = n;
                    n4 = f3;
                    f = n8;
                    break;
                }
                case 4: {
                    f = com.google.android.gms.common.internal.safeparcel.a.f(parcel, a);
                    n4 = n2;
                    uri2 = uri;
                    n5 = n3;
                    break;
                }
            }
            n3 = n5;
            uri = uri2;
            n2 = n4;
            n = f;
        }
        if (parcel.dataPosition() != b) {
            throw new a$a("Overread allowed size end=" + b, parcel);
        }
        return new WebImage(n3, uri, n2, n);
    }
    
    public WebImage[] a(final int n) {
        return new WebImage[n];
    }
}
