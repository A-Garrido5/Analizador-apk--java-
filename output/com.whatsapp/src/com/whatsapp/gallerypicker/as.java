// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class as implements Parcelable$Creator
{
    public ak a(final Parcel parcel) {
        return new ak(parcel, null);
    }
    
    public ak[] a(final int n) {
        return new ak[n];
    }
    
    public Object createFromParcel(final Parcel parcel) {
        return this.a(parcel);
    }
    
    public Object[] newArray(final int n) {
        return this.a(n);
    }
}
