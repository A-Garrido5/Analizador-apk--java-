// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class r implements Parcelable$Creator
{
    public c a(final Parcel parcel) {
        return new c(parcel, null);
    }
    
    public c[] a(final int n) {
        return new c[n];
    }
    
    public Object createFromParcel(final Parcel parcel) {
        return this.a(parcel);
    }
    
    public Object[] newArray(final int n) {
        return this.a(n);
    }
}
