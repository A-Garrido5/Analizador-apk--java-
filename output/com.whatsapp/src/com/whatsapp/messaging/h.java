// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.messaging;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class h implements Parcelable$Creator
{
    public bl a(final Parcel parcel) {
        return new bl(parcel, null);
    }
    
    public bl[] a(final int n) {
        return new bl[n];
    }
    
    public Object createFromParcel(final Parcel parcel) {
        return this.a(parcel);
    }
    
    public Object[] newArray(final int n) {
        return this.a(n);
    }
}
