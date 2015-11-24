// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.messaging;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class ap implements Parcelable$Creator
{
    public b8 a(final Parcel parcel) {
        return new b8(parcel, null);
    }
    
    public b8[] a(final int n) {
        return new b8[n];
    }
    
    public Object createFromParcel(final Parcel parcel) {
        return this.a(parcel);
    }
    
    public Object[] newArray(final int n) {
        return this.a(n);
    }
}
