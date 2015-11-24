// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class q8 implements Parcelable$Creator
{
    public d6 a(final Parcel parcel) {
        return new d6(parcel);
    }
    
    public d6[] a(final int n) {
        return new d6[n];
    }
    
    public Object createFromParcel(final Parcel parcel) {
        return this.a(parcel);
    }
    
    public Object[] newArray(final int n) {
        return this.a(n);
    }
}
