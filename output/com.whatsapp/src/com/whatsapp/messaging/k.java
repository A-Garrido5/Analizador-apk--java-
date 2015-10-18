// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.messaging;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class k implements Parcelable$Creator
{
    public u a(final Parcel parcel) {
        return new u(parcel, null);
    }
    
    public u[] a(final int n) {
        return new u[n];
    }
    
    public Object createFromParcel(final Parcel parcel) {
        return this.a(parcel);
    }
    
    public Object[] newArray(final int n) {
        return this.a(n);
    }
}
