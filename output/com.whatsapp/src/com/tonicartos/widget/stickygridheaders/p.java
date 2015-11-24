// 
// Decompiled by Procyon v0.5.30
// 

package com.tonicartos.widget.stickygridheaders;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class p implements Parcelable$Creator
{
    public a a(final Parcel parcel) {
        return new a(parcel, null);
    }
    
    public a[] a(final int n) {
        return new a[n];
    }
    
    public Object createFromParcel(final Parcel parcel) {
        return this.a(parcel);
    }
    
    public Object[] newArray(final int n) {
        return this.a(n);
    }
}
