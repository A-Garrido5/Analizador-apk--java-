// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class ap implements Parcelable$Creator
{
    public RateLimit a(final Parcel parcel) {
        return new RateLimit(parcel);
    }
    
    public RateLimit[] a(final int n) {
        return new RateLimit[n];
    }
}
