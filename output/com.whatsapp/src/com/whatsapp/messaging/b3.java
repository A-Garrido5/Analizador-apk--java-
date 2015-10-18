// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.messaging;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class b3 implements Parcelable$Creator
{
    public ai a(final Parcel parcel) {
        return new ai(parcel, null);
    }
    
    public ai[] a(final int n) {
        return new ai[n];
    }
    
    public Object createFromParcel(final Parcel parcel) {
        return this.a(parcel);
    }
    
    public Object[] newArray(final int n) {
        return this.a(n);
    }
}
