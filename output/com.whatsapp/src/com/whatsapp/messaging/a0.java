// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.messaging;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class a0 implements Parcelable$Creator
{
    public bw a(final Parcel parcel) {
        return new bw(parcel, null);
    }
    
    public bw[] a(final int n) {
        return new bw[n];
    }
    
    public Object createFromParcel(final Parcel parcel) {
        return this.a(parcel);
    }
    
    public Object[] newArray(final int n) {
        return this.a(n);
    }
}
