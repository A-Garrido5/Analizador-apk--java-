// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util.undobar;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class b implements Parcelable$Creator
{
    public g a(final Parcel parcel) {
        return new g(parcel);
    }
    
    public g[] a(final int n) {
        return new g[n];
    }
    
    public Object createFromParcel(final Parcel parcel) {
        return this.a(parcel);
    }
    
    public Object[] newArray(final int n) {
        return this.a(n);
    }
}
