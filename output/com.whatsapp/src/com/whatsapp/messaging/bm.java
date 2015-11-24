// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.messaging;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class bm implements Parcelable$Creator
{
    public a1 a(final Parcel parcel) {
        return new a1(parcel, null);
    }
    
    public a1[] a(final int n) {
        return new a1[n];
    }
    
    public Object createFromParcel(final Parcel parcel) {
        return this.a(parcel);
    }
    
    public Object[] newArray(final int n) {
        return this.a(n);
    }
}
