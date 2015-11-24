// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.messaging;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class j implements Parcelable$Creator
{
    public bs a(final Parcel parcel) {
        return new bs(parcel, null);
    }
    
    public bs[] a(final int n) {
        return new bs[n];
    }
    
    public Object createFromParcel(final Parcel parcel) {
        return this.a(parcel);
    }
    
    public Object[] newArray(final int n) {
        return this.a(n);
    }
}
