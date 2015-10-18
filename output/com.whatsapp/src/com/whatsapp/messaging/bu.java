// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.messaging;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class bu implements Parcelable$Creator
{
    public bd a(final Parcel parcel) {
        return new bd(parcel, null);
    }
    
    public bd[] a(final int n) {
        return new bd[n];
    }
    
    public Object createFromParcel(final Parcel parcel) {
        return this.a(parcel);
    }
    
    public Object[] newArray(final int n) {
        return this.a(n);
    }
}
