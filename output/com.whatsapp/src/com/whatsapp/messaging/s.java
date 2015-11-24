// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.messaging;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class s implements Parcelable$Creator
{
    public am a(final Parcel parcel) {
        return new am(parcel, null);
    }
    
    public am[] a(final int n) {
        return new am[n];
    }
    
    public Object createFromParcel(final Parcel parcel) {
        return this.a(parcel);
    }
    
    public Object[] newArray(final int n) {
        return this.a(n);
    }
}
