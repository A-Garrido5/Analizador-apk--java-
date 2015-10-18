// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.messaging;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class bn implements Parcelable$Creator
{
    public bj a(final Parcel parcel) {
        return new bj(parcel, null);
    }
    
    public bj[] a(final int n) {
        return new bj[n];
    }
    
    public Object createFromParcel(final Parcel parcel) {
        return this.a(parcel);
    }
    
    public Object[] newArray(final int n) {
        return this.a(n);
    }
}
