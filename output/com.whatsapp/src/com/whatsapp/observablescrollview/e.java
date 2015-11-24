// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.observablescrollview;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class e implements Parcelable$Creator
{
    public d a(final Parcel parcel) {
        return new d(parcel, null);
    }
    
    public d[] a(final int n) {
        return new d[n];
    }
    
    public Object createFromParcel(final Parcel parcel) {
        return this.a(parcel);
    }
    
    public Object[] newArray(final int n) {
        return this.a(n);
    }
}
