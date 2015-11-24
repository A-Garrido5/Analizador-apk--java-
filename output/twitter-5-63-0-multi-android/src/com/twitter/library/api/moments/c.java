// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.moments;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class c implements Parcelable$Creator
{
    public Moment a(final Parcel parcel) {
        return new Moment(parcel);
    }
    
    public Moment[] a(final int n) {
        return new Moment[n];
    }
}
